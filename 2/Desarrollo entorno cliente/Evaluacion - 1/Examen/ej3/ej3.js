const maxTries = 10;
const increment = 10;

var currentTrie = null;
var currentValue = null
var money = null;
var btnMore = null;
var youWin = null;

// Main
window.onload = function () {
    getElements();
    loadGame();
    listenEvents();
    console.log('Page loaded');
}


function getElements() {
    console.log('[getElements]');
    money = document.getElementById('num');
    btnMore = document.getElementById('btn-more');
    youWin =  document.getElementById('you-win');
}

function listenEvents() {
    console.log('[listenEvents]');
    btnMore.addEventListener('click', function () {
        console.log('[listenEvents]', '{click}', 'btnMore');
        play(money.value);
    });
}


function setTrie(trie) {
    console.log('[setTrie]', trie);
    currentTrie = trie
}

function loadGame() {
    console.log('[loadGame]');
    setTrie(1);
    currentValue = increment;
}

function reset() {
    console.log('[reset]');
    window.location.assign('');
}

function play(money) {
    console.log('[play]', money);
    if (money > currentValue) {
        currentValue += increment;
        setTrie(currentTrie + 1);
    } else {
        gameOver(false);
    }
    if (currentTrie > maxTries) {
        gameOver(true);
    }
}

function gameOver(status) {
    console.log('[gameOver]', status);
    if (status) {
        youWin.style.display = 'inline';
    } else {
        alert('You lost')
    }
    alert('[GAME OVER]');
}