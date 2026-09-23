-- 
CREATE DATABASE IF NOT EXISTS DB_INSTI;
-- 
USE DB_INSTI;
-- 
CREATE TABLE IF NOT EXISTS estudis (
    idEstudi VARCHAR(10) NOT NULL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);
-- 
CREATE TABLE IF NOT EXISTS materies (
    idMateria INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    codiMateria VARCHAR(20) UNIQUE,
    nom VARCHAR(100),
    hores TINYINT UNSIGNED NULL
);
-- 
CREATE TABLE IF NOT EXISTS cursos (
    idCurs INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    idEstudi VARCHAR(10) NOT NULL,
    CONSTRAINT idEstudi
    FOREIGN KEY (idEstudi)
    REFERENCES estudis(idEstudi),
	idMateria INT,
    CONSTRAINT idMateria
    FOREIGN KEY (idMateria)
    REFERENCES materies(idMateria)
);
--
INSERT INTO estudis (idEstudi, nom)
VALUES 
("DAW", "Desenvolupament d'aplicacions Web"),
("DAM", "Desenvolupament d'aplicacions Multiplataforma"),
("ASIX", "Administracio de Sistemes Informatics en Xarxes");
-- 
INSERT INTO materies (codiMateria, nom, hores)
VALUES
("SASP", "Sostenibilitat aplicada al sistema productiu", NULL),
("ED", "Entorns de desenvolupament", 99),
("PRO", "Programació", NULL),
("BD", "Bases de dades", NULL),
("SI", "Sistemes informàtics", NULL),
("IPO1", "Itinerari professional per a l'ocupabilitat 1", NULL),
("DASP", "Digitalització aplicada als sistemes productius", NULL),
("LMSGI", "Llenguatges de marques i sistemes de gestió de la informació", NULL),
("DWES", "Desenvolupament web en entorn servidor", NULL),
("DIW", "Disseny d'interfcies web", NULL);
-- 
INSERT INTO cursos (idEstudi, idMateria)
VALUES
("ASIX", 4),
("DAM", 4),
("DAW", 1),
("DAW", 2),
("DAW", 3),
("DAW", 4),
("DAW", 5),
("DAW", 6),
("DAW", 7),
("DAW", 8),
("DAW", 9),
("DAW", 10);
-- 
