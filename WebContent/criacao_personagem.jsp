<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br" class="has-navbar-fixed-top">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Simulador de Vida Real</title>
	<link rel="stylesheet" href="bulma-0.7.5/css/bulma.css">
    <link rel="stylesheet" href="bulma-0.7.5/css/bulma.css.map">
    <link rel="stylesheet" href="bulma-0.7.5/css/bulma.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
</head>
<body>

<nav class="level">
  <p class="level-item has-text-centered">
    <a class="title">Criação de Personagem</a>
  </p>
</nav>

<div class="tile is-ancestor">
    <div class="tile is-vertical is-8">
        <div class="tile">
            <div class="tile is-parent is-vertical">
                <div class="tile is-parent">
                </div>
            </div>
            <div class="tile is-parent is-vertical">
                <div class="tile is-parent">
                    <article class="tile is-child notification is-danger">
                        <p class="subtitle">Nome: </p>
                        <input class="input" type="text" placeholder="Nome...">
                       	<p class="subtitle">Gênero: </p>
                        <div class="field">
	 						<div class="control">
	    						<div class="select">
	      							<select>
	        							<option>Masculino</option>
	        							<option>Feminino</option>
	      							</select>
	    						</div>
	  						</div>
						</div>
						<p class="subtitle">Dificuldade: </p>
                        <div class="field">
	 						<div class="control">
	    						<div class="select">
	      							<select>
	        							<option>Fácil</option>
	        							<option>Normal</option>
	        							<option>Difícil</option>
	        							<option>Modo Deus (Molina)</option>
	      							</select>
	    						</div>
	  						</div>
						</div>
						<div class="buttons">
  							<button class="button is-link" type="submit">Criar Personagem</button>
						</div> 	
                    </article>
                </div>
            </div>
        </div>
    </div>
    <div class="tile is-parent is-vertical">
    </div>
</div>
</body>
</html>