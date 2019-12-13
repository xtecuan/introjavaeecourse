<%-- 
    Document   : jspUsebean
    Created on : Dec 13, 2019, 11:29:42 AM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="fechaActual" scope="page" class="beans.ObtenerFecha" />
        <jsp:useBean id="f" scope="page" class="beans.Fechas" />
        <jsp:setProperty name="f" property="date" value="<%=fechaActual.getDate()%>" />
        <h1>Fecha Formateada: <jsp:getProperty name="f" property="formattedDate" /></h1>
        
        
        
    </body>
</html>
