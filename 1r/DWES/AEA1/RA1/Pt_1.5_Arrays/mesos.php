<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mesos</title>
</head>
<body>
    <h1>Els dies que te cada mes:</h1>
    <!--  -->
    <?php
    $mesos = array(
        "Gener" => 31,
        "Febrer" => 28,
        "Març" => 31,
        "Abril" => 30,
        "Maig" => 31,
        "Juny" => 30,
        "Juliol" => 31,
        "Agost" => 31,
        "Septembre" => 30,
        "Octubre" => 31,
        "Novembre" => 30,
        "Decembre" => 31
    );
    //
    echo "<ul>
    <li><p>$mesos[Gener]</p></li>
    <li><p>$mesos[Febrer]</p></li>
    <li><p>$mesos[Març]</p></li>
    <li><p>$mesos[Abril]</p></li>
    <li><p>$mesos[Maig]</p></li>
    <li><p>$mesos[Juny]</p></li>
    <li><p>$mesos[Juliol]</p></li>
    <li><p>$mesos[Agost]</p></li>
    <li><p>$mesos[Septembre]</p></li>
    <li><p>$mesos[Octubre]</p></li>
    <li><p>$mesos[Novembre]</p></li>
    <li><p>$mesos[Decembre]</p></li>
    </ul>";
    //
    ?>
    <!--  -->
</body>
</html>