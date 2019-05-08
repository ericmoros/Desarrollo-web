var clicks = {
    init() {
        console.group('init')
        if (isNaN(clicks.total)) clicks.initTotal()
        $('.btn, .session, .total').ready(function () {
            clicks.initElements()
            clicks.render()
            clicks.listenButton()
            console.log('done')
            console.groupEnd()
        })
    },
    elements: {
        session: null,
        total: null,
        btn: null
    },
    _session: 0,
    get total() {
        console.log('get total')
        return parseInt(Cookies.get('total'))
    },
    set total(value) {
        console.group('total', value)
        Cookies.set('total', value, 3)
        clicks.render('total')
        console.log('done')
        console.groupEnd()
    },
    get session() {
        console.log('get session')
        return this._session
    },
    set session(value) {
        console.group('session', value)
        clicks._session = value
        clicks.render('session')
        console.log('done')
        console.groupEnd()
    },
    initTotal() {
        console.group('initTotal')
        Cookies.set('total', 0, 3)
        console.log('done')
        console.groupEnd()
    },
    initElements() {
        console.group('initElements')
        clicks.elements.session = $('.session')
        clicks.elements.total = $('.total')
        clicks.elements.btn = $('.btn')
        console.log('done')
        console.groupEnd()
    },
    render(att) {
        console.group('render', att)
        switch (att) {
            case 'session':
                clicks.elements.session.html(clicks.session)
                break
            case 'total':
                clicks.elements.total.html(clicks.total)
                break
            default:
                clicks.elements.session.html(clicks.session)
                clicks.elements.total.html(clicks.total)
                break
        }
        console.log('done')
        console.groupEnd()
    },
    listenButton() {
        console.group('listenButton')
        clicks.elements.btn.click(function () {
            console.group('btn {click}')
            clicks.total++
            clicks.session++
            console.log('done')
            console.groupEnd()
        })
        console.log('done')
        console.groupEnd()
    }
}

function main() {
    clicks.init()
}

main()
