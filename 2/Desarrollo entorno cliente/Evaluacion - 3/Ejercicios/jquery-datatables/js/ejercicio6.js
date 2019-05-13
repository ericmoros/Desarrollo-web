$(document).ready(function () {
    $('#example').dataTable({
        language: {
            decimal: '',
            emptyTable: 'No hay datos disponibles en la tabla',
            info: 'Mostrando _START_ a _END_ de _TOTAL_ entradas',
            infoEmpty: 'Mostrando del 0 al 0 de 0 entradas',
            infoFiltered: '(filtrado de _MAX_ entradas totales)',
            infoPostFix: '',
            thousands: ',',
            lengthMenu: 'Mostrar entradas _MENU_',
            loadingRecords: 'Cargando...',
            processing: 'Tratamiento...',
            search: 'Buscar:',
            zeroRecords: 'No se encontraron registros coincidentes',
            paginate: {
                first: 'Primero',
                last: 'Último',
                next: 'Siguiente',
                previous: 'Anterior'
            },
            aria: {
                sortAscending: ': activar para ordenar la columna ascendente',
                sortDescending: ': activar para ordenar la columna descendente'
            }
        }
    });
});