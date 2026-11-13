-- =====================================================================
-- A5 · VINACOTECA · Creació de les taules i inserció de dades
-- Taules creades a partir del diagrama relacional de l'activitat.
-- Nota: la taula intermèdia es diu vi_varietat com a l'enunciat i la
-- seva segona columna és id_vi (relaciona cada vi amb les seves varietats).
-- =====================================================================
CREATE DATABASE IF NOT EXISTS bd_vinacoteca;
USE bd_vinacoteca;
--
CREATE TABLE IF NOT EXISTS denominacions_origen (
    id_denominacio_origen INT UNSIGNED AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    nom VARCHAR(30) NOT NULL,
    descripcio TEXT NOT NULL,
    hectarees INT UNSIGNED NOT NULL,
    numero_viticultors INT UNSIGNED NOT NULL
);
--
CREATE TABLE IF NOT EXISTS varietats_raim (
    id_varietat_raim INT UNSIGNED AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    nom VARCHAR(50) NOT NULL
);
--
CREATE TABLE IF NOT EXISTS bodegues (
    id_bodega INT UNSIGNED AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    nom VARCHAR(30) NOT NULL UNIQUE,
    descripcio TEXT NOT NULL,
    any_fundacio YEAR NOT NULL,
    produccio_anual INT UNSIGNED NOT NULL,
    adreca VARCHAR(100) NOT NULL,
    telefon CHAR(9) NOT NULL,
    lloc_web VARCHAR(50) NOT NULL,
    id_denominacio_origen INT UNSIGNED NOT NULL,
    FOREIGN KEY (id_denominacio_origen)
        REFERENCES denominacions_origen(id_denominacio_origen)
);
--
CREATE TABLE IF NOT EXISTS vins (
    id_vi INT UNSIGNED AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    nom VARCHAR(25) NOT NULL,
    descripcio TEXT NOT NULL,
    any_collita YEAR NOT NULL,
    tipus ENUM('blanc', 'negre', 'rosat', 'escumos') NOT NULL,
    preu_unitat DOUBLE NOT NULL,
    id_varietat_raim_principal INT UNSIGNED NOT NULL,
    id_bodega INT UNSIGNED NOT NULL,
    FOREIGN KEY (id_varietat_raim_principal)
        REFERENCES varietats_raim(id_varietat_raim),
    FOREIGN KEY (id_bodega)
        REFERENCES bodegues(id_bodega)
);
--
CREATE TABLE IF NOT EXISTS vi_varietat (
    id_varietat_raim INT UNSIGNED NOT NULL,
    id_vi INT UNSIGNED NOT NULL,
    PRIMARY KEY (id_varietat_raim, id_vi),
    FOREIGN KEY (id_varietat_raim)
        REFERENCES varietats_raim(id_varietat_raim)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (id_vi)
        REFERENCES vins(id_vi)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

-- ---------------------------------------------------------------------
-- Exercici 1. Denominacions d'origen
-- Insereix les dues DO amb un sol INSERT.
-- ---------------------------------------------------------------------
INSERT INTO denominacions_origen (nom, descripcio, hectarees, numero_viticultors)
VALUES
("Pla de Bages", "DO de la Catalunya central, terra de tines de pedra i del picapoll.", 550, 90),
("Tarragona", "DO costanera al voltant del Camp de Tarragona.", 4500, 1200);

-- ---------------------------------------------------------------------
-- Exercici 2. Varietats de raïm
-- Insereix aquestes varietats amb un sol INSERT.
-- ---------------------------------------------------------------------
INSERT INTO varietats_raim (nom)
VALUES
("Picapoll blanc"),
("Picapoll negre"),
("Mandó"),
("Malvasia"),
("Garnatxa roja");

-- ---------------------------------------------------------------------
-- Exercici 3. Bodegues
-- ---------------------------------------------------------------------

-- a) Primer mirem quin id té la DO Pla de Bages...
SELECT id_denominacio_origen
FROM denominacions_origen
WHERE nom = "Pla de Bages";
-- ...i ara inserim el Celler Les Tines escrivint aquest número directament (id = 1).
INSERT INTO bodegues (nom, descripcio, any_fundacio, produccio_anual, adreca, telefon, lloc_web, id_denominacio_origen)
VALUES
("Celler Les Tines", "Celler que recupera les antigues tines de pedra.", 2008, 35000, "Camí de les Tines s/n, Artés", "938000201", "www.lestines.cat", 1);

