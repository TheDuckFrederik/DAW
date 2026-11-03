<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tipus 2</title>
    <!--  -->
</head>
<body>
    <h1>Els tipus de les variables, ara amb una funcio:</h1>
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
        // Creo la funcio que retorna el tipus de la variable, si es un numero nomes retorna Número
        function resoldreTipus($var) {
            $tipus = gettype($var);
            //
            if ($tipus == "integer" || $tipus == "double" || $tipus == "float") {
                return "Número";
            } else {
                return $tipus;
            }
        }
        //
        // Poso totes les variables dins d'un array, aixo fa que el codi sigui mes net i escalable
        $variables = array(
            "x" => $x,
            "y" => $y,
            "z" => $z,
            "a" => $a,
            "b" => $b,
            "c" => $c,
            "d" => $d,
            "e" => $e,
            "f" => $f
        );
        //
        // Recorro l'array i per cada variable crido la funcio
        foreach ($variables as $nomVariable => $valor) {
            echo "<p>La variable \$$nomVariable es un " . resoldreTipus($valor) . "</p>";
        }
        //
    ?>
    <!--  -->
</body>
</html>
