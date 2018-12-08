var numbersElement = null;
const numbers = [];
numbers.length = 50;

window.onload = function () {
    getElements();
    generateNumbers();
    paintElements();
    console.log("Página lista!");
};

function getElements() {
    console.log("[getElements]");
    numbersElement = document.getElementById("numbers");
    console.info(numbersElement);
}

function pum(num) {
    var rNum = num;
    var lastRNum = rNum.toString().split('').pop();
    if (lastRNum == 7 || rNum % 7 == 0) {
        rNum = "PUM";
    }
    return rNum;
}

function generateNumbers() {
    var number = 0;
    for (let i = 0; i < numbers.length; i++) {
        number++
        numbers[i] = pum(number);
    }
}

function paintElements() {  
    console.log(`[paintElements]`);
    numbersElement.innerHTML = numbers;
    console.log(numbersElement);
}
