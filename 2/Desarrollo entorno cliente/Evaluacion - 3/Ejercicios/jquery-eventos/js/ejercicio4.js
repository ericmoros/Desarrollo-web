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
            var name = this.product.value
            this.product.value = ""
            var product = addProduct(name)
            if (product == null) return false
            listenProductClick(product)
            return false
        })
    }

    function listenProductClick(product) {
        product.on("click", function () {
            $(this).toggleClass("product-clicked")
        })
    }
}

function addProduct(name) {
    if (name == null || name == "") return
    var product = productTemplate.clone()
    product.text(name)
    productList.append(product)
    return product
}

$(window).ready(function () {
    load()
    listenEvents()
})
