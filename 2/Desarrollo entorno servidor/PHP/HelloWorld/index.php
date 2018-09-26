<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Hello world</title>
    <style>
        code {
            background-color: #fff;
        }
    </style>
</head>

<body>
    <h1>Ejercicios</h1>
    <!-- EJERCICIO 1 -->
    <section>
        <h2>1</h2>
        <p>
            Crea un fichero PHP que muestre por pantalla el mensaje “PRIMER EJERCICIO: visualización del contenido
            de
            variables”. A continuación, define dos variables $nombre y $edad y asígnales un valor correcto. Después
            crea una
            sentencia que muestre un mensaje que contenga dichas variables, similar a “Mi nombre es:
            valor_de_la_variable_$nombre y mi edad es valor_de_la_variable_$edad”. Pon en el código un comentario
            encima de
            cada variable explicando el significado del valor que almacenará cada variable.
        </p>
        <section>
            <code>
                <p>
                    <?php
                        echo("PRIMER EJERCICIO: visualización del contenidode variables!");
                    ?>
                </p>
                <p>
                    <?php
                        $nombre = "Eric";
                        $edad = 18;
                        echo("Mi nombre es: " . $nombre);
                    ?>
                </p>
            </code>
        </section>
    </section>
    <!-- EJERCICIO 2 -->
    <section>
        <h2>2</h2>
        <p>
            Crea un fichero PHP que permita comprobar las capacidades aritméticas de PHP. Para ello, crea dos
            variables.
            Asígnales los valores 13 y 4 respectivamente. Define una tercera variable $resultado y escribe un código
            que
            permita hacer las siguientes operaciones y muestre su resultado por pantalla: a. 13 – 4 b. 13 + 4 c. 13 * 4
            d. 13 /
            4 e. 13 % 4
        </p>
        <section>
            <code>
                <p>
                    <?php
                        $num1 = 13;
                        $num2 = 4;
                        $resultado = $num1 + $num2;
                        echo($num1 . " + " . $num2 . " = " . $resultado);
                    ?>
                </p>
                <p>
                    <?php
                        $resultado = $num1 - $num2;
                        echo($num1 . " - " . $num2 . " = " . $resultado);
                    ?>
                </p>
                <p>
                    <?php
                        $resultado = $num1 * $num2;
                        echo($num1 . " * " . $num2 . " = " . $resultado);
                    ?>
                </p>
                <p>
                    <?php
                        $resultado = $num1 / $num2;
                        echo($num1 . " / " . $num2 . " = " . $resultado);
                    ?>
                </p>
                <p>
                    <?php
                        $resultado = $num1 % $num2;
                        echo($num1 . " % " . $num2 . " = " . $resultado);
                    ?>
                </p>
            </code>
        </section>
    </section>
    <!-- EJERCICIO 3 -->
    <section>
        <h2>3</h2>
        <p>
            Crea un fichero de PHP que permita conocer toda la información de una variable (utiliza la función
            var_dump()), de tal forma que pueda obtener una salida por pantalla similar a la siguiente: Información de
            la variable “nombre”: string (4) “Juan” Contenido de la variable: Juan Después de asignarle un valor nulo
            NULL
        </p>
        <section>
            <code>
                <p>
                    <?php
                        var_dump($nombre)
                    ?>
                </p>
            </code>
        </section>
    </section>
    <!-- EJERCICIO 4 -->
    <section>
        <h2>4</h2>
        <p>
            Crea un fichero PHP en el que se asignen los siguientes valores, de forma consecutiva, a una variable
            $temporal:
            “Juan”, 3.14, false, 3, null. Muestra por pantalla el tipo que se le asigna a la variable utilizando la
            función
            gettype() después de cada asignación
        </p>
        <section>
            <code>
                <p>
                    <?php
                        $temporal = "Juan";
                        echo(gettype($temporal));
                    ?>
                </p>
                <p>
                    <?php
                        $temporal = 3.14;
                        echo(gettype($temporal));
                    ?>
                </p>
                <p>
                    <?php
                        $temporal = false;
                        echo(gettype($temporal));
                    ?>
                </p>
                <p>
                    <?php
                        $temporal = 3;
                        echo(gettype($temporal));
                    ?>
                </p>
                <p>
                    <?php
                        $temporal = null;
                        echo(gettype($temporal));
                    ?>
                </p>
            </code>
        </section>
    </section>
</body>

</html>