<%-- 
    Document   : hello
    Created on : Dec 2, 2019, 2:24:55 PM
    Author     : xtecuan
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World! JSP</title>
    </head>
    <body>
        <h1>Hello World! JSP</h1>
        <jsp:useBean id="clock" scope="page" class="calendar.JspCalendar" />

        <b>Today is:</b>
        <br/>
        <ul>
            <li>Day of Month: <%=clock.getDayOfMonth()%></li>
            <li>Month: <%=clock.getMonth()%></li>
            <li>Year: <%=clock.getYear()%></li>
        </ul>
    </body>
</html>
