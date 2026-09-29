<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assosiative Arrays</title>
</head>
<body>
    <h1>Assosiative Array PHP</h1>
    <!--  -->
    <?php
    // Empty array declaration
    //$grades = array();
    // Assosiative array definition with initial values
    $grades = [
        "SH" => rand(0,10),
        "QJ" => rand(0,10),
        "RH" => rand(0,10),
        "TB" => rand(0,10)
    ];
    //
    $randInt = rand(0, 3);
    //
    $grades["TB"] = 7;
    $grades["BW"] = 10;
    //
    echo "The student's first grade is: $grades[ST1]";
    //
    echo "<br>";
    echo "<h2>Grade list</h2>";
    // Initials, the key of the array
    echo "<ul>";
    foreach ($grades as $initials => $grade) {
        echo "<li>The grade of the student with initials: $initials is $grade</li>";
    }
    echo "</ul>"
    //
    ?>
</body>
</html>