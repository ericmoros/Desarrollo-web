function clicAlerta() {
    alert("Has hecho clic");
}

$(document).ready(function () {
    $("p").on("mouseenter mouseleave", function (e) {
        if ($(this).css("color") == "rgb(0, 0, 0)")
            $(this).css("color", "rgb(255, 0, 0)");
        else
            $(this).css("color", "black");
    })

    var miClase =  $(".miclase")

    miClase.on("click", function () {
        clicAlerta()
    });

    $("input").on("click", function () {
        miClase.off("click")
    })
    

})