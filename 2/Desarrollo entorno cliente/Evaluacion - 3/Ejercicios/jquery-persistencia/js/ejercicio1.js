$(window).ready(function () {
    var connections = $('.connections')
    var cookieConnections = Cookies.get('connections')
    if (cookieConnections != null) {
        cookieConnections++
        Cookies.set('connections', cookieConnections, { expires: 3 })
    } else {
        cookieConnections = 1
        Cookies.set('connections', cookieConnections, { expires: 3 })
    }
    connections.html(cookieConnections)
})