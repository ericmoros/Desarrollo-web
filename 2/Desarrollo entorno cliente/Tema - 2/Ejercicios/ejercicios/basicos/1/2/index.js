var usuario = new Object();
var usuarioNombreElement = null;
var usuarioEdadElement = null;

window.onload = function () {
    getElements();
    pedirUsuario(usuario);
    paintElements(usuario);
    console.log("Página lista!");
};

function getElements() {
    console.log("[Getting elements]");
    usuarioNombreElement = document.getElementById("usuario-nombre");
    usuarioEdadElement = document.getElementById("usuario-edad");
    console.info(usuarioNombreElement);
    console.info(usuarioEdadElement);
}

function pedirUsuario(usuario) {
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
    usuarioNombreElement.innerText = usuario.nombre;
    usuarioEdadElement.innerText = usuario.edad;

    console.log(`[pintaUsuario]`);
    console.log(usuario);
}