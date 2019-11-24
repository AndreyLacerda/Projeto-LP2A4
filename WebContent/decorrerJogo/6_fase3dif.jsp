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
            <h1 class="title" id="h1head">Fase 3</h1>
            <h2 class="subtitle" id="h2head">Escolhas futuras</h2>
        </div>
        </div>
    </section>
    
    <section class="section">
        <div class="card">
        <div class="card-content">
            <p class="level-item has-text-centered">
      <img style="padding-bottom:10px" src="../imagens/Maguila.jpg"  width="500" height="500">
            <div class="card">
            
            
            <!-- Aqui o if para aparecer o texto de acordo com o tipo de criança -->
            <%@page import="Entities.Personagem, 
            javax.persistence.EntityManager, 
            javax.persistence.EntityManagerFactory, 
            javax.persistence.Persistence" %>
            <%
	            EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetolp2a4");
	    		EntityManager em = emf.createEntityManager();
	    		
	    		Personagem personagem = em.find(Personagem.class, userId);
	    		
            	if (personagem.getTipoCrianca() == 2){
            %>
            <p style="padding:20px">Você não foi uma criança muito comportada, nunca estudou nem deu valor a nada. Seu destino é ir para uma escola ruim. Entretanto, nas suas empreitadas você encontra um velho que diz ser ninguém menos que Maguila, e pergunta se você gostaria de socar a preguiça com ele.</p>          
            </div>
        </div>
        <footer class="card-footer">
        
        <!--  criança ruim -->
		<%
            	} else{
		%>
		<p style="padding:20px">Você foi uma criança muito comportada, deu valor a tudo e estudou bastante. Entrou em uma boa escola e está prestes a terminar o ensino médio.  Entretanto, nas suas empreitadas você encontra um velho que diz ser ninguém menos que Maguila, e pergunta se você gostaria de socar a preguiça com ele.</p>
        <!--  criança boa -->

         <%} %>
         <section class="section">
         <div class="container">
    		<div class="columns is-centered">
	       <form method="post" action="../Variaveis">
	      	 <footer class="card-footer">
	        	<p class="card-footer-item">
	    			<input hidden type="text" value="true" name="mag">
	        		<button class="button">Socar a preguiça com o Maguila</button>
	        	</p>
		    </form>
	    	<form method="post" action="../Variaveis">
		   	 	<p class="card-footer-item">
	    			<input hidden type="text" value="false" name="mag">
  					<button class="button">Sai daqui cara, eu nem te conheço</button>
  				</p>
		    </form>
		    </div>
		    </div>
		</section>
		</div>
    </section>
  </body>
</html>
