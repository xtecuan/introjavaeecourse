<%-- 
    Document   : clienteLogicaBean
    Created on : Dec 1, 2019, 1:29:49 PM
    Author     : xtecuan
--%>


<%@page import="sv.com.fedecredito.ejemplos.miaplicacion2.ejb.client.LogicaBeanClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente EJB LogicaBean</title>
    </head>
    <body>
        <h1>Cliente LogicaBean</h1>

        <%

            LogicaBeanClient client = new LogicaBeanClient();

            out.println("<h1>" + client.getLogica().saludar("Julian", "Rivera-Pineda") + "</h1>");

        %>


    </body>
</html>
