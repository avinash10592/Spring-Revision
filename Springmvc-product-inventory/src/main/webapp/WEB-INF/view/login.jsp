<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>


	<form action="login" method="GET">
		<pre>
		 <strong>Login Here | <a href="register">Click here to Register</a></strong>
		
		User Id: <input type="text" name="userId" />
	
		Password: <input type="password" name="password" />

		<input type="submit" value="Login" />
		</pre>
	</form>
	${msg}
</body>
</html>