package br.com.java.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi: definindo o caminho do requerimento/endere�o da p�g.
@WebServlet(urlPatterns = "/oi") //urlPatterns define o nome do Servlet, caminho da p�g.
public class OiMundoServlet extends HttpServlet{
	
	public OiMundoServlet() {
		System.out.println("Criando Oi Mundo Servlet");
	}
	
	@Override //essa annotation sobrescreve um m�todo
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		 //Em resp.getWriter � definido o que ser� a resposta. Como nesse caso � texto, getWriter. Se fosse imagem, seria outro get.
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, parab�ns! Voc� escreveu o primeiro Servlets.");
		out.println("</body>");
		out.println("</html>");		
		
		System.out.println("o servlet OiMundoServlet foi chamado"); //� um teste para verificar que o servlet foi chamdo dentro do Tomcat.
	}
}
