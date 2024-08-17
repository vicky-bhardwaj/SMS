<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Management System</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row">
            <h1>Students List</h1>
        </div>

        <div class="row">
            <div class="col-lg-3">
                <a href="${pageContext.request.contextPath}/students/new" class="btn btn-primary btn-sm mb-3">Add Student</a>
            </div>
        </div>

        <table class="table table-striped table-bordered">
            <thead class="table-dark">
                <tr>
                    <th>Student First Name</th>
                    <th>Student Last Name</th>
                    <th>Student Email</th>
                    <th>Actions</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td><c:out value="${student.fName}" /></td>
                        <td><c:out value="${student.lName}" /></td>
                        <td><c:out value="${student.email}" /></td>
                        <td>
                            <a href="${pageContext.request.contextPath}/students/edit/${student.id}" class="btn btn-primary">Update</a>
                            <a href="${pageContext.request.contextPath}/students/${student.id}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
