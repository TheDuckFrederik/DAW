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
INSERT INTO estudis (idEstudi, nom)
VALUES 
("DAW", "Desenvolupament d'aplicacions Web"),
("DAM", "Desenvolupament d'aplicacions Multiplataforma"),
("ASIX", "Administracio de Sistemes Informatics en Xarxes");
-- 
