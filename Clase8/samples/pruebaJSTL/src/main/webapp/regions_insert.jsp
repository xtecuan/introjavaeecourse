<%-- 
    Document   : regions_insert
    Created on : Dec 20, 2019, 2:37:54 PM
    Author     : xtecuan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="datasource.jsp" %>

<sql:update var="regions_crud" dataSource="${oracleDS}">

    INSERT INTO HR.REGIONS
    (REGION_NAME)
    VALUES(?)
    <sql:param value="${param['region_name']}"/>
</sql:update>

<c:set scope="session" var="msg" value="${regions_crud}"/>

<c:redirect url="regions.jsp"/>




