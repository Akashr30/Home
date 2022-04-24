<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Hello Student</title>
</head>
<body>
<h2>Student Form</h2>

<%-- 	<form :form action="saveForm" modelAttribute="student">
		First name : <form:input path="firstName"/>
		<br><br>
		Last Name : <form:input path="lastName"/>
		<br><br>
		<input type = "submit" value = "Submit"/>
	</form:form> --%>
	
	<form:form action="saveForm" modelAttribute="student">	
		First name : <form:input path="firstName"/>
		<br><br>
		Last Name : <form:input path="lastName"/>
		<br><br>
		
		Country : 
		<form:select path="country">
			<%-- <form:option value="England"/>
			<form:option value="France"/>
			<form:option value="Germany"/>
			<form:option value="India"/> --%>
			<form:options items = "${student.countryOptions}"/>	<%--  items attribute refers to the collections of data--%>
		
		</form:select>
		
		<input type = "submit" value = "Submit"/>
	</form:form>
	
</body>
</html>