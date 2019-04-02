
function dumpData() {
    function getElementsWithAttribute(element, attribute) {
        var matchingElements = [];
        var allElements = element.getElementsByTagName('*');
        for (var i = 0, n = allElements.length; i < n; i++) {
            if (allElements[i].getAttribute(attribute) !== null) {
                // Element exists with attribute. Add to array.
                matchingElements.push(allElements[i]);
            }
        }
        return matchingElements;
    }

    var templates = {
        all: [],
        get: function (name) {
            return templates.all.filter(t => t.name == name)[0]
        },
        scan: function () {
            getElementsWithAttribute(document, 'obj-template').forEach(elementTemplate => {
                var parent = elementTemplate.parentElement
                var element = elementTemplate.parentNode.removeChild(elementTemplate)
                var name = element.getAttribute('obj-template')
                element.removeAttribute('obj-template')
                var template = { name: name, element: element, parent: parent }
                this.all.push(template)
            });
        }
    }

    function createObj(templateElement, objData) {
        var objElement = templateElement.cloneNode(true)
        var dataKeys = Object.getOwnPropertyNames(objData)
        for (var i = 0; i < dataKeys.length; i++) {
            var key = objData[dataKeys[i]];
            
            dataKeys.push(key)
        }

        dataKeys.forEach(key => {
            var objKey = 'obj-' + key
            var objVal = objData[key]
            var elementsWithKey = getElementsWithAttribute(objElement, objKey)
            for (var i = 0; i < elementsWithKey.length; i++) {
                var elementWithKey = elementsWithKey[i];
                if (Array.isArray(objVal)) {
                    for (var i = 0; i < objVal.length; i++) {
                        var iObjVal = objVal[i];
                        elementWithKey.innerHTML = iObjVal
                    }
                } else {
                    elementWithKey.innerHTML = objVal
                }
            }
        });
        return objElement
    }

    function appendData(funcPromise, templateName) {
        funcPromise.then(function (objectsData) {
            if (Array.isArray(objectsData)) {
                for (var i = 0; i < objectsData.length; i++) {
                    var objData = objectsData[i]
                    var template = templates.get(templateName)
                    var obj = createObj(template.element, objData)
                    template.parent.append(obj)
                }
            } else {
                    var objData = objectsData
                    var template = templates.get(templateName)
                    var obj = createObj(template.element, objData)
                    template.parent.append(obj)
            }
        })
    }

    function getUsers() {
        var promise = $.ajax({
            url: 'http://localhost/users',
            type: 'GET',
            dataType: 'json',
        })
        return promise
    }

    function getFootball() {
        var promise = $.ajax({
            headers: { 'X-Auth-Token': '73ff6f9399dd45a183c024aa583fdf70' },
            url: "http://api.football-data.org/v2/matches?dateFrom=2018-11-01&dateTo=2018-11-10&competitions=2001",
            type: 'GET',
            dataType: 'json',
        })
        return promise
    }

    var dumps = [
        { funcPromise: getUsers(), template: 'users' },
        { funcPromise: getFootball(), template: 'football' }
    ]

    templates.scan()
    console.log(templates.all)
    dumps.forEach(dump => {
        appendData(dump.funcPromise, dump.template)
    });
}
function main() {
    dumpData()
}

main()
