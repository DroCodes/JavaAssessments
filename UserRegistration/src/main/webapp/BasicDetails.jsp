<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Basic Details</title>
</head>
<body>
<form action="BasicDetailsServlet" method="post">
<div>
<label for="firstName">First Name</label>
<input type="text" name="firstName" size="10">
</div>
<div>
<label for="lastName">Last Name</label>
<input type="text" name="lastName" size="10">
</div>
<div>
<input type="submit" value="Process User" />
</div>
</form>
</body>
</html>