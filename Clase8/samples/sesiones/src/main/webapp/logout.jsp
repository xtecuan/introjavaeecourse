<%-- 
    Document   : logout
    Created on : Dec 20, 2019, 11:05:56 AM
    Author     : xtecuan
--%>

<%

    session.invalidate();

    response.sendRedirect(getServletContext().getContextPath() + "/index.jsp");

%>
