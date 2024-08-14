<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teacher Dashboard</title>
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
            background-color: #555a40;
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
            background-color: #555a40;
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

    <nav class="navbar navbar-expand-lg navbar-custom fixed-top">
        <a class="navbar-brand" href="#">Teacher Portal</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Library</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Create Mocks</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container  my-5">
        <!-- Sidebar -->
        <div class="sidebar">
            <a href="#">Update Students</a>
            <a href="#">Attendance</a>
            <a href="#">Subject</a>
            <a href="#">Assignment</a>
            <a href="#">Feedback Score</a>
        </div>

        <!-- Content -->
        
        <div class="content">
            <h2 class="mb-4">Welcome to your Dashboard</h2>
            <div class="img-placeholder">
                <p>Image Placeholder - Profile or Dashboard Overview</p>
            </div>
            <div class="img-placeholder">
                <p>Image Placeholder - Recent Assignments or Attendance</p>
            </div>
            <div class="img-placeholder">
                <p>Image Placeholder - Upcoming Classes or Feedback</p>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
