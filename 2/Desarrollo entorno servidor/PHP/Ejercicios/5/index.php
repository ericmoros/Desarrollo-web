<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Utilizando ficheros</title>
</head>

<body>
    <?php
        $lines = file("data/test.txt");
        foreach ($lines as $key => $value) {
    ?>
    <p>
        <?php echo($value);?>
    </p>
    <?php
        }
    ?>
</body>

</html>