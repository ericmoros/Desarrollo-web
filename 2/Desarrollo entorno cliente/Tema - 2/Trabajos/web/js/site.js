jQuery(document).ready(function ($) {
    //edit button
    $(document).on('click', 'button.edit', function (id) {
        var id = $(this).attr("id");
        console.info("Editing " + id);
        editProduct(id);
    });
});

function editProduct(id) {
    var name = $('tr#tr-' + id + ' td.td-name').text();
    var price = $('tr#tr-' + id + ' td.td-price').text();
    var stock = $('tr#tr-' + id + ' td.td-stock').text();
    var description = $('tr#tr-' + id + ' td.td-description').text();

    $('#edit-title').text("Editing " + id);
    $('#edit-id').val(id);
    $('#edit-name').val(name);
    $('#edit-price').val(price);
    $('#edit-stock').val(stock);
    $('#edit-description').val(description);
}