var usuario = new Object();
var usuarioNombreElement = null;
var usuarioEdadElement = null;

window.onload = function () {
    getElements();
    pedirUsuario(usuario);
    pintarUsuario(usuario);
    console.log("Página lista!");
};

function getElements() {
    console.log("[Getting elements]");
    usuarioNombreElement = document.getElementById("usuario-nombre");
    usuarioEdadElement = document.getElementById("usuario-edad");
    console.info(usuarioNombreElement);
    console.info(usuarioEdadElement);
}

function pedirBooleano(str) {
    var respuesta = null;
    str = str.toLowerCase();

    switch (str) {
        case "si":
            respuesta = true;
            break;
        case "no":
            respuesta = false;
            break;
    }

    console.log(`[pedirBooleano]`);
    console.log(respuesta);

    return respuesta;
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

function pintarUsuario(usuario) {
    usuarioNombreElement.innerText = usuario.nombre;
    usuarioEdadElement.innerText = usuario.edad;

    console.log(`[pintaUsuario]`);
    console.log(usuario);
}