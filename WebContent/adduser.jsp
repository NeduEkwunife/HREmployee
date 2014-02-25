<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>ADD USERS</h3>
</div><br><br>
	
	<div align="center">
	<a href="ViewUsers">View Users</a>&nbsp;&nbsp;
	<a href="Home">Home</a>&nbsp;&nbsp;
	<a href="logout">Logout</a><br><br>
	</div>

	<div align="center">
	<form name='registration' action="Registration" method='POST'>
	<table border="1" style="width: 100px">
	<tr><td>Name:</td><td><input type="text" name="name"></td></tr>
	<tr><td>Email:</td><td> <input type="text" name="email"></td></tr>
	<tr><td>Password:</td><td><input type="password" name="password"></td></tr>
	<tr><td></td><td><input type="submit" value="Submit"></td></tr>
	</table>
	</form>
	<% //get value sent by Registration servlet  
   String name = request.getParameter("var1"); 
   if (name != null && name.equals("success")){ %>
	<font color="red"><i>the data was saved correctly</i></font>
	<% //close the if statement  
   } 
   if (name != null && name.equals("failure")){ %>
	<font color="red"><i>the data was not saved! Empty
			parameters</i></font>
	<%
   } %>
   </div>
</body>
</html>