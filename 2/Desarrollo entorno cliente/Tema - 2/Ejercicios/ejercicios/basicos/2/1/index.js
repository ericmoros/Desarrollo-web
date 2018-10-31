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
    console.log("[getElements]");
    userNameElement = document.getElementById("user-name");
    userAgeElement = document.getElementById("user-age");
    console.info(userNameElement);
    console.info(userAgeElement);
}

function askUser(user) {
    user.name = "";
    while ("" == user.name) {
        user.name = prompt("Nombre");
    }
    
    user.age = NaN;
    while (isNaN(user.age)) {
        user.age = prompt("Edad");
        user.age = parseInt(user.age);
    }

    console.log(`[pedirUsuario]`);
    console.log(user);
}

function paintElements(user) {
    userNameElement.innerText = user.name;
    userAgeElement.innerText = user.age;

    console.log(`[pintaUsuario]`);
    console.log(user);
}
