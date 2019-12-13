<%-- 
    Document   : elementosJSP
    Created on : Dec 13, 2019, 9:43:32 AM
    Author     : xtecuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            class HelloWorld {

                private String nombres;
                private String apellidos;

                public String getNombreCompleto() {
                    return nombres + " " + apellidos;
                }

                public void setNombres(String nombres) {
                    this.nombres = nombres;
                }

                public void setApellidos(String apellidos) {
                    this.apellidos = apellidos;
                }
            }

            HelloWorld hw = new HelloWorld();
            hw.setApellidos("Rivera Pineda");
            hw.setNombres("Julian");
        %>
        
        <h1>Hello: <%=hw.getNombreCompleto()%></h1>
        

        
    </body>
</html>
