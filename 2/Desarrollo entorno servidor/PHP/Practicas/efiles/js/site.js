var inputFileLabelElement;
window.onload = function () {
    inputFileLabelElement = document.getElementById("input-file-label");
    eventsListen();
}

function eventsListen() {
    console.log("Events listening");
    $('#input-file').on('change',function(){
        var fileName = $(this).val();
        inputFileLabelElement.innerHTML = fileName;
    }); 
}