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
import javax.servlet.http.HttpSession;

import Entities.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		Usuario usuario = em.find(Usuario.class, email);
		
		if (usuario == null) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('Usuário não Encontrado!');");
			out.println("location='index.jsp';");
			out.println("</script>");
			out.close();
		} else {
			if (usuario.getSenha().equals(senha)) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario", usuario.getEmail());
				response.sendRedirect("Redirect");
			} else {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('Senha Incorreta!');");
				out.println("location='index.jsp';");
				out.println("</script>");
				out.close();
			}
		}
		em.close();
		emf.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
