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
		<jsp:include page="includes/head.jsp"></jsp:include>
		<!-- Preloader  -->
		<div
			class="auth-wrapper d-flex no-block justify-content-center align-items-center position-relative"
			style="background: url(../assets/images/big/auth-bg.jpg) no-repeat center center;">
			<div class="auth-box row">
				<div class="col-lg-7 col-md-5 modal-bg-img"
					style="background-image: url(../assets/images/big/3.jpg);"></div>
				<div class="col-lg-5 col-md-7 bg-white">
					<div class="p-3">
						<div class="text-center">
							<img src="../assets/images/big/icon.png" alt="wrapkit">
						</div>
						<h2 class="mt-3 text-center">Ingreso al sistema</h2>

						<div class="row"></div>
						<form action='<c:url value="/dologin" />' method="post"
							modelAttribute="libro" class="mt-4">

							<div class="col-lg-12 text-center">
								<button type="submit" class="btn btn-block btn-dark">Ingresar
									🙏🏼</button>
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