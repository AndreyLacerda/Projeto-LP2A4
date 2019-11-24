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
            <h1 class="title" id="h1head">Fase 1</h1>
            <h2 class="subtitle" id="h2head">Começo</h2>
        </div>
        </div>
    </section>
    
    <form method="post" action="../Variaveis">
	    <section class="section">
	    	<div class="card">
	        	<div class="card-content">
	            	<p class="level-item has-text-centered">
	            	<div class="card">
	            		<p style="padding:20px">Sua vida começa. Você veio de uma família de classe média, e seus pais sempre foram liberais com você. Você é uma criança comportada, que busca conhecimento ou é o capeta em forma de guri?</p>
	            	</div>
	            </div>
	        </div>
	        <footer class="card-footer">
		    	<p class="card-footer-item">
		    		<button class="button" name="crianca" value="1">Sou comportado</button>
		    	</p>
		    	<p class="card-footer-item">
					<button class="button" name="crianca" value="2">SOU CRAMUNHÃO</button>
				</p>
	  		</footer>
	    </section>
    </form>
  </body>
</html>

