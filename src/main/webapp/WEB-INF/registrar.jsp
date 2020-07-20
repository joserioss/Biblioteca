<!-- Todas las dependencias para el uso de jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Todas las dependencias para el uso de jsp #-->

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

						<h2 class="mt-3 text-center">Regista un libro</h2>

						<form class="mt-4" modelAttribute="libro" action='<c:out value="/libro" />'
							method="post">

							<div class="row">
								<div class="col-lg-12">
									<div class="form-group">
										<input type="hidden" id="id" name="id" value="1" />
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-lg-12">
									<div class="form-group">
										<input class="form-control" type="text" id="titulo"
											name="titulo" placeholder="ingrese titulo del libro">
									</div>
								</div>
								<div class="col-lg-12">
									<div class="form-group">
										<input class="form-control" type="text" id="autor"
											name="autor" placeholder="ingrese autor del libro">
									</div>
								</div>
								<div class="col-lg-12">
									<div class="form-group">
										<input class="form-control" type="text" id="imprenta"
											name="imprenta" placeholder="ingrese imprenta del libro">
									</div>
								</div>
								<div class="col-lg-12">
									<div class="form-group">
										<input class="form-control" type="text" id="anio_pub"
											name="anio_pub"
											placeholder="ingrese año de publicacion del libro">
									</div>
								</div>


								<div class="col-lg-12 text-center">
									<button type="submit" class="btn btn-block btn-dark">Ingresar</button>
								</div>

								<div class="col-lg-12 text-center mt-5"></div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- footer scripts -->
	<jsp:include page="includes/footerscripts.jsp"></jsp:include>
	<!-- footer scripts -->
</body>

</html>