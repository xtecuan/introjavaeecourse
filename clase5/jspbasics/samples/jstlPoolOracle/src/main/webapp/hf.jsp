<%-- 
    Document   : hf
    Created on : Dec 13, 2019, 4:10:08 PM
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
        <%@include  file="html/header.html" %>
        
        Texto de la Pagina Web<br/>
        
        <jsp:include page="includes/run1.jsp"/>
        <br/>
        <%@include file="html/footer.html" %>
    </body>
</html>
