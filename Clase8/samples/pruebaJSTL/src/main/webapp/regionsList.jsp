<%-- 
    Document   : regionsList
    Created on : Dec 20, 2019, 4:59:40 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado De Regiones</title>
    </head>
    <body>
        <h1>Listado de regiones</h1>
        
        <ul>
            
            <c:forEach var="region" items="${requestScope['regions']}">
                <li>${region.regionName}</li>
            </c:forEach>
        </ul>
    </body>
</html>
