-- 
CREATE DATABASE IF NOT EXISTS bd_insti;
-- 
USE bd_insti;
-- 
CREATE TABLE IF NOT EXISTS estudis (
    codi_estudi VARCHAR(10) NOT NULL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);
-- 
CREATE TABLE IF NOT EXISTS materies (
    id_materia INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    codi_materia VARCHAR(20) UNIQUE,
    nom VARCHAR(100),
    hores TINYINT UNSIGNED NULL
);
-- 
CREATE TABLE IF NOT EXISTS cursos (
    id_curs INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    codi_estudi VARCHAR(10) NOT NULL,
    CONSTRAINT codi_estudi
    FOREIGN KEY (codi_estudi)
    REFERENCES estudis(codi_estudi),
	id_materia INT,
    CONSTRAINT id_materia
    FOREIGN KEY (id_materia)
    REFERENCES materies(id_materia)
);
--
INSERT INTO estudis (codi_estudi, nom)
VALUES 
("DAW", "Desenvolupament d'aplicacions Web"),
("DAM", "Desenvolupament d'aplicacions Multiplataforma"),
("ASIX", "Administracio de Sistemes Informatics en Xarxes");
-- 
INSERT INTO materies (codi_materia, nom, hores)
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
INSERT INTO cursos (codi_estudi, id_materia)
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
