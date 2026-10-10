<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Paisos i les seves capitals</title>
    <!--  -->
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            /*  */
            padding: 3px;
        }
        th {
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Els paisos i les seves capitals</h1>
    <!--  -->
    <?php
        $EU = array("Italy"=>"Rome", 
        "Luxembourg"=>"Luxembourg",
        "Belgium"=> "Brussels", 
        "Denmark"=>"Copenhagen", 
        "Finland"=>"Helsinki", 
        "France" => "Paris", 
        "Slovakia"=>"Bratislava", 
        "Slovenia"=>"Ljubljana", 
        "Germany" => "Berlin", 
        "Greece" => "Athens", 
        "Ireland"=>"Dublin", 
        "Netherlands"=>"Amsterdam");
        //
        echo "<table> 
            <tr>
                <th>Pais</th>
                <th>Capital</th>
            </tr>";
        //
        foreach ($EU as $x => $y) {
            echo "<tr>
                <td>$x</td>
                <td>$y</td>
            </tr>";
        }
        //    
        echo "</table>";
    ?>
</body>
</html>