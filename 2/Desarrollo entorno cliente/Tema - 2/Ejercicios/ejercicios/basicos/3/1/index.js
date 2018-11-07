class Element {
    constructor(name, element, value) {
        this.name = name;
        this.element = element;
        this.value = value;
    }

    find() {
        console.log("[Element:find]");
        this.element = document.getElementById(this.name);
        console.log(this.element);
        
    }

    paint() {
        console.log("[Element:paint]");
        this.element.innerHTML = this.value;
        console.log(this.element);
    }

    overPaint() {
        console.log("[Element:overPaint]");
        this.element.innerHTML += this.value;
        console.log(this.element);
    }
}

var e = [
    new Element("check1"),
    new Element("check2"),
    new Element("check3"),
    new Element("check4")
];

window.onload = function () {
    getElements();
    paintElements();
    console.log("[pageReady]");
};

function getElements() {
    console.log("[getElements]");
    e.forEach(element => {
        element.find();
    });
}

function paintElements() {  
    console.log(`[paintElements]`);
    e.forEach(element => {
        element.overPaint();
    });
}
