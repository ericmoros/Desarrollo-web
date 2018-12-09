window.onload = function () {
    num.innerHTML = prompt('Introduzca un número.');
    cNum.innerHTML = num.innerHTML;
    cRes.innerHTML = isPar(num.innerHTML) ? 'Par' : 'Impar';
    console.log('[pageReady]');
};

function isPar(num) {
    let isPar = false;
    if (num % 2 == 0)
        isPar = true;
    return isPar;
}
