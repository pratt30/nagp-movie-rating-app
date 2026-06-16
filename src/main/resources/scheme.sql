CREATE TABLE movie_ratings
(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    movie_name VARCHAR(100),
    genre VARCHAR(50),
    rating DECIMAL(2,1),
    review_count INT
);