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
 * Servlet implementation class Crianca
 */
@WebServlet("/Crianca")
public class Variaveis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Variaveis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void tipoCrianca(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String crianca = request.getParameter("crianca");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		int crian = Integer.parseInt(crianca);
    	
    	Personagem personagem = em.find(Personagem.class, 1);
    	Personagem personagem1 = em.find(Personagem.class, 0);
    	
    	if(personagem.getDificuldade() == 1) {
    		personagem.setTipoCrianca(1);
    		
    		PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("location='4_fase2.jsp';");
			out.println("</script>");
			out.close();
    	} else {
    		
    		PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("location='4_fase2dif.jsp';");
			out.println("</script>");
			out.close();
    	}
	}
    
    protected void setVampeta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String vampeta = request.getParameter("vampeta");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		boolean vamp = Boolean.parseBoolean(vampeta);
    	
    	Personagem personagem = em.find(Personagem.class, dificuldade);
    	
    	if(vamp == true) {
    		personagem.setVampeta(true);	
    	} else {
    		personagem.setVampeta(false);
    	}
    	
    	PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("location='14_fase6dif.jsp';");
		out.println("</script>");
		out.close();
	}

    protected void setMaguila(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String maguila = request.getParameter("maguila");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		boolean mag = Boolean.parseBoolean(maguila);
    	
    	Personagem personagem = em.find(Personagem.class, dificuldade);
    	
    	if(mag == true) {
    		personagem.setVampeta(true);	
    	} else {
    		personagem.setVampeta(false);
    	}
    	
    	PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("location='6_fase3dif.jsp';");
		out.println("</script>");
		out.close();
	}
    
    protected void checarMaguila(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Personagem personagem = em.find(Personagem.class, dificuldade);
    	
    	if(personagem.mag == true) {
    		PrintWriter out = response.getWriter();
    		out.println("<script>");
    		out.println("location='18_fase6transicao.jsp';");
    		out.println("</script>");
    		out.close();	
    	} else {
    		PrintWriter out = response.getWriter();
    		out.println("<script>");
    		out.println("location='19_fase7dif.jsp';");
    		out.println("</script>");
    		out.close();
    	}
    	
    	PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("location='6_fase3dif';");
		out.println("</script>");
		out.close();
	}
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
