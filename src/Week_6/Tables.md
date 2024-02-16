### DATA BASE TABLES ABOUT FILM AND USER  

-----------------------------------
### CREATE FILM TABLE
```
CREATE TABLE fılm(
 film_id  SERIAL PRIMARY KEY ,
 film_name VARCHAR NOT NULL,
 category VARCHAR NOT NULL,
 director VARCHAR(25),
 release_date DATE,
 movie_length INT,
 score DECIMAL CHECK(score BETWEEN 0 AND 10)
 
);
```
### CREATE SUBSCRIBER TABLE
```
CREATE TABLE  subscriber(
  user_id SERIAL PRIMARY KEY ,
  user_name VARCHAR NOT NULL,
  email VARCHAR,
  user_password VARCHAR(8) NOT NULL

);
```
### CREATE SUBSCRIBER_FILMS TABLE
```
CREATE TABLE subscriber_films(
   film_id INT REFERENCES(film.film_id),
   user_id INT REFERENCES (subscriber.user_id),
   situation VARCHAR NOT NULL,
   score INT CHECK(score BETWWEEN 0 AND 10)
);
```
### CREATE USER_COMMENT TABLE
```
CREATE TABLE user_comment( 
   comment_id INT PRIMERY KEY,
   user_id INT REFERENCES (subscriber.user_id),
   film_id INT REFERENCES (film.film_id),
   user_comment VARCHAR
);
```
### ADD VALUE TO  FILM TABLE
```
 INSERT INTO film(film_name,category,director,release_length,movie_length,score)
 VALUES('Film1','science fiction','Director1','1990.01.01',120,6),
        ('Film2','drama','Director2','1990.02.01',60,2),
        ('Film3','drama','Director3','1990.02.01',60,2),
        ('Film5','comedy','Director5','1990.03.01',160,7),
        ('Film8','science fiction','Director2','1990.02.01',80,4),
        ('Film7','drama','Director6','1990.05.01',10,9),
        ('Film10','comedy','Director1','1990.02.01',180,1);
```
### ADD VALUE TO  SUBSCRIBER TABLE
```
  INSERT INTO subscriber(user_name,email,user_passwoord)
  VALUES('User1','user1@gmail.com','Hal8y25'),
         ('User6','user6@gmail.com','ak3yj5'),
         ('User3','user3@gmail.com','Wllky9'),
         ('User2','user2@gmail.com','8y25'),
         ('User8','user8@gmail.com','H2y75'),
         ('User5','user5@gmail.com','Hl9pdjy'),
         ('User7','user7@gmail.com','Hal8y14');
```
### ADD VALUE TO  USER_COMMENT TABLE
```
  INSERT INTO user_comment(comment_id,user_id,film_id,user_comment)
  VALUES(1,1,7,'it was good'),
         (2,4,2,'not bad'),
         (3,2,7,'it was good'),
         (4,5,7,'good :)'),
         (5,6,7,'boring'),
         (6,3,7,'it was good');
```
### ADD VALUE TO  SUBSCRIBER_FILMS TABLE
```
  INSERT INTO subscriber_films(film_id,user_id,situation,score)
  VALUES(1,2,'done',5)
         (1,3,'in progress',6),
         (7,2,'to do',null),
         (5,2,'done',9),
         (2,2,'in progress',2),
         (6,2,'done',8),
         (6,2,'to do',null),
         (1,2,'in progress',5);
```




