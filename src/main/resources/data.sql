INSERT INTO specialty (name) VALUES
('History') ,
('Philology'),
('Computer Science');
COMMIT;

INSERT INTO classroom (number) VALUES
(123),
(134),
(156),
(178),
(199),
(223),
(243),
(263),
(283)
;
COMMIT;

INSERT INTO groups (name, specialty_id) VALUES
                                 ('16CS',3),
                                 ('17CS',3),
                                 ('11H',1),
                                 ('13P',2),
                                 ('23P',2),
                                 ('44CS',3);
COMMIT;

INSERT INTO subject (name) VALUES
                                 ('History') ,
                                 ('English'),
                                 ('French'),
                                 ('German'),
                                 ('Java'),
                                 ('Scala'),
                                 ('Haskel'),
                                 ('Literature'),
                                 ('Mathematica');
COMMIT;

INSERT INTO students (first_name, last_name, year, group_id) VALUES
                               ('Nazar','Mahno',1,1) ,
                               ('Stepan','Giga',1,1),
                               ('Ivo','Bobul',1,1),
                               ('Sashko','Starodub',1,2),
                               ('Agata','Tesak',1,3),
                               ('Kyrylo','Kovalchuk',1,3),
                               ('Dmytro','Iva',1,2),
                               ('Nataly','Kan',1,3),
                               ('Max','Rudenko',1,2);
COMMIT;

INSERT INTO professor (first_name, last_name) VALUES
                               ('Angelika','Tovarnjak') ,
                               ('Mykyta','Lys'),
                               ('Chak','Nosus'),
                               ('Semen','Gavrynjuk'),
                               ('Tamara','Loboda'),
                               ('Valerii','Smith'),
                               ('Leonid','Novak');
COMMIT;

INSERT INTO professors_to_subject (number_hours, professor_id, subject_id) VALUES
                                                  (123,1,1) ,
                                                  (211,2,2),
                                                  (99, 2,3),
                                                  (322,4,5),
                                                  (350,5,5),
                                                  (166,6,7),
                                                  (233,7,9);
COMMIT;


INSERT INTO specialty_to_subject (number_hours, year, specialty_id, subject_id) VALUES
 (234,1,3,2),
 (400,1,3,5),
 (300,1,3,9),
 (322,1,3,5),
 (350,1,2,2),
 (166,1,2,3),
 (233,1,1,2);
COMMIT;

INSERT INTO students_to_subject (mark, student_id, subject_id) VALUES
(234,1,2),
(400,1,5),
(300,1,9),
(322,2,5),
(350,2,2),
(166,2,3),
(233,3,2);
COMMIT;


INSERT INTO schedule (date, class_room_id, group_id, professor_id, subject_id) VALUES
('2021-12-25',1,1,2,2),
('2021-12-25',2,1,4,5),
('2021-12-25',3,1,7,9),
('2021-12-25',4,3,2,2),
('2021-12-25',5,2,2,2),
('2021-12-25',6,2,4,5),
('2021-12-25',7,2,7,9);
COMMIT;









