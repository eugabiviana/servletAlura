<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.java.alura.gerenciador.servlet.Empresa"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importa��o feita para que o programa reconhe�a o la�o de repeti��o da express�o escrita na expression language. esse c no prefix � relativo a core -->  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standar Taglib</title>
</head>
<body>
	Lista de empresas: <br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa" >		
			<li>${empresa.nome}</li>
		</c:forEach>
	
	
	</ul>	
	
<!-- a express�o acima � igual a express�o abaixo  
	<ul>
		 
		la�o 'for each' para apresentar a lista de empresas cadastradas 
	//
		//List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");//essa linha � igual a ${empresas}	
		//for (Empresa empresa : lista) {
	//%>
	//	<li>// empresa.getNome() %></li>
	
		//}
	%> 
		
	</ul>-->	
	
</body>
</html>