var totalNumbers = 2;
var numbers = new Array(totalNumbers);
var highestNumber = null;
var numbersElement = null;
var highestNumberElement = null;

window.onload = function () {
    getElements();
    askNumbers();
    setHighest();
    paintElements();
    console.log("Página lista!");
};

function getElements() {
    console.log("[Getting elements]");
    numbersElement = document.getElementById("numbers");
    highestNumberElement = document.getElementById("highest-number");
    console.info(highestNumber);
}

function askNumbers() {
    console.log(`[askNumbers]`);
    for (let i = 0; i < numbers.length; i++) {
        var num = numbers[i];
        num = NaN;
        while (isNaN(num)) {
            num = prompt(`Número ${i + 1}`);
            num = num.replace(',', '.');
            num = parseFloat(num);
        }
        numbers[i] = num;

    }
    console.log(numbers);
}

function setHighest() {
    console.info("[setHighest]");
    highestNumber = Math.max(...numbers);
    console.log(highestNumber);
}

function paintElements() {
    console.log(`[paintElements]`);
    numbersElement.innerText = numbers;
    highestNumberElement.innerText = highestNumber;
    console.log(numbers);
    console.log(highestNumber);
}