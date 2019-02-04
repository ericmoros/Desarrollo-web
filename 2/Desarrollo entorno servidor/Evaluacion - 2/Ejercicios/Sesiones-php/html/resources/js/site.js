function loadIndex() {
    lang.innerHTML = server.session.lang;
    visibility.innerHTML = server.session.visibility;
    timeZone.innerHTML = server.session.timeZone;
    console.log('loadIndex done');
}

function loadConf() {
    // lang.innerHTML = server.session.lang;
    // visibility.innerHTML = server.session.visibility;
    // timeZone.innerHTML = server.session.timeZone;
    for (let i = 0; i < server.av.langs.length; i++) {
        const lang = server.av.langs[i];
        let option = document.createElement('option');
        option.value = i;
        option.innerHTML = option;
        avLang.appendChild(option);
    }
    console.log('loadConf done');    
}

function load() {
    function getPage() {
        let url = window.location.href;
        let urlReverse = url.split('').reverse().join('');
        let slashPos = urlReverse.indexOf('/');
        let pageReverse = urlReverse.substring(0, slashPos);
        let page = pageReverse.split('').reverse().join('');
        return page;
    }
    let page = getPage();
    switch (page) {
        case '':
        case 'index.php':
            loadIndex();
            break;
        case 'conf.php':
            loadConf();
            break;
        default:
            loadIndex();
            break;
    }
    console.log('load done');
}

function main() {
    load();
}

main();