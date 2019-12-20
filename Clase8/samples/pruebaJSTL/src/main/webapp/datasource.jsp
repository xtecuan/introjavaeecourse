<%-- 
    Document   : datasource
    Created on : Dec 20, 2019, 1:51:11 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<sql:setDataSource var="oracleDS" 
                   driver="oracle.jdbc.OracleDriver"
                   url="jdbc:oracle:thin:@localhost:1521:orcl"
                   user="hr"
                   password="holahola1"/>


