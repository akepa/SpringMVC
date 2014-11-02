<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Story roulette</title>

<!-- Bootstrap -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">


<style type="text/css">

/* Sticky footer styles
      -------------------------------------------------- */
html, body {
	height: 100%;
	/* The html and body elements cannot have any padding or margin. */
}

/* Wrapper for page content to push down footer */
#wrap {
	min-height: 100%;
	height: auto !important;
	height: 100%;
	/* Negative indent footer by it's height */
	margin: 0 auto -60px;
}

/* Set the fixed height of the footer here */
#push, #footer {
	height: 60px;
}

#footer {
	background-color: #f5f5f5;
}

/* Lastly, apply responsive CSS fixes as necessary */
@media ( max-width : 767px) {
	#footer {
		margin-left: -20px;
		margin-right: -20px;
		padding-left: 20px;
		padding-right: 20px;
	}
}

/* Custom page CSS
      -------------------------------------------------- */
/* Not required for template or sticky footer method. */
#wrap>.container {
	padding-top: 60px;
}

.container .credit {
	margin: 20px 0;
}

code {
	font-size: 80%;
}
</style>
</head>
<body>
	<!-- Part 1: Wrap all page content here -->
	<div id="wrap">

		<!-- Begin page content -->
		<div class="container">
			<div class="jumbotron vertical-center">
				<h1>
					Welcome<small> and enter your credentials...</small>
				</h1>
				<p>...and enter the most amazing webpage in the world</p>
				<%-- Warning if login is not correct --%>
				<c:if test="${authenticationResult == 'FAIL_USER_NOT_EXISTS'}">
					<div class="alert alert-warning" role="alert">
						<b>Warning. </b> The username is not valid.
					</div>
				</c:if>
				<c:if test="${authenticationResult == 'FAIL_WRONG_PASSWORD'}">
					<div class="alert alert-warning" role="alert">
						<b>Warning. </b> The password is not valid.
					</div>
				</c:if>
				<%-- Login form --%>
				<form class="form-horizontal" role="form" action="" method="post">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="inputEmail3"
								placeholder="Email" name="email">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPassword3"
								placeholder="Password" name="password">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<div class="checkbox">
								<label> <input type="checkbox"> Remember me
								</label>
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-primary">Sign in</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<div id="footer">
		<div class="container">
			<p class="muted credit">Developed by Adam Kepa.</p>
		</div>
	</div>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>

