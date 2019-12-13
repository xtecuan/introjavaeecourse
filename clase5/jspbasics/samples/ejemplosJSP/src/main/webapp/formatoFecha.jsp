<%-- 
    Document   : formatoFecha
    Created on : Dec 13, 2019, 11:22:47 AM
    Author     : xtecuan
--%>

<%@page import="beans.Fechas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% Fechas f = new Fechas();
            f.setDate(new java.util.Date());
        %>
        
       <h1><%=f.getFormattedDate()%></h1>
    </body>
</html>
