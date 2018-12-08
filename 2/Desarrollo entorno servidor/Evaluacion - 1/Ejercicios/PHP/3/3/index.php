<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ejercicio 3.3</title>
    <?php
        $a=$_GET["a"];
        $b=$_GET["b"];
        $c=$_GET["c"];
        $d=$_GET["d"];
    ?>

    <style>
        .ej5-div1 {
            width: <?php echo(($d + $c) . 'px') ?>;
            height: <?php echo($a . 'px') ?>;
            background-color: red;
        }

        .ej5-div2 {
            width: <?php echo($d . 'px') ?>;
            height: <?php echo($b . 'px') ?>;
            background-color: blue;
            display: inline-block;
            float: left;
        }

        .ej5-div3 {
            width: <?php echo($c . 'px') ?>;
            height: <?php echo($b . 'px') ?>;
            background-color: green;
            display: inline-block;
            float: left;
        }

        .spacer {
            margin-top: 200px;
            margin-bottom: 200px;
        }
    </style>
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

            <code>
                <form action="/ejercicios/3/3" method="get">
                    <label for="name">Número</label>
                    <input type="text" name="num">
                    <input type="submit">
                </form>
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
                <form action="/ejercicios/3/3" method="get">
                    <label for="name">Nombre</label>
                    <input type="text" name="name" id="form-2-name"><br/>
                    <label for="sur-name">Apellidos</label>
                    <input type="text" name="sur-name" id="form-2-sur-name"><br/>
                    <label for="address">Dirección</label>
                    <input type="text" name="address" id="form-2-address"><br/>
                    <label for="date">Fecha</label>
                    <input type="date" name="date" id="form-2-date"><br/>
                    <label for="age">Edad</label>
                    <input type="number" name="age" id="form-2-age"><br/>
                    <fieldset>
                        <legend>Languages</legend>
                        <div>
                            <input type="checkbox" name="languages[]" id="form-2-languages[]-es" value="es">
                            <label for="languages[]">Español</label>
                        </div>
                        <div>
                            <input type="checkbox" name="languages[]" id="form-2-languages[]-en" value="en">
                            <label for="languages[]">Inglés</label>
                        </div>
                        <div>
                            <input type="checkbox" name="languages[]" id="form-2-languages[]-fr" value="fr">
                            <label for="languages[]">Francés</label>
                        </div>
                        <div>
                            <input type="checkbox" name="languages[]" id="form-2-languages[]-it" value="it">
                            <label for="languages[]">Italiano</label>
                        </div>
                    </fieldset>
                    <fieldset>
                        <legend>Sexo</legend>
                        <div>
                            <input type="radio" id="form-2-sex-man" name="sex" value="man" checked />
                            <label for="form-2-sex-man">Hombre</label>
                        </div>
                        <div>
                            <input type="radio" id="form-2-sex-women" name="sex" value="women" />
                            <label for="form-2-sex-women">Mujer</label>
                        </div>
                        <div>
                            <input type="radio" id="form-2-sex-other" name="sex" value="other" />
                            <label for="form-2-sex-other">Otros</label>
                        </div>
                    </fieldset>
                    <label for="e-mail">Correo electrónico</label>
                    <input type="email" name="e-mail" id="form-2-e-mail"><br/>
                    <label for="grades">Estudios</label>
                    <select name="grades[]">
                        <option value="null" selected disabled hidden>Haz clic para seleccionar</option>
                        <option id="form-2-grades[]-eso" value="eso">ESO</option>
                        <option id="form-2-grades[]-bac" value="bac">Bachiller</option>
                        <option id="form-2-grades[]-cif" value="cif">Ciclo formativo</option>
                        <option id="form-2-grades[]-gru" value="gru">Grado universitario</option>
                    </select><br/>
                    <input type="submit">
                </form>
                <?php
                    $name = $_GET["name"];
                    $surName = $_GET["sur-name"];
                    $address = $_GET["address"];
                    $date = $_GET["date"];
                    $age = $_GET["age"];
                    $languages = $_GET["languages"];
                    $sex = $_GET["sex"];
                    $eMail = $_GET["e-mail"];
                    $grades = $_GET["grades"];

                    function toString ($array) {
                        $str = "";
                        foreach ($array as $key => $value) {
                            $str = $str . $value . ", ";
                        }
                        return $str;
                    }

                    if ($name) echo ("<p>Nombre: " .  $name . "</p>");
                    if ($surName) echo ("<p>Apellido: " .  $surName . "</p>");
                    if ($address) echo ("<p>Dirección: " .  $address . "</p>");
                    if ($date) echo ("<p>Fecha: " .  $date . "</p>");
                    if ($age) echo ("<p>Años: " .  $age . "</p>");
                    if ($languages) echo ("<p>Lenguajes: " . toString($languages)  . "</p>");
                    if ($sex) echo ("<p>Sexo: " .  $sex . "</p>");
                    if ($eMail) echo ("<p>Correo electrónico: " .  $eMail . "</p>");
                    if ($grades) echo ("<p>Estudios: " .  toString($grades) . "</p>");
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
                <form action="/ejercicios/3/3" method="get">
                    <label for="name">Número</label>
                    <input type="text" name="num">
                    <input type="submit">
                </form>
                <?php
                    $num = $_GET["num"];
                    $base = 10;
                    $bin = base_convert ($num, $base, 2);
                    $oct = base_convert ($num, $base, 8);
                    $hex = base_convert ($num , $base, 16);
                    echo ("<p>Binario: " . $bin . "</p>");
                    echo ("<p>Octal: " . $oct . "</p>");
                    echo ("<p>Hexadecimal: " . $hex . "</p>");
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
                <form action="/ejercicios/3/3" method="get">
                    <label for="username">Nombre</label>
                    <input type="text" name="username" id="form-3-username"><br/>
                    <label for="password">Apellidos</label>
                    <input type="text" name="password" id="form-3-password"><br/>
                    <input type="submit">
                </form>
                <?php
                    class User {
                        // Atts
                        public $username;
                        public $password;
                        public $status = false;

                        // Methods
                        function login() {
                            $status = true;
                        }
                    }
                    
                    // $userA = new User();
                    // $userA["username"] = "eric";
                    // $userA["password"] = "1234";
                    // $userB = new User();

                    // $users = [$userA, $userB];
                    // $username = $_GET["username"];
                    // $password = $_GET["password"];

                    
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
                <form action="/ejercicios/3/3" method="get">
                    <label for="3-form-a">A</label>
                    <input id="3-form-a" name="a" type="number">
                    <label for="3-form-b">B</label>
                    <input id="3-form-b" name="b" type="number">
                    <label for="3-form-c">C</label>
                    <input id="3-form-c" name="c" type="number">
                    <label for="3-form-d">D</label>
                    <input id="3-form-d" name="d" type="number">
                    <input type="submit" value="Enviar">
                </form>
                <div class="ej5-div1"></div>
                <div class="ej5-div2"></div>
                <div class="ej5-div3"></div>
            </code>
        </section>
        <section>
            <h2>6</h2>
            <p>
                Juego de adivinar números. Haz un programa que genere un número aleatorio entre 0 y 1024. Después
                deberás de intentar adivinarlo, para ello el programa te informará de si el número que aportas es
                menor, mayor o si lo has acertado. Tendrás 10 intentos. En cualquier momento podrás reiniciar el juego
                mientras estás jugando. Deberás tener tres ficheros: - Index.html que te generará la información -
                jugar.php que es el juego - fin.php cuando termine la partida mostrará la información del juego
                realizado
            </p>

            <p>
                Requisito1: La pantalla de inicio a) Crear la pantalla de bienvenida con la explicación del juego b)
                Con una opción que me lleve a un fichero llamado jugar.php c) El fichero de momento solo muestra un
                mensaje Requisito 2: Generamos un número aleatorio a) Solo lo generamos si venimos de index.php b)
                Tenemos un botón de jugar c) Si apretamos el botón de jugar volvemos a cargar jugar.php, pero sin
                generar el número aleatorio de nuevo d) Podemos probar visualizando el número Requisito 3: solicitamos
                un número al usuario Requisito 4: Controlamos las jugadas Requisito 5: informamos si es mayor o menor
                el número Requisito 6: podemos reiniciar el juego Requisito 7: Volver al inicio Requisito 8: Controlar
                el final Requisito 9: Ventana de fin Requisito 10: Volver a iniciar la partida desde el final
            </p>
            <code>
                <a href="6">Ir al ejercicio 6</a>
            </code>
        </section>
        <div class="spacer"></div>
    </main>
</body>

</html>