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

.main_page_item {
	margin-top: 50px;
	margin-bottom: 100px;
	margin-right: 150px;
	margin-left: 150px;
}
</style>

</head>

<body>
	<!--  Common header in all the webpages -->
	<jsp:include page="header.jsp" />

	<div class="main_page_item">
		<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">
					<b> <c:out value="${story.name} " /></b>
				</h3>
			</div>
			<div class="panel-body">
				<c:forEach items="${story.storyTrunks}" var="trunk">
					<c:out value="${trunk.text} " />
				</c:forEach>
			</div>
		</div></div>
		<div class="container">
			<form name="addText" id="form-1" action="addText">
				<p>Words: X</p>
				<textarea class="form-control" rows="3"></textarea>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>



</body>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</html>