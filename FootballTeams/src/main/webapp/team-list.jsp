<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="navigationServlet">
		<table>
		<c:forEach items="${requestScope.allTeams}" var="currentTeam">
				<tr>
					<td><input type="radio" name="id" value="${currentTeam.id}"></td>
					<td>${currentTeam.city}</td>
					<td>${currentTeam.teamName}</td>
					<td>${currentTeam.numOfPlayers}</td>
					<td>${currentTeam.numOfWins}</td>
					<td>${currentTeam.numOfLosses}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="edit" name="doThisToTeam"> <input
			type="submit" value="delete" name="doThisToTeam"> <input
			type="submit" value="add" name="doThisToTeam">
	</form>
</body>
</html>