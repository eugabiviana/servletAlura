package br.com.java.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresas") //endereço no navegador
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//chamando a lista de empresas cadastradas no simulador do banco de dados
		//PS: esse simulador é temporário! Ao reiniciar o servidor, perde as informações cadastradas!
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();		
		
		//método em HTML para acessar e ver as empresas cadastradas. 
		PrintWriter out = response.getWriter();			
		out.println("<html><body>");
		out.println("<ul>");
		
		//laço 'for each' para apresentar a lista de empresas cadastradas
		for (Empresa empresa : lista) {
			out.println("<li>" + empresa.getNome() + "</li>");
		}
		
		out.println("</ul>");
		out.println("</body></html>");		
	}

}
