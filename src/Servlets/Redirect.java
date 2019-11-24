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

import Entities.Personagem;

/**
 * Servlet implementation class Escolhas
 */
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("usuario");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		Personagem personagem = em.find(Personagem.class, userId);
		
		if(personagem == null) {
			
			response.sendRedirect("/Projeto-LP2A4/criacao_personagem.jsp");
			
		} else {
			if(personagem.getDificuldade() == 1) {
				switch(personagem.getFase()) {
					case 1:
						session.setAttribute("fase", 1);
						PrintWriter out1 = response.getWriter();
						out1.println("<script>");
						out1.println("location='decorrerJogo/1_fase1.jsp';");
						out1.println("</script>");
						out1.close();
						break;
					case 2:
						session.setAttribute("fase", 2);
						PrintWriter out2 = response.getWriter();
						out2.println("<script>");
						out2.println("location='decorrerJogo/3_fase2.jsp';");
						out2.println("</script>");
						out2.close();
						break;
					case 3:
						session.setAttribute("fase", 3);
						PrintWriter out3 = response.getWriter();
						out3.println("<script>");
						out3.println("location='decorrerJogo/5_fase3.jsp';");
						out3.println("</script>");
						out3.close();
						break;
					case 4:
						session.setAttribute("fase", 4);
						PrintWriter out4 = response.getWriter();
						out4.println("<script>");
						out4.println("location='decorrerJogo/7_fase4.jsp';");
						out4.println("</script>");
						out4.close();
						break;
					case 5:
						session.setAttribute("fase", 5);
						PrintWriter out5 = response.getWriter();
						out5.println("<script>");
						out5.println("location='decorrerJogo/9_fase5.jsp';");
						out5.println("</script>");
						out5.close();
						break;
					case 6:
						session.setAttribute("fase", 6);
						PrintWriter out6 = response.getWriter();
						out6.println("<script>");
						out6.println("location='decorrerJogo/12_fase6.jsp';");
						out6.println("</script>");
						out6.close();
						break;
					case 7:
						session.setAttribute("fase", 7);
						PrintWriter out7 = response.getWriter();
						out7.println("<script>");
						out7.println("location='decorrerJogo/15_fase7.jsp';");
						out7.println("</script>");
						out7.close();
						break;
					case 8:
						session.setAttribute("fase", 8);
						PrintWriter out8 = response.getWriter();
						out8.println("<script>");
						out8.println("location='decorrerJogo/21_fase8.jsp';");
						out8.println("</script>");
						out8.close();
						break;
					}
			} else {
				switch(personagem.getFase()) {
					case 1:
						session.setAttribute("fase", 1);
						PrintWriter out1 = response.getWriter();
						out1.println("<script>");
						out1.println("location='decorrerJogo/2_fase1dif.jsp';");
						out1.println("</script>");
						out1.close();
						break;
					case 2:
						session.setAttribute("fase", 2);
						PrintWriter out2 = response.getWriter();
						out2.println("<script>");
						out2.println("location='decorrerJogo/4_fase2dif.jsp';");
						out2.println("</script>");
						out2.close();
						break;
					case 3:
						session.setAttribute("fase", 3);
						PrintWriter out3 = response.getWriter();
						out3.println("<script>");
						out3.println("location='decorrerJogo/6_fase3dif.jsp';");
						out3.println("</script>");
						out3.close();
						break;
					case 4:
						session.setAttribute("fase", 4);
						PrintWriter out4 = response.getWriter();
						out4.println("<script>");
						out4.println("location='decorrerJogo/8_fase4dif.jsp';");
						out4.println("</script>");
						out4.close();
						break;
					case 5:
						session.setAttribute("fase", 5);
						PrintWriter out5 = response.getWriter();
						out5.println("<script>");
						out5.println("location='decorrerJogo/10_fase5dif.jsp';");
						out5.println("</script>");
						out5.close();
						break;
					case 6:
						session.setAttribute("fase", 6);
						PrintWriter out6 = response.getWriter();
						out6.println("<script>");
						out6.println("location='decorrerJogo/14_fase6dif.jsp';");
						out6.println("</script>");
						out6.close();
						break;
					case 7:
						session.setAttribute("fase", 7);
						PrintWriter out7 = response.getWriter();
						out7.println("<script>");
						out7.println("location='decorrerJogo/19_fase7dif.jsp';");
						out7.println("</script>");
						out7.close();
						break;
					case 8:
						session.setAttribute("fase", 8);
						PrintWriter out8 = response.getWriter();
						out8.println("<script>");
						out8.println("location='decorrerJogo/21_fase8.jsp';");
						out8.println("</script>");
						out8.close();
						break;
				}
			}
		}
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
