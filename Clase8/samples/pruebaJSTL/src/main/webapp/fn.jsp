<%-- 
    Document   : fn
    Created on : Dec 20, 2019, 3:39:03 PM
    Author     : xtecuan
--%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FN</title>
    </head>
    <body>
        <h1>FN</h1>

        <c:set var="nombre" value="Julian Rivera Pineda" />

        ${fn:toUpperCase(nombre)}
        <br/>


        <c:forEach var="item" items="${fn:split(nombre, ' ')}">
            ${item}<br/>
        </c:forEach>

        <%!
            public class Cuidad {

                private String nombre;
                private String cabecera;

                public Cuidad() {
                    this.nombre = "Santa Ana";
                    this.cabecera = "Santa Ana";
                }

                public String getNombre() {
                    return nombre;
                }

                public String getCabecera() {
                    return cabecera;
                }

            }

            Cuidad c = new Cuidad();

        %>

        <%
            Map<String, Object> ciudades = new HashMap<>();
            ciudades.put("SS", "San Salvador");
            ciudades.put("SA", c);
            ciudades.put("SM", "San Miguel");

            request.setAttribute("ciudades", ciudades);

        %>

        ${ requestScope['ciudades']['SS']}<br/>
        ${ requestScope['ciudades']['SA'].cabecera }

    </body>
</html>
