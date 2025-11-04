<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invalid User</title>

</head>
<body>
<h1>The User is not valid. Please enter valid information.</h1>

<div>
    <c:forEach var="error" items="${errorList}">
        <p>${error}</p>
    </c:forEach>
</div>

</body>
</html>
