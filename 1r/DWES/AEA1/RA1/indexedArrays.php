<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Indexed Arrays</title>
</head>
<body>
    <h1>Indexed Array PHP</h1>
    <!--  -->
    <?php
    // Array declaration
    $grades = array(rand(0, 10), rand(0, 10), rand(0, 10), rand(0, 10));
    $randInt = rand(0, 3);
    //
    $grades[3] = 7;
    //
    echo "The student's first grade is: $grades[$randInt]";
    //
    echo "<br>";
    echo "<h2>Grade list</h2>";
    //
    $grades[] = 3;
    //
    foreach ($grades as $grade) {
        echo "$grade<br>";
    }
    //
    count($grades); // Counts items inside
    array_push($grades, 3, 6, 9); // Adds values to the end
    $lastGrade = array_pop($grades); // Takes the last inserted item of the array out of the array
    array_splice($grades, 4, 5); // First param is the arrat, the second the position and the third the value
    //
    ?>
</body>
</html>