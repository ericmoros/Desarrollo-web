var game = {
    status: false,
    images: {
        dir: 'resources/img/',
        label: 'you-',
        extension: '.gif',
        size: 8
    },
    dic: [],
    word: ''
};

var user = {
    fails: 0,
    cursor: {
        char: '|',
        elementPos: null
    },
    score: 0
};


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
    document.addEventListener('keypress', (event) => {
        const keyName = event.key;
        console.log('document {keypress}', keyName);

    });
}

function readTextFile(file) {
    let text = null;
    let rawFile = new XMLHttpRequest();
    rawFile.open("GET", file, false);
    rawFile.onreadystatechange = function () {
        if (rawFile.readyState === 4 && rawFile.status === 200 || rawFile.status == 0)
            text = rawFile.responseText;
    }
    rawFile.send(null);
    return text;
}

function loadDic(path) {
    let dic = [];
    let text = readTextFile(path);
    if (!text) {
        alert('IF YOU DIDN\'T PLAYED THIS GAME OVER A SERVER THE DICTIONARY WILL NOT LOAD AND WILL USE AN INTERNALS ONE')
        text = 'javascript hola sol colleja pechuga pollo lechuga';
    }
    text.split('\n').forEach(word => {
        dic.push(word);
    });
    return dic;
}

function startGame() {
    game.dic = loadDic('resources/data/spanish.dic');

}

function fail() {
    console.log('[fail]');
    let rFail = true;
    if (user.fails < game.images.size) {
        user.fails++;
        let youPath = `${game.imgs.dir}${game.imgs.label}${user.fails}${game.imgs.extension}`;
        you.src = youPath;
    } else {
        rFail = false;
    }
    return rFail;
}

function setCursor(e) {
    console.log('[setCursor:DEVELOPMENT]', e);
    // youCursor = true;
    // Concurrent.Thread.create(function() {
    //     while (youCursor) {
    //         setTimeout(function () {
    e.innerHTML = game.cursor;
    // }, 500);
    //     }
    // })
}

function gameOver(status) {
    console.log('[gameOver]', status);
    let youGame = status ? 'win' : 'lose';
    alert(`[GAME OVER] You ${youGame}`);
}
