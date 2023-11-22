<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.Door" %>
    <%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>All Watches Page</h1>
	<% ArrayList<Door> doors = (ArrayList<Door>) request.getAttribute("doors"); %>
	<p>Number of Doors: <%= doors.size() %></p>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Material</th>
			<th>Height</th>
			<th>Width</th>
			<th>Date</th>
			
		</tr>
		<%for(Door d: doors) {%>
			<tr>
				<td><a href="doors/<%= d.getId() %>"><%= d.getId() %></a></td>
				<td><%= d.getMaterial() %></td>
				<td><%= d.getHeight() %></td>
				<td><%= d.getWidth() %></td>
				<td><%= d.getDate() %></td>
			</tr>
		<% } %>
	</table>








</table>
</body>
</html>