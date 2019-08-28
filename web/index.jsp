<%-- 
    Document   : index
    Created on : 21-ago-2019, 18:30:24
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Usuario:<input type="text" name="txtusuario">
            Password: <input type="password" name="txtclave">
            <br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
