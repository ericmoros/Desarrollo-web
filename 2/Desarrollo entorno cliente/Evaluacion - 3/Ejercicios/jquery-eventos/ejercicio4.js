var productTemplate
var productList
var addForm

function load() {
    productList = $("#productList")
    addForm = $("#addForm")
    var currentProductTemplate = $("#productTemplate")
    currentProductTemplate.removeAttr("id")
    productTemplate = currentProductTemplate.clone()
    currentProductTemplate.remove()
}

function listenEvents() {
    listenFormSubmit()

    function listenFormSubmit() {
        addForm.on("submit", function () {
            if (addForm[0].validate()) return false
            var name = this.product.value
            this.product.value = ""
            addProduct(name)
            return false
        })
    }
}

function addProduct(name) {
    if (name == null) return
    var product = productTemplate.clone()
    product.text(name)
    productList.append(product)
}

$(window).ready(function () {
    load()
    listenEvents()
})
