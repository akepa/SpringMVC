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
<!--  Common header in all the webpages -->
<jsp:include page="header.jsp" />

</body>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</html>
