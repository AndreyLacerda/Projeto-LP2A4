CREATE DATABASE projetolp2a4;

USE projetolp2a4;

CREATE TABLE Usuario (
    email		VARCHAR(125),
    senha 		VARCHAR(45),
    PRIMARY KEY (email)
);

CREATE TABLE Personagem (
	userEmail			VARCHAR(125),
	dificuldade			INT,
    fase				INT,
    tipoCrianca			INT,
    maguila     		BOOLEAN,
    vampeta     		BOOLEAN,
    dificuldadeOriginal INT,
    PRIMARY KEY (userEmail),
    FOREIGN KEY (userEmail) REFERENCES Usuario (email)
);
DELETE FROM Personagem WHERE userEmail = 'andrey-lacerda@hotmail.com';
DELETE FROM Usuario WHERE email = 'andrey-lacerda@hotmail.com';

SELECT * FROM Usuario;
SELECT * FROM Personagem;

