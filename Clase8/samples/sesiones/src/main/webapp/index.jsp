<%-- 
    Document   : newjsp
    Created on : Dec 20, 2019, 10:46:39 AM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejando la Sesion</title>
    </head>
    <body>
        <h1>Uso de Sesiones</h1>

        <a href="logout.jsp">Cerrar Sesión</a>

        <form name="sesion" action="sesion" method="POST">

            <table border="1">
                <thead>
                    <tr>
                        <th>Label</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombres:</td>
                        <td><input type="text" name="nombres" 
                                   value="${sessionScope['nombres']}" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos:</td>
                        <td><input type="text" name="apellidos" 
                                   value="${sessionScope['apellidos']}" /></td>
                    </tr>
                    <tr>
                        <td>E-Mail</td>
                        <td><input type="text" name="email" 
                                   value="${sessionScope['email']}" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Enviar a Sesion" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                </tbody>
            </table>


        </form>

    </body>
</html>
