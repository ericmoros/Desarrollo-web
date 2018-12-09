window.onload = function () {
    while (str.innerHTML == "") {
        str.innerHTML = prompt('Introduzca una cadena texto');
    }
    cStr.innerHTML = str.innerHTML;
    cTotalUppers.innerHTML = totalUppers(str.innerHTML);
    cTotalLowers.innerHTML = totalLowers(str.innerHTML);
    if (cTotalUppers.innerHTML > 0)
        cUppers.style.display = 'block';
    if (cTotalLowers.innerHTML > 0)
        cLowers.style.display = 'block';
    console.log('[pageReady]');
};

function totalUppers(str) {
    console.log('[totalUppers]', str);
    let uppers = str.match(/[a-zá-ú]/g);

    return uppers.length;
}

function totalLowers(str) {
    console.log('[totalLowers]', str);
    let lowers = str.match(/[A-ZÁ-Ú]/g);
    return lowers.length;
}