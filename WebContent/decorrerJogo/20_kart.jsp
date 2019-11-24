<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br" class="has-navbar-fixed-top">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Simulator Molinator</title>
    <link rel="stylesheet" href="../css/bulma-0.7.5/css/bulma.min.css">
    <link rel="stylesheet" href="../css/own.css" defer>
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
  </head>
  <body>
<%@ include file="../topo.jsp" %>
        <nav class="navbar is-fixed-top" aria-label="dropdown navigation">
                <a class="navbar-item">
                </a>
            
                <div class="navbar">
                <p class="navbar-item">Simulator Molinator</p>
                </div>
                <div class="navbar-end">
                <div class="navbar-item">
                    <div class="buttons">
                    </div>
                </div>
                </div>
            </nav>
   
    
    <section class="hero" id="cabeca">
        <div class="hero-body">
        <div class="container">
            <h1 class="title" id="h1head">Kart</h1>
            <h2 class="subtitle" id="h2head">X1?</h2>
        </div>
        </div>
    </section>
    
    <section class="section">
        <div class="card">
        <div class="card-content">
            <p class="level-item has-text-centered">
            <div class="card">
            <p style="padding:20px">Gustavinho não gosta das suas atitudes, e na maior humildade te convida para andar de kart com ele.</p>
            </div>
            </p>
        </div>
        <footer class="card-footer">
            <p class="card-footer-item">
            <span>
            <a href="21_fase8.jsp">Sai fora, vou estudar e passar de boas aqui.</a>
            </span>
            </p>
            <p class="card-footer-item">
            <span>
            
            <!-- Aqui devem ter os ifs/switch -->

            <%@page import="Entities.Personagem, 
            javax.persistence.EntityManager, 
            javax.persistence.EntityManagerFactory, 
            javax.persistence.Persistence" %>
            <%
	            EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
	    		EntityManager em = emf.createEntityManager();
	    		
	    		Personagem personagem = em.find(Personagem.class, userId);
	  			
            	if (personagem.getDificuldadeOriginal() == 2 && personagem.isVampeta() == true){
            %>
            <!-- Se estiver no difícil e for amigo do vampeta -->
            	<a href="23_ajudavamp.jsp">Bora x1 então tio, bora bora</a>
            	
            <%} else { if(personagem.isVampeta() == false && personagem.getDificuldadeOriginal() == 2){ %>
            <!-- Se estiver no difícil e não for amigo do vampeta -->
           	 	<a href="../Morte">Bora x1 então tio, bora bora</a>
            <%} else{ if(personagem.getDificuldadeOriginal() == 1){ %>
            <!-- Se estiver no fácil -->
                <a href="22_ajudaroger.jsp">Bora x1 então tio, bora bora</a>
             <%}}}%>
            </span>
            </p>
        </footer>
        </div>
    </section>
  </body>
</html>