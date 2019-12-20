<%-- 
    Document   : newjspdos
    Created on : Dec 13, 2019, 4:27:32 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DOS</title>
    </head>
    <body>


        <c:if test="${not empty param.color}">
            <h1 style="color: ${param.color}">DOS</h1>
        </c:if>
        <c:if test="${empty param.color}">
            <h1 style="color: red">DOS</h1>
        </c:if>    


    </body>
</html>
