<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Parell o imparell</title>
    <!--  -->
</head>
<body>
    <h1>Un número aleatori del 1 al 100:</h1>
    <!--  -->
    <?php
        // Genero un numero aleatori del 1 al 100
        $numero = rand(1, 100);
        //
        echo "<h2>$numero</h2>";
        //
        // Si el resta de dividir entre 2 es 0 es parell
        if ($numero % 2 == 0) {
            echo "<p>El número $numero es parell</p>";
        } else {
            echo "<p>El número $numero es imparell</p>";
        }
        //
    ?>
    <!--  -->
</body>
</html>
