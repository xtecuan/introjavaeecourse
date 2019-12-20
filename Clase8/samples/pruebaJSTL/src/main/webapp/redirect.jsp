<%-- 
    Document   : redirect
    Created on : Dec 20, 2019, 12:19:06 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Redirect</title>
    </head>
    <body>
        <h1>Redirect</h1>
        <%
            String url = request.getServletContext().getContextPath()+"index.jsp";
            String urlListeners = "/listeners/index.jsp";
        %>
        <c:redirect url="${url}"/>
    </body>
</html>
