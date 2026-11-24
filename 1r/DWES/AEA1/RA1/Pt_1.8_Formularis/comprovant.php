<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comprovant Ocine</title>
    <!--  -->
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            /*  */
            padding: 3px;
        }
        th {
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Comprovant de la compra:</h1>
    <!--  -->
    <?php
        // Creo la funcio que calcula el preu d'una entrada segons l'edat i si es estudiant o no
        function preuEntrada($edat, $estudiant) {
            if ($estudiant == "si" || $edat < 12) {
                return 3.5;
            } else {
                return 5;
            }
        }
        //
        // Primer comprovo que s'ha arribat aqui desde el formulari
        if ($_SERVER["REQUEST_METHOD"] != "POST") {
            echo "<p>Has d'omplir primer el <a href='formulari.php'>formulari</a></p>";
        } else {
            // Recullo les dades del comprador principal
            $nomComprador = $_POST["nomComprador"];
            $cognomsComprador = $_POST["cognomsComprador"];
            $edatComprador = $_POST["edatComprador"];
            $estudiantComprador = $_POST["estudiantComprador"];
            //
            // Poso totes les persones dins d'un array, el comprador sempre compra la seva entrada
            $persones = array(
                array("nom" => $nomComprador, "cognoms" => $cognomsComprador, "edat" => $edatComprador, "estudiant" => $estudiantComprador)
            );
            //
            // Les persones 1, 2 i 3 son opcionals, si no s'ha omplit res no les afegeixo
            for ($i = 1; $i <= 3; $i++) {
                $nom = $_POST["nomPersona$i"];
                $cognoms = $_POST["cognomsPersona$i"];
                $edat = $_POST["edatPersona$i"];
                $estudiant = $_POST["estudiantPersona$i"];
                //
                // Si al menys un camp te alguna cosa escrita, l'afegeixo per validar-la
                if ($nom != "" || $cognoms != "" || $edat != "") {
                    $persones[] = array("nom" => $nom, "cognoms" => $cognoms, "edat" => $edat, "estudiant" => $estudiant);
                }
            }
            //
            // Valido les dades de totes les persones una per una
            $errors = array();
            foreach ($persones as $index => $persona) {
                if ($index == 0) {
                    $quiEs = "el comprador";
                } else {
                    $quiEs = "la Persona $index";
                }
                //
                if ($persona["nom"] == "" || $persona["cognoms"] == "") {
                    $errors[] = "Falta el nom o els cognoms de $quiEs";
                }
                //
                if (!is_numeric($persona["edat"]) || $persona["edat"] < 0) {
                    $errors[] = "L'edat de $quiEs no es valida";
                }
            }
            //
            // Si hi ha algun error el mostro tots i no contino
            if (count($errors) > 0) {
                echo "<h2>Hi ha errors a les dades:</h2>";
                echo "<ul>";
                foreach ($errors as $error) {
                    echo "<li>$error</li>";
                }
                echo "</ul>";
                echo "<p><a href='formulari.php'>Torna al formulari</a></p>";
            } else {
                // Conto les entrades de cada grup i sumo el total amb la funcio
                $menors = 0;
                $estudiants = 0;
                $adults = 0;
                $total = 0;
                //
                foreach ($persones as $persona) {
                    if ($persona["edat"] < 12) {
                        $menors++;
                    } elseif ($persona["estudiant"] == "si") {
                        $estudiants++;
                    } else {
                        $adults++;
                    }
                    //
                    $total = $total + preuEntrada($persona["edat"], $persona["estudiant"]);
                }
                //
                // Mostro qui ha comprat les entrades
                echo "<p><strong>Comprador de les entrades:</strong> $nomComprador $cognomsComprador</p>";
                //
                // Mostro la taula del comprovant, nomes amb els grups que tenen entrades
                echo "<table>
                    <tr>
                        <th>Grup</th>
                        <th>Entrades</th>
                        <th>Preu entrada</th>
                        <th>Total grup</th>
                    </tr>";
                //
                if ($menors > 0) {
                    echo "<tr>
                        <td>Menors de 12 anys</td>
                        <td>$menors</td>
                        <td>3,50 €</td>
                        <td>" . number_format($menors * 3.5, 2, ",") . " €</td>
                    </tr>";
                }
                //
                if ($estudiants > 0) {
                    echo "<tr>
                        <td>Estudiants (12 anys o mes)</td>
                        <td>$estudiants</td>
                        <td>3,50 €</td>
                        <td>" . number_format($estudiants * 3.5, 2, ",") . " €</td>
                    </tr>";
                }
                //
                if ($adults > 0) {
                    echo "<tr>
                        <td>Adults</td>
                        <td>$adults</td>
                        <td>5,00 €</td>
                        <td>" . number_format($adults * 5, 2, ",") . " €</td>
                    </tr>";
                }
                //
                echo "</table>";
                //
                // Mostro el preu total de totes les entrades, number_format em mostra el preu amb coma i dos decimals
                echo "<p><strong>Preu total:</strong> " . number_format($total, 2, ",") . " €</p>";
            }
        }
        //
    ?>
    <!--  -->
</body>
</html>
