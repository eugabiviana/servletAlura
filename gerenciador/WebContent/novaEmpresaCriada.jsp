<!-- Como n�o d� para programar em HTML concatenando, usa/cria uma p�gina com a tecnologia java server page (JSP). Por isso renomeei essa p�g. de .HTML para .JSP
 PS: Todo o c�digo (scriptlet) � executado no servidor antes de enviar a resposta para o navegador. -->


<!-- Ap�s renomear a p�g. coloca o % com os s�mbolos maior e menor, que � "adicionar um peda�o de c�digo java", chamamos essa inser��o de c�digo Java um arquivo jsp de scriptlet. -->
<!--  <%
// scriptlet
// String nomeEmpresa = (String)request.getAttribute("empresa"); <!-- essa express�o est� reescrita abaixo com o ${ } -->
// System.out.println(nomeEmpresa);
//%> -->


<html><body>
<!-- melhorando a Expression Language. Nesse formato ${}, a linguagem reconhece a express�o dentro das chaves e interpreta o que est� sendo feito diretamente. Se eu colocar 3+3, no navegador aparecer� a resposta 6. Ent�o eu uso a vari�vel "empresa", definida em listaEmpresas e ele ler� a empresa cadastrada.  -->

Empresa ${ empresa } cadastrada com sucesso! 

<!-- Empresa <%= nomeEmpresa %> cadastrada com sucesso! 
 O s�mbolo = ap�s o s�mbolo % � um atalho para n�o precisar escrever todo o m�todo 'out.println(nomeEmpresa);' -->
</body></html>



