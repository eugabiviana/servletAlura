<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.java.alura.gerenciador.servlet.Empresa"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- importação feita para que o programa reconheça o laço de repetição da expressão escrita na expression language. esse c no prefix é relativo a core -->  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standar Taglib</title>
</head>
<body>

		<c:if test="${not empty empresa }" >
			Empresa ${ empresa } cadastrada com sucesso! 
		</c:if>
				
	Lista de empresas: <br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa" >		
			<li>
			${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostraEmpresa?id=${empresa.id}">editar</a>	
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">remover</a>					
			</li>
		</c:forEach>
		
	</ul>	
	
<!-- a expressão acima é igual a expressão abaixo  
	<ul>
		 
		laço 'for each' para apresentar a lista de empresas cadastradas 
	//
		//List<Empresa> lista = (List<Empresa>)request.getAttribute("empresas");//essa linha é igual a ${empresas}	
		//for (Empresa empresa : lista) {
	//%>
	//	<li>// empresa.getNome() %></li>
	
		//}
	%> 
		
	</ul>-->	
	
</body>
</html>