<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
	
	<head>
	
		<title>Note saved successfully!</title>
	
	</head>

	<body>
	
		Your note was saved successfully! <br>
		<a href="${contextPath}/home/displayNotes">Go to notes overview</a>
	
	</body>


</html>