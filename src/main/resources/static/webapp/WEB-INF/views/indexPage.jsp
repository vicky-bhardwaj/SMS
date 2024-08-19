<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Management System</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Custom styles */
        body {
            font-family: Arial, sans-serif;
        }
        .navbar {
            margin-bottom: 20px;
        }
        .carousel-inner img {
            width: 100%;
            height: 500px;
        }
        section {
            padding: 60px 0;
        }
        footer {
            padding: 20px;
            background: #333;
            color: #fff;
            text-align: center;
        }
    </style>
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <a class="navbar-brand" href="#">Student Management System</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item"><a class="nav-link" href="#about">About</a></li>
                <li class="nav-item"><a class="nav-link" href="#courses">Courses</a></li>
                <li class="nav-item"><a class="nav-link" href="#placement">Placement</a></li>
                <li class="nav-item"><a class="nav-link" href="#gallery">Gallery</a></li>
                <li class="nav-item"><a class="nav-link" href="#contact">Contact Us</a></li>
            </ul>
            <div class="dropdown">
                <button class="btn btn-outline-primary dropdown-toggle" type="button" id="loginDropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Login
                </button>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="loginDropdown">
                    <a class="dropdown-item" href="#">Student</a>
                    <a class="dropdown-item" href="#">Teacher</a>
                </div>
            </div>
        </div>
    </nav>

    <!-- Image Carousel -->
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="https://via.placeholder.com/1500x500" class="d-block w-100" alt="First slide">
            </div>
            <div class="carousel-item">
                <img src="https://via.placeholder.com/1500x500" class="d-block w-100" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img src="https://via.placeholder.com/1500x500" class="d-block w-100" alt="Third slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>

    <!-- About Section -->
    <section id="about">
        <div class="container">
            <h2>About Us</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Praesent libero. Sed cursus ante dapibus diam.</p>
        </div>
    </section>

    <!-- Courses Section -->
    <section id="courses">
        <div class="container">
            <h2>Our Courses</h2>
            <div class="row">
                <div class="col-md-4">
                    <h3>Course 1</h3>
                    <p>Description of Course 1.</p>
                </div>
                <div class="col-md-4">
                    <h3>Course 2</h3>
                    <p>Description of Course 2.</p>
                </div>
                <div class="col-md-4">
                    <h3>Course 3</h3>
                    <p>Description of Course 3.</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Placement Section -->
    <section id="placement">
        <div class="container">
            <h2>Placement</h2>
            <p>Information about placement opportunities and records.</p>
        </div>
    </section>

    <!-- Gallery Section -->
    <section id="gallery">
        <div class="container">
            <h2>Gallery</h2>
            <p>A collection of images showcasing our institution's activities.</p>
        </div>
    </section>

    <!-- Contact Us Section -->
    <section id="contact">
        <div class="container">
            <h2>Contact Us</h2>
            <p>If you have any questions, feel free to contact us at example@example.com or call us at (123) 456-7890.</p>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <p>&copy; 2024 Student Management System. All Rights Reserved.</p>
    </footer>

    <!-- Bootstrap JS, Popper.js, and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
