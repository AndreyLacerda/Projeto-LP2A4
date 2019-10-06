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
	<div class="columns is-centered">
		<div class='column is-one-third is-centered'>
			<form method="post" action="Login">
			
				<div class="field">
				  <div class="control has-icons-left has-icons-right">
				    <input class="input" type="text" placeholder="Login" maxlength="45" required="true">
				    <span class="icon is-small is-left">
				      <i class="fas fa-user"></i>
				    </span>
				  </div>
				</div>
				<div class="field">
				  <p class="control has-icons-left">
				    <input class="input" type="password" placeholder="Senha" maxlength="45" required="true">
				    <span class="icon is-small is-left">
				      <i class="fas fa-lock"></i>
				    </span>
				  </p>
				</div>
				<div class="field is-grouped">
				  <div class="control">
				    <button class="button is-success">Entrar</button>
				  </div>
				  <div class="control">
				    <a class="button is-text" href="register.jsp">Crie uma Conta</a>
				  </div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>