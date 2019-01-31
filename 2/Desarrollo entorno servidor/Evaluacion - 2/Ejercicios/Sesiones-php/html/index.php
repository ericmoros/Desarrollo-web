<?php

$session = session_start();

if ($session) {
    if(!isset($_SESSION['lang'])) {
        $_SESSION['lang'] = 'en';
        echo('<p>lang has been set to: ' . $_SESSION['lang'] . '</p>');
    }
    if(!isset($_SESSION['visibility'])) {
        $_SESSION['visibility'] = 'yes';
        echo('<p>visibility has been set to: ' . $_SESSION['visibility'] . '</p>');
    }
    if(!isset($_SESSION['timeZone'])) {
        $_SESSION['timeZone'] = 'utc';
        echo('<p>timeZone has been set to: ' . $_SESSION['timeZone'] . '</p>');
    }
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Sesión-php</title>
</head>

<body>
    <nav>
        <a href="">Home</a> |
        <a href="conf">Config</a> |
        <a href="ex1">Example page 1</a> |
        <a href="ex2">Another example page</a>
    </nav>
    <header>
        <h1>Sesiones con php</h1>
        <h2>Home</h2>
    </header>
    <main>
        <div class="session-info">
            <h3>Session info</h3>
            <p>Lang: <span id="lang">Loading</span></p>
            <p>Visibility: <span id="visibility">Loading</span></p>
            <p>TimeZone: <span id="timeZone">Loading</span></p>
        </div>
        <div class="content">
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Necessitatibus voluptatum, iure sequi explicabo
            labore, numquam atque quia veritatis cumque minima nihil sunt maxime? Perspiciatis pariatur dolores modi,
            id sint libero!
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
            }
        }
        if (server.debug) console.log(server);
    </script>
    <script src="resources/js/site.js"></script>
</body>

</html>