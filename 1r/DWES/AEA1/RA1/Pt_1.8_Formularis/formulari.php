<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulari Ocine</title>
    <!--  -->
</head>
<body>
    <h1>Compra d'entrades Ocine:</h1>
    <!--  -->
    <form action="comprovant.php" method="post">
        <!-- Comprador principal -->
        <fieldset>
            <legend>Comprador principal</legend>
            <label for="nomComprador">Nom:</label>
            <input type="text" id="nomComprador" name="nomComprador" required>
            <br>
            <label for="cognomsComprador">Cognoms:</label>
            <input type="text" id="cognomsComprador" name="cognomsComprador" required>
            <br>
            <label for="edatComprador">Edat:</label>
            <input type="number" id="edatComprador" name="edatComprador" min="0" required>
            <br>
            <input type="radio" id="estudiantSiComprador" name="estudiantComprador" value="si">
            <label for="estudiantSiComprador">Estudiant</label>
            <input type="radio" id="estudiantNoComprador" name="estudiantComprador" value="no" checked>
            <label for="estudiantNoComprador">No estudiant</label>
        </fieldset>
        <!--  -->
        <!-- Persona 1 -->
        <fieldset>
            <legend>Persona 1</legend>
            <label for="nomPersona1">Nom:</label>
            <input type="text" id="nomPersona1" name="nomPersona1">
            <br>
            <label for="cognomsPersona1">Cognoms:</label>
            <input type="text" id="cognomsPersona1" name="cognomsPersona1">
            <br>
            <label for="edatPersona1">Edat:</label>
            <input type="number" id="edatPersona1" name="edatPersona1" min="0">
            <br>
            <input type="radio" id="estudiantSiPersona1" name="estudiantPersona1" value="si">
            <label for="estudiantSiPersona1">Estudiant</label>
            <input type="radio" id="estudiantNoPersona1" name="estudiantPersona1" value="no" checked>
            <label for="estudiantNoPersona1">No estudiant</label>
        </fieldset>
        <!--  -->
        <!-- Persona 2 -->
        <fieldset>
            <legend>Persona 2</legend>
            <label for="nomPersona2">Nom:</label>
            <input type="text" id="nomPersona2" name="nomPersona2">
            <br>
            <label for="cognomsPersona2">Cognoms:</label>
            <input type="text" id="cognomsPersona2" name="cognomsPersona2">
            <br>
            <label for="edatPersona2">Edat:</label>
            <input type="number" id="edatPersona2" name="edatPersona2" min="0">
            <br>
            <input type="radio" id="estudiantSiPersona2" name="estudiantPersona2" value="si">
            <label for="estudiantSiPersona2">Estudiant</label>
            <input type="radio" id="estudiantNoPersona2" name="estudiantPersona2" value="no" checked>
            <label for="estudiantNoPersona2">No estudiant</label>
        </fieldset>
        <!--  -->
        <!-- Persona 3 -->
        <fieldset>
            <legend>Persona 3</legend>
            <label for="nomPersona3">Nom:</label>
            <input type="text" id="nomPersona3" name="nomPersona3">
            <br>
            <label for="cognomsPersona3">Cognoms:</label>
            <input type="text" id="cognomsPersona3" name="cognomsPersona3">
            <br>
            <label for="edatPersona3">Edat:</label>
            <input type="number" id="edatPersona3" name="edatPersona3" min="0">
            <br>
            <input type="radio" id="estudiantSiPersona3" name="estudiantPersona3" value="si">
            <label for="estudiantSiPersona3">Estudiant</label>
            <input type="radio" id="estudiantNoPersona3" name="estudiantPersona3" value="no" checked>
            <label for="estudiantNoPersona3">No estudiant</label>
        </fieldset>
        <!--  -->
        <p>Les persones 1, 2 i 3 son opcionals, si no omples res no es compra la seva entrada</p>
        <input type="submit" value="Comprar">
    </form>
    <!--  -->
</body>
</html>
