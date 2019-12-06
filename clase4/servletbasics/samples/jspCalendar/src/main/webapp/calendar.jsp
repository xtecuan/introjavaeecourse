<%-- 
    Document   : calendar
    Created on : Dec 6, 2019, 9:39:02 AM
    Author     : xtecuan
--%>

<%@page import="calendar.JspCalendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de JavaBean llamado JspCalendar</title>
    </head>
    <body>
        <h1>Uso de JavaBean llamado JspCalendar</h1>

        <%
            JspCalendar calendar = new JspCalendar();
            out.println("<h3>Dia del mes: " + calendar.getDayOfMonth() + "</h3>");
            out.println("<h3>Mes: " + calendar.getMonth() + "</h3>");
            out.println("<h3>Year: " + calendar.getYear() + "</h3>");
        %>
        <jsp:useBean id="clock" scope="page" class="calendar.JspCalendar" />
        <jsp:useBean id="clock1" scope="page" class="calendar.JspCalendar" />

        Fecha es: <jsp:getProperty name="clock" property="dayOfMonth" /> / 
        <jsp:getProperty name="clock" property="month" /> /
        <jsp:getProperty name="clock" property="year" />

        Fecha es: <jsp:getProperty name="clock1" property="dayOfMonth" /> / 
        <jsp:getProperty name="clock1" property="month" /> /
        <jsp:getProperty name="clock1" property="year" />

    </body>
</html>
