<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 3.3.6</title>
</head>

<body>
    <h1>Ejercicio 3.3.6</h1>
    <p>Introduce un número del 0 al 1024 y si lo adivinas has ganado.</p>
    <form action="jugar.php" method="post">
        <label for="form-numero">Número</label>
        <input type="number" name="numero" id="form-numero">
        <input type="number" name="rNumero" id="form-rNumero" hidden>
        <input type="submit" value="Adivinar">
    </form>
</body>

</html>