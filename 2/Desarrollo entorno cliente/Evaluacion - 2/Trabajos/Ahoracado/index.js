const gameCursor = '|';

const youDir = 'resources/img/'
const youLabel = 'you-'
const youExtension = '.gif';
const youSize = 8;

var youFail = 0;
var youCursor = false;
window.onload = function () {
    listenEvents();
    startGame();
    console.log('[pageReady]');
}

function q(str) {
    console.log('[q]', str);
    return document.querySelectorAll(str);
}

function listenEvents() {
    console.log('[listenEvents]');
    q('.wordChar').forEach(c => {
        c.addEventListener('click', function () {
            console.log('c {click}', this);
            setCursor(this);
        })
    });
}

function startGame() {
    
}

function fail() {
    console.log('[fail]');
    let rFail = true;
    if (youFail < youSize) {
        youFail++;
        let youPath = `${youDir}${youLabel}${youFail}${youExtension}`;
        you.src = youPath;
    } else {
        rFail = false;
    }
    return rFail;
}

function setCursor(e) {
    console.log('[setCursor]', e);
    executeAsync(function() {
        while (youCursor) {
            setTimeout(function () {
                
            }, 500);
        }
    });
}

function gameOver(status) {
    console.log('[gameOver]', status);
    let youGame = status ? 'win' : 'lose';
    alert(`[GAME OVER] You ${youGame}`);
}