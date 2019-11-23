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
		String dificuldade = request.getParameter("modo");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		int dif = Integer.parseInt(dificuldade);
		
		Personagem personagem = em.find(Personagem.class, dificuldade);
		
		if(personagem == null) {
			Personagem novoPersonagem = new Personagem(dif, 0);
			
			em.getTransaction().begin();
			em.persist(novoPersonagem);
			em.getTransaction().commit();
			
			if(dif == 1) {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("location='1_fase1.jsp';");
				out.println("</script>");
				out.close();
			} else {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("location='2_fase1dif.jsp';");
				out.println("</script>");
				out.close();
			}
		} else if(personagem != null) {
			
			switch(personagem.getFase()) {
				case 1:
					PrintWriter out1 = response.getWriter();
					out1.println("<script>");
					out1.println("location='1_fase1.jsp';");
					out1.println("</script>");
					out1.close();
					break;
				case 2:
					PrintWriter out2 = response.getWriter();
					out2.println("<script>");
					out2.println("location='1_fase1.jsp';");
					out2.println("</script>");
					out2.close();
					break;
				case 3:
					PrintWriter out3 = response.getWriter();
					out3.println("<script>");
					out3.println("location='1_fase1.jsp';");
					out3.println("</script>");
					out3.close();
					break;
				case 4:
					PrintWriter out4 = response.getWriter();
					out4.println("<script>");
					out4.println("location='1_fase1.jsp';");
					out4.println("</script>");
					out4.close();
					break;
				case 5:
					PrintWriter out5 = response.getWriter();
					out5.println("<script>");
					out5.println("location='1_fase1.jsp';");
					out5.println("</script>");
					out5.close();
					break;
				case 6:
					PrintWriter out6 = response.getWriter();
					out6.println("<script>");
					out6.println("location='1_fase1.jsp';");
					out6.println("</script>");
					out6.close();
					break;
				case 7:
					PrintWriter out7 = response.getWriter();
					out7.println("<script>");
					out7.println("location='1_fase1.jsp';");
					out7.println("</script>");
					out7.close();
					break;
				case 8:
					PrintWriter out8 = response.getWriter();
					out8.println("<script>");
					out8.println("location='1_fase1.jsp';");
					out8.println("</script>");
					out8.close();
					break;
				case 9:
					PrintWriter out9 = response.getWriter();
					out9.println("<script>");
					out9.println("location='1_fase1.jsp';");
					out9.println("</script>");
					out9.close();
					break;
				case 10:
					PrintWriter out10 = response.getWriter();
					out10.println("<script>");
					out10.println("location='1_fase1.jsp';");
					out10.println("</script>");
					out10.close();
					break;
				case 11:
					PrintWriter out11 = response.getWriter();
					out11.println("<script>");
					out11.println("location='1_fase1.jsp';");
					out11.println("</script>");
					out11.close();
					break;
				case 12:
					PrintWriter out12 = response.getWriter();
					out12.println("<script>");
					out12.println("location='1_fase1.jsp';");
					out12.println("</script>");
					out12.close();
					break;
				case 13:
					PrintWriter out13 = response.getWriter();
					out13.println("<script>");
					out13.println("location='1_fase1.jsp';");
					out13.println("</script>");
					out13.close();
					break;
				case 14:
					PrintWriter out14 = response.getWriter();
					out14.println("<script>");
					out14.println("location='1_fase1.jsp';");
					out14.println("</script>");
					out14.close();
					break;
				case 15:
					PrintWriter out15 = response.getWriter();
					out15.println("<script>");
					out15.println("location='1_fase1.jsp';");
					out15.println("</script>");
					out15.close();
					break;
				case 16:
					PrintWriter out16 = response.getWriter();
					out16.println("<script>");
					out16.println("location='1_fase1.jsp';");
					out16.println("</script>");
					out16.close();
					break;
				case 17:
					PrintWriter out17 = response.getWriter();
					out17.println("<script>");
					out17.println("location='1_fase1.jsp';");
					out17.println("</script>");
					out17.close();
					break;
				case 18:
					PrintWriter out18 = response.getWriter();
					out18.println("<script>");
					out18.println("location='1_fase1.jsp';");
					out18.println("</script>");
					out18.close();
					break;
				case 19:
					PrintWriter out19 = response.getWriter();
					out19.println("<script>");
					out19.println("location='1_fase1.jsp';");
					out19.println("</script>");
					out19.close();
					break;
				case 20:
					PrintWriter out20 = response.getWriter();
					out20.println("<script>");
					out20.println("location='1_fase1.jsp';");
					out20.println("</script>");
					out20.close();
					break;
				case 21:
					PrintWriter out21 = response.getWriter();
					out21.println("<script>");
					out21.println("location='1_fase1.jsp';");
					out21.println("</script>");
					out21.close();
					break;
				case 22:
					PrintWriter out22 = response.getWriter();
					out22.println("<script>");
					out22.println("location='1_fase1.jsp';");
					out22.println("</script>");
					out22.close();
					break;
				case 23:
					PrintWriter out23 = response.getWriter();
					out23.println("<script>");
					out23.println("location='1_fase1.jsp';");
					out23.println("</script>");
					out23.close();
					break;
				case 24:
					PrintWriter out24 = response.getWriter();
					out24.println("<script>");
					out24.println("location='1_fase1.jsp';");
					out24.println("</script>");
					out24.close();
					break;
				case 25:
					PrintWriter out25 = response.getWriter();
					out25.println("<script>");
					out25.println("location='1_fase1.jsp';");
					out25.println("</script>");
					out25.close();
					break;
			}
			
		}
		
		if(personagem.getDificuldade() == 1) {
			response.sendRedirect("decorrerJogo/1_fase1.jsp");
		} else {
			response.sendRedirect("decorrerJogo/2_fase1dif.jsp");
		}
	}
    
    protected void doGet1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
