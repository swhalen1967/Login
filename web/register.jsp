<%@page trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${username != null}">
    <c:redirect url="content.jsp"/>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <title>Register for Treasures</title>
        <link rel="stylesheet" type="text/css" href="styles/main.css"/>
    </head>
    <body>
        <h1>Sign up to get unlimited treasure!</h1>
        <h2 class="flash">${flash}</h2>
        <form method="POST" action="signup.jsp">
            Pick a user name: <input type="text" name="user"/><br/>
            Pick a password: <input type="password" name="pass1"/><br/>
            Repeat the password: <input type="password" name ="pass2"/><br/>
            <input type="submit" value="Sign me up!"/>
        </form>
        <a href="index.jsp">I think I have an account already.</a>
    </body>
</html>
