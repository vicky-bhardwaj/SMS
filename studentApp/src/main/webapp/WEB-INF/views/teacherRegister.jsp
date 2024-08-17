<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SMS</title>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/book1.webp" type="image/webp">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-info text-white text-center">
                        <h4>Teacher Registration</h4>
                    </div>
                    <div class="card-body">
                        <form action="registerTeacherAction" method="post">
                            <div class="form-group">
                                <label for="name">Name</label>
                                <input type="text" class="form-control" id="name" name="name" placeholder="Enter your Name" required>
                            </div>
                            <div class="form-group">
                                <label for="email">Email ID</label>
                                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your Email ID" required>
                            </div>
                            <div class="form-group">
                                <label for="mobile">Mobile Number</label>
                                <input type="text" class="form-control" id="mobile" name="mobile" placeholder="Enter your Mobile Number" required>
                            </div>
                            <div class="form-group">
                                <label for="teacherId">Teacher ID</label>
                                <input type="text" class="form-control" id="teacherId" name="teacherId" placeholder="Enter your Teacher ID" required>
                            </div>
                            <button type="submit" class="btn btn-info btn-block">Register</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
