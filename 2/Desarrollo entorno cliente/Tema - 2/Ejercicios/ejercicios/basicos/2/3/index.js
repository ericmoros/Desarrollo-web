var pyramidElement = null;
const pyramid = [];
pyramid.length = 50;

window.onload = function () {
    getElements();
    generatePyramid();
    paintElements();
    console.log("Página lista!");
};

function getElements() {
    console.log("[getElements]");
    pyramidElement = document.getElementById("pyramid");
    console.info(pyramidElement);
}

function generatePyramid() {
    var line;
    var number;
    for (let i = 0; i < pyramid.length; i++) {
        pyramid[i] = [];
        line = pyramid[i];
        line.length = i + 1;
        number = 0;
        for (let j = 0; j < line.length; j++) {
            number++;
            line[j] = number;
        }
    }
}

function paintElements() {  
    console.log(`[paintElements]`);
    pyramid.forEach(line => {
        lineElement = document.createElement("p");
        lineElement.innerText = line;
        pyramidElement.appendChild(lineElement);
    });
    console.log(pyramidElement);
}
