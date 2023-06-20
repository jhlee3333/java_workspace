
/*작성자 : 이종협 */


/* Create Tables */

CREATE TABLE score
(
	scoreno number NOT NULL,
	exam1 date NOT NULL,
	exam2 date NOT NULL,
	examscore number NOT NULL,
	studentnumber number(7,0) NOT NULL,
	studycode varchar2(5) NOT NULL,
	teacherID char(4) NOT NULL,
	PRIMARY KEY (scoreno)
);


CREATE TABLE Student
(
	studentnumber number(7,0) NOT NULL UNIQUE,
	name varchar2(3) NOT NULL,
	birthday varchar2(8) NOT NULL,
	address number NOT NULL,
	PRIMARY KEY (studentnumber)
);


CREATE TABLE subject
(
	studycode varchar2(5) NOT NULL UNIQUE,
	studyname varchar2(2) NOT NULL,
	teacherID varchar2(4) NOT NULL,
	studymonth varchar2(2) NOT NULL,
	PRIMARY KEY (studycode)
);


CREATE TABLE teacher
(
	teacherID char(4) NOT NULL UNIQUE,
	teachername varchar2(3) NOT NULL,
	join date NOT NULL,
	major char(4) NOT NULL,
	PRIMARY KEY (teacherID)
);



/* Create Foreign Keys */

ALTER TABLE score
	ADD FOREIGN KEY (studentnumber)
	REFERENCES Student (studentnumber)
;


ALTER TABLE score
	ADD FOREIGN KEY (studycode)
	REFERENCES subject (studycode)
;


ALTER TABLE score
	ADD FOREIGN KEY (teacherID)
	REFERENCES teacher (teacherID)
;



