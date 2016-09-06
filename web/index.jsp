<%@page trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style type="text/css">
            .flash {color:red;}
        </style>
    </head>
    <body>
        <h1>Log in for excellent treasures.</h1>
        <h2 class="flash">${flash}</h2>
        <form method="POST" action="engage.jsp">
            Username: <input type="text" name="user" required/><br/>
            Password: <input type="password" name="pass" required/><br/>
            <input type="submit" value="Let me in"/>
        </form>
    </body>
</html>
