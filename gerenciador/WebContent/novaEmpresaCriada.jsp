<!-- Como não dá para programar em HTML concatenando, usa/cria uma página com a tecnologia java server page (JSP). Por isso renomeei essa pág. de .HTML para .JSP
 PS: Todo o código (scriptlet) é executado no servidor antes de enviar a resposta para o navegador. -->


<!-- Após renomear a pág. coloca o % com os símbolos maior e menor, que é "adicionar um pedaço de código java", chamamos essa inserção de código Java um arquivo jsp de scriptlet. -->
<!--  <%
// scriptlet
// String nomeEmpresa = (String)request.getAttribute("empresa"); <!-- essa expressão está reescrita abaixo com o ${ } -->
// System.out.println(nomeEmpresa);
//%> -->


<html><body>
<!-- melhorando a Expression Language. Nesse formato ${}, a linguagem reconhece a expressão dentro das chaves e interpreta o que está sendo feito diretamente. Se eu colocar 3+3, no navegador aparecerá a resposta 6. Então eu uso a variável "empresa", definida em listaEmpresas e ele lerá a empresa cadastrada.  -->

Empresa ${ empresa } cadastrada com sucesso! 

<!-- Empresa <%= nomeEmpresa %> cadastrada com sucesso! 
 O símbolo = após o símbolo % é um atalho para não precisar escrever todo o método 'out.println(nomeEmpresa);' -->
</body></html>



