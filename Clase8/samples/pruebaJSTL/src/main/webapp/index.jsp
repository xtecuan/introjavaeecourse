<%-- 
    Document   : index
    Created on : Dec 20, 2019, 11:47:00 AM
    Author     : xtecuan
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="sv.com.fedecredito.ejemplos.pruebajstl.Persona"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba JSTL</title>
    </head>
    <body>
        <h1>Prueba JSTL</h1>

        <c:set var="hola" scope="session" value="<U>Hola Mundo</U>"/>

        <b>${hola}</b><br/>
        <I>
            <c:out value="${hola}" escapeXml="true"/>
        </I>

        <c:set var="condicional" value="true" scope="page"/>
        <c:set var="tokens" value="Julian;Juliancito;Jimena;Jessica"/>

        <c:if test="${condicional}">
            <ul>
                <c:forTokens var="current" delims=";" items="${tokens}">
                    <li><c:out value="${current}"/></li>
                    </c:forTokens>
            </ul>
        </c:if>

        <c:set var="color" value="red"/>

        <c:choose>
            <c:when test="${color eq 'blue'}">
                <h1 style="color:blue">${color}</h1>
            </c:when>
            <c:when test="${color eq 'red'}">
                <h1 style="color:red">${color}</h1>
            </c:when>
            <c:otherwise>
                <h1 style="color:black">${color}</h1>
            </c:otherwise>
        </c:choose>

        <%

            List<Persona> personas = new ArrayList<>();

            int counter = 1000;

            String nombre = "Nombre_";
            String apellido = "Apellido_";
            String correo = "Correo_";
            String suffixCorreo = "@gmail.com";


        %>

        <%--<c:forEach var="i" begin="1" end="${counter}" step="1">
            <%                Persona p = new Persona();
            %>
            <c:set target="${p}" property="nombres" value="${nombre}${i}"/>
            <c:set target="${p}" property="apellidos" value="${apellido}${i}"/>
            <c:set target="${p}" property="email" value="${correo}${i}${suffixCorreo}"/>

            <%personas.add(p);%>
        </c:forEach>--%>

        <%            for (int i = 1; i <= counter; i++) {

                Persona p = new Persona();
                p.setNombres(nombre + i);
                p.setApellidos(apellido + i);
                p.setEmail(correo + i + suffixCorreo);
                personas.add(p);

            }

            session.setAttribute("personas", personas);

        %>

        <%=personas.size()%>

        <ul>
            <c:forEach var="p1" items="${sessionScope['personas']}">
                <li>
                    ${p1}
                </li>
            </c:forEach>

        </ul>


        <c:import  url="/banner.jsp"/>
        
    </body>
</html>
