<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<br />
	<a href="/Springmvc-product/index.jsp"> <-- Go back to HomePage</a>
	<br />

	<h1>Products List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product price</th>
			<th>Product Final price</th>


		</tr>
		<c:forEach var="product" items="${list}">

			<tr>
				<td>${product.pid }</td>
				<td>${product.pname}</td>
				<td>${product.price}</td>
				<td>${product.finalprice}</td>



			</tr>
		</c:forEach>
	</table>


	<br />
	<br />
	<br />
	<a href="/Springmvc-product/login">Login to your Admin account to
		Edit/Add products in the inventory</a>





</body>
</html>