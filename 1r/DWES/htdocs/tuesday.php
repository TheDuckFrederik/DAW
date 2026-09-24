<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tuesday 22-09-2026</title>
    <!-- Quack -->
</head>
<body>
    <h1>Watch out, a random int!!!</h1>
    <!--  -->
    <?php
        $randInt = rand(0, 73);
        echo "<h2>vvv</h2> $randInt";
        echo "<h2>^^^</h2>";
        //
        $favColor = "purple";
        echo "My fav color is $favColor";
        //
        echo "<br><p>Ja pierdole</p>";
        // 
        $mySentence = "Today is Tuesday";
        // The parameter, but reversed :P
        echo strrev($mySentence);
        // Locate second parameter in first parameter
        echo "<br>";
        echo strpos($mySentence, "is");
        //
        echo "<p>" . md5($mySentence) . "</p>"; // Ecrypted in MD5 bylat.   
        //
        echo str_replace("Tuesday", "Thursday", $mySentence); // Search the first param, replaces it by the second param, and the third param is where it is looking
        //
        echo "<br>";
        echo substr($mySentence, 7); // Returns the content of param 1 after the position indicated in param 2 (param 3 is to specify the max len than it can return)
        //
        define ("NAME", "Unai");
        echo NAME;
        //
    ?>
</body>
</html>