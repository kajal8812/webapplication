<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  



<html>
<head>

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title> My TODOS list</title>
</head>
	<body>
		<div class="container">
		
		<div>your todos are </div>
		<table class="table">
		<thead>
		<tr>
		<th>id</th>
		<th>Description</th>
		<th>Target Date</th>
		<th>is done?</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${todos}" var="todo">
		<tr>
		<td>${todo.id}</td>
		<td>${todo.description}</td>
		<td>${todo.target}</td>
		<td>${todo.done}</td>
		
		
		</tr>
		
		</c:forEach>
		
		</tbody>
		</table>
		
		</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>