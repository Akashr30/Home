<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer SignUp</title>
	
	<style>
		.error {
			color : red
		}
	</style>
</head>
<body>
<h2>Hello Customer</h2>

	<form:form action = "addCustomer" modelAttribute = "Customer">
		
		First Name : <form:input path="firstName"/>
		<br><br>
		Last Name* : <form:input path= "lastName"/>
		<form:errors path="lastName" cssClass = "error"/>
		<br><br>
		Free pass : <form:input path = "freePass"/>
		<form:errors path="freePass" cssClass = "error"/>
		<br><br>
		Postal Code : <form:input path = "postalCode"/>
		<form:errors path="postalCode" cssClass = "error"/>
		<br><br>
		
		Course Code : <form:input path = "courseCode"/>
		<form:errors path="courseCode" cssClass = "error"/>
		<br><br>
		
		Bank IFSC Code(*) : <form:input path = "bankIfscCode"/>
		<form:errors path="bankIfscCode" cssClass = "error"/>
		<br><br>
		
		<input type = "submit" value = "submit"/>
	
	</form:form>


</body>
</html>