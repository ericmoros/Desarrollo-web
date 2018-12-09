window.onload = function () {
    num.innerHTML = prompt('Introduzca el número del que desea sacar el factorial.');
    cNum.innerHTML = num.innerHTML;
    cRes.innerHTML = factorial(num.innerHTML);
    console.log('[pageReady]');
};

function factorial(num) {
    let rNum = 1;
    let nLoops = parseInt(num) + 1;
    for (let i = 1; i < nLoops; i++)
        rNum *= i;
    return rNum;
}
