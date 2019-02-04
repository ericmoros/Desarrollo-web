<?php
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Sesión-php - Config</title>
</head>

<body>
    <nav>
        <a href="/">Home</a> |
        <a href="">Config</a> |
        <a href="ex1.php">Example page 1</a> |
        <a href="ex2.php">Another example page</a>
    </nav>
    <header>
        <h1>Sesiones con php</h1>
        <h2>Conf</h2>
    </header>
    <main>
        <div class="session-info">
            <form action="">
                <select name="lang" id="avLang">
                </select>
                <select name="visibility" id="avVisibility">
                </select>
                <select name="timeZone" id="avTimeZone">
                </select>
            </form>
        </div>
    </main>
    <footer>
        <p>Developed by: Eric Moros Pérez</p>
    </footer>
    <script>
        const server = {
            debug: true,
            session: {
                lang: '<?php echo($_SESSION['lang'])?>',
                visibility: '<?php echo($_SESSION['visibility'])?>',
                timeZone: '<?php echo($_SESSION['timeZone'])?>'
            },
            av: {
                langs: <?php echo(json_encode($_SESSION['av_langs']))?>,
                visibilities: <?php echo(json_encode($_SESSION['av_visibilities']))?>,
                timeZones: <?php echo(json_encode($_SESSION['av_timeZones']))?>
            }
        }
        if (server.debug) console.log(server);
    </script>
    <script src="resources/js/site.js"></script>
</body>

</html>