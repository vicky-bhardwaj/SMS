/**
 * 
 */
$(document).ready(function() {

    // Handle the Edit button click
    $('.table .editButton').on('click', function(event) {
        event.preventDefault();
        var href = $(this).data('href');

        console.log('Edit button clicked. Fetching data from: ' + href);

        $.get(href, function(teacher, status) {
            console.log('Received teacher data: ', teacher);

            $('#edit-teacherId').val(teacher.teacherId);
            $('#edit-fName').val(teacher.fName);
            $('#edit-lName').val(teacher.lName);
            $('#edit-email').val(teacher.email);

            $('#editModal').modal('show');
        }).fail(function() {
            console.log('Failed to fetch teacher data.');
        });
    });

    // Handle the Delete button click
    $('.table .deleteButton').on('click', function(event) {
        event.preventDefault();
        var href = $(this).data('href');

        console.log('Delete button clicked. Setting delete reference to: ' + href);

        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal('show');
    });
});
