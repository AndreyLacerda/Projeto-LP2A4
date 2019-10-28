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
					<div class="field">
						<label class="label">Nome</label>
						<div class="control has-icons-left">
							<input class="input" placeholder="Nome..." type="text" id="nome"> <span class="icon is-small is-left"><i class="fas fa-user"></i></span>
						</div>
					</div>
					<div class="field">
						<label class="label">Dificuldade</label>
						<div class="control">
							<div class="select" id="dificuldade">
								<select>
									<option>
										Fácil
									</option>
									<option>
										Normal
									</option>
									<option>
										Difícil
									</option>
									<option>
										Molina Mode (God Mode)
									</option>
								</select>
							</div>
						</div>
					</div>
					<div class="field">
						<label class="label">Gênero</label>
						<div class="control">
							<label class="radio"><input name="question" type="radio" id="M"> Masculino</label> <label class="radio"><input name="question" type="radio" id="F"> Feminino</label>
						</div>
					</div>
					<div class="field is-grouped">
						<div class="control">
							<button class="button is-link">Criar personagem</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="tile is-parent is-vertical"></div>
	</div>
</body>
</html>	