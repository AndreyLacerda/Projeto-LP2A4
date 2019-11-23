CREATE DATABASE projetolp2a4;

USE projetolp2a4;

CREATE TABLE Usuario (
    email		VARCHAR(125),
    senha 		VARCHAR(45),
    dific		INT,
    PRIMARY KEY (email)
);

SELECT * FROM Usuario;