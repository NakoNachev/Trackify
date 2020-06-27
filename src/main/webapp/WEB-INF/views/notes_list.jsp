<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current goals</title>

<link type="text/css"
	  rel = "stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>
<body>

	<h1>You current goals are:</h1>
	<div id="notesTable">
	<table>
		
			<tr>
			
				<th> Note id </th>
				<th> Note title </th>
				<th> Note content </th>
				<th> Note creation date </th>
				<th> Note active </th>

				</tr>
				
				
				
				<c:forEach items="${notesList}" var="tempNote">
					
				<tr>
					<td> ${tempNote.id } </td>
					<td> ${tempNote.title } </td>
					<td> ${tempNote.content } </td>
					<td> ${tempNote.creationDate } </td>
					<td> ${tempNote.active} <td> <br>
					
				</td>	
				</c:forEach>
				


		
		</table> <br>
	
	</div>
	
	<c:url var="editNote" value="/home/editNote">
		 <c:param name="chosenOption" value="${id}"/>  
		</c:url>  
	
	
<!--  
	<form action = "editNote">
		<label> Select note id</label>
		
		<select>
		<c:forEach var="id" begin="1" end="${notesListSize}">
		
		
		
		<option value = "${id}"> ${id}</option>

		</c:forEach>

		</select>
		<input type="submit" value="Submit">
	
	</form>

-->

	<form:form action="editNote" modelAttribute ="optionChoice">
	
		<form:select path = "id">
		
			<c:forEach var="id" begin="1" end="${notesListSize}">
			<form:option value = "${id}"> ${notesList.get(id-1).getId()}</form:option>
			</c:forEach>
		
		</form:select>
		
		<input type="submit" value="Edit">
	
	</form:form> <br>
	
	
	<form:form action="showAddNoteForm">
	
		Add new note? <input type="submit" value="Add"/>
		
	
	</form:form> <br>
	
	
	
	<form:form action="deleteNote" modelAttribute="optionChoice">
	
		Delete note: 
		
		<form:select path = "id">
		
			<c:forEach var="id" begin="1" end="${notesListSize}">
			<form:option value = "${notesList.get(id-1)}"> ${notesList.get(id-1).getId()}</form:option>
			</c:forEach>
		
		</form:select>
		
		<input type="submit"
							onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false" value="Delete"/>
	
	</form:form>
	
	
	
	<a href="../"> Go back to home page</a>

</body>
</html>