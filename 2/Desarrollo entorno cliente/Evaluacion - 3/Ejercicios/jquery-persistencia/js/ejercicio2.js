function pShow() {
    Cookies.set('visible', 1)
}

function pHide() {
    Cookies.set('visible', 0)
}

function isVisible() {
    var visible = parseInt(Cookies.get('visible'))
    return visible != null ? visible : false
}

function render() {
    if (isVisible()){
        $('paragraph').show()
    } else {
        $('paragraph').hide()
    }
}

function listenEvents() {
    listenButtons()

    function listenButtons() {
        $('.show').click(function () {
            pShow()
            render()
        })
        $('.hide').click(function () {
            pHide()
            render()
        })
    }
}

$(document).ready(function () {
    render()
    listenEvents()
})
