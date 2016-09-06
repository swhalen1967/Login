<%@page trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${username == null}">
    <c:redirect url="index.jsp"/>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Treasure! Candy!</title>
    </head>
    <body>
        <h1>Congratulations! You've won ${candyVan.treasure}!</h1>
        <a href="content.jsp">Thanks, Mister!</a>
        <br/><br/>
        <a href="logout.jsp">I'm done. Take me home.</a>
    </body>
</html>
