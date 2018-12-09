const components = [
    true, //0
    5, //1
    false, //2
    "hola", //3
    "adios", //4
    2  //5
];
const inline = 'inline';
const none = 'none';

window.onload = function () {
    check1.getElementsByClassName(components[4] > components[3] ? 'bigger': 'lesser')[0].style.display = inline;
    c2result.innerHTML = components[0] || components[2] ? 'true' : 'false';
    c3result.innerHTML = components[0] && components[2] ? 'true' : 'false';
    c4sum.innerHTML = components[1] + components[5];
    c4sub.innerHTML = components[1] - components[5];
    c4mul.innerHTML = components[1] * components[5];
    c4div.innerHTML = components[1] / components[5];
    c4mod.innerHTML = components[1] % components[5];
    console.log("[pageReady]");
};

