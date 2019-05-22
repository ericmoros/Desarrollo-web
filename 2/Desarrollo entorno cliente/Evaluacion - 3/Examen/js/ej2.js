$(document).ready(function () {
    $('#example').dataTable({
        stateSave: true,
        order: [
            ['1', 'desc'],
            ['3', 'desc']
        ]
    })
    $("#tableForm").validate({
        errorClass: "invalid",
        rules: {
            textoABuscar: {
                required: true,
                minlength: 6
            },
            webAPI: {
                url: true
            },
            ciudad: {
                required: true,
                minlength: 6
            },
            desplegable: {
                required: true,
            }
        },
        messages: {
            textoABuscar: {
                required: "El campo textoABuscar es necesario.",
                minlength: jQuery.validator.format("Introduce por lo menos {0} caracteres.")
            },
            webAPI: {
                url: "Por favor introduce una dirección web valida."
            },
            ciudad: {
                required: "El campo ciudad es necesario.",
                minlength: jQuery.validator.format("Introduce por lo menos {0} caracteres.")
            },
            desplegable: {
                required: "El campo desplegable es necesario.",
            }
        }
    })
})

