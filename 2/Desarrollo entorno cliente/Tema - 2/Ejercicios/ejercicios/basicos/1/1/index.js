var usuario = new Object();

window.onload = function () {
    console.log("Ventana lista!");

    pedirUsuario(usuario);
    pintarUsuario(usuario);
};

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
    
    usuario.altura = NaN;
    while (isNaN(usuario.altura)) {
        usuario.altura = prompt("Altura");
        usuario.altura = usuario.altura.replace(',', '.');
        usuario.altura = parseFloat(usuario.altura);
    }

    usuario.casado = null;
    while (usuario.casado == null) {
        usuario.casado = prompt("¿Estás casado? Responde si o no");
        usuario.casado = pedirBooleano(usuario.casado);
    }

    console.log(`[rellenaUsuario]`);
    console.log(usuario);
}

function pintarUsuario(usuario) {
    document.getElementById("usuario-nombre").innerText = usuario.nombre;
    document.getElementById("usuario-edad").innerText = usuario.edad;
    document.getElementById("usuario-altura").innerText = usuario.altura;
    document.getElementById("usuario-casado").innerText = usuario.casado;

    console.log(`[pintaUsuario]`);
    console.log(usuario);
}