<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inventari de botiga</title>
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
    <h1>Inventari de botiga</h1>
    <!--  -->
    <?php
        // Creem el array
        $inventariBotiga = array(
            "Portatil" => [
                "preu" => 899,
                "stock" => 5
            ],
            "Ratoli" => [
                "preu" => 25,
                "stock" => 20
            ],
            "Teclat" => [
                "preu" => 45,
                "stock" => 12
            ],
            "Monitor" => [
                "preu" => 200,
                "stock" => 8
            ],
            "Auriculars" => [
                "preu" => 60,
                "stock" => 15
            ]
        );
        // Mostrem tot el inventari
        echo "<table>
            <tr>
                <th>Producte</th>
                <th>Preu</th>
                <th>Quantitat</th>
            </tr>";
        foreach ($inventariBotiga as $producte => $info) {
            echo "<tr>
                <td>$producte</td>
                <td>" . $info["preu"] . " €</td>
                <td>" . $info["stock"] . "</td>
            </tr>";
        }
        echo "</table>";
        // Actualitza la quantitat d'un producte (per exemple, després de vendre'n un)
        $inventariBotiga["Ratoli"]["stock"];
        // Afegeix un nou producte a l'inventari
        $inventariBotiga["Webcam"] = [
            "preu" => 35,
            "stock" => 10
        ];
        // Elimina un producte de l'inventari
        unset($inventariBotiga["Monitor"]);
        // Didac, no estic segur de si vols que torni a mostrar tots els productes, aixi que esta tot comentat
        // echo "<h2>Inventari actualitzat</h2>";
        // echo "<table>
        //     <tr>
        //         <th>Producte</th>
        //         <th>Preu</th>
        //         <th>Quantitat</th>
        //     </tr>";
        // foreach ($inventariBotiga as $producte => $info) {
        //     echo "<tr>
        //         <td>$producte</td>
        //         <td>" . $info["preu"] . " €</td>
        //         <td>" . $info["stock"] . "</td>
        //     </tr>";
        // }
        // echo "</table>";
    ?>
</body>
</html>