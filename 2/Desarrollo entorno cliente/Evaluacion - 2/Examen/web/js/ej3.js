var p = {}

$(document).ready(function () {
    load()
    listenEvents()
});

function load() {
    p.btnAdd = $('#btnAdd')
    p.data = $('#data')
    p.name = $('#name')
    p.desc = $('#description')
}

function listenEvents() {
    p.btnAdd.on('click', function () {
        addRow()
    })
}

function addRow() {
    let newRow = document.createElement('tr')
    let selectTd = document.createElement('td')
    let input = document.createElement('input')
    input.type = 'checkbox'
    selectTd.append(input)  
    let asTd = document.createElement('td')
    let p1 = document.createElement('p')
    p1.innerHTML = p.name.val()
    asTd.append(p1)
    let descTd = document.createElement('td')
    let p2 = document.createElement('p')
    p2.innerHTML = p.desc.val()
    descTd.append(p2)

    newRow.append(selectTd)
    newRow.append(asTd)
    newRow.append(descTd)
    p.data.append(newRow)
}