$(document.body).ready(function () {
    $('input[type="text"], input[type="email"], textarea').on('keyup', function () {
        var val = $(this).parent().siblings(0)
        var type = $(this).attr('type')
        val.html('lol, you wrote on my '+ type+  ' wtf...')

        val.show()
        $(this).focusout(function () {
            val.hide()
        })
    })
})
