<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 3</title>
    <style>
        section {
            margin-bottom: 50px;
        }
    </style>
</head>
<body>
    <h1>Ejercicio 3</h1>
    <section>
        <h2>Funciones</h2>
        <section>
            <h3>Función que devuelva el resultado de 3 sumandos</h3>
            <code>
                <?php
                $sum1 = 1;
                $sum2 = 2;
                $sum3 = 3;
                $result = null;
                function sum($num1, $num2, $num3)
                {
                    $result = $num1 + $num2 + $num3;
                    return $result;
                }
                $result = sum($sum1, $sum2, $sum3);
                echo ("<p>" . $sum1 . " + " . $sum2 . " + " . $sum3 . " = " . $result . "</p>");
                ?>
            </code>
        </section>
    </section>
    <section>
        <h2>Arrays</h2>
        <section>
            <h3>Definir un array de 15 valores y llenarlo con valores aleatorios</h3>
            <code>
            <?php
            $min = 1;
            $max = 20;
            $avg = null;
            $rArray = array();
            $totalNum = 15;
            for ($i = 0; $i < $totalNum; $i++) {
                array_push($rArray, rand($min, $max));
                echo ($rArray[$i] . ", ");
            }
            echo("<p>Array ordenado</p>");
            sort($rArray);
            foreach ($rArray as $key => $value) {
                echo ($value . ", ");
            }
            $min = min($rArray);
            $max = max($rArray);
            $avg = array_sum($rArray) / count($rArray);
            echo ("<p>Mayor: " . $max . "</p>");
            echo ("<p>Menor: " . $min . "</p>");
            echo ("<p>Media: " . $avg . "</p>");
            ?>
            </code>
        </section>
    </section>
</body>
</html>