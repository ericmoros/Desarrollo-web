<?php
if ($_SERVER["REQUEST_METHOD"] == "POST" && !empty($_FILES["userfile"])) {
    // move_uploaded_file()
}
?>
<html>

<head>
    <title>File Upload Progress Bar</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
    <div id="bar_blank">
        <div id="bar_color"></div>
    </div>
    <div id="status"></div>
    <form action="<?php echo $_SERVER[" PHP_SELF"]; ?>" method="POST"
        id="myForm" enctype="multipart/form-data" target="hidden_iframe">
        <input type="hidden" value="myForm" name="<?php echo ini_get(" session.upload_progress.name"); ?>">
        <input type="file" name="userfile"><br>
        <input type="submit" value="Start Upload">
    </form>
    <iframe id="hidden_iframe" name="hidden_iframe" src="about:blank"></iframe>
    <script type="text/javascript" src="script.js"></script>
</body>

</html>