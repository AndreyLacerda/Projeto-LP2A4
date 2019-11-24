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
 * Servlet implementation class Crianca
 */
@WebServlet("/Variaveis")
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
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("usuario");
		int fase = (int)session.getAttribute("fase");
		
		switch(fase){
			case 1: tipoCrianca(request, response); break;
			case 3: escolhaMaguila(request, response); break;
			case 5: escolhaVamp(request, response); break;
		}
    }
    
    protected void tipoCrianca(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("usuario");
    	
    	Personagem personagem = em.find(Personagem.class, userId);
    	
    	if(personagem.getDificuldade() == 1) {
    		personagem.setTipoCrianca(1);
    		personagem.setFase(2);
    		
    		em.getTransaction().begin();
			em.merge(personagem);
			em.getTransaction().commit();
    		
    		PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("location='decorrerJogo/4_fase2.jsp';");
			out.println("</script>");
			out.close();
			
    	} else {
    		String crianca = request.getParameter("crianca");
    		int crian = Integer.parseInt(crianca);
    		
    		personagem.setTipoCrianca(crian);
    		
    		em.getTransaction().begin();
			em.merge(personagem);
			em.getTransaction().commit();
			
			response.sendRedirect("PassarFase");
    	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void escolhaMaguila(HttpServletRequest request, HttpServletResponse response) throws IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("usuario");
    	
    	Personagem personagem = em.find(Personagem.class, userId);
    	
    	boolean mag = Boolean.parseBoolean(request.getParameter("mag"));
    	
    	personagem.setMag(mag);

		em.getTransaction().begin();
		em.merge(personagem);
		em.getTransaction().commit();
		
		response.sendRedirect("PassarFase");
	}
	
	protected void escolhaVamp(HttpServletRequest request, HttpServletResponse response) throws IOException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
		EntityManager em = emf.createEntityManager();
		
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("usuario");
    	
    	Personagem personagem = em.find(Personagem.class, userId);
    	
    	boolean vampeta = Boolean.parseBoolean(request.getParameter("vampeta"));
    	
    	personagem.setVampeta(vampeta);
		
		em.getTransaction().begin();
		em.merge(personagem);
		em.getTransaction().commit();
		
		response.sendRedirect("PassarFase");
	}

}
