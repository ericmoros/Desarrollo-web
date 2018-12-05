const gameAsks = [
    'Do you like the game?',
    'Are you serious?',
    'if i say dummy say "mmmm" you say...'
];
const gameResponses = [
    'yes',
    'yes',
    'what?'
];
const gameMessages = [
    'This is just the padawans luck',
    'What!? You was serious? ... But if no body is serious...',
    'emmmm  butttt iffj theññkpowerflkfñfkldñsklafklsdfjdsñkafjkldsalkfdsaj.f .fsdkjañfjdsklañfjkldñsa klfdsajfñlk233 02020202010101010101010101010101010101011111111010101010111010101010101111'
];
const aiMessages = [
    'Noooooooooooooooo!!!',
    'My poweeeeeeeeeer!!!!',
    'Appears that you are...',
    'You w...',
    '...',
    '[DISCONNECTING]',
];


const gameTries = 3;

var currentAsk = null;
var currentTrie = null;

var tries = null;
var ask = null;
var res = null;
var btnRes = null;
var btnReset = null;

// Main
window.onload = function () {
    getElements();
    loadGame();
    listenEvents();
    console.log('Page loaded');
}

// Functions
function getElements() {
    console.log('[getElements]');
    metersConvertMetersToFoot = document.getElementById('meters-convert-meters-to-foot');
    tries = document.getElementById('tries');
    ask = document.getElementById('ask');
    res = document.getElementById('res');
    btnRes = document.getElementById('btn-res');
    btnReset = document.getElementById('btn-reset');
}

function listenEvents() {
    console.log('[listenEvents]');
    btnRes.addEventListener('click', function () {
        console.log('[listenEvents]', '{click}', 'btnRes');
        userRespond(res.value);
    });
    btnReset.addEventListener('click', function () {
        console.log('[listenEvents]', '{click}', 'btnReset');
        reset();
    });
}

function reset() {
    console.log('[reset]');
    window.location.assign('');
}

function userRespond(res) {
    console.log('[userRespond]', res);
    if (currentAsk < gameAsks.length) {
        if (gameResponses[currentAsk] == res) {
            alert(gameMessages[currentAsk]);
            setAsk(currentAsk + 1);
        } else {
            setTrie(currentTrie + 1);
        }
        if (currentTrie > gameTries) {
            gameOver(false);
        }
    } else {
        gameOver(true)
    }
}

function setAsk(index) {
    console.log('[setAsk]');
    currentAsk = index;
    ask.innerHTML = gameAsks[index];
}

function setTrie(trie) {
    console.log('[setTrie]');
    currentTrie = trie
    tries.innerHTML = trie;
}

function loadGame() {
    console.log('[loadGame]');
    setAsk(0);
    setTrie(1);
}

function gameOver(status) {
    console.log('[gameOver]', status);
    if (status) {
        aiMessages.forEach(m => {
            alert(m)
        });
    } else {
        alert('You lost');
    }
    alert('[GAME OVER]');
    reset();
}