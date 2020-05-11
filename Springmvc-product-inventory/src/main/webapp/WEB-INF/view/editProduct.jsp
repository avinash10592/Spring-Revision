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
	<h1>Edit Product Details</h1>
	<form:form method="POST" action="/Springmvc-product/editProduct">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="pid" /></td>
			</tr>
			<tr>
				<td>Product Name :</td>
				<td><form:input path="pname" /></td>
			</tr>
			<tr>
				<td>Price :</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Finalprice :</td>
				<td><form:input path="finalprice" /></td>

			</tr>

			<tr>
				<td><input type="submit" value="Edit Save" /></td>
			</tr>

			<td><a href="Springmvc-product/deleteProduct/${product.pid}">Delete</a></td>
		</table>
	</form:form>
	<br />
	<a href="/Springmvc-product/welcome"> <----Go back to home page </a>


</body>
</html>