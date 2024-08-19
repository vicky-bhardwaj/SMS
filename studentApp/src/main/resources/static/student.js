



$(document).ready(function() {

    // Handle the Edit button click
    $('.table .editButton').on('click', function(event) {
        event.preventDefault();
        var href = $(this).data('href');

        console.log('Edit button clicked. Fetching data from: ' + href);

        $.get(href, function(student, status) {
            console.log('Received student data: ', student);

            $('#edit-rollNo').val(student.rollNo);
            $('#edit-fName').val(student.fName);
            $('#edit-lName').val(student.lName);
            $('#edit-email').val(student.email);
            $('#edit-PRN').val(student.PRN);

            $('#editModal').modal('show');
        }).fail(function() {
            console.log('Failed to fetch student data.');
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
