package br.santaLucia.trabalho;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.santaLucia.Linguagens.Linguagens;

/**
 * Servlet implementation class Pesquisa
 */
@WebServlet("/pesquisa")
public class Pesquisa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pesquisa() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String opcao = request.getParameter("optradio");
		System.out.println("Op��o: " +  opcao);

		Linguagem l = new Linguagem();
		
		Linguagens.listaLinguagens.add(l);
		
		
		if(opcao.equals("Java")){
			l.java++;
		}else if(opcao.equals("C#")){
			l.c++;
		}else if(opcao.equals("Python")){
			l.python++;
		}else if(opcao.equals("Cobol")){
			l.cobol++;
		}
		
		//RequestDispatcher rd = request.getRequestDispatcher("/Mostrar.jsp");
		//request.setAttribute("resultado",res);
		//rd.forward(request,response);
		
		response.sendRedirect("Mostrar.jsp?" + opcao);
	
		response.sendRedirect("Mostrar.jsp?" + l.java);
		response.sendRedirect("Mostrar.jsp?" + l.c);
		response.sendRedirect("Mostrar.jsp?" + l.python);
		response.sendRedirect("Mostrar.jsp?" + l.cobol);
	
		
		
	}

}
