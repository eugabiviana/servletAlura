<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- esse comando renomeia o endereço do navegador e faz com que isso seja definido com uma variável -->
<c:url value="/novaEmpresa" var="linkServlerNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet</title>
</head>
<body>
	<form action="${linkServletNovaEmpresa}" method="post">	
	
	Nome: <input type="text" name="nome"/>
	
	<input type="submit" />
	
	</form>

</body>
</html>