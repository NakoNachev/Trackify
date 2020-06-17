<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>

	<head>
	
		<title> Note was added successfully</title>
	
	
	
	</head>

	
	<body>
	
		Successful addition of note!
		<a href="${contextPath}/home/displayNotes">Go to notes overview</a>
	
	</body>


</html>