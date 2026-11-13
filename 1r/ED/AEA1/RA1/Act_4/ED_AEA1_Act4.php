<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Llista de la compra</title>
</head>
<body>
    <?php
    session_start();
    //
    if (isset($_POST["borrarSessio"])) {
        $_SESSION["productesGuardats"] = [];
    }
    //
    if (!isset($_SESSION['productesGuardats'])) {
        $_SESSION["productesGuardats"] = [];
    }
    //
    if (isset($_POST["afegirALlista"]) && !empty($_POST["productesSeleccionats"])) {
        foreach($_POST["productesSeleccionats"] as $producteSeleccionat) {
            if(!in_array($producteSeleccionat, $_SESSION["productesGuardats"])) {
                $_SESSION["productesGuardats"][] = $producteSeleccionat;
            }
        }
    }
    //
    ?>
    <!--  -->
    <h1>Llista de la compra</h1>
    <!--  -->
    <form action="ED_AEA1_A4.php" method="post">
        <?php
        $productes = array("Pa", "Llet", "Ous", "Formatge", "Tomaquets", "Pomes", "Carn", "Cafe", "Sucre", "Sal");
        //
        foreach ($productes as $producte) {
            if (in_array($producte, $_SESSION["productesGuardats"])){
                echo"<label>
                    <input type='checkbox' name='productesSeleccionats[]' id='$producte' value='$producte' checked>
                    $producte
                </label>
                <br>";
            } else {
                echo"<label>
                    <input type='checkbox' name='productesSeleccionats[]' id='$producte' value='$producte'>
                    $producte
                </label>
                <br>";
            }
            //
        }
        //
        echo"<br><input type='submit' name='afegirALlista' value='Afegir a la llista'>";
        echo"<input type='submit' name='borrarSessio' value='Tancar sessio'>";
        //
        echo"<h2>La teva llista de la compra:</h2>";
        //
        if (!empty($_SESSION["productesGuardats"])) {
            echo"<ul>";
            //
            foreach($_SESSION["productesGuardats"] as $producteGuardat) {
                echo"<tr><h3>$producteGuardat</h3></tr>";
            }
            //
            echo"</ul>";
            //
        } else {
            echo"<h3>No hi ha cap producte</h3>";
        }
        //
        ?>
    </form>
    <!--  -->
</body>
</html>