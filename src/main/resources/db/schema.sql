DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE CUSTOMER
(
    id         INT PRIMARY KEY,
    first_name VARCHAR(30),
    last_name  VARCHAR(30),
    address    VARCHAR(255),
    city       VARCHAR(80),
    telephone  VARCHAR(20),
    email      VARCHAR(20)
);