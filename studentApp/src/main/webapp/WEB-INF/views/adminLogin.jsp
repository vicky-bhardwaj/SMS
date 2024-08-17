<%@ taglib prefix="n" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background: #f7f9fc;
        }
        .login-container {
            margin-top: 10%;
            max-width: 400px;
            padding: 15px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .login-header {
            margin-bottom: 20px;
            font-size: 1.5em;
            text-align: center;
        }
        .btn-custom {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-custom:hover {
            background-color: #0056b3;
            border-color: #004085;
        }
        .error {
	color: red;
}
    </style>
</head>
<%
String message = "";
if (request.getAttribute("message") != null) {
	message = request.getAttribute("message").toString();

}

String msg="";
if (request.getAttribute("msg") != null) {
	msg = request.getAttribute("msg").toString();
}

%>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div >
                <div class="login-header">
                    Admin Login
                </div>
                <n:form method="post" action="ad" modelAttribute="admindata">
                    <div class="form-group">
                        <label for="adminId">Admin ID</label>
                        <input type="text" class="form-control" id="adminId" name="adminId" placeholder="Enter Admin ID" required >
                        <span><n:errors class="error" path="adminId" /></span>
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>
                        <span><n:errors class="error" path="password" /></span>
                    </div>
                    <button type="submit" class="btn btn-custom btn-block">Login</button>
                    
                </n:form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
