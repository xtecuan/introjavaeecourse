<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : Dec 14, 2019, 9:45:44 AM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Index</title>
    </head>
    <body>
        <h1>Pagina Index</h1>

        <%

            String[] paginas = {"uno.jsp", "dos.jsp", "tres.jsp"};

            String[] paramsNames = {"variable1", "variable2"};
            String[] paramsValues = {"Hola", "Mundo"};

        %>

        <ul>
            
            <c:forEach var="i" begin="0" end="${paginas.length}" step="1">
                
                <li>
                    <a href="${paginas[i]}">${paginas[i]}</a>
                </li>
                
            </c:forEach>
           
        </ul>

    </body>
</html>
