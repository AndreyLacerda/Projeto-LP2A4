package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entities.Usuario;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, email);
		
		if (usuario == null) {
			String senha = request.getParameter("senha");
			
			Usuario novoUsuario = new Usuario(email, senha);
			
			em.getTransaction().begin();
			em.persist(novoUsuario);
			em.getTransaction().commit();
			
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('Usuário Cadastrado com Sucesso!');");
			out.println("location='index.jsp';");
			out.println("</script>");
			out.close();
		} else {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('Usuário Já Existente no Sistema!');");
			out.println("location='register.jsp';");
			out.println("</script>");
			out.close();
			out.close();
		}
		
		emf.close();
		em.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
