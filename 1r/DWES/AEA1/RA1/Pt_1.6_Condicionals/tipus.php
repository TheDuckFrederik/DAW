<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tipus</title>
    <!--  -->
</head>
<body>
    <h1>Els tipus de les variables:</h1>
    <!--  -->
    <?php
        // Declaro les variables
        $x = 10;
        $y = "10";
        $z = $x * 2;
        $a = "23 anys";
        $b = $x + 11;
        $c = 1.234;
        $d = 1.2e3;
        $e = 7E-10;
        $f = NULL;
        //
        // Comprovo el tipus de cada variable, si es un numero nomes mostro Número
        if (gettype($x) == "integer" || gettype($x) == "double" || gettype($x) == "float") {
            echo "<p>La variable \$x es un Número</p>";
        } else {
            echo "<p>La variable \$x es un " . gettype($x) . "</p>";
        }
        //
        if (gettype($y) == "integer" || gettype($y) == "double" || gettype($y) == "float") {
            echo "<p>La variable \$y es un Número</p>";
        } else {
            echo "<p>La variable \$y es un " . gettype($y) . "</p>";
        }
        //
        if (gettype($z) == "integer" || gettype($z) == "double" || gettype($z) == "float") {
            echo "<p>La variable \$z es un Número</p>";
        } else {
            echo "<p>La variable \$z es un " . gettype($z) . "</p>";
        }
        //
        if (gettype($a) == "integer" || gettype($a) == "double" || gettype($a) == "float") {
            echo "<p>La variable \$a es un Número</p>";
        } else {
            echo "<p>La variable \$a es un " . gettype($a) . "</p>";
        }
        //
        if (gettype($b) == "integer" || gettype($b) == "double" || gettype($b) == "float") {
            echo "<p>La variable \$b es un Número</p>";
        } else {
            echo "<p>La variable \$b es un " . gettype($b) . "</p>";
        }
        //
        if (gettype($c) == "integer" || gettype($c) == "double" || gettype($c) == "float") {
            echo "<p>La variable \$c es un Número</p>";
        } else {
            echo "<p>La variable \$c es un " . gettype($c) . "</p>";
        }
        //
        if (gettype($d) == "integer" || gettype($d) == "double" || gettype($d) == "float") {
            echo "<p>La variable \$d es un Número</p>";
        } else {
            echo "<p>La variable \$d es un " . gettype($d) . "</p>";
        }
        //
        if (gettype($e) == "integer" || gettype($e) == "double" || gettype($e) == "float") {
            echo "<p>La variable \$e es un Número</p>";
        } else {
            echo "<p>La variable \$e es un " . gettype($e) . "</p>";
        }
        //
        if (gettype($f) == "integer" || gettype($f) == "double" || gettype($f) == "float") {
            echo "<p>La variable \$f es un Número</p>";
        } else {
            echo "<p>La variable \$f es un " . gettype($f) . "</p>";
        }
        //
    ?>
    <!--  -->
</body>
</html>
