<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Basic User Results</h3>
<p>${userBasicDetails.printBasicDetails()}</p>

<div><a href="index.jsp">Home</a></div>
<div><a href="AdditionalInfo.jsp">Add Additional Info</a></div>
</body>
</html>