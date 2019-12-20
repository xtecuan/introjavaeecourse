<%-- 
    Document   : regions
    Created on : Dec 20, 2019, 2:35:05 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regions</title>
    </head>
    <body>
        <h1>Regions</h1>
        
        <br/>
        
        <c:if test="${not empty msg}">
            
            <h6 style="color: green"> Se inserto  ${msg} region </h6>
            <c:remove scope="session" var="msg"/>
            
        </c:if>   
        
        <br/>
        
        <form action="regions_insert.jsp" method="POST">
            <table border="1">

                <tbody>
                    <tr>
                        <td>Nombre Region:</td>
                        <td><input type="text" name="region_name" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Crear" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                </tbody>
            </table>
        </form>

    </body>
</html>
