window.onload = function () {
    c1res.innerHTML = num1.innerHTML > num2.innerHTML ? 'Mayor' : 'Menor';
    c2res.innerHTML = 0 > num2.innerHTML ? 'Negativo' : 'Positivo';
    if (num1.innerHTML == 0)
    c3res.innerHTML = 0;
    else if (0 > num1.innerHTML)
    c3res.innerHTML = 'Negativo';
    else
    c3res.innerHTML = 'Diferente de 0 y negativo';
    num1.innerHTML++;
    c3res.innerHTML = 0 > num1.innerHTML ? 'Negativo' : 'Positivo';
    if (num1.innerHTML > num2.innerHTML)
    c4res.innerHTML = 'Mayor';
    if (num1.innerHTML == num2.innerHTML)
    c4res.innerHTML = 'Igual';
    else
    c4res.innerHTML = 'Diferente';
    console.log('[pageReady]');
};

