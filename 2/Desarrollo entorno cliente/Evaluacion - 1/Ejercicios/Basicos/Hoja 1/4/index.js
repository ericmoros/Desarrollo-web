var user = new Object();
var examPassedElement = null;
var userNameElement = null;
var userScoreElement = null;

window.onload = function () {
    getElements();
    askUser();
    paintElements();
    displayMessage();
    console.log("Página lista!");
};

function getElements() {
    console.log("[getElements]");
    examPassedElement = document.getElementById("exam-passed");
    userNameElement = document.getElementById("user-name");
    userScoreElement = document.getElementById("user-score");
    console.info(examPassedElement);
    console.info(userNameElement);
    console.info(userScoreElement);
}

function askUser() {
    console.log(`[askUser]`);
    user.name = prompt("Nombre");

    user.score = NaN;
    while (isNaN(user.score)) {
        user.score = prompt("Nota");
        user.score = parseInt(user.score);
    }
    console.log(user);
}

function checkScore(score) {
    var check = false;
    if (score > 4) check = true;
    return check;
}

function displayMessage() {
    if (checkScore(user.score)) {
        console.log(`[displayMessage]`);
        examPassedElement.style.display = "inline";
    }
}

function paintElements() {
    console.log(`[paintElements]`);
    userNameElement.innerHTML = user.name;
    userScoreElement.innerHTML = user.score;
    console.log(user.name);
    console.log(user.score);
}