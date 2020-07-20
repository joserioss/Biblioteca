<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html dir="ltr">

<head>
<jsp:include page="includes/head.jsp"></jsp:include>
</head>

<body>
	<div class="main-wrapper">
		<!-- Preloader  -->
		<jsp:include page="includes/preloader.jsp"></jsp:include>
		<!-- Preloader  -->

		<div
			class="auth-wrapper d-flex no-block justify-content-center align-items-center position-relative"
			style="background: url(../assets/images/big/auth-bg.jpg) no-repeat center center;">
			<div class="auth-box row text-center">
				<div class="col-lg-7 col-md-5 modal-bg-img"
					style="background-image: url(../assets/images/big/3.jpg);"></div>
				<div class="col-lg-5 col-md-7 bg-white">
					<div class="p-3">
						<img src="../assets/images/big/icon.png" alt="wrapkit">
						<h2 class="mt-3 text-center">Actualizar, también es gratis</h2>

						<form class="mt-4" modelAttribute="libro"
							action='<c:out value="/libro/actualizar" />' method="post">

							<div class="row">
								<div class="col-lg-12">
									<div class="form-group">
										<input type="hidden" id="id" name="id"
											value="<c:out value='${libroVo.getLibro().getId() }' />" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-lg-12">
									<div class="form-group">
										<input class="form-control" type="text" id="titulo"
											name="titulo" placeholder="titulo del libro"
											value="<c:out value='${libroVo.getLibro().getTitulo() }' />">
									</div>
								</div>

								<div class="col-lg-12"></div>
								<div class="form-group">
									<input class="form-control" type="text" id="autor" name="autor"
										placeholder="autor del libro"
										value="<c:out value='${libroVo.getLibro().getAutor() }' />">
								</div>

								<div class="col-lg-12">

									<div class="form-group">
										<input class="form-control" type="text" id="imprenta"
											name="imprenta" placeholder="imprenta del libro"
											value="<c:out value='${libroVo.getLibro().getImprenta() }' />">
									</div>
								</div>

								<div class="col-lg-12">

									<div class="form-group">
										<input class="form-control" type="text" id="anio_pub"
											name="anio_pub" placeholder="Año de publicacion del libro"
											value="<c:out value='${libroVo.getLibro().getAnio_pub() }' />">
									</div>
								</div>



								<div class="col-lg-12 text-center">
									<button type="submit" class="btn btn-block btn-dark">Actualizar</button>
								</div>


							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!-- ============================================================== -->
		<!-- Login box.scss -->
		<!-- ============================================================== -->
	</div>
	<!-- footer scripts -->
	<jsp:include page="includes/footerscripts.jsp"></jsp:include>
	<!-- footer scripts -->
</body>

</html>