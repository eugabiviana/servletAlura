package br.com.java.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa.");
				
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		//declarando a vari�vel fora do m�todo try/catch, para que ela funcione dele.
		Date dataAbertura = null; 
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		//simulando um banco de dados criando uma classe Banco.
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		
		//n�o chamo mais o m�todo RequestDispatcher, redireciono a requisi��o para o navegador, que pedir� a informa��o para o outro servlet.
		response.sendRedirect("listaEmpresas");
		
		
//		//chamar o JSP:usar uma requisi��o que entenda que a resposta est� no JSP e imprima no navegador com os dados desse arquivo.
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response); //pega a requisi��o e manda a resposta para o navegador, lendo o que est� definido no JSP.

		
		
//		Essa parte agora funciona e est� no arquivo novaEmpresaCriada.jsp!
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa " +nomeEmpresa+ " cadastrada com sucesso!</body></html>");
	}

}
