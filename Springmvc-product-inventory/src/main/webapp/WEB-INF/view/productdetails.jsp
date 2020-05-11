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
	<a href="/Springmvc-product/welcome.jsp"> <----Go back to home page
	</a>
	<h1>Products List</h1>

	<table border="2" width="70%" cellpadding="4">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product price</th>
			<th>Product Final price</th>


		</tr>
		<c:forEach var="product" items="${list}">
			<tr>
				<td><a href="/Springmvc-product/editProduct/${product.pid }">${product.pid }</a></td>
				<td>${product.pname}</td>
				<td>${product.price}</td>
				<td>${product.finalprice}</td>




			</tr>
		</c:forEach>
	</table>
	<h4>Note: *Click on the pId to edit or delete the details</h4>
	<br />
	<br />
	<a href="/Springmvc-product/addProduct">Click here to add your
		product</a>
</body>
</html>