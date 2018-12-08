const MeterFoot = 3.2808;
const InchCentimeters = 0.39370;

// ConvertMetersToFoot
var metersConvertMetersToFoot = null;
var btnConvertMetersToFoot = null;
var footConvertMetersToFoot = null;
// ConvertFootToMeters
var footConvertFootToMeters = null;
var btnConvertFootToMeters = null;
var metersConvertFootToMeters = null;
// ConvertInchesToCentimeters
inchesConvertInchesToCentimeters = null;
btnConvertInchesToCentimeters = null;
centimetersConvertInchesToCentimeters = null;
// ConvertCentimetersToInches
centimetersConvertCentimetersToInches = null;
btnConvertCentimetersToInches = null;
inchesConvertCentimetersToInches = null;


// Main
window.onload = function() {
    getElements();
    listenEvents();
    console.log('Page loaded');
}

// Functions
function getElements() {
    console.log('[getElements]');
    // ConvertMetersToFoot
    metersConvertMetersToFoot = document.getElementById('meters-convert-meters-to-foot');
    btnConvertMetersToFoot = document.getElementById('btn-convert-meters-to-foot');
    footConvertMetersToFoot = document.getElementById('foot-convert-meters-to-foot');
    // ConvertFootToMeters
    metersConvertFootToMeters = document.getElementById('meters-convert-foot-to-meters');
    btnConvertFootToMeters = document.getElementById('btn-convert-foot-to-meters');
    footConvertFootToMeters = document.getElementById('foot-convert-foot-to-meters');
    // ConvertInchesToCentimeters
    inchesConvertInchesToCentimeters = document.getElementById('inches-convert-inches-to-centimeters');;
    btnConvertInchesToCentimeters = document.getElementById('btn-convert-inches-to-centimeters');;
    centimetersConvertInchesToCentimeters = document.getElementById('centimeters-convert-inches-to-centimeters');;
    // ConvertCentimetersToInches
    centimetersConvertCentimetersToInches = document.getElementById('centimeters-convert-centimeters-to-inches');;
    btnConvertCentimetersToInches = document.getElementById('btn-convert-centimeters-to-inches');;
    inchesConvertCentimetersToInches = document.getElementById('inches-convert-centimeters-to-inches');;
}

function listenEvents() {
    console.log('[listenEvents]');
    btnConvertMetersToFoot.addEventListener('click', function() {
        console.log('[listenEvents]', '{click}', 'btnConvertMetersToFoot');
        footConvertMetersToFoot.value = convertMetersToFoot(metersConvertMetersToFoot.value);
    });
    btnConvertFootToMeters.addEventListener('click', function() {
        console.log('[listenEvents]', '{click}', 'btnConvertFootToMeters');
        metersConvertFootToMeters.value = convertFootMeters(footConvertFootToMeters.value);
    });
    btnConvertInchesToCentimeters.addEventListener('click', function() {
        console.log('[listenEvents]', '{click}', 'btnConvertInchesToCentimeters');
        centimetersConvertInchesToCentimeters.value = convertInchesCentimeters(inchesConvertInchesToCentimeters.value);
    });
    btnConvertCentimetersToInches.addEventListener('click', function() {
        console.log('[listenEvents]', '{click}', 'btnConvertCentimetersToInches');
        inchesConvertCentimetersToInches.value = convertCentimetersInches(centimetersConvertCentimetersToInches.value);
    });
}

// [convert]
function convertMetersToFoot(meters) {
    console.log('[convertMetersToFoot]', meters);
    let foot = meters / MeterFoot;  // La formula aplicada es 1m / 3.2808feet
    return foot;
}

function convertFootMeters(foot) {
    console.log('[convertFootMeters]', foot);
    let meters = foot * MeterFoot;   // La formula aplicada es 1feet * 3.2808m
    return meters;
}

function convertInchesCentimeters(inches) {
    console.log('[convertInchesCentimeters]', inches);
    let centimeters = inches * InchCentimeters;   // La formula aplicada es 1inch * 0.3937cm
    return centimeters;
}


function convertCentimetersInches(centimeters) {
    console.log('[convertCentimetersInches]', centimeters);
    let inches = centimeters / InchCentimeters;   // La formula aplicada es 1inch / 0.3937cm
    return inches;
}
