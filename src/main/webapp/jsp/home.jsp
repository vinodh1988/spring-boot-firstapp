<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="../style.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
  <h1>Spring boot is working</h1>
  <h3><u>Teams</u></h3>
  <ul>
    <c:forEach items="${team}" var="x">
        <li>${x}</li>
    </c:forEach>
  </ul>
  <div id="footer">
        Programmed by ${programmer} <br>
        &copy; ${organization} 2021.
  </div>
</body>
</html>