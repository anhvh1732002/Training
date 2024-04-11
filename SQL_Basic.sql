Create database DBResearch;
Use DBResearch;

-------------------------------------- Primary key
Create table Student(
	Student_ID INT PRIMARY KEY,
    Name VARCHAR(255),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    Address VARCHAR(255)
);

Create table Subject(
	Subject_ID INT PRIMARY KEY,
    SubjectName VARCHAR(255),
    Teacher VARCHAR(255)
);

Create table Grade(
	Grade_ID INT PRIMARY KEY,
    Student_ID INT,
    Subject_ID INT,
    Score FLOAT,
    FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID),
    FOREIGN KEY (Subject_ID) REFERENCES Subject(Subject_ID)
);

-- Insertdata
INSERT INTO Student (Student_ID, Name, DateOfBirth, Gender, Address)
VALUES
    (1, 'John Doe', '2000-01-01', 'Male', '123 Main St'),
    (2, 'Jane Smith', '2001-03-15', 'Female', '456 Elm St'),
    (3, 'David Brown', '1999-07-20', 'Male', '789 Oak St'),
    (4, 'Emily Johnson', '2002-05-10', 'Female', '101 Pine St'),
    (5, 'David Doe', '2002-02-02', 'Male', '101 Oak St');
    
INSERT INTO Subject (Subject_ID, SubjectName, Teacher)
VALUES
    (1, 'Mathematics', 'Mr. Smith'),
    (2, 'Physics', 'Ms. Johnson'),
    (3, 'History', 'Mrs. Davis'),
    (4, 'Biology', 'Dr. White');
    
INSERT INTO Grade (Grade_ID, Student_ID, Subject_ID, Score)
VALUES
    (1, 1, 1, 85),
    (2, 1, 2, 78),
    (3, 2, 1, 92),
    (4, 2, 3, 88);    

-------------------------------------- Index
alter table Student add index idx_studentId (`Student_ID`);

-------------------------------------- Join
-- Inner join
select s.Name, g.Score from Student s inner join Grade g on s.Student_ID = g.Student_ID;
-- Left join
select s.Name, g.Score from Student s left join Grade g on s.Student_ID = g.Student_ID order by s.Name;
-- Right join
select g.Score, s.Name from Student s right join Grade g on g.Student_ID = s.Student_ID order by g.Score;
-- MySQL does not support Full outer join

-------------------------------------- Group by
select s.Name,AVG(g.Score) from Student s inner join Grade g on s.Student_ID = g.Student_ID Group by s.name;

-------------------------------------- Some support functions
select SUM(Score) from Grade;
select AVG(Score) from Grade;
select COUNT(Score) from Grade;
select MAX(Score) from Grade;
select MIN(Score) from Grade;
select UPPER(Name) from Student;
select LOWER(Name) from Student;
select CONCAT('Thầy ', Teacher, ' dạy môn ', SubjectName) AS sbj_info FROM Subject;
-- select DATE(columnname) from tablename
-- select TIME(columnname) from tablename

