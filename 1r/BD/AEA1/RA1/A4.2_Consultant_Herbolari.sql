-- =====================================================================
-- A4.2 · CONSULTANT L'HERBOLARI
-- Consultes sobre la BD bd_herbolari. Executar després de bd_herbolari.sql
-- i de l'script de dades addicionals (ScriptHerbolari.sql).
-- =====================================================================
USE bd_herbolari;

-- ---------------------------------------------------------------------
-- 1. Mostra tota la informació dels ingredients.
-- ---------------------------------------------------------------------
SELECT * FROM ingredients;

-- ---------------------------------------------------------------------
-- 2. Mostra tota la informació de les pocions ordenades alfabèticament.
-- ---------------------------------------------------------------------
SELECT * FROM pocions ORDER BY nom;

-- ---------------------------------------------------------------------
-- 3. Mostra el nom comú i el nom científic de tots els ingredients.
-- ---------------------------------------------------------------------
SELECT nom_comu, nom_cientific FROM ingredients;

-- ---------------------------------------------------------------------
-- 4. Mostra només el nom de totes les pocions en ordre alfabètic.
-- ---------------------------------------------------------------------
SELECT nom FROM pocions ORDER BY nom;

-- ---------------------------------------------------------------------
-- 5. Mostra l'id i el nom comú dels dos primers ingredients.
-- ---------------------------------------------------------------------
SELECT id_ingredient, nom_comu FROM ingredients LIMIT 2;

-- ---------------------------------------------------------------------
-- 6. Quin és el nom científic de la Mandràgora?
-- ---------------------------------------------------------------------
SELECT nom_cientific FROM ingredients WHERE nom_comu = 'Mandràgora';

-- ---------------------------------------------------------------------
-- 7. Mostra la descripció de la Poció multisucs.
-- ---------------------------------------------------------------------
SELECT descripcio FROM pocions WHERE nom = 'Poció multisucs';

-- ---------------------------------------------------------------------
-- 8. Mostra tota la informació de les receptes en què es fan servir més
--    de 100 g d'un ingredient.
-- ---------------------------------------------------------------------
SELECT * FROM ingredients_pocions WHERE quantitat > 100;

-- ---------------------------------------------------------------------
-- 9. Mostra tota la informació de les receptes en què es fan servir menys
--    de 5 g d'un ingredient.
-- ---------------------------------------------------------------------
SELECT * FROM ingredients_pocions WHERE quantitat < 5;

-- ---------------------------------------------------------------------
-- 10. Mostra tota la informació de les receptes en què es fan servir entre
--     100 g i 1000 g d'un ingredient (ambdós inclosos).
-- ---------------------------------------------------------------------
SELECT * FROM ingredients_pocions WHERE quantitat BETWEEN 100 AND 1000;

-- ---------------------------------------------------------------------
-- 11. Mostra les quantitats que s'utilitzen en les pocions, sense repeticions.
-- ---------------------------------------------------------------------
SELECT DISTINCT quantitat FROM ingredients_pocions;

-- ---------------------------------------------------------------------
-- 12. Quins ingredients no tenen il·lustració?
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE il_ilustracio IS NULL;

-- ---------------------------------------------------------------------
-- 13. Quines pocions tenen un nom que comença per "Poció"? Mostra'ls
--     ordenats en ordre alfabètic descendent.
-- ---------------------------------------------------------------------
SELECT nom FROM pocions WHERE nom LIKE 'Poció%' ORDER BY nom DESC;

-- ---------------------------------------------------------------------
-- 14. Quins ingredients tenen un nom científic que acaba en officinalis?
-- ---------------------------------------------------------------------
SELECT nom_comu, nom_cientific FROM ingredients WHERE nom_cientific LIKE '%officinalis';

-- ---------------------------------------------------------------------
-- 15. Quins ingredients són tòxics, segons la seva descripció?
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE descripcio LIKE '%tòxic%';

-- ---------------------------------------------------------------------
-- 16. Quins ingredients no tenen foto de la flor però sí que tenen il·lustració?
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE foto_flor IS NULL AND il_ilustracio IS NOT NULL;

-- ---------------------------------------------------------------------
-- 17. Quines pocions fan dormir? (A la descripció hi surt la paraula "son".)
-- ---------------------------------------------------------------------
SELECT nom FROM pocions WHERE descripcio LIKE '%son%';

-- ---------------------------------------------------------------------
-- 18. Quins ingredients tenen un nom comú de 5 lletres exactament?
--     Mostra'ls ordenats alfabèticament.
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE CHAR_LENGTH(nom_comu) = 5 ORDER BY nom_comu;

-- ---------------------------------------------------------------------
-- 19. Quins ingredients tenen una "e" com a segona lletra?
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE nom_comu LIKE '_e%';

-- ---------------------------------------------------------------------
-- 20. Quins ingredients tenen un nom científic acabat en officinalis i
--     tenen il·lustració?
-- ---------------------------------------------------------------------
SELECT nom_comu, nom_cientific FROM ingredients
WHERE nom_cientific LIKE '%officinalis' AND il_ilustracio IS NOT NULL;

-- ---------------------------------------------------------------------
-- 21. Mostra el nom científic de la Menta i de la Valeriana.
-- ---------------------------------------------------------------------
SELECT nom_cientific FROM ingredients WHERE nom_comu IN ('Menta', 'Valeriana');

-- ---------------------------------------------------------------------
-- 22. Quins ingredients tenen un nom comú que comença per "C" o per "M"?
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE nom_comu LIKE 'C%' OR nom_comu LIKE 'M%';

-- ---------------------------------------------------------------------
-- 23. Quins ingredients no tenen foto de la flor o no tenen il·lustració?
-- ---------------------------------------------------------------------
SELECT nom_comu FROM ingredients WHERE foto_flor IS NULL OR il_ilustracio IS NULL;

-- ---------------------------------------------------------------------
-- 24. Mostra l'identificador dels ingredients de la poció Alè de foc
--     (poció 1) o de la Pòcima per dormir (poció 2) dels quals es fan
--     servir més de 100 g.
-- ---------------------------------------------------------------------
SELECT id_ingredient FROM ingredients_pocions
WHERE (id_pocio = 1 OR id_pocio = 2) AND quantitat > 100;
