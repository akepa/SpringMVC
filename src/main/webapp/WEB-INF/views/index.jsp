<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>MiProyecto</title>
<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
	
	
<!-- //////// Custom CSS ////////-->	
<style type="text/css">
body {
	padding-top: 70px;
}
.main_page_item{
	margin-top: 50px;
    margin-bottom: 100px;
    margin-right: 150px;
    margin-left: 150px;
}
</style>

</head>
<body>
<!--  Common header in all the webpa -->
<jsp:include page="header.jsp" />


	<div class="main_page_item">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Welcome to 67 words</h3>
			</div>
			<div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer venenatis gravida enim, sit amet pharetra dolor imperdiet eget. Etiam tincidunt ex sit amet condimentum mattis. Integer et viverra neque. Sed rutrum nulla et ante tempus, et congue tellus rhoncus. Pellentesque libero mauris, accumsan eu risus vitae, semper dignissim dui. Sed mattis mi vitae magna ornare sagittis. Duis semper nisi ac augue tincidunt vestibulum. Aenean dignissim porta urna, pulvinar luctus erat ultrices nec. Pellentesque ut diam diam. Pellentesque malesuada metus eget lacus porta, et imperdiet arcu pellentesque. Proin condimentum hendrerit vehicula. Ut mollis mollis condimentum. In ultrices porttitor purus, vel pretium justo pharetra vitae.</div>
		</div>
	</div>
	
	<!--  Debug   -->
	<div class="container">
		<P>Taking the message from the bean: ${message}.</P>
		<p>
			Taking the email from the url:
			<%=request.getParameter("email")%></p>
		<p>
			Taking the password from the url:
			<%=request.getParameter("password")%></p>
	</div>


</body>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</html>
