<%@ page import="java.util.List, gerenciador.servlet.Empresa"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String nomeEmpresa = "Prodemge";
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de empresas - Java Standard Tag Lib</title>
</head>
<body>
	<p>Lista de Empresas:</p>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome}</li>
		</c:forEach>
	</ul>
</body>
</html>