// Global vars
var elements = [];

// Main
window.onload = function () {
    loadElements();
    loadSite();
    console.log('loadComplete!');
}


// Functions
function loadElements() {
    console.log('[loadElements]');
    var AllElements = document.getElementsByTagName('*');
    for (let i = 0; i < AllElements.length; i++) {
        const e = AllElements[i];
        if (e.id)
            elements.push(new Element(e.id, e, e.innerHTML));
    }
    console.log(elements);
}

function es(id) {
    console.log('[findElement]', id);
    return elements.filter(e => e.id == id);
}

function e(id) {
    console.log('[findElement]', id);
    let foundElements = null
    let element = null;
    foundElements = elements.filter(e => e.id == id);
    if (foundElements) {
        if (foundElements.length > 1) 
            console.warn(`Found more than 1 ${id}, just first returned`);
        element = foundElements[0];
    }
    return element;
}

class Element {
    constructor(id, element, value) {
        this.id = id;
        this.element = element;
        this.value = value;
    }

    set value(value) {
        this.element.innerHTML = value;
        this._value = value;
    }

    get value() {
        this.value = this.element.innerHTML;
        return this._value;
    }
}
