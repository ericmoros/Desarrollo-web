$(document).ready(function () {
    $('#example').dataTable({
        order: [
            ['0', 'asc'],
        ],
        columnDefs: [
            { visible: false, targets: [0, 3] },
            { orderable: false, targets: 4 }
        ]
    });
});