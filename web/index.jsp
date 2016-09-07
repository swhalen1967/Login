<%@page trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${username != null}">
    <c:redirect url="index.jsp"/>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="styles/main.css"/>
    </head>
    <body>
        <h1>Log in for excellent treasures.</h1>
        <h2 class="flash">${flash}</h2>
        <form method="POST" action="engage.jsp">
            Username: <input type="text" name="user" required/><br/>
            Password: <input type="password" name="pass" required/><br/>
            <input type="submit" value="Let me in"/>
        </form>
        <a href="register.jsp">Register for awesome treasure!</a>
    </body>
</html>
