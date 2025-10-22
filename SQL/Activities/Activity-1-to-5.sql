CREATE TABLE salesman (
    salesman_id int PRIMARY KEY,
    salesman_name varchar2(32) NOT NULL,
    salesman_city varchar2(32),
    commission int
);
DESCRIBE salesman;
INSERT INTO salesman VALUES(1,'RAM','PUNE',15);
INSERT INTO salesman VALUES(5002,'Nail Knite','Paris',13);
INSERT INTO salesman VALUES( 5005,'Pit Alex','London',16);
INSERT INTO salesman VALUES( 5006,'McLyon','Paris',12);
INSERT INTO salesman VALUES( 5007 ,'Paul Adam','Rome',17);

Select * from SALESMAN;

SELECT salesman_id , salesman_city FROM salesman;
SELECT * FROM SALESMAN WHERE salesman_city =('Paris');
SELECT salesman_id, commission FROM SALESMAN WHERE salesman_name =('Paul Adam');

ALTER TABLE SALESMAN ADD grade int;
UPDATE SALESMAN SET grade=100;

Select * from SALESMAN;

UPDATE SALESMAN SET grade=200 WHERE salesman_city='Rome';
UPDATE SALESMAN SET grade=300 WHERE salesman_name='RAM';
UPDATE SALESMAN SET salesman_name = 'Pierre' WHERE salesman_name ='McLyon'

Select * from SALESMAN;