<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br" class="has-navbar-fixed-top">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Simulador de Vida Real - Cadastro</title>
	<link rel="stylesheet" href="bulma-0.7.5/css/bulma.css">
    <link rel="stylesheet" href="bulma-0.7.5/css/bulma.css.map">
    <link rel="stylesheet" href="bulma-0.7.5/css/bulma.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
</head>
<body>
	<div class="columns is-centered">
		<div class='column is-one-third is-centered'>
			<form method="post" action="Cadastro">
				
				<div class="field">
				  <label class="label">Email</label>
				  <div class="control has-icons-left has-icons-right">
				    <input class="input" type="email" name="email" maxlength="125" placeholder="Seu Email" required="true">
				    <span class="icon is-small is-left">
				      <i class="fas fa-envelope"></i>
				    </span>
				  </div>
				</div>
				
				<div class="field">
				  <label class="label">Senha</label>
				  <div class="control has-icons-left has-icons-right">
				    <input class="input" type="password" name="senha" maxlength="45" placeholder="Seu senha" required="true">
				    <span class="icon is-small is-left">
		     	 		<i class="fas fa-lock"></i>
		    		</span>
				  </div>
				</div>
				
				<div class="field">
				  <div class="control">
				    <label class="checkbox">
				      <input type="checkbox" required="true">
				      Eu li e concordo com os <a href="#">Termos de uso</a>
				    </label>
				  </div>
				</div>
				
				<div class="field is-grouped">
				  <div class="control">
				    <button class="button is-link">Confirmar Cadastro</button>
				  </div>
				  <div class="control">
				    <a class="button is-text" href="index.jsp">Cancelar</a>
				  </div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>