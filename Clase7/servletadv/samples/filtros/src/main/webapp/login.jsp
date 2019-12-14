<%-- 
    Document   : login
    Created on : Dec 14, 2019, 12:25:43 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login.jsp" method="POST">

            User: <input type="text" name="user" value="" />
            Password:<input type="password" name="pass" value="" />

            <input type="submit" value="Login" />
        </form>

        <c:if test="${not empty param.user and not empty param.pass}">

            <c:set var="token" scope="session" value="${param.user}$%$^%^%&^&^&^&"/>
            <%

                response.sendRedirect(request.getContextPath() + "/admin/privada.jsp");

            %>

        </c:if>


    </body>
</html>
