<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html class="has-navbar-fixed-top" lang="pt-br">
<head>
	<meta charset="utf-8">
	<meta content="width=device-width, initial-scale=1" name="viewport">
	<title>Simulador de Vida Real</title>
	<link rel="stylesheet" href="css/bulma-0.7.5/css/bulma.css">
    <link rel="stylesheet" href="css/bulma-0.7.5/css/bulma.css.map">
    <link rel="stylesheet" href="css/bulma-0.7.5/css/bulma.min.css">
	<script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js">
	</script>
</head>
<body>
<%@ include file="../topo.jsp" %>
	<div class="columns is-centered">
		<div class='column is-one-third is-centered'>
		<nav class="level">
			<p class="level-item has-text-centered"><a class="title">Criação de Personagem</a></p>
		</nav>
		<form method="post" action="CriacaoPersonagem">
		<div class="tile is-ancestor">
			<div class="tile is-vertical is-8">
				<div class="tile">
					<div class="tile is-parent is-vertical">
						<div class="tile is-parent"></div>
					</div>
					<div class="tile is-parent is-vertical">
						<div class="tile is-parent">
							<article class="tile is-child notification is-danger">
								<div class="field" >
									<label class="label">Subject</label>
									<div class="control" >
										<div class="select">
											<select name="modo" required>
												<option value="1">Fácil</option>										
												<option value="2">Molina Mode (God Mode)</option>
											</select>
										</div>
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
	</form>
	</div>
	</div>
</body>
</html>