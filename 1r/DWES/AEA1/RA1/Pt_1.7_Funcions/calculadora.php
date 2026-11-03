<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
    <!--  -->
</head>
<body>
    <h1>La calculadora:</h1>
    <!--  -->
    <?php
        // Creo les variables amb els dos operands i la operacio
        $operand1 = 7;
        $operand2 = 3;
        $operacio = "-";
        //
        // Creo la funcio calcular, que segons la operacio retorna un resultat o un altre
        function calcular($operand1, $operand2, $operacio) {
            switch ($operacio) {
                case "+":
                    return $operand1 + $operand2;
                //
                case "-":
                    return $operand1 - $operand2;
                //
                case "*":
                    return $operand1 * $operand2;
                //
                case "/":
                    // Si el segon operand es 0 no es pot dividir, aixo fa que no salti cap error
                    if ($operand2 == 0) {
                        return "No es pot dividir entre 0";
                    }
                    return $operand1 / $operand2;
                //
                default:
                    return "Operacio no valida";
            }
        }
        //
        // Crido la funcio i guardo el resultat
        $resultat = calcular($operand1, $operand2, $operacio);
        //
        echo "<p>El resultat de $operand1 $operacio $operand2 es: $resultat</p>";
        //
    ?>
    <!--  -->
</body>
</html>
