-- 1. Mostra cada vi en una sola columna amb el format NOM DEL VI (número de la bodega): el nom del vi en majúscules i el nº de la bodega entre parèntesis. Ordena per nom del vi.
SELECT CONCAT(UPPER(nom), ' (', bodega_id, ')') AS 'NOM DEL VI (número de la bodega)' FROM vins ORDER BY nom;
-- 2. Per als vins blancs, mostra el nom, el tipus, el preu, el preu amb el 21 % d'IVA arrodonit a 2 decimals i el mateix preu amb IVA arrodonit a euros. Ordena per preu de més car a menys; si tenen el mateix preu, ordena alfabèticament.
SELECT nom, tipus, ROUND((preu_unitat * 1.21), 2) AS 'Preu amb IVA', TRUNCATE((preu_unitat * 1.21), 0) AS Euros FROM vins WHERE tipus='blanc' ORDER BY preu_unitat DESC, nom ASC;
-- 3. Les ampolles es venen en caixes de 6. Per a cada bodega, mostra quantes caixes completes surten de la producció anual (CAIXES) i quantes ampolles queden soltes (AMPOLLES SOLTES).
SELECT nom, TRUNCATE((produccio_anual / 6), 0) AS Caixes, MOD(produccio_anual, 6) AS 'Ampolles sobrants' FROM bodegues;
--
