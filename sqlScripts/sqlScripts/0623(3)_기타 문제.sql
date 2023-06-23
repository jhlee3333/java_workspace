
-- // bookrent 테이블에 insert를 합니다.(단, delay_days 컬럼은 제외)
UPDATE bookrent SET delay_days = return_date -exp_date;
SELECT * FROM bookrent;         -- 연체일수 정수 OR 소숫점
SELECT trunc(return_date) -exp_date FROM bookrent;    -- 연체일수 정수 OR 소숫점


-- // 중요 1. tbl_buy 테이블에서 사용자ID 별로 구매 횟수를 구해서 가장 구매 횟수가 많은 사용자 ID, 구매횟수(buy_count)을 조회해라
-- 단, 구매 횟수가 가장 많은 것은 1개이다.
SELECT customid, count(*) buy_count
      FROM TBL_BUY tb 
      GROUP BY customid
      ORDER BY buy_count DESC;
     -----------------------------
     SELECT rownum, customid, buy_count
     from(
         SELECT customid, count(*) buy_count
         FROM TBL_BUY tb 
         GROUP BY customid
         ORDER BY buy_count DESC
     );
    -- where rownum = 1;         -- rownum에 쓸 수 있는 연산은 >=, <=, >, <, between, rownum=1(1 이외의 다른 값은 동작 오류)
    -- 오라클은 조회된 행에 순서대로 번호를 부여하여 rownum 컬럼에 저장한다. 항상 사용할 수 있는 컬럼입니다.
    SELECT rownum, buy_seq, customid, quantity FROM TBL_BUY tb   --rownum은 ORDER BY 하기 전의 rownum
    ORDER BY quantity DESC;

SELECT * FROM bookmember;
SELECT * FROM books;
SELECT * FROM bookrent;

CREATE TABLE bookmember
as
SELECT * FROM bookmember WHERE bookmember_seq=0;

CREATE TABLE bookmember(
      MEM_IDX number(5,0) PRIMARY KEY, NOT NULL,
      NAME varchar2(20) NOT NULL,
      EMAIL varchar2(20) NOT NULL,
      TEL varchar2(20),
      PASSWORD varchar2(10)
);

CREATE TABLE books
as
SELECT * FROM books WHERE books_seq=0;

CREATE TABLE books(
      BCODE char(5) PRIMARY KEY, NOT NULL,
      TITLE varchar2(30) NOT NULL,
      WRITER varchar2(20) NOT NULL,
      PUBLISHER varchar2(20),
      PDATE date
);

CREATE TABLE bookrent
as
SELECT * FROM bookrent WHERE bookrent_seq=0;

CREATE TABLE bookrent(
      RENT_NO number(5,0) PRIMARY KEY, NOT NULL,
      MEM_IDX number(5,0) NOT NULL,
      BCODE char(5) NOT NULL,
      RENT_DATE DATE NOT NULL,
      EXP_DATE DATE NOT NULL,
      RETURN_DATE DATE,
      delay_days number(3,0)
);

INSERT INTO bookmember (MEM_IDX, NAME, EMAIL, TEL, PASSWORD)
VALUES (10001, '이하니', 'henoy@naver.com', 010-9889-0567, 1122);
INSERT INTO bookmember (MEM_IDX, NAME, EMAIL, TEL, PASSWORD)
VALUES (10002, '이세종', 'jong@daum.net', 010-2354-6773, 2345);
INSERT INTO bookmember (MEM_IDX, NAME, EMAIL, TEL, PASSWORD)
VALUES (10003, '최행운', 'lucky@korea.com', 010-5467-8792, 9876);
INSERT INTO bookmember (MEM_IDX, NAME, EMAIL, TEL, PASSWORD)
VALUES (10004, '나길동', 'nadong@kkk.net', 010-3456-8765, 3456);
INSERT INTO bookmember (MEM_IDX, NAME, EMAIL, TEL, PASSWORD)
VALUES (10005, '강감찬', 'haha@korea.net', 010-3987-9087, 1234);
