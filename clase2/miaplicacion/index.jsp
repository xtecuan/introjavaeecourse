<html>
<head>

<title>Hola Mundo</title>

</head>

<body>

<%--- Hola Usuario la fecha es: <%=new java.util.Date()%> ---%>

<form action="procesar.jsp" method="POST">

Nombres: <input name="nombres" type="text" value=""/>

Apellidos: <input name="apellidos" type="text" value=""/>


<input type="submit" value="Enviar"/>


</form>


</body>


</html>