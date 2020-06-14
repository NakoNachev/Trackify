<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<html>

<head>


</head>


<body>

You have chosen id : ${optionChoice.id}

	<form:form action="editNote/editConfirmation" modelAttribute="noteToEdit">
	
		ID <form:input path="id"/> <br>

		Title: <form:input path="title"/> <br>
		
		Content: <form:textarea path="content"/> <br>
		
		<input type="submit" value="Save"/>

	</form:form>


</body>


</html>