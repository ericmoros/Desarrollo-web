function clicAlerta() {
    alert("Has hecho clic");
}

$(window).ready(function () {
    $("p").on("mouseover mouseout", function () {
        $(this).toggleClass("red")
    })
    $("p:first").on("click", function () {
        clicAlerta()
    })
})
