<%@ page import="Config.Conexion" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html lang="es">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Registrar funcion</title>
	<link rel="stylesheet" href="recursos/css/normalize.css">
	<link rel="stylesheet" href="recursos/css/sweetalert2.css">
	<link rel="stylesheet" href="recursos/css/material.min.css">
	<link rel="stylesheet" href="recursos/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="recursos/css/jquery.mCustomScrollbar.css">
	<link rel="stylesheet" href="recursos/css/main.css">
	<script src="recursos/js/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="recursos/js/jquery-1.11.2.min.js"><\/script>')</script>
	<script src="recursos/js/material.min.js" ></script>
	<script src="recursos/js/sweetalert2.min.js" ></script>
	<script src="recursos/js/jquery.mCustomScrollbar.concat.min.js" ></script>
	<script src="recursos/js/main.js" ></script>
</head>
<body>
	<!-- navLateral -->
	<section class="full-width navLateral">
		<div class="full-width navLateral-bg btn-menu"></div>
		<div class="full-width navLateral-body">
			<div class="full-width navLateral-body-logo text-center tittles">
				<i class="zmdi zmdi-close btn-menu"></i> CINE JUNGLA
			</div>
			<figure class="full-width navLateral-body-tittle-menu">
				<div>
					<img src="recursos/css/img/avatar-male.png" alt="Avatar" class="img-responsive">
				</div>
				<figcaption>
					<span>
						<small>Director</small>
					</span>
				</figcaption>
			</figure>
			<nav class="full-width">
				<ul class="full-width list-unstyle menu-principal">
					<li class="full-width">
						<a href="#!" class="full-width btn-subMenu">
							<div class="navLateral-body-cl">
								<i class="zmdi zmdi-camera-alt"></i>
							</div>
							<div class="navLateral-body-cr">
								FUNCIONES
							</div>
							<span class="zmdi zmdi-chevron-left"></span>
						</a>
						<ul class="full-width menu-principal sub-menu-options">
							<li class="full-width">
								<a href="Controlador?accion=registrarFuncion" class="full-width">
									<div class="navLateral-body-cl">
										<i class="zmdi zmdi-tv-play"></i>
									</div>
									<div class="navLateral-body-cr">
										REGISTRAR FUNCION
									</div>
								</a>
							</li>
							<li class="full-width">
								<a href="Controlador?accion=consultarFuncionD" class="full-width">
									<div class="navLateral-body-cl">
										<i class="zmdi zmdi-tv-list"></i>
									</div>
									<div class="navLateral-body-cr">
										CONSULTAR FUNCION
									</div>
								</a>
							</li>
						</ul>
					</li>
					<li class="full-width divider-menu-h"></li>
					<li class="full-width">
						<a href="#!" class="full-width btn-subMenu">
							<div class="navLateral-body-cl">
								<i class="zmdi zmdi-camera"></i>
							</div>
							<div class="navLateral-body-cr">
								PELICULAS
							</div>
							<span class="zmdi zmdi-chevron-left"></span>
						</a>
						<ul class="full-width menu-principal sub-menu-options">
							<li class="full-width">
								<a href="Controlador?accion=registrarPelicula" class="full-width">
									<div class="navLateral-body-cl">
										<i class="zmdi zmdi-camera-roll"></i>
									</div>
									<div class="navLateral-body-cr">
										REGISTRAR PELICULA
									</div>
								</a>
							</li>
							<li class="full-width">
								<a href="client.html" class="full-width">
									<div class="navLateral-body-cl">
										<i class="zmdi zmdi-videocam-off"></i>
									</div>
									<div class="navLateral-body-cr">
										INHABILITAR PELICULA
									</div>
								</a>
							</li>
						</ul>
					</li>
					<li class="full-width divider-menu-h"></li>
					<li class="full-width">
						<a href="#!" class="full-width btn-subMenu">
							<div class="navLateral-body-cl">
								<i class="zmdi zmdi-star"></i>
							</div>
							<div class="navLateral-body-cr">
								GESTI??N DE MULTIPLEX
							</div>
							<span class="zmdi zmdi-chevron-left"></span>
						</a>
						<ul class="full-width menu-principal sub-menu-options">
							<li class="full-width">
								<a href="Controlador?accion=registrarSala" class="full-width">
									<div class="navLateral-body-cl">
										<i class="zmdi zmdi-cast"></i>
									</div>
									<div class="navLateral-body-cr">
										REGISTRAR SALA
									</div>
								</a>
							</li>
							<li class="full-width">
								<a href="Controlador?accion=registrarMultiplex" class="full-width">
									<div class="navLateral-body-cl">
										<i class="zmdi zmdi-star-circle"></i>
									</div>
									<div class="navLateral-body-cr">
										REGISTRAR MULTIPLEX
									</div>
								</a>
							</li>
						</ul>
					</li>
					<li class="full-width divider-menu-h"></li>
					<li class="full-width">
						<a href="Controlador?accion=registrarUsuario" class="full-width">
							<div class="navLateral-body-cl">
								<i class="zmdi zmdi-accounts-alt"></i>
							</div>
							<div class="navLateral-body-cr">
								REGISTRAR EMPLEADO
							</div>
						</a>
					</li>
				</ul>
			</nav>
		</div>
	</section>
	<!-- pageContent -->
	<section class="full-width pageContent">
		<!-- navBar -->
		<div class="full-width navBar">
			<div class="full-width navBar-options">
				<i class="zmdi zmdi-swap btn-menu" id="btn-menu"></i>	
				<div class="mdl-tooltip" for="btn-menu">Hide / Show MENU</div>
				<nav class="navBar-options-list">
					<ul class="list-unstyle">
						<li class="btn-exit" id="btn-exit">
							<i class="zmdi zmdi-power"></i>
							<div class="mdl-tooltip" for="btn-exit">LogOut</div>
						</li>
						<li class="text-condensedLight noLink" ><small>User Name</small></li>
						<li class="noLink">
							<figure>
								<img src="recursos/css/img/avatar-male.png" alt="Avatar" class="img-responsive">
							</figure>
						</li>
					</ul>
				</nav>
			</div>
		</div>
		<div class="full-width divider-menu-h"></div>
		<div class="mdl-grid">
			<div class="mdl-cell mdl-cell--12-col">
				<div class="full-width panel mdl-shadow--2dp">
					<div class="full-width panel-tittle bg-primary text-center tittles">
						Nueva funci??n
					</div>
					<div class="full-width panel-content">
						<form action="Controlador">
							<div class="mdl-grid">
								<div class="mdl-cell mdl-cell--12-col">
		                            <legend class="text-condensedLight"><i class="zmdi zmdi-border-color"></i> &nbsp; DATOS DE LA FUNCI??N</legend><br>
		                        </div>
								<div class="mdl-cell mdl-cell--12-col">
									<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
										<select name="idPelicula" id="idPelicula" class="mdl-textfield__input">
											<option value="">Seleccione la pel??cula</option>
											<%
												Conexion cn = new Conexion();
												Connection con;
												PreparedStatement ps;
												ResultSet rs;

												String sql = "select k_pelicula, n_titulo from peliculas";
												try {
													con = cn.getConnection();
													ps = con.prepareStatement(sql);
													rs = ps.executeQuery();

													while (rs.next()) {
														out.println("<OPTION VALUE=\""+ rs.getString(1) +"\">"+ rs.getString(2) +"</OPTION>");
													}

												}catch (Exception e){
													System.out.println(e);
												}
											%>
										</select>
									</div>
								</div>
								<div class="mdl-cell mdl-cell--12-col">
									<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
										<select name="idSala" id="idSala" class="mdl-textfield__input">
											<option value="">Seleccione la sala</option>
											<%
												Conexion cn2 = new Conexion();
												Connection con2;
												PreparedStatement ps2;
												ResultSet rs2;

												String sql2 = "select k_sala, n_sala from salas";
												try {
													con2 = cn2.getConnection();
													ps2 = con2.prepareStatement(sql2);
													rs2 = ps2.executeQuery();

													while (rs2.next()) {
														out.println("<OPTION VALUE=\""+ rs2.getString(1) +"\">"+ rs2.getString(2) +"</OPTION>");
													}

												}catch (Exception e){
													System.out.println(e);
												}
											%>
										</select>
									</div>
								</div>
								<div class="mdl-cell mdl-cell--6-col mdl-cell--8-col-tablet">
									<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
										<label class="" for="fechaHoraInicio">Seleccione la fecha y hora de inicio</label>
										<input class="mdl-textfield__input" type="datetime-local" id="fechaHoraInicio" name="fechaHoraInicio">
										<span class="mdl-textfield__error">Invalid name</span>
									</div>
								</div>
								<div class="mdl-cell mdl-cell--6-col mdl-cell--8-col-tablet">
									<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
										<label class="" for="fechaHoraFin">Seleccione la fecha y hora de fin</label>
										<input class="mdl-textfield__input" type="datetime-local" id="fechaHoraFin" name="fechaHoraFin">
										<span class="mdl-textfield__error">Invalid name</span>
									</div>
								</div>
							</div>
							<p class="text-center">
								<button type="submit" name="accion" value="registrarFuncion" class="mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored bg-primary" id="btn-addFuncion">
									<i class="zmdi zmdi-plus"></i>
								</button>
								<div class="mdl-tooltip" for="btn-addCompany">Registrar funci??n</div>
							</p>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>