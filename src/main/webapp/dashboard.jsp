<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
response.setHeader("Cache-Control", "no-cache"); //Forces caches to obtain a new copy of the page from the origin server
response.setHeader("Cache-Control", "no-store"); //Directs caches not to store the page under any circumstance
response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
response.setHeader("Pragma", "no-cache"); //HTTP 1.0 backward compatibility
%>
<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

<link href="Assets/Libraries/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap -->

<link rel="stylesheet" href="Assets/Fonts/font.css">
<!-- font -->
<link rel="stylesheet"
	href="Assets/Libraries/datatable/datatables.min.css">
<!--  datatable -->
<link rel="stylesheet" href="Assets/CSS/dashboard.css">
</head>
<body>
	<c:if test="${sessionScope.admin != null}">
		<jsp:include page="header.jsp"></jsp:include>

		<div class="container">
			<nav class="text-right">
				<a href="registration.jsp" class="btn btn-success">Add User</a> <a
					href="LogoutController" class="btn btn-danger">Logout</a>
			</nav>
			<br>
			<table id="users-table" class="table table-striped">
				<!-- cell-border hover stripe -->
				<!-- Table for data -->
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Phone</th>
						<th>Gender</th>
						<th>Game</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
					<!-- Headings -->
				</thead>
				<tbody>
				</tbody>
			</table>
			<form class="form-inline" action="UsersController" method="post"
				enctype="multipart/form-data">
				<input type="file" name="excelFile" class="btn-primary form-control"> 
				<input type="submit" value="Import Users"
					class="btn btn-success btn-lg">
			</form>

		</div>
		<jsp:include page="footer.html"></jsp:include>
	</c:if>
	<c:if test="${sessionScope.admin == null}">
		<c:redirect url="index.jsp" />
	</c:if>
	<script src="Assets/JS/jquery-3.6.0.min.js"></script>
	<!-- jquery -->
	<script src="Assets/Libraries/bootstrap/js/bootstrap.min.js"></script>
	<!--  bootstrap -->
	<script src="Assets/Libraries/datatable/datatables.min.js"></script>
	<!-- datatable -->
	<script src="Assets/JS/dashboard.js"></script>
</body>
</html>