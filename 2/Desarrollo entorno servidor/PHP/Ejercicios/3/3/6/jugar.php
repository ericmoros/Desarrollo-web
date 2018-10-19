<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 3.3.6 - Jugar</title>
</head>

<body>
    <h2>Jugar</h2>
    <?php
        $victoria = false;
        $rNumero = rand(0, 1);
        $numero = $_GET[numero];

        if ($numero == $rNumero) {
            $victoria = true;
        }
    ?>
    <?php
        if ($victoria) {
    ?>
    <h3>Has ganado!</h3>
    <?php
        } else {
    ?>
    <h3>Has perdido, je je :D</h3>
    <p>El número era: <?php echo($rNumero);?></p>
    <?php
        }
    ?>
</body>

</html>