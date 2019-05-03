jQuery(function ($) {
    var oh = $("#outer-hover")
    oh.hover(
        function () {
            console.log("mouseHoverEnter")
        },
        function () {
            console.log("mouseHoverLeave")
        }
    )
    oh.on("mouseover", function () {
        console.log("mouseover")
    })
    oh.on("mouseout", function () {
        console.log("mouseout")
    })
    oh.on("mouseenter", function () {
        console.log("mouseenter")
    })
    oh.on("mouseleave", function () {
        console.log("mouseleave")
    })
}) 