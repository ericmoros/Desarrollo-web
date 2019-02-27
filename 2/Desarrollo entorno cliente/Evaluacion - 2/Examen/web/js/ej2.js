var p = {}

$(document).ready(function () {
    load()
    listenEvents()
});

function load() {
    p.p1 = $('#p1')
    p.opacidad = $('#opacidad')
    changeOpacity()
}

function listenEvents() {
    p.opacidad.on('change', function () {
        changeOpacity()
    })
}

function changeOpacity() {
    p.p1.css('opacity', p.opacidad.val())    
}