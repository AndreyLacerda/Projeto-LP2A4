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
            <h1 class="title" id="h1head">Fase 5</h1>
            <h2 class="subtitle" id="h2head">Lendas antigas</h2>
        </div>
        </div>
    </section>
    
    <form method="post" action="/Escolhas">
	    <section class="section">
	        <div class="card">
	        	<div class="card-content">
		            <p class="level-item has-text-centered">
		           	<img style="padding-bottom:20px" src="../imagens/Vampeta.jpg"  width="500" height="500">
		            <div class="card">
		            	<p style="padding:20px">Tomando uma boazinha com Zeca, você encontra a lenda brasileira, VAMPETA! E ele te convida para jogar um caromzinho de leve.</p>
		            </div>
	        	</div>
		        <footer class="card-footer">
		    		<p class="card-footer-item">
		    			<button class="button" name="vampeta" onclick="/Redirect" value="false">Sai mano, curintia é lixo! Vou sozinho.</button>
		    		</p>
		    		<p class="card-footer-item">
						<button class="button" name="vampeta" onclick="/Redirect" value="true">SÓ BORA MULEKOTE</button>
					</p>
	  		</footer>
	        </div>
	    </section>
    </form>
  </body>
</html>