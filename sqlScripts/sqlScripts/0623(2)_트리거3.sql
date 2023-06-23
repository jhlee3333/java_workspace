-- // 1. 예시 : tbl_buy2 는 구매 목록 테이블 , tbl_money 는 결제 테이블 , custom_sale 는 고객매출로 하여 
create table tbl_buy2           -- tbl_buy 구조만 복사. 시퀀스 생성은 안하고 임의로 값을 주고 테스트하겠습니다.
as
select * from tbl_buy where buy_seq=0;         -- 데이터 복사 안 함

CREATE TABLE tbl_money(         -- 
   money_seq number(5) PRIMARY KEY,
   buy_seq number(5) ,
   customid varchar(20),
   money number(7)
);
CREATE SEQUENCE tblmoney_seq START WITH 5001;

-- //2. 아래와 같은 insert 할때
INSERT INTO tbl_buy2 
VALUES (2000, 'mina012','CJBAb12g',3,sysdate,0);

-- //3. tbl_buy2 에 적용할 트리거
-- INSERT는 :NEW, DELETE는 :OLD, UPDATE는 :OLD, :NEW 모두 있습니다.
CREATE  OR  REPLACE  TRIGGER  set_money_trig
AFTER  INSERT  ON  tbl_buy2
FOR  EACH  ROW 
DECLARE 
    vprice number(7);
     vtotal number(7):=0;
    vcnt number(7):=0;
BEGIN 
	-- DELETE from TBL_BUY2 tb where buy_seq = ; 했을 때 :NEW.customid 출력되는지 확인해보기
	dbms_output.put_line('*' || :NEW.customid || ' ' || vtotal || ' ' || vcnt);
   SELECT price 
      INTO vprice 
      FROM tbl_product tp WHERE pcode=:NEW.pcode;   
    INSERT  INTO  tbl_money VALUES  (tblmoney_seq.nextval, :NEW.buy_seq,:NEW.customid ,:NEW.quantity * vprice);
    SELECT  count(*) 
    INTO  vcnt
    FROM   tbl_sale WHERE  customid=:NEW.customid;
      SELECT  sum(money)
       INTO  vtotal
       FROM  tbl_money
       WHERE  customid = :NEW.customid;
   dbms_output.put_line('*' || :NEW.customid || ' ' || vtotal || ' ' || vcnt);
    IF vcnt=0 THEN  
        INSERT  INTO  tbl_sale VALUES  (:NEW.customid, vtotal);
    ELSE 
        UPDATE  tbl_sale SET  total=vtotal WHERE  customid = :NEW.customid;
    END  IF;
    EXCEPTION          -- EXCEPTION 추가하여 처리 -> 메시지 출력
      WHEN OTHERS THEN 
      dbms_output.put_line('//// fail  ////');
END;

-- //4. 데이터 행 입력
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1001,'mina012','CJBAb12g',5,TIMESTAMP'2022-03-10 14:33:15.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1002,'mina012','APLE5kg',2,TIMESTAMP'2022-03-10 14:33:15.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1003,'mina012','JINRMn5',2,TIMESTAMP'2022-03-16 10:13:15.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1004,'twice','JINRMn5',3,TIMESTAMP'2021-12-25 19:32:15.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1005,'twice','MANGOTK4r',2,TIMESTAMP'2021-12-25 19:32:15.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1006,'hongGD','DOWON123a',1,TIMESTAMP'2021-10-21 11:13:25.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1007,'hongGD','APLE5kg',7,TIMESTAMP'2021-10-21 11:13:25.0');
INSERT INTO ICLASS.tbl_buy2 (BUY_SEQ,CUSTOMID,PCODE,QUANTITY,BUY_DATE) 
VALUES (1008,'twice','CJBAb12g',2,TIMESTAMP'2023-06-22 14:04:47.0');
----------------------------------------------------------------------
TRUNCATE TABLE tbl_

-- //5. 집계 데이터 저장용 테이블
CREATE TABLE tbl_sale(
   customid varchar2(20) PRIMARY KEY,
   total number(7)
);
SELECT * FROM tbl_sale;
-----------------------------------------------------------------
DELETE FROM TBL_BUY2 tb WHERE buy_seq = 1001;
--------------------------------------
SELECT * FROM tbl_buy2;
-------------------------------------
/*
1. tbl_buy2 의 buy_seq 를 tbl_money 가 참조하도록
외래키를 설정합니다. 
2. 외래키의 on delete 옵션은 cascade로 합니다.
3. tbl_money 테이블의 set_sale_trig 트리거를 
정의합니다. 
내용은 tbl_money 테이블에서 sum(돈)를 
구하여 tbl_sale 테이블을 update 합니다.
4. delete from tbl_buy2 where buy_seq = 1004;
실행하여 확인합니다.
==> 4번 실행할 때 mutating 오류 생기면 2번 외래키를 삭제하고
트리거에 DELETE FROM tbl_money WHERE buy_seq = .... 추가해서 다시 해보세요!!!
*/
-- 1
ALTER TABLE TBL_BUY2 ADD PRIMARY key(buy_seq);
ALTER TABLE TBL_MONEY ADD FOREIGN key(buy_seq) REFERENCES tbl_buy2(buy_seq) ON DELETE CASCADE;

DELETE FROM tbl_buy2 WHERE buy_seq = 1004;

CREATE OR REPLACE TRIGGER set_delete_trig
AFTER DELETE ON tbl_buy2
FOR EACH ROW
DECLARE
     vtotal NUMBER(7);
BEGIN
	DELETE FROM tbl_money WHERE buy_seq =
	SELECT sum(money)
	   INTO vtotal
	   FROM tbl_money
	   WHERE customid = :OLD.customid;   -- 삭제된 행의 customid 필드값
    UPDATE TBL_SALE SET total = vtotal WHERE customid = :OLD.customid;
    dbms_output.put_line('*' || :OLD.customid || ' ' || vtotal);
    EXCEPTION
       WHEN OTHERS THEN
          dbms_output.put_line('set_delete_trig 실패!');
          ROLLBACK;
END;

-- cascase 때문에 tbl_buy2 테이블 삭제하면 tbl_money 테이블 삭제되면서 충돌
-- mutating 오류 : 돌연변이 즉 잘못 실행되고 있음.(같은 테이블에 접근하는 충돌)
--                ㄴ 외래키 자체를 삭제하고
-- DELETE from tbl_money where buy_seq = :OLD.buy_seq; 를 트리거에서 직접 실행합니다.