<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Team</title>
</head>
<body>
	<form action="editTeamServlet" method="post">
		Team: <input type="text" name="name" value="${teamToEdit.teamName}">
		<input type="hidden" name="id" value="${teamToEdit.id}"> <input
			type="submit" value="Save Edited Item">
	</form>
</body>
</html>