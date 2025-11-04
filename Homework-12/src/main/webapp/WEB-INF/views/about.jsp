<%--
  Created by IntelliJ IDEA.
  User: danie
  Date: 11/3/2025
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is your first simple Spring MVC project to add User information</title>
</head>
<body>
<div class="container">
    <h1>About this site</h1>
    <p><strong>Description:</strong> ${description}</p>
    <p><strong>Contact:</strong> ${contact}</p>
    <h2>Click on image to register: </h2>
    <a href="${pageContext.request.contextPath}/home">
        <img src="${pageContext.request.contextPath}/images/register.jpg" alt="Clickable image"/>
    </a>
</div>

</body>
</html>
