<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- esse comando renomeia o endere�o do navegador e faz com que isso seja definido com uma vari�vel -->
<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post">	
	
	Nome: <input type="text" name="nome" value="${empresa.nome}"/>
	Data: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>
	<input type="hidden" name="id" value="${empresa.id}"/>
	<input type="submit" />
	
	</form>

</body>
</html>