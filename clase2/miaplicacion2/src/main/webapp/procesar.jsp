<%-- 
    Document   : procesar
    Created on : Nov 30, 2019, 2:19:15 PM
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
        
        
   
        
        <h1>Hola <%=request.getParameter("nombres")%> <%=request.getParameter("apellidos")%> </h1>
    </body>
</html>
