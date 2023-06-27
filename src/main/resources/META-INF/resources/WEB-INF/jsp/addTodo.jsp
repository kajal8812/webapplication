<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title> My  TODOS list</title>
</head>
	<body>
		<div class="container">
		
		<h1>your added todos are </h1>
		<form:form method="post" modelAttribute="t">
		     Description: <form:input type="text" path="description"/>
		 <form:input type="hidden" path="id"/>
		 <form:input type="hidden" path="done"/>
		     <input type ="submit" class="btn btn-success">
		</form:form>
		</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>