<%-- 
    Document   : jstlcore
    Created on : Dec 13, 2019, 9:11:37 AM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista no ordenada de HTML</title>
    </head>
    <body>
        <c:set var="numeroiteraciones" value="100" scope="page"/>
        <h1>Mostrar <c:out value="${numeroiteraciones}"/> elementos de una lista</h1>

        <ul>
            <c:forEach var="i" begin="1" end="${numeroiteraciones}" step="1">
                <li><c:out value="ITEM-${i}"/></li>
            </c:forEach>
        </ul>
    </body>
</html>
