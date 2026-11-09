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
-- A4.2 Extra inserts
-- =====================================================================
-- HERBOLARI DE HOGWARTS · Registres addicionals
-- Executar DESPRÉS d'haver creat la BD i inserit les dades de l'activitat.
-- Els id de la taula ingredients_pocions s'obtenen amb subconsultes a partir
-- del nom, així no cal saber quin id ha assignat l'AUTO_INCREMENT.
-- =====================================================================
USE bd_herbolari;
-- ---------------------------------------------------------------------
-- 1. Nous ingredients
-- ---------------------------------------------------------------------
INSERT INTO ingredients (nom_comu, nom_cientific, descripcio, foto_flor, foto_planta, il_ilustracio) VALUES
('Díctam', 'Dictamnus albus',
 'Planta màgica amb propietats curatives molt potents. La seva essència fa que les ferides superficials es tanquin a l''instant i sembla que hagin cicatritzat fa dies.',
 'img/flor_dictam.jpg', 'img/planta_dictam.jpg', 'img/il_dictam.jpg'),
('Donzell', 'Artemisia absinthium',
 'Planta d''olor intensa i gust molt amarg. La seva infusió és un ingredient clau del Filtre de la mort en vida i de l''Elixir de l''eufòria.',
 'img/flor_donzell.jpg', 'img/planta_donzell.jpg', 'img/il_donzell.jpg'),
('Asfòdel', 'Asphodelus albus',
 'Planta amb flors blanques en forma d''estrella. L''arrel en pols, barrejada amb infusió de donzell, produeix un somnífer tan potent que es coneix com a Filtre de la mort en vida.',
 'img/flor_asfodel.jpg', 'img/planta_asfodel.jpg', 'img/il_asfodel.jpg'),
('Ortiga', 'Urtica dioica',
 'Planta de fulles dentades cobertes de pèls urticants. Les fulles seques són un dels primers ingredients que aprenen a fer servir els alumnes de primer, per exemple a la Cura per a furóncols.',
 'img/flor_ortiga.jpg', 'img/planta_ortiga.jpg', 'img/il_ortiga.jpg'),
('El·lèbor', 'Helleborus niger',
 'Planta d''hivern amb flors blanques que floreix per Nadal. El seu xarop és un ingredient de la Poció de la pau, que calma l''ansietat i l''agitació.',
 'img/flor_ellebor.jpg', 'img/planta_ellebor.jpg', 'img/il_ellebor.jpg'),
('Centinodi', 'Polygonum aviculare',
 'Herba rastrera molt comuna als camins. És un dels ingredients de la Poció multisucs i s''ha de collir durant la lluna plena.',
 'img/flor_centinodi.jpg', 'img/planta_centinodi.jpg', 'img/il_centinodi.jpg'),
('Margarida', 'Bellis perennis',
 'Flor petita de pètals blancs i cor groc. Les seves arrels, tallades a trossets iguals, s''utilitzen a la Solució encongidora.',
 'img/flor_margarida.jpg', 'img/planta_margarida.jpg', 'img/il_margarida.jpg'),
('Llevístec', 'Levisticum officinale',
 'Planta aromàtica de gust semblant a l''api. És un dels ingredients del Beuratge confusor, que provoca confusió a qui se''l beu.',
 'img/flor_llevistec.jpg', 'img/planta_llevistec.jpg', 'img/il_llevistec.jpg'),
('Cocleària', 'Cochlearia officinalis',
 'Petita planta de fulles carnoses que creix a prop del mar. Els mariners la menjaven per evitar l''escorbut i a Hogwarts s''utilitza al Beuratge confusor.',
 'img/flor_coclearia.jpg', 'img/planta_coclearia.jpg', NULL),
('Gingebre', 'Zingiber officinale',
 'Rizoma de gust picant i aromàtic. L''arrel tallada s''utilitza a la Poció per aguditzar l''enginy i escalfa el cos de qui se la pren.',
 'img/flor_gingebre.jpg', 'img/planta_gingebre.jpg', 'img/il_gingebre.jpg'),
('Àrnica', 'Arnica montana',
 'Planta de muntanya amb flors grogues semblants a les margarides. Es fa servir per tractar cops i blaus, però no s''ha de prendre mai per via oral.',
 'img/flor_arnica.jpg', 'img/planta_arnica.jpg', 'img/il_arnica.jpg'),
