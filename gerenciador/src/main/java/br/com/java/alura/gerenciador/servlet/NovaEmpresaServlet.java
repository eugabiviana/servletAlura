package br.com.java.alura.gerenciador.servlet;

import java.io.IOException;

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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa.");
				
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		//simulando um banco de dados criando uma classe Banco.
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//chamar o JSP:usar uma requisição que entenda que a resposta está no JSP e imprima no navegador com os dados desse arquivo.
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response); //pega a requisição e manda a resposta para o navegador, lendo o que está definido no JSP.
		
		
		
		
//		Essa parte agora funciona e está no arquivo novaEmpresaCriada.jsp!
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa " +nomeEmpresa+ " cadastrada com sucesso!</body></html>");
	}

}
