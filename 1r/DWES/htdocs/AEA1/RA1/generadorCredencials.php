<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Generador de credencials.</title>
</head>
<body>
    <!--  -->
    <?php
        // 1. Informació de l'usuari
        $nom = "Unai";
        $cognom = "Pujol";
        $edat = 19;
        $nota = 7.5;
        $actiu = true;
        $email = "unai.pujol@insbaixcamp.cat";
        // 
        echo "<h4>================================
        <br>       CREDENCIAL D'USUARI 
        <br>================================</h4>";
        // Show initial user data
        echo "<p><strong>Nom:</strong> $nom</p>";
        echo "<p><strong>Cognom:</strong> $cognom</p>";
        echo "<p><strong>Edat:</strong> $edat</p>";
        echo "<p><strong>Nota:</strong> $nota</p>";
        echo "<p><strong>Actiu:</strong> $actiu</p>";
        // 2. Crear el nom d'usuari
        echo "<br>";
        $usuari = strtolower($nom) . "." . strtolower($cognom); // Makes the string all lower case
        echo "<p><strong>Usuari:</strong> $usuari</p>";
        // 3. Generar un número aleatori
        $numero = rand(1000 ,9999);
        // 4. Treballar amb strpos() + 5. Treballar amb substr()
        echo "<br>";
        $posicioArroba = strpos($email, "@");
        $domini = substr($email, $posicioArroba + 1);
        echo "<p><strong>Email:</strong> $email</p>";
        echo "<p><strong>Posicio del @:</strong> $posicioArroba</p>";
        echo "<p><strong>Domini:</strong> $domini</p>";
        //
        echo "<br>";
        echo "<p><strong>Número aleatori:</strong> $numero</p>";
        // 6. Crear un codi
        echo "<br>";
        $codi = substr($nom, 0, 3) . substr($cognom, -3) . $numero;
        echo "<p><strong>Codi generat:</strong> $codi</p>";
    ?>
    <!--  -->
</body>
</html>