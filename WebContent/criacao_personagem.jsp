<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html class="has-navbar-fixed-top" lang="pt-br">
<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1" name="viewport">
	<title>Simulador de Vida Real</title>
	<link href="bulma-0.7.5/css/bulma.css" rel="stylesheet">
	<link href="bulma-0.7.5/css/bulma.css.map" rel="stylesheet">
	<link href="bulma-0.7.5/css/bulma.min.css" rel="stylesheet">
	<script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js">
	</script>
</head>
<body>
	<nav class="level">
		<p class="level-item has-text-centered"><a class="title">Criação de Personagem</a></p>
	</nav>
	<div class="tile is-ancestor">
		<div class="tile is-vertical is-8">
			<div class="tile">
				<div class="tile is-parent is-vertical">
					<div class="tile is-parent"></div>
				</div>
				<div class="tile is-parent is-vertical">
					<div class="tile is-parent">
						<article class="tile is-child notification is-danger">
							<div class="field">
								<label class="label is-centered">Nome</label>
								<div class="control has-icons-left">
									<input class="input" placeholder="Nome..." type="text" required> <span class="icon is-small is-left"><i class="fas fa-user"></i></span>
								</div>
							</div>
							<div class="field" >
								<label class="label">Subject</label>
								<div class="control" >
									<div class="select">
										<select name="modo" required>
											<option value="facil">
												Fácil
											</option>
											<option value="medio">
												Normal
											</option>
											<option value="dificil">
												Difícil
											</option>
											<option value="god">
												Molina Mode (God Mode)
											</option>
										</select>
									</div>
								</div>
							</div>
							<div class="field">
								<div class="control">
									<label class="label">Gênero</label>
									<label class="radio"><input name="question" type="radio" value="M">Masculino</label> <label class="radio"><input name="question" type="radio" value="F">Feminino</label>
								</div>
							</div>
							<div class="field is-grouped">
  								<div class="control">
    								<button class="button is-link">Criar personagem</button>
  								</div>
  							</div>
						</article>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>