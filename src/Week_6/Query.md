### 1 - List highest rated movies
```
   SELECT * FROM film
   ORDER BY score DESC;
```
### 2 - List 'User8' comments
```
   SELECT user_comment.user_comment FROM subscriber
   JOIN user_comment ON subscriber.user_id=user_comment.useR_id
   WHERE subscriber.user_name='User8';
```
|        user_comment |
|--------------------:|
|              good:) |

                
### 3 - Movie names and comments watched by the user
```
  SELECT film.film_name, user_comment.user_comment FROM subscriber
  JOIN user_comment ON subscriber.user_id=user_comment.useR_id
  JOIN film ON user_comment.film_id=film.film_id
  WHERE subscriber.user_name='User6';
```
|  | film_name | user_comment |
|--|:---------:|-------------:|
|  |  Film10   | it was good. |
### 4 -Select a movie and list all states for this movie and the users who made these states
```
  SELECT film.film_name,subscriber_films.situation  FROM film
  JOIN subscriber_films ON film.film_id=subscriber_films.film_id
  WHERE film.film_name='Film7';
```
|  | user_name | film_name | situation |
|--|:---------:|----------:|:----------|
|  |   User6   |     Film7 | done      |
|  |   User6   |     Film7 | todo      |           

### 5 - Score average for 'Film7' and situation=done
```
  SELECT AVG(subscriber_films.score)  FROM film
  JOIN subscriber_films ON subscriber_films.film_id=film.film_id
  WHERE film.film_name='Film1' AND subscriber_films.situation='done' ;
```
|          |     avg      |
|---------:|:------------:|
|          | 5.0000000000 |
### 6 - Give Film name and  score values when score >5 
```
 SELECT film.film_name, subscriber_films.score  FROM film
 JOIN subscriber_films ON subscriber_films.film_id=film.film_id
 WHERE subscriber_films.score > 5 ;
```
|     | film_name | score |
|-----|:---------:|------:|
| 1   |   Film1   |     6 |
| 2   |   Film8   |     9 |
| 3   |   Film7   |     8 |
### 7- Give users who haven't commented
```
  SELECT subscriber.user_name FROM subscriber
  LEFT JOIN subscriber_films ON subscriber.user_id=subscriber_films.user_id
  WHERE  subscriber_films.situation  IS NULL;
```
|   | user_name | 
|---|:---------:|
| 1 |   User8   |
| 2 |   User5   |
| 3 |   User2   |
| 4 |   User1   |
| 5 |  User87   |

### 8 - Bring category of film when score of film greater than 5
```
 SELECT category,count(*) FROM film
 WHERE film.score>5
 GROUP BY category;
```
|   |    category     | count |  
|---|:---------------:|------:|
| 1 | science fiction |     1 | 
| 2 |      drama      |     1 |  
| 3 |     comedy      |     1 |  
### 9 - Bring the comments  on a director's films
```
 SELECT film.film_name, user_comment.user_comment FROM film
 JOIN user_comment ON user_comment.film_id=film.film_id 
 WHERE film.director='Director2';
```
|   | film_name  | user_comment  |
|---|:----------:|:--------------|
| 1 |   Film2    | not bad.      |
