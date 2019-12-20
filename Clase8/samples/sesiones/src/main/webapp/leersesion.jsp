<%-- 
    Document   : leersesion
    Created on : Dec 20, 2019, 10:57:40 AM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información en la Sesión</title>
    </head>
    <body>
        <h1>Su Información es:</h1>
        
        <ul>
            <li>Nombres: ${sessionScope['nombres']}</li>
            <li>Apellidos: ${sessionScope['apellidos']}</li>
            <li>Email: ${sessionScope['email']}</li>
        </ul>
        
        <a href="index.jsp">
            Ir a Inicio
        </a>
        
    </body>
</html>