('Belladona', 'Atropa belladonna',
 'Planta molt tòxica de baies negres i brillants. En quantitats molt petites provoca deliri i confusió, i en quantitats grans pot ser mortal.',
 NULL, 'img/planta_belladona.jpg', 'img/il_belladona.jpg'),
('Romaní', 'Rosmarinus officinalis',
 'Arbust aromàtic de fulles estretes i flors blavoses, molt comú a la Mediterrània. Ajuda a estimular la memòria i la concentració.',
 'img/flor_romani.jpg', 'img/planta_romani.jpg', 'img/il_romani.jpg'),
-- Ingredient que (de moment) no s'utilitza en cap poció
('Camamilla', 'Matricaria chamomilla',
 'Flor petita i aromàtica molt utilitzada en infusions digestives i relaxants. La professora Sprout la cultiva als hivernacles, però encara no forma part de cap recepta de l''Herbolari.',
 'img/flor_camamilla.jpg', 'img/planta_camamilla.jpg', NULL);
-- Els 6 ingredients de l'activitat (Menta, Valeriana, Espígol, Mandràgora,
-- Acònit i Bitxo) ja existeixen a la BD amb els id 1-6, així que no es
-- tornen a inserir: duplicar-los faria fallar les subconsultes de l'apartat 3.

-- ---------------------------------------------------------------------
-- 2. Noves pocions
-- ---------------------------------------------------------------------
INSERT INTO pocions (nom, descripcio) VALUES
('Filtre de la mort en vida',
 'Somnífer extremadament potent que sumeix el bevedor en un son tan profund que sembla mort. Mal preparat pot ser letal.'),
('Elixir de l''eufòria',
 'Provoca una sensació de felicitat intensa i sense motiu. Com a efectes secundaris pot provocar cantar massa i tocar-se el nas.'),
('Cura per a furóncols',
 'Poció senzilla que elimina els furóncols de la pell. És una de les primeres pocions que s''aprenen a primer curs.'),
('Poció de la pau',
 'Calma l''ansietat i alleuja l''agitació. Si s''afegeix massa quantitat d''algun ingredient, el bevedor pot caure en un son profund i, de vegades, irreversible.'),
('Poció multisucs',
 'Permet que qui la beu adopti l''aparença física d''una altra persona durant una hora. Necessita un tros de la persona en qui es vol convertir.'),
('Solució encongidora',
 'Fa que qui la beu, o l''objecte on s''aboca, s''encongeixi i torni a un estat més jove.'),
('Essència de díctam',
 'Líquid curatiu de color marró que tanca les ferides i fa que la pell es regeneri.'),
('Beuratge confusor',
 'Provoca confusió i comportament imprudent en qui se''l beu.'),
('Poció matallops',
 'Poció molt difícil d''elaborar que permet a un home llop conservar la seva ment humana durant la transformació. S''ha de prendre la setmana abans de la lluna plena.'),
('Poció per aguditzar l''enginy',
 'Millora la capacitat de raonar i la concentració de qui se la pren. És molt popular entre els alumnes en època d''exàmens.'),
('Pasta contra els blaus',
 'Pasta de color groc que s''aplica sobre la pell i fa desaparèixer els blaus en pocs minuts.'),
('Poció contra el refredat',
 'Cura els refredats a l''instant, però fa sortir fum per les orelles durant unes quantes hores.'),
-- Poció de la qual encara no es coneix la recepta
('Felix Felicis',
 'També coneguda com a "sort líquida". Fa que el bevedor tingui sort en tot el que intenti mentre duren els efectes. La seva recepta és molt complexa i encara no s''ha afegit a l''Herbolari.');

