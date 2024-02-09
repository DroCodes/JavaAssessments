<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Additional Info</title>
</head>
<body>
<form action="AdditionalInfoServlet" method="post">
<div>
<label for="phoneNumber">Phone Number</label>
<input type="text" name="phoneNumber" size="15">
</div>
<div>
<label for="email">Email</label>
<input type="text" name="email" size="20">
</div>
<div>
<label for="address">Address</label>
<input type="text" name="address" size="20">
</div>
<div>
<label for="city">City</label>
<input type="text" name="city" size="20">
</div>
<div>
<label for="state">State</label>
<input type="text" name="state" size="2">
</div>
<div>
<input type="submit" value="Process User" />
</div>
</form>
</body>
</html>