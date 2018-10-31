var user = new Object();
var userNameElement = null;
var userAgeElement = null;

window.onload = function () {
    getElements();
    askUser(user);
    paintElements(user);
    console.log("Página lista!");
};

function getElements() {
    console.log("[Getting elements]");
    userNameElement = document.getElementById("usuario-nombre");
    userAgeElement = document.getElementById("usuario-edad");
    console.info(userNameElement);
    console.info(userAgeElement);
}

function askUser(usuario) {
    usuario.nombre = prompt("Nombre");
    
    usuario.edad = NaN;
    while (isNaN(usuario.edad)) {
        usuario.edad = prompt("Edad");
        usuario.edad = parseInt(usuario.edad);
    }

    console.log(`[pedirUsuario]`);
    console.log(usuario);
}

function paintElements(usuario) {
    userNameElement.innerText = usuario.nombre;
    userAgeElement.innerText = usuario.edad;

    console.log(`[pintaUsuario]`);
    console.log(usuario);
}