-- ---------------------------------------------------------------------
-- 3. Receptes: (id_ingredient, id_pocio, grams)
--    Cada id s'obté amb una subconsulta que el cerca pel nom.
-- ---------------------------------------------------------------------
INSERT INTO ingredients_pocions (id_ingredient, id_pocio, quantitat) VALUES
-- Filtre de la mort en vida
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Asfòdel'),   (SELECT id_pocio FROM pocions WHERE nom = 'Filtre de la mort en vida'), 45.30),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Donzell'),   (SELECT id_pocio FROM pocions WHERE nom = 'Filtre de la mort en vida'), 60.00),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Valeriana'), (SELECT id_pocio FROM pocions WHERE nom = 'Filtre de la mort en vida'), 120.75),
-- Elixir de l'eufòria
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Menta'),     (SELECT id_pocio FROM pocions WHERE nom = 'Elixir de l''eufòria'), 15.40),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Donzell'),   (SELECT id_pocio FROM pocions WHERE nom = 'Elixir de l''eufòria'), 8.20),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Espígol'),   (SELECT id_pocio FROM pocions WHERE nom = 'Elixir de l''eufòria'), 12.00),
-- Cura per a furóncols
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Ortiga'),    (SELECT id_pocio FROM pocions WHERE nom = 'Cura per a furóncols'), 25.50),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Menta'),     (SELECT id_pocio FROM pocions WHERE nom = 'Cura per a furóncols'), 5.00),
-- Poció de la pau
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'El·lèbor'),  (SELECT id_pocio FROM pocions WHERE nom = 'Poció de la pau'), 18.90),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Valeriana'), (SELECT id_pocio FROM pocions WHERE nom = 'Poció de la pau'), 35.20),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Espígol'),   (SELECT id_pocio FROM pocions WHERE nom = 'Poció de la pau'), 20.00),
-- Poció multisucs
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Centinodi'), (SELECT id_pocio FROM pocions WHERE nom = 'Poció multisucs'), 33.30),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Mandràgora'),(SELECT id_pocio FROM pocions WHERE nom = 'Poció multisucs'), 4.70),
-- Solució encongidora
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Margarida'), (SELECT id_pocio FROM pocions WHERE nom = 'Solució encongidora'), 14.80),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Donzell'),   (SELECT id_pocio FROM pocions WHERE nom = 'Solució encongidora'), 6.10),
-- Essència de díctam
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Díctam'),    (SELECT id_pocio FROM pocions WHERE nom = 'Essència de díctam'), 80.00),
-- Beuratge confusor
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Llevístec'), (SELECT id_pocio FROM pocions WHERE nom = 'Beuratge confusor'), 27.60),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Cocleària'), (SELECT id_pocio FROM pocions WHERE nom = 'Beuratge confusor'), 22.40),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Acònit'),    (SELECT id_pocio FROM pocions WHERE nom = 'Beuratge confusor'), 1.90),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Belladona'), (SELECT id_pocio FROM pocions WHERE nom = 'Beuratge confusor'), 0.80),
-- Poció matallops
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Acònit'),    (SELECT id_pocio FROM pocions WHERE nom = 'Poció matallops'), 3.50),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Valeriana'), (SELECT id_pocio FROM pocions WHERE nom = 'Poció matallops'), 15.00),
-- Poció per aguditzar l'enginy
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Gingebre'),  (SELECT id_pocio FROM pocions WHERE nom = 'Poció per aguditzar l''enginy'), 18.20),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Romaní'),    (SELECT id_pocio FROM pocions WHERE nom = 'Poció per aguditzar l''enginy'), 10.50),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Menta'),     (SELECT id_pocio FROM pocions WHERE nom = 'Poció per aguditzar l''enginy'), 4.30),
-- Pasta contra els blaus
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Àrnica'),    (SELECT id_pocio FROM pocions WHERE nom = 'Pasta contra els blaus'), 55.00),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Romaní'),    (SELECT id_pocio FROM pocions WHERE nom = 'Pasta contra els blaus'), 12.30),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Ortiga'),    (SELECT id_pocio FROM pocions WHERE nom = 'Pasta contra els blaus'), 7.80),
-- Poció contra el refredat
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Bitxo'),     (SELECT id_pocio FROM pocions WHERE nom = 'Poció contra el refredat'), 40.00),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Gingebre'),  (SELECT id_pocio FROM pocions WHERE nom = 'Poció contra el refredat'), 22.70),
((SELECT id_ingredient FROM ingredients WHERE nom_comu = 'Menta'),     (SELECT id_pocio FROM pocions WHERE nom = 'Poció contra el refredat'), 9.90);
--
