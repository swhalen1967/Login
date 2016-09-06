<%@page trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${username == null}">
    <c:redirect url="index.jsp"/>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome, ${username}!</h1>
        <h2>Would you like some candy? Step into my van!</h2>
        <a href="treasure.jsp">Gimme gimme!</a>
        <br/><br/>
        <a href="logout.jsp">I'm done, Mr. Clown!</a>
    </body>
</html>
