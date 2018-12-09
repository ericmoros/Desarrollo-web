window.onload = function () {
    while (str.innerHTML == "") {
        str.innerHTML = prompt('Introduzca el DNI');
    }
    cRes.innerHTML = isDNI(str.innerHTML) ? 'Valido' : 'Invalido';
    console.log('[pageReady]');
};

function isDNI(dni) {
    console.log('[isDNI]', dni);
    dniUC = dni.toUpperCase();
    let chars = 'TRWAGMYFPDXBNJZSQVHLCKET';
    let dniFormat = new RegExp(`\\d{8}[${chars}]`);
    let isDNI = false;
    if (dniFormat.test(dniUC)) {
        let dniNumber = parseInt(dniUC.substring(0, 8));
        let charPos = dniNumber % 23;
        if (chars[charPos] == dniUC[dniUC.length - 1])
            isDNI = true;
    }
    return isDNI;
}