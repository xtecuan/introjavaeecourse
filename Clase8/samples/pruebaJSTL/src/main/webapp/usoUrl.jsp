<%-- 
    Document   : usoUrl
    Created on : Dec 20, 2019, 1:38:19 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Construir URL</title>
    </head>
    <body>
        <h1>Construir URL</h1>

        <c:url var="myUrl" value="pagina1.jsp">
            <c:param name="param1" value="Valor del par&aacute;metro 1"/>
            <c:param name="param2" value="Valor del par&aacute;metro 2"/>
        </c:url>

       
       

        <a href="${myUrl}">pagina1.jsp</a>

    </body>
</html>
