CREATE DATABASE projetolp2a4;

USE projetolp2a4;

CREATE TABLE Usuario (
    email		VARCHAR(125),
    senha 		VARCHAR(45),
);

CREATE TABLE Personagem (
	dific		INT,
    fase		INT,
    tipoC		INT,
    maguila     BOOLEAN,
    vampeta     BOOLEAN,
    PRIMARY KEY (dific)
)

SELECT * FROM Usuario;