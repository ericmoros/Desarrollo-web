<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 2</title>
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
        <h1>Ejercicio 2</h1>
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
        <section>
            <h2>
                Bucles
            </h2>
            <section>
                <h3>Un número par del 1 al 100</h3>
                <code>
                    <p>
                        <?php
                        while ($rNum % 2 != 0) {
                            $rNum = rand(1, 100);
                        }
                        echo ("The number " . $rNum . " is pair");
                        ?>
                    </p>
                </code>
            </section>
            <section>
                <h3>Multiplicar</h3>
                <section>
                    <code>
                        <?php
                        $mul = 3;
                        $max = 10;
                        $result = null;
                        echo ("<table>");
                        echo ("<caption>Tabla del " . $mul . "</caption>");
                        echo ("<thead><tr><th>clave</th><th>valor</th></tr></thead>");
                        echo ("<tbody>");
                        for ($num = 1; $num <= $max; $num++) {
                            $result = $num * $mul;
                            echo ("<tr>");
                            echo ("<td>" . $num . "</td>");
                            echo ("<td>" . $result . "</td>");
                            echo ("</tr>");
                        }
                        echo ("</tbody>");
                        echo ("</table>");
                        ?>
                    </code>
                </section>
                <section>
                    <code>
                        <?php
                        $num = 0;
                        $from = 0;
                        $mul = 3;
                        $max = 10;
                        $result = null;
                        echo ("<table>");
                        echo ("<caption>Tabla del " . $mul . "</caption>");
                        echo ("<thead>");
                        echo ("<tr>");
                        while ($num < $max) {
                            $num++;
                            echo ("<th>" . $num . "</th>");
                        }
                        echo ("</tr>");
                        echo ("</thead>");
                        echo ("<tbody>");
                        for ($num = 1; $num <= $max; $num++) {
                            echo ("<tr>");
                            for ($num2 = 1; $num2 <= $max; $num2++) {
                                $result = $num2 * $num;
                                echo ("<td>" . $result . "</td>");
                            }
                            echo ("</tr>");
                        }
                        echo ("</tbody>");
                        echo ("</table>");
                        ?>
                    </code>
                </section>
            </section>
            <section>
                <h3>Números primos</h3>
                <code>
                    <?php
                    $num = 0;
                    $max = 99999;
                    $primes = array();
                    for ($i=1; $i <= $max; $i++) { 
                        $prime = true;
                        for ($j=2; $j < $i; $j++) { 
                            if ($i % $j == 0) {
                                $prime = false;
                                echo ($j . ", ");
                                break;
                            }
                        }
                        if ($prime) {
                            array_push($primes, $i);
                        }
                    }
                    foreach ($primes as $key => $value) {
                        echo ("<p>" . $value . "</p>");
                    }
                    ?>
                </code>
            </section>
        </section>
    </main>
</body>

</html>