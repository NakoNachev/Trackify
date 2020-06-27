<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Deletion successful</title>
	</head>


	<body>
	
		Note was deleted successfully.<br>
		
		<a href="${contextPath}/home/displayNotes">Go to notes overview</a>

	</body>
</html>