var customHistory = {
    urls: [],
    back: () => {
        window.location.href = customHistory.urls[customHistory.urls.length - 2];
        customHistory.urls.pop();
        customHistory.urls.pop();
        let dataValue = arrayToString(customHistory.urls, separator)
        let data = `urls = ${dataValue}`;
        document.cookie = data;
    }
}
const separator = ',';

function arrayToString(array, separator) {
    var str = '';
    array.forEach(element => { str += element + separator; });
    str = str.substring(0, str.length - separator.length);
    return str;
}

customHistory.urls = document.cookie.substring(document.cookie.indexOf('=') + 1).split(separator);
customHistory.urls.push(window.location.href);
let dataValue = arrayToString(customHistory.urls, separator)
let data = `urls = ${dataValue}`;
document.cookie = data;


console.log(customHistory.urls);
console.log(window.location);
