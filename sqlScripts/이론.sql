SELECT * FROM bookmember;
SELECT * FROM books;
SELECT * FROM bookrent;

CREATE TABLE bookmember(
     MEM_IDX number(5,0) NOT NULL,
     NAME varchar2(20) NOT NULL,
     EMAIL varchar2(20) NOT NULL,
     TEL varchar2(20),
     PASSWORD varchar2(10),
     PRIMARY key
);

INSERT INTO bookmember(MEM_IDX, NAME, EMAIL, TEL, PASSWORD) VALUES();
INSERT INTO bookmember
VALUES ('10,001', '이하니', 'honey@naver.com', '010-9889-0567', '1122');
INSERT INTO bookmember
VALUES ('10,002', '이세종', 'jong@daum.net', '010-2354-6773', '2345');
INSERT INTO bookmember
VALUES ('10,003', '최행운', 'lucky@korea.com', '010-5467-8792', '9876');
INSERT INTO bookmember
VALUES ('10,004', '나길동', 'nadong@kkk.net', '010-3456-8765', '3456');
INSERT INTO bookmember
VALUES ('10,005', '강감찬', 'haha@korea.net', '010-3987-9087', '1234');

CREATE TABLE books(
     BCODE char(5) NOT NULL,
     TITLE varchar2(30) NOT NULL,
     WRITER varchar2(20) NOT NULL,
     PUBLISHER varchar2(20),
     PDATE DATE,
     PRIMARY key
);

INSERT INTO books(BCODE, TITLE, WRITER, PUBLISHER, PDATE) VALUES();
INSERT INTO books
VALUES ('A1101', '코스모스', '칼세이건', '사이언스북스', '2006-12-01');
INSERT INTO books
VALUES ('B1101', '해커스토익', '이해커', '해커스랩', '2018-07-10');
INSERT INTO books
VALUES ('C1101', '푸른사자 와니니', '이현', '창비', '2015-06-20');
INSERT INTO books
VALUES ('A1102', '페스트', '알베르트 까뮈', '민음사', '2011-03-01');

CREATE TABLE bookrent(
     RENT_NO number(5,0) NOT NULL,
     MEM_IDX number(5,0) NOT NULL,
     BCODE char(5) NOT NULL,
     RENT_DATE DATE NOT NULL,
     EXP_DATE DATE NOT NULL,
     RETURN_DATE DATE,
     DELAY_DAYS number(3,0),
     PRIMARY key
);

INSERT INTO bookrent(RENT_NO, MEM_IDX, BCODE, RENT_DATE, EXP_DATE, RETURN_DATE, DELAY_DAYS) VALUES();
INSERT INTO bookrent
VALUES ('1', '10,001', 'B1101', '2023-05-01 14:22:00', '2023-05-15 00:00:00', '2023-05-14 11:30:00', '-1');
INSERT INTO bookrent
VALUES ('2', '10,002', 'C1101', '2023-06-12 17:04:00', '2023-06-25 00:00:00', NULL, NULL);
INSERT INTO bookrent
VALUES ('3', '10,003', 'B1101', '2023-06-03 10:15:00', '2023-06-17 00:00:00', '2023-06-17 11:33:00', '0');
INSERT INTO bookrent
VALUES ('4', '10,004', 'C1101', '2023-04-03 13:34:00', '2023-04-17 00:00:00', '2023-04-15 14:20:00', '-2');
INSERT INTO bookrent
VALUES ('5', '10,001', 'A1101', '2023-06-16 11:11:00', '2023-06-30 00:00:00', NULL, NULL);
INSERT INTO bookrent
VALUES ('6', '10,003', 'A1102', '2023-06-17 11:41:00', '2023-07-01 00:00:00', NULL, NULL);
INSERT INTO bookrent
VALUES ('7', '10,002', 'A1101', '2023-05-15 13:42:00', '2023-05-29 00:00:00', '2023-05-30 12:42:00', '1');

-- 회원은 1회 1권의 책을 대여합니다. 동일한 코드의 책을 2번 이상 대여할 수 없습니다.
-- 반납 기한 날짜는 대여 날짜+14일로 자동 저장됩니다.
-- 반납 날짜가 null이면 아직 반납을 하지 않은 상태입니다.
-- 반납을 하면 연체일을 계산하여 저장합니다.