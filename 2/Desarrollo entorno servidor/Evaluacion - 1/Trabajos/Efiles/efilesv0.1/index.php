<?php
$dir_path = "files/";
$file_path = $dir_path . basename($_FILES["input-file"]["name"]);
$
 = array_diff(scandir($dir_path), array('.', '..'));

if ($_FILES["input-file"]["error"] == 0) {
    move_uploaded_file($_FILES["input-file"]["tmp_name"], $file_path);
}

if (isset($_GET["filename"])) {
    $file_name = $_GET["filename"];
    download($file_name);
}

function download($file_name)
{
    $file = $dir_path . $file_name;
    header('Content-Description: File Transfer');
    header('Content-Type: MIME');
    header('Content-Disposition: attachment; filename="'.basename($file).'"');
    header('Expires: 0');
    header('Cache-Control: must-revalidate');
    header('Pragma: public');
    header('Content-Length: ' . filesize($file));
    readfile($file);
    exit;   
}
?>  
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta author="Eric Moros Pérez">
    <title>EFiles</title>
    <link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="lib/fontawesome/css/all.min.css">
    <link rel="stylesheet" href="css/site.css">
</head>

<body>
    <nav class="navbar navbar-expand-sm navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="#">
            <i class="far fa-file-alt"></i>
            EFiles
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="container">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#home">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#music">Music</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <main>
        <div class="container mt-5">
            <section>
                <div class="row">
                    <div class="col-md-3">
                        <h2 class="m-auto">All Files</h2>
                    </div>
                    <div class="col-md">
                        <form method="post" enctype="multipart/form-data" max>
                            <div class="form-row">
                                <div class="col">
                                    <div class="custom-file">
                                        <input type="hidden" name="MAX_FILE_SIZE" value="2097152">
                                        <input type="file" class="m-auto custom-file-input" id="input-file" name="input-file" required>
                                        <label id="input-file-label" class="m-auto custom-file-label" for="input-file">Choose file...</label>
                                        <div class="m-auto invalid-feedback">Example invalid custom file feedback</div>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <button class="btn btn-primary btn-block" type="submit">Upload</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col">
                        <div id="accordion">
                            <!-- from -->
                            <?php
                                $value_id = 0;
                                foreach ($files as $key => $value) {
                                $value_id += 1;
                                $value_trim = strtolower($value);
                                preg_replace('/\s+/', '', $value_trim)
                            ?>
                            <div class="card">
                                <div class="card-header" id="heading-<?php echo($value_id)?>">
                                    <h5 class="mb-0">
                                        <button class="btn btn-link" data-toggle="collapse" data-target="#collapse-<?php echo($value_id)?>"
                                            aria-expanded="true" aria-controls="collapse-<?php echo($value_id)?>">
                                            <?php echo($value);?>
                                        </button>
                                        <a class="btn btn-outline-info float-right" href='/practicas/efiles?filename="<?php echo($value)?>"'>
                                            <i class="fas fa-file-download"></i>
                                        </a>
                                        <button class="btn btn-outline-info float-right  mr-5">
                                            <i class="fas fa-trash-alt"></i>
                                        </button>
                                    </h5>
                                </div>
                                <div id="collapse-<?php echo($value_id)?>" class="collapse" aria-labelledby="heading-<?php echo($value_id)?>" data-parent="#accordion">
                                    <div class="card-body">
                                        Lorem ipsum dolor sit amet consectetur, adipisicing elit. Corporis pariatur
                                        incidunt necessitatibus id nemo alias sint soluta saepe cupiditate.
                                        Exercitationem, cumque modi! Obcaecati quam incidunt molestias dolores libero
                                        magnam cum.
                                    </div>
                                </div>
                            </div>
                            <?php
                                }
                            ?>
                            <!-- to -->
                        </div>
                    </div>
            </section>
        </div>
    </main>
    <footer>
        <hr>
        <p>
            Desarrollado por Eric Moros Pérez en 2018
        </p>
    </footer>
    <script src="lib/jquery/jquery-3.3.1.min.js"></script>
    <script src="lib/popper.js/popper.min.js"></script>
    <script src="lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="lib/fontawesome/js/all.min.js"></script>
    <script src="js/site.js"></script>
</body>

</html>