<%-- 
    Document   : index
    Created on : Nov 30, 2019, 2:14:30 PM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesar Saludo de usuario</title>
    </head>
    <body>
        <h1>Usuario a Saluda</h1>
        
        
        <form name="formulario1" action="procesar.jsp" method="POST">
            
            Nombres: <input type="text" name="nombres" value="" size="50" /><br/>
            Apellidos: <input type="text" name="apellidos" value="" size="50" /><br/>
            
            <input type="submit" value="Procesar" name="procesar" />
            
        </form>
        
    </body>
</html>
