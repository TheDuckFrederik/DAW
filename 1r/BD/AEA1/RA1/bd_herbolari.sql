--
CREATE DATABASE IF NOT EXISTS bd_herbolari;
USE bd_herbolari;
--
CREATE TABLE IF NOT EXISTS ingredients (
    id_ingredient INT AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    nom_comu VARCHAR(100) NOT NULL,
    nom_cientific VARCHAR(200) NOT NULL,
    descripcio TEXT NOT NULL,
    foto_flor VARCHAR(100) NULL,
    foto_planta VARCHAR(100) NULL,
    il_ilustracio VARCHAR(100) NULL
);
--
CREATE TABLE IF NOT EXISTS pocions (
    id_pocio INT AUTO_INCREMENT NOT NULL UNIQUE PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    descripcio TEXT NOT NULL
);
--
CREATE TABLE IF NOT EXISTS ingredients_pocions (
    id_ingredient INT NOT NULL,
    id_pocio INT NOT NULL,
    quantitat DOUBLE NOT NULL,
    PRIMARY KEY (id_ingredient, id_pocio),
    FOREIGN KEY (id_ingredient)
        REFERENCES ingredients(id_ingredient)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (id_pocio)
        REFERENCES pocions(id_pocio)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
--
INSERT INTO ingredients (nom_comu, nom_cientific, descripcio)
VALUES
("Menta", "Mentha piperita L", "És una planta usada comunament com a aromatitzant i ocasionalment com a ingredient de pocions, amb tija i fulles de color verd."),
("Valeriana", "Valeriana officinalis", "Era coneguda en temps medievals com \"Sana Tot\", reconeguda per les seves propietats sedants i antiespasmòdiques, i per tant era usada com a remei per dormir i calmar els nervis i més tard per al tractament de l'epilèpsia."),
("Espígol", "Lavandula angustifolia", "Ès una flor que destaca pel seu \"color bonic\"i \"fragància relaxant\". Es pot utilitzar com a ingredient en una varietat de pocions.
>"),
("Mandràgora", "Mandragora officinarum", "És una planta màgica i sensible que té una arrel que s'assembla a un ésser humà (com un nadó quan la planta és jove, però madura a mesura que la planta creix). Quan madura, el seu crit pot ser fatal per a qualsevol persona que l'escolti."),
("Acònit", "Aconitum", "Aquesta planta ara només es troba en llocs silvestres. Les seves flors són útils per fer pocions, però les seves fulles són molt tòxiques. La seva arrel es pot utilitzar com a ingredient de pocions."),
("Bitxo", "Capsicum annuum", "És de forma prima i allargada. Presenta un alt contingut en capsaïcina i per aquest motiu és intensament coent o picant. S'utilitza com a condiment culinari de molts plats i salses.");
--
INSERT INTO pocions (nom, descripcio)
VALUES
("Alè de foc", "És una poció perillosa que pot fer que una persona exhali foc."),
("Pòcima per dormir", "També coneguda com poció somnífera o poció adormidora, és una poció que causa al bevedor, gairebé instantàniament, un son profund però temporal."),
("Antídot per verins comuns", "És una poció i antídot que contrarresta verins ordinaris, com els de mossegades i picades de criatures.");
--
INSERT INTO ingredients_pocions (id_ingredient, id_pocio, quantitat)
VALUES
(1, 1, 30.2),
(2, 1, 50.5),
(3, 1, 22.5),
(6, 1, 335.4),
(4, 2, 40.6),
(2, 2, 300),
(1, 2, 50.6),
(3, 3, 10.6),
(1, 3, 25.6),
(5, 3, 2.6);
--
