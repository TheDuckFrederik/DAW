-- Crea la base de dades bd_insit si no existeix
CREATE DATABASE IF NOT EXISTS bd_insti;
-- Entrem a la base de dades
USE bd_insti;
-- Crea la taula estudis
CREATE TABLE IF NOT EXISTS estudis (
    codi_estudi VARCHAR(10) NOT NULL PRIMARY KEY,
    nom VARCHAR(100) NOT NULL
);
-- Crea la taula materies
CREATE TABLE IF NOT EXISTS materies (
    id_materia INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    codi_materia VARCHAR(20) UNIQUE,
    nom VARCHAR(100),
    hores TINYINT UNSIGNED NULL
);
-- Inserta dades a la taula estudis
INSERT INTO estudis (codi_estudi, nom)
VALUES 
("CFGS-ASIXcs", "Administració de Sistemes Informatics en Xarxa, perfil Ciberseguretat"),
("CFGS-DAW", "Desenvolupament d’Aplicacions Web"),
("CFGS-DAM", "Desenvolupament d’Aplicacions Multiplataforma"),
-- Segona tanda de inserts
("ESO LOE", "ESO"),
("BAT LOE", "BAT SH");
-- Inserta dades a la taula materies
INSERT INTO materies (codi_materia, nom, hores)
VALUES
("0484.RA1", "Disseny BD", 25),
("0484.RA3", "SQL", NULL),
-- Segona tanda de inserts (Si no es posa un NULL ni un int, fallara perque al insert hem dit que posariem 3 camps per registre). No funcionaba perque el codi_materia MAT esta repetit, i es UNIQUE. Pots ficar una cosa sense hores pero no sense nom perque les hores pot ser null (definit al create)
("0373.RA1", "Programació estructurada", 66),
("0373.RA2", "Programació modular", 37),
("0373.RA5", "Llibreries fonamentals", 38),
("0373.RA6", "Persistència en BD", 28),
("MAT", "Matemàtiques", NULL),
("TEC", "Tecnologia", NULL),
("MU", "Música", 4);
-- Els 3 enunciats: 1. Fer un INSERT a materies sense haber de posar NULL a les hores.
INSERT INTO materies (codi_materia, nom)
VALUES
("QM", "Quimica");
-- 2. Fer un select de nomes els noms de les materies
SELECT nom FROM materies;
-- 3. Borrar un registre
DELETE FROM materies WHERE codi_materia = 'QM';
-- 
