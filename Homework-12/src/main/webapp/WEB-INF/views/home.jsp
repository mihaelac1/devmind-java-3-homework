<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Welcome in Spring MVC world!</h1>

<P>Time on server: ${serverTime}.</p>
<h2>Add user information: </h2>
<form action="user" method="post">
    <label>User name:</label>
    <input type="text" name="userName">
    <br> <br>
    <label>Email:</label>

    <input type="text" name="email"/>
    <br/> <br>
    <label>Telefon:</label>

    <input type="text" name="phoneNumber"/>
    <br/> <br>
    <label>Data nasterii:</label>

    <input type="date" name="birthDate"/>
    <br/> <br>
    <input
            type="submit" value="Login"/>
</form>


</body>
</html>