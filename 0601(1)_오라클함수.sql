-- 문자열 함수 : 자바와 비슷한 내용으로 분석
-- 함수, 수식 결과값 확인할 때 오라클 dual 테이블 사용
SELECT concat('java', 'hello') FROM dual;
SELECT 'java' || 'hello!' FROM dual;

-- 실제로는 테이블의 컬럼으로 함수 실행합니다.
SELECT INITCAP('hello') FROM dual;        -- 예상 : Hello
FROM dual;      -- initail capital : 첫번째 대문자
SELECT UPPER('hello') FROM dual;          -- 대문자로 변환. HELLO
SELECT LOWER('OraCle') FROM dual;         -- 소문자로 변환. oracle
SELECT LENGTH('oracle') FROM dual;        -- 문자열 길이. 6
SELECT SUBSTR('java program', 3, 5)       -- 부분 추출(문자열, 위치, 길이) 결과 :
FROM dual;
SELECT SUBSTR('java program', -5, 3)      -- 부분 추출 결과 : 위치 음수이면 뒤에서부터
FROM dual;
SELECT REPLACE('java program', 'pro', '프로')       -- 문자열 바꾸기. java 프로gram
FROM dual;
SELECT instr('java program', 'og')        -- 자바의 indexOf
FROM dual; 
SELECT trim('java program')               -- 공백(불필요한 앞뒤 공백) 제거
FROM dual;
SELECT LENGTH('java program') FROM dual;           -- 공백 포함 16
SELECT LENGTH(trim('java program')) FROM dual;           -- 공백 제거 후에는 12

-- 숫자 함수(정수 또는 실수 number를 대상으로 하는 함수)
-- abs(n) : 절댓값
-- trunc(숫자, 자릿수) : 자릿수 맞추기 위해서 버림 3.177567 -> 3.17
SELECT trunc(3.177567,2) FROM dual;
-- round(숫자, 자릿수) :                   반올림 3.177567 -> 3.18
SELECT ROUND(3.177567,2) FROM dual;
-- ceil(숫자) : 실수를 정수로 올림으로 변환
SELECT ceil(3.177567) FROM dual;          -- 결과값 : 4
-- floor(숫자) : 실수를 정수로 내림으로 변환
SELECT floor(3.177567) FROM dual;         -- 결과값 : 3

-- 날짜 함수
SELECT sysdate, SYSTIMESTAMP            -- 서버의 날짜(초 단위)와 시간(ms)
FROM dual;

SELECT ADD_MONTHS(SYSDATE, 3)           -- 오늘 날짜 3개월 이후. 첫번째 인자는 날짜 형식. 두번째 더해지는 값
FROM dual;

SELECT TO_CHAR(SYSDATE, 'MONTH')        -- 오늘 날짜에서 '월' 출력. 두번째 인자로 쓰이는 날짜 포맷 더 알아보기
FROM dual;      -- 결과값

SELECT TO_CHAR(SYSDATE, 'YEAR')  AS results
FROM dual;      -- 결과값

SELECT TO_CHAR(SYSDATE, 'DAY')          -- 요일
FROM dual;      -- 결과값

SELECT
TO_CHAR(ADD_MONTHS(SYSDATE, 3), 'YYYY/MM/DD')    -- 문자열 패턴 기호 - 또는 / 또는 구분 기호 없음 가능
FROM dual;

SELECT MONTHS_BETWEEN(TO_DATE('2022/06/05'),    -- 지정된 2개의 날짜 사이에 간격(월). 결과는 소숫점
TO_DATE('2022/09/23')) FROM dual;

SELECT TRUNC(SYSDATE) - TO_DATE('20171110', 'YYYYMMDD')  -- 2개의 날짜 형식 값 간격(일)
FROM dual;    -- 2개의 날짜의 간격(일). TRUNC(SYSDATE)는 일(day)까지로 변환