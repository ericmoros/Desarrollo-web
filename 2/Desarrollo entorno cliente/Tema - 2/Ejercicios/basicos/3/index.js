var totalNumbers = 3;
var numbers = new Array(totalNumbers);
var numbersElement = null;
var sumElement = null;
var mulElement = null;

window.onload = function () {
    getElements();
    askNumbers();
    calculate();
    paintElements();
    console.log("Página lista!");
};

function getElements() {
    console.log("[Getting elements]");
    numbersElement = document.getElementById("numbers");
    sumElement = document.getElementById("sum");
    mulElement = document.getElementById("mul");
    console.info(sumElement);
    console.info(mulElement);
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

function calculate() {
    console.info("[Calculate sum and mul]")
    sum = 0;
    mul = 1;
    numbers.forEach(num => {
        sum += num;
        mul *= num;
    });
    console.info(`sum: ${sum}`);
    console.info(`mul: ${mul}`);
}

function paintElements() {
    console.log(`[paintElements]`);
    numbersElement.innerText = numbers;
    sumElement.innerText = sum;
    mulElement.innerText = mul;
    console.log(numbers);
    console.log(sum);
    console.log(mul);
}