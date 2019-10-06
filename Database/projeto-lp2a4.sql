CREATE DATABASE projetolp2a4;

USE projetolp2a4;

CREATE TABLE Usuario (
	usuarioId	VARCHAR(170),
	login		VARCHAR(45),
    email		VARCHAR(125),
    senha 		VARCHAR(45),
    PRIMARY KEY (usuarioId)
);

SELECT * FROM Usuario;