<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Real Madrid</title>
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
    <h1>Real Madrid</h1>
    <!--  -->
    <?php 
        // Crea el array
        $plantilla = array(
            "Porters" => [
                "Courtois",
                "Lunin"
            ],
            "Defenses" => [
                "Carvajal",
                "Militão",
                "Rüdiger",
                "Alaba",
                "Mendy",
                "Alexander-Arnold",
                "Fran García",
                "Asencio"
            ],
            "Migcampistes" => [
                "Valverde",
                "Tchouaméni",
                "Camavinga",
                "Bellingham",
                "Güler",
                "Ceballos",
                "Mastantuono"
            ],
            "Davanters" => [
                "Mbappé",
                "Vinícius",
                "Rodrygo",
                "Brahim",
                "Endrick",
                "Gonzalo García"
            ]
        );
        // Mostra en una taula tots els jugadors
        echo "<table> 
            <tr>
                <th>Posició</th>
                <th>Jugadors</th>
            </tr>";
            //
        foreach ($plantilla as $x => $y) {
            echo "<tr>
                <td>$x</td>
                <td>";
            foreach ($y as $jugador) {
                echo "$jugador<br>";
            }
            echo "</td>
            </tr>";
        }
        //
        echo "</table>";
    ?>
</body>
</html>