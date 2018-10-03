<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 3</title>
</head>

<body>
    <header>
        <h1>Ejercicio 3</h1>
        <p>Esto es una prueba 2</p>
    </header>
    <main>
        <section>
            <h2>1</h2>
            <p>
                Haz un formulario en el que insertemos un número y el servidor web nos visualice la tabla de
                multiplicar. Comprobaremos previamente que la variable exista y tenga un valor numérico.
                isset($variable)  para ver que exista la variable y no tiene un valor null is_null($variable)  Puedes
                usarla en lugar de la anterior, son complementarias is_numeric($variable)  Nos indica si el valor de
                la variable es numérico
            </p>
            <form action="/ejercicios/3/3" method="get">
                <label for="name">Número</label>
                <input type="text" name="num">
                <input type="submit">
            </form>
            <code>
                <?php
                $variable = $_GET["num"];
                if (!is_null($variable) && is_numeric($variable)) {
                    $mul = $variable;
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
                }
                ?>
            </code>
        </section>
        <section>
            <h2>2</h2>
            <p>
                Realiza un formulario donde pidamos al usuario datos para confeccionar una ficha  Nombre  Apellidos 
                Dirección  Fecha de nacimiento  Edad  Idiomas que habla de entre 4 idiomas (checkbox)  Si es hombre
                o mujer o no quiere informar de ello (radio)  Dirección de correo electrónico  Estudios realizados
                entre ESO, BACHILLER, CICLO FORMATIVO, GRADO UNIVERSITARIO (select)
            </p>
            <code>
                <?php

                ?>
            </code>
        </section>
        <section>
            <h2>3</h2>
            <p>
                Conversor numérico. Realiza un programa en el que introduzca un número, que será leído en decimal, y el
                programa mostrará la conversión a hexadecimal, octal y binario. Esta información se mostrará en una
                tabla. En caso de que el dato introducido no sea un número, el programa lo tiene que indicar y mostrar
                0 en todos los valores.
            </p>
            <code>
                <?php

                ?>
            </code>
        </section>
        <section>
            <h2>4</h2>
            <p>
                Mostrar formulario o datos de acceso. Realiza un programa que se muestre o bien el formulario o bien un
                mensaje de bienvenida con los datos del usuario. El usuario y password han de coincidir. En caso de que
                no coincidan se mostrará junto con el formulario un mensaje de error
            </p>
            <code>
                <?php

                ?>
            </code>
        </section>
        <section>
            <h2>5</h2>
            <p>
                Crear un sitio web. Realiza un programa en PHP que solicite al usuario una serie de parámetros, y con
                ellos construirá una página web según se especifica Donde A es la altura de la cabecera
                &lt;div style=height:A&gt; TITULO DE LA CABECERA&lt;/div&gt; Donde B es la altura del contenido &lt;div
                style=height:B&gt;
                esto es el contenido (menú y contenido)&lt;/div&gt; Donde C es el ancho de la parte derecha del
                contenido
                &lt;div style=width:C&gt; Zona de contenido&lt;/div&gt; Donde D es el acho de la parte izquierda
                correspondiente al
                menú &lt;div style=width:D&gt; Zona de menú&lt;/div&gt;
            </p>
            <code>
                <?php

                ?>
            </code>
        </section>
    </main>
</body>

</html>