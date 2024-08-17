<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>


	<div class ="container">
		<div class = "row">
			<h1>  Teachers List </h1>
		</div>
		
		<div class = "row">
			<div class = "col-lg-3">
				<a th:href = "@{/teachers/new}" class = "btn btn-primary btn-sm mb-3"> Add Teacher</a>
			</div>
		</div>
		<table class = "table table-striped table-bordered">
			<thead class = "table-dark">
				<tr>
					<th> Teacher First Name</th>
					<th> Teacher Last Name</th>
					<th> Teacher Email </th>
					<th> Actions </th>
				</tr>
			</thead>
			
			<tbody>
				<tr th:each = "Teacher: ${Teachers}">
					<td th:text = "${Teacher.firstName}"></td>
					<td th:text = "${Teacher.lastName}"></td>
					<td th:text = "${Teacher.email}"></td>
					<td>
						<a th:href = "@{/sTeachers/edit/{id}(id=${Teacher.id})}"
						 class = "btn btn-primary">Update</a>
						
						<a th:href = "@{/Teachers/{id}(id=${Teacher.id})}"
						 class = "btn btn-danger">Delete</a>
						 
					</td>
				</tr>
			</tbody>
		
		</table>
		
	</div>
</body>
</html>