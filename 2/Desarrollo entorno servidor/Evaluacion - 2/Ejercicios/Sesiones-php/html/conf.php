<?php

$session = session_start();

if (!$session) {
    throw new Exception("Error starting session", 1);
}

if (isset($_POST['lang'])) $_SESSION['lang'] = $_SESSION['av_langs'][$_POST['lang']];
if (isset($_POST['visibility'])) $_SESSION['visibility'] = $_SESSION['av_visibilities'][$_POST['visibility']];
if (isset($_POST['timeZone'])) $_SESSION['timeZone'] = $_SESSION['av_timeZones'][$_POST['timeZone']];
if (isset($_POST['reset'])) {
    session_destroy();
    header('location:/');
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Sesión-php - Config</title>
    <link rel="stylesheet" href="resources/css/site.css">
</head>

<body>
    <nav>
        <a href="/">Home</a> |
        <a href="">Config</a>
    </nav>
    <header>
        <h1>Sesiones con php</h1>
        <h2>Conf</h2>
    </header>
    <main>
        <div class="session-info">
            <form name="formLang" class="inline-form" action="" method="POST">
                <label for="avLang">Lang</label>
                <select name="lang" id="avLang">
                </select>
            </form>
            <form name="formVisibility" class="inline-form" action="" method="POST">
                <label for="avVisibility">visibility</label>
                <select name="visibility" id="avVisibility">
                </select>
            </form>
            <form name="formTimeZone" class="inline-form" action="" method="POST">
                <label for="avTimeZone">Time zone</label>
                <select name="timeZone" id="avTimeZone">
                </select>
            </form>
            <form name="formReset" class="inline-form" action="" method="POST">
                <input name="reset" type="submit" value="Reset all">
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