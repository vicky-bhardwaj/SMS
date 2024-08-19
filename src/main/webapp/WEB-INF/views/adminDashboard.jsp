<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/admin-icon.webp" type="image/webp">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            display: flex;
            min-height: 100vh;
            flex-direction: column;
        }
        .wrapper {
            display: flex;
            flex: 1;
        }
        .sidebar {
            width: 250px;
            background-color: #343a40;
            color: white;
            height: 100vh;
            position: fixed;
            top: 0;
            left: 0;
            padding-top: 70px;
        }
        .sidebar a {
            color: white;
            text-decoration: none;
            display: block;
            padding: 15px;
            font-size: 18px;
        }
        .sidebar a:hover {
            background-color: #495057;
        }
        .content {
            margin-left: 250px;
            padding: 20px;
            width: 100%;
        }
        .navbar-custom {
            background-color: #343a40;
        }
        .navbar-custom .navbar-brand,
        .navbar-custom .navbar-nav .nav-link {
            color: white;
        }
        .img-placeholder {
            width: 100%;
            height: 250px;
            background-color: #e9ecef;
            display: flex;
            align-items: center;
            justify-content: center;
            margin-bottom: 20px;
            border-radius: 8px;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-white fixed-top">
        <a class="navbar-brand" href="#">Admin Portal</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Library</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout">LogOut</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="wrapper my-5">
        <!-- Sidebar -->
        <div class="sidebar">
            <a href="#" class="sidebar-link" data-target="updateStudents">Update Students</a>
			<a href="#" class="sidebar-link" data-target="updateTeachers">Update Teachers</a>
			<a href="#" class="sidebar-link" data-target="manageCourses">Manage Courses</a>
			<a href="#" class="sidebar-link" data-target="viewReports">View Reports</a>
			<a href="#" class="sidebar-link" data-target="systemSettings">System Settings</a>

        </div>

        <!-- Content -->
        <div class="content">
            <div id="main-content">
                <!-- Initial content or a welcome message -->
                <h2 class="mb-4">Welcome to the Admin Dashboard</h2>
                <div class="img-placeholder">
                    <p>Select an option from the sidebar to get started.</p>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
    $(document).ready(function() {
        $('.sidebar-link').click(function(e) {
            e.preventDefault();

            // Get the target URL
            var targetUrl = $(this).data('target');

            // Load the content into the main-content div
            $.ajax({
                url: targetUrl,
                type: 'GET',
                success: function(response) {
                    $('#main-content').html(response);
                },
                error: function(xhr, status, error) {
                    $('#main-content').html('<p>Error loading content. Please try again.</p>');
                    console.error("here is the error");
                }
            });
        });
    });

    </script>
</body>
</html>
