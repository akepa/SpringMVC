<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<div class="navbar-wrapper">
	<div class="container">

		<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index">67 words</a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li
							<%-- Section index highlight--%>
							<c:if test="${section == 'index'}">
								class="active"
							</c:if>><a
							href="index">Home</a></li>
						<li
							<%-- Section about highlight--%>
							<c:if test="${section == 'about'}">
								class="active"
							</c:if>><a
							href="about">About</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Stories <span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<c:forEach items="${userStories}" var="story">
									<li><a href="<c:url value="/story?storyid=${story.value.id}"/>"><c:out
												value="${story.value.name}" /></a></li>
								</c:forEach>
								<li class="divider"></li>
								<li class="dropdown-header">Admin</li>
								<li><a href="#">Create new story</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>