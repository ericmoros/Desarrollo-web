<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 3.1</title>
    <style>
        table,
        caption,
        th,
        td {
            border: 1px solid green;
            text-align: center;
        }

        section {
            margin-bottom: 50px;
        }
    </style>
</head>

<body>
    <main role="main">
        <h1>Ejercicio 3.1</h1>
        <section>
            <h2>
                Condiciones
            </h2>
            <code>
                <p>
                    <?php
                    $num = 10;
                    $rNum = rand(1, 100);
                    if ($rNum > $num) {
                        echo ("The number " . $rNum . " is greater than " . $num);
                    } else {
                        echo ("The number " . $rNum . " is lower than " . $num);
                    }
                    ?>
                </p>
            </code>
        </section>
    </main>
</body>

</html>