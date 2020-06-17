<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 


<html>


	<head>
		<title> Add new note</title>
	
	
	</head>

	<body>
	
		<form:form action="showAddNoteForm/addNoteConfirmation" modelAttribute="newNote">
		
			Title: <form:input path="title" /> <br>
			Content <form:textarea path="content" /> <br>
			
			<input type="submit" value="Add note"/>

		</form:form>
	
	
	</body>



</html>