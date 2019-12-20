<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : Dec 14, 2019, 3:46:10 PM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee List</title>
    </head>
    <body>
        <h1>Employee List</h1>
        <ul>
            <c:forEach var="emp" items="${requestScope['employees']}">
                <li>
                    ${emp.employeeId} - ${emp.firstName} ${emp.lastName}
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