-- b) Les altres dues bodegues amb un sol INSERT, obtenint el id_denominacio_origen
--    amb una subconsulta a partir del nom de la DO.
INSERT INTO bodegues (nom, descripcio, any_fundacio, produccio_anual, adreca, telefon, lloc_web, id_denominacio_origen)
VALUES
("Celler Vinya del Bages", "Cooperativa de petits viticultors del Bages.", 1964, 150000, "Carrer de la Vinya 8, Navarcles", "938000202", "www.vinyadelbages.cat",
 (SELECT id_denominacio_origen FROM denominacions_origen WHERE nom = "Pla de Bages")),
("Celler Mas del Camp", "Masia vitícola a tocar del mar.", 1976, 220000, "Mas del Camp, el Morell", "977000203", "www.masdelcamp.cat",
 (SELECT id_denominacio_origen FROM denominacions_origen WHERE nom = "Tarragona"));

-- c) Avantatge de la subconsulta respecte de l'apartat a): no cal fer abans el
--    SELECT per mirar quin id ha assignat l'AUTO_INCREMENT ni apuntar-lo a ma.
--    La pròpia comanda troba el número correcte, així que l'INSERT funciona
--    encara que les files s'hagin inserit en un altre ordre (o que s'esborrin
--    i es tornin a inserir) i no hi ha manera d'escriure un id equivocat.

-- ---------------------------------------------------------------------
-- Exercici 4. Vins
-- Insereix els vins amb un sol INSERT. Obtén l'identificador de la bodega
-- i la varietat principal amb subconsultes.
-- ---------------------------------------------------------------------
-- (La taula de vins de l'enunciat no estava disponible: aquests vins són
--  inventats, però segueixen el format de l'activitat.)
INSERT INTO vins (nom, descripcio, any_collita, tipus, preu_unitat,
                  id_varietat_raim_principal, id_bodega)
VALUES
("Picapoll de les Tines", "Vi blanc fresc i mineral, elaborat amb raïm de vinyes velles rodejades de tines de pedra.", 2022, "blanc", 11.50,
 (SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Picapoll blanc"),
 (SELECT id_bodega FROM bodegues WHERE nom = "Celler Les Tines")),
("Mandó de les Tines", "Vi negre lleuger i afruitat, fet amb el raïm autòcton del Bages.", 2021, "negre", 14.20,
 (SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Mandó"),
 (SELECT id_bodega FROM bodegues WHERE nom = "Celler Les Tines")),
("Negre de Navarcles", "Vi negre jove de cooperativa, honrat i amb bona relació qualitat-preu.", 2021, "negre", 9.95,
 (SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Picapoll negre"),
 (SELECT id_bodega FROM bodegues WHERE nom = "Celler Vinya del Bages")),
("Malvasia dolça", "Vi blanc dolç de postres, amb aromes de fruita confitada i mel.", 2020, "blanc", 12.80,
 (SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Malvasia"),
 (SELECT id_bodega FROM bodegues WHERE nom = "Celler Vinya del Bages")),
("Garnatxa del Camp", "Vi rosat fresc i salí, veremat a tocar del mar del Camp de Tarragona.", 2022, "rosat", 8.90,
 (SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Garnatxa roja"),
 (SELECT id_bodega FROM bodegues WHERE nom = "Celler Mas del Camp"));

-- ---------------------------------------------------------------------
-- Exercici 5. Varietats de cada vi
-- Omple la taula vi_varietat fent servir subconsultes tant per a
-- l'identificador del vi com per al de la varietat.
-- ---------------------------------------------------------------------
-- (Parelles inventades a partir dels vins de l'exercici 4: cada vi està
--  format per la seva varietat principal i alguna més.)
INSERT INTO vi_varietat (id_varietat_raim, id_vi)
VALUES
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Picapoll blanc"), (SELECT id_vi FROM vins WHERE nom = "Picapoll de les Tines")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Malvasia"),      (SELECT id_vi FROM vins WHERE nom = "Picapoll de les Tines")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Mandó"),         (SELECT id_vi FROM vins WHERE nom = "Mandó de les Tines")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Picapoll negre"),(SELECT id_vi FROM vins WHERE nom = "Mandó de les Tines")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Picapoll negre"),(SELECT id_vi FROM vins WHERE nom = "Negre de Navarcles")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Mandó"),         (SELECT id_vi FROM vins WHERE nom = "Negre de Navarcles")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Malvasia"),      (SELECT id_vi FROM vins WHERE nom = "Malvasia dolça")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Garnatxa roja"), (SELECT id_vi FROM vins WHERE nom = "Garnatxa del Camp")),
((SELECT id_varietat_raim FROM varietats_raim WHERE nom = "Picapoll negre"),(SELECT id_vi FROM vins WHERE nom = "Garnatxa del Camp"));
--
