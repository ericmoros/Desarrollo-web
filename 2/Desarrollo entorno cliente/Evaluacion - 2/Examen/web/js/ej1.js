const PLAY_SECONDS = 4
const PLAY_T = PLAY_SECONDS * 1000 / 3
const PLAY_STEP = '200px'
const W = $(window)
var p = {}

$(document).ready(function () {
    load()
    listenEvents()
    play(p.logo)
    console.log('page ready')
})

function load() {
    p.logo = $('#logo')
    p.btnPlay = $('#btnPlay')
    p.btnStop = $('#btnStop')
    p.btnStopAll = $('#btnStopAll')
    console.log('load done')
}

function listenEvents() {
    p.btnPlay.on('click', function () {
        console.log('btnPlay clicked')
        play(p.logo)
    })
    p.btnStop.on('click', function () {
        console.log('btnStop clicked')
        p.logo.stop()
    })
    p.btnStopAll.on('click', function () {
        console.log('btnStopAll clicked')
        p.logo.stop()
        p.logo.stop()
        p.logo.stop()
    })
    console.log('listenEvents done')
}

function play(jQueryElement) {
    p.btnPlay.prop('disabled', true)
    p.btnStop.prop('disabled', false)        
    p.btnStopAll.prop('disabled', false)      
    jQueryElement.animate({ width: jQueryElement.width() * 2 }, PLAY_T)
    jQueryElement.animate({ left: '+=' + PLAY_STEP }, PLAY_T)
    jQueryElement.animate({ width: jQueryElement.width() }, PLAY_T, function () {
        p.btnPlay.prop('disabled', false)
        p.btnStop.prop('disabled', true)        
        p.btnStopAll.prop('disabled', true)         
    })
    console.log('play done')
}
