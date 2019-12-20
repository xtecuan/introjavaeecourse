<%-- 
    Document   : uno
    Created on : Dec 13, 2019, 4:27:26 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina 1</title>
    </head>
    <body>

        <c:if test="${empty param.pagina}">
            <h1>Pagina 1</h1>
            <form name="f1" action="uno.jsp" method="POST">

                Ir a pagina:
                <select name="pagina">
                    <option value="dos.jsp">Pagina 2</option>
                    <option value="tres.jsp">Pagina 3</option>
                </select>
                <input type="submit" value="Ir" name="ir" />

            </form>

        </c:if>
        <c:if test="${not empty param.pagina}">

            <c:if test="${param.pagina eq 'dos.jsp'}">
                <jsp:forward page="<%=request.getParameter("pagina")%>">
                    <jsp:param name="color" value="blue"/>
                </jsp:forward>
            </c:if>

            <jsp:forward page="<%=request.getParameter("pagina")%>"/>
        </c:if>




    </body>
</html>
