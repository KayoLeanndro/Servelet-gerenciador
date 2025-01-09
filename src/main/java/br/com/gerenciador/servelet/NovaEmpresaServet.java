package br.com.gerenciador.servelet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		//Adiciona o nome da empresa como atributo para JSP
		request.setAttribute("empresa", empresa.getNome());
		
		//Chama o JPS
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		rd.forward(request, response);
		
	}
	

}
