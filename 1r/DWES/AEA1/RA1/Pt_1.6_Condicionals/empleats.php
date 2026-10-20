<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Empleats</title>
    <!--  -->
</head>
<body>
    <h1>Nivells d'empleats:</h1>
    <!--  -->
    <?php
        // Creo les dades del empleat
        $anysExperiencia = 3;
        $horesSetmana = 35;
        //
        echo "<p>Te $anysExperiencia anys d'experiencia i treballa $horesSetmana hores a la setmana</p>";
        //
        // El classifico segons els anys d'experiencia i les hores
        if ($anysExperiencia < 2 || $horesSetmana < 20) {
            echo "<p>Es un empleat Principiant</p>";
        } elseif ($anysExperiencia > 5 || $horesSetmana > 40) {
            echo "<p>Es un empleat Expert</p>";
        } else {
            echo "<p>Es un empleat Intermedi</p>";
        }
        //
    ?>
    <!--  -->
</body>
</html>
