<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<title>CRUD Operators with Hibernate</title>
</head>
<body>

	<h3>Add Product</h3>
	${msg }
	<form method="post" action="${pageContext.request.contextPath }">
		<table>
			<tr>
				<td>Amount</td>
				<td><input type="text" name="amount"></td>
			</tr>
			<tr>
				<td>Desc</td>
				<td><input type="text" name="desc"></td>
			</tr>
			<tr>
				<td>Expense Type</td>
				<td><input type="text" name="expense"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>

</body>
</html>