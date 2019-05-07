var clicks = {
    init() {
        if (isNaN(clicks.total)) clicks.initTotal()
        $(window).ready(function () {
            clicks.initElements()
            clicks.render()
            clicks.listenButton()
        })
    },
    elements: {
        session: null,
        total: null,
        btn: null
    },
    _session: 0,
    get total() {
        return parseInt(Cookies.get('total'))
    },
    set total(value) {
        Cookies.set('total', value, 3)
        clicks.render('total')
    },
    get session() {
        return this._session
    },
    set session(value) {
        clicks._session = value
        clicks.render('session')
    },
    initTotal() {
        Cookies.set('total', 0, 3)
    },
    initElements() {
        clicks.elements.session = $('.session')
        clicks.elements.total = $('.total')
        clicks.elements.btn = $('.btn')
    },
    render(att) {
        switch (att) {
            case 'session':
                clicks.elements.session.html(clicks.session)
                break;
            case 'total':
                clicks.elements.total.html(clicks.total)
                break;
            default:
                clicks.elements.session.html(clicks.session)
                clicks.elements.total.html(clicks.total)
                break;
        }
    },
    listenButton() {
        clicks.elements.btn.click(function () {
            clicks.total++
            clicks.session++
        })
    }
}

clicks.init()