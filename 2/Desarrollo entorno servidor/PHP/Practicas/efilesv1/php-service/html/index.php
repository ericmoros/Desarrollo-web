<?php
    session_start();
    if (false) {
        echo(ini_get('max_input_time') . '<br/>');
        echo(ini_get('max_execution_time') . '<br/>');
        echo(ini_get('upload_max_filesize') . '<br/>');
        echo(ini_get('post_max_size') . '<br/>');
    }
    $dir = 'files/';
    $users = ['ericmoros', 'guest'];
    $passwords = ['test1234', '12345678'];
    $file_separator = '|';
    
    $file_upload_name = upload_file($dir);
    $file_remove_name = remove_file($dir);
    $files = get_files($dir);
    $session = startSession($users, $passwords);

    // Session
    function checkLogin($users, $passwords, $user, $password)
    {
        $allRight = false;
        $uIndex = -1;
        $usersLength = count($users);
        for ($i=0; $i < $usersLength; $i++) {
            if ($user == $users[$i]) {
                $uIndex = $i;
                break;
            }
        }
        if ($uIndex != -1) {
            if ($passwords[$uIndex] == $password) {
                $allRight = true;
            }
        }

        return $allRight;
    }

    function startSession($users, $passwords)
    {
        if (!$_SESSION["session"]) {
            $login = checkLogin($users, $passwords, $_POST['user-name'], $_POST['user-password']);
            if ($login) {
                $_SESSION["session"] = true;
                $_SESSION["session-user"] = $_POST['user-name'];
            }
        }
        return $_SESSION["session"];
    }
    
    // Get all
    function get_files($dir)
    {
        $files = scandir($dir);
        $files = filter_files($files);
        return $files;
    }

    function filter_files($files)
    {
        $no_files = ['.', '..'];
        $files = array_diff($files, $no_files);
        return $files;
    }

    function array_to_string($array, $separator)
    {
        $str = '';
        foreach ($array as $key => $value)
            $str = $str . $value . $separator;
        $str = trim($str);
        $str = substr($str, 0, strlen($str) - 1);
        return $str;
    }

    // Remove
    function remove_file($dir)
    {
        if (isset($_POST['f-remove'])) {
            $file_name = $_POST['f-remove'];
            $file = $dir . $file_name;
            if (is_file($file))
                unlink($file);
        }
    }

    // Upload
    function findWebUploadedFile()
    {
        $found = false;
        if (isset($_FILES['f-input']))
            $found = true;
        return $found;
    }

    function upload_file($dir)
    {
        $file_name = '';
        if (findWebUploadedFile()) {
            $file_name = $_FILES['f-input']['name'];
            $file = $dir . $file_name;
            $web_file = $_FILES['f-input']['tmp_name'];
            move_uploaded_file($web_file, $file);
            if (!is_file($file))
                $file_name = 'error';
        }
        return $file_name;
    }
?>

<?php if ($session) { ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title id="title">Loading</title>
    <link rel="stylesheet" href="resources/css/site.css">
</head>
<body>
    <nav>
        <ul id="pages">
            <li><h1 id="header">Loading</h1></li>
            <li id="p0" class="page">Home</li>
        </ul>
    </nav>
    <header>
        <h2 id="page-header">Home</h2>
    </header>
    <main>
        <section id="up-file">
            <h3>Upload</h3>
            <form id="up-file-form" action="" method="post" enctype="multipart/form-data">
                <input id="up-file-form-btn" type="submit" value="Up">
                <button id="up-file-form-cancel">Cancel</button>
                <input id="up-file-form-input" type="file" name="f-input" id="f-input">
            </form>
            <progress id="up-file-progress" value="0" max="99"></progress>
            <section>
                <p id="up-file-warn"></p>
            </section>
        </section>
        <section id="files">
            <h3>All</h3>
            <hr>
            <section id="f0" class="file">
                <h4 class="f-name">Default</h4>
                <p class="f-path">/files/default.test</p>
                <a  class="f-path-a" target="_blank" href="files/default.test" >
                    <button class="btn-open">Open</button>
                </a>
                <br>
                <a class="f-path-a" href="files/default.test" download>
                    <button class="btn-download">Download</button>
                </a>
                <form action="" method="post">
                    <input class="f-remove" name="f-remove" type="text" hidden>
                    <input type="submit" value="Remove">
                </form>
                <hr/>
            </section>
        </section>
    </main>
    <footer>
        <p>Developed by Eric Moros Pérez</p>
    </footer>
    <script>
        const phpFiles = '<?php echo(array_to_string($files, $file_separator))?>';
        const phpDir = '<?php echo($dir)?>';
        const user = '<?php echo($_SESSION["session-user"]); ?>';
        const fileSeparator = '<?php echo($file_separator);?>';
        const file_uploaded = '<?php echo($file_upload_name);?>';
        </script>
    <script src="resources/js/site.js"></script>
    <script src="resources/js/main.js"></script>
</body>
</html>
<?php } else { ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title id="title">Login</title>
</head>
<body>
    <header>
        <h2 id="page-header">Login</h2>
    </header>
    <main>
        <form action="" method="post">
            <div class="input-group">
                <label for="user-name">Username</label>
                <input name="user-name" id="user-name" autofocus="" required="" type="text">
            </div>
            <div class="input-group">
                <label for="user-password">Contraseña</label>
                <input name="user-password" id="user-password" required="" type="password" minlength="8">
            </div>
            <div class="input-group">
                <input type="submit" value="Enter">
            </div>
        </form>
    </main>
    <footer>
        <p>Developed by Eric Moros Pérez</p>
    </footer>
</body>
</html>
<?php } ?>
