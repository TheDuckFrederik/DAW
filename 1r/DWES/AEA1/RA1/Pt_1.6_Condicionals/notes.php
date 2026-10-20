<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notes</title>
    <!--  -->
</head>
<body>
    <h1>La nota del dia:</h1>
    <!--  -->
    <?php
        // Genero una nota aleatoria del 0 al 10
        $nota = rand(0, 10);
        //
        echo "<h2>$nota</h2>";
        //
        // Mostro la llegenda segons la nota
        if ($nota >= 0 && $nota <= 4) {
            echo "<p>La nota $nota es un Suspès</p>";
        } elseif ($nota == 5) {
            echo "<p>La nota $nota es un Aprovat</p>";
        } elseif ($nota == 6) {
            echo "<p>La nota $nota es un Bé</p>";
        } elseif ($nota >= 7 && $nota <= 8) {
            echo "<p>La nota $nota es un Notable</p>";
        } else {
            echo "<p>La nota $nota es un Excel·lent</p>";
        }
        //
    ?>
    <!--  -->
</body>
</html>
