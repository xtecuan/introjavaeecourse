<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : query
    Created on : Dec 20, 2019, 1:55:15 PM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso sql:query</title>
    </head>
    <body>
        <h1>Query Sobre tabla de empleados</h1>
        <%@include  file="datasource.jsp" %>

        <sql:query var="queryEmp" dataSource="${oracleDS}">
            SELECT * FROM EMPLOYEES
        </sql:query>


        <table border="1">
            <tr>
                <c:forEach var="columnName" items="${queryEmp.columnNames}">
                    <th>${columnName}</th>
                </c:forEach>
            </tr>
            <c:forEach var="row" items="${queryEmp.rowsByIndex}">
                <tr>
                    <c:forEach var="column" items="${row}">
                        <td><c:out value="${column}"/></td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>









    </body>
</html>
