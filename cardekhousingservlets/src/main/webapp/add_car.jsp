<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<form action="add_car" method="post">
			<table>
				<tr>
					<td>Id</td>
					<td><input type="text" name="id"></td>
				</tr>

				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Brand</td>
					<td><input type="text" name="brand"></td>
				</tr>

				<tr>
					<td>Price</td>
					<td><input type="text" name="price"></td>
				</tr>
			</table>
			<input type="submit" value="submit">


		</form>

		<%!String message;%>

		<h1>
			<%
			message = (String) request.getAttribute("message");
			%>
		</h1>
		<%
		if (message != null) {
		%>
		<h1><%=message%></h1>

		<%
		}
		%>
	</div>

</body>
</html>