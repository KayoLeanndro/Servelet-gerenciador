<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ import="java.util.List, br.com.gerenciador.servelet.Empresa" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Empresas</title>
</head>
<body>

<ul>
<%
	List<Empresa> empresas = (List<Empresa>)request.getAttribute("empresas");
	for(Empresa empresa : empresas){
%>
<li> <%= empresa.getNome()%> </li>
<%
	}
%>


</ul>

</body>
</html>