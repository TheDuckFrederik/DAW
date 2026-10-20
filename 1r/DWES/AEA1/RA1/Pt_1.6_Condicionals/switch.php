<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Curs</title>
    <!--  -->
</head>
<body>
    <h1>En quin curs està?</h1>
    <!--  -->
    <?php
        // Creo les variables
        $nom = "Unai";
        $curs = "DAW1";
        //
        // Amb el switch comprovo el curs, nomes surten els CFGS
        switch ($curs) {
            case "ASIX1":
                echo "<p>$nom, alumne d'administració de sistemes informàtics i xarxes de primer</p>";
                break;
            //
            case "ASIX2":
                echo "<p>$nom, alumne d'administració de sistemes informàtics i xarxes de segon</p>";
                break;
            //
            case "DAW1":
                echo "<p>$nom, alumne de desenvolupament d'aplicacions web de primer</p>";
                break;
            //
            case "DAW2":
                echo "<p>$nom, alumne de desenvolupament d'aplicacions web de segon</p>";
                break;
            //
            case "DAM1":
                echo "<p>$nom, alumne de desenvolupament d'aplicacions multiplataforma de primer</p>";
                break;
            //
            case "DAM2":
                echo "<p>$nom, alumne de desenvolupament d'aplicacions multiplataforma de segon</p>";
                break;
            //
            default:
                echo "<p>$nom no és alumne de cicle superior d'informàtica</p>";
                break;
        }
        //
    ?>
    <!--  -->
</body>
</html>
