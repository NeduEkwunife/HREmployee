<%@ page import="com.acn.training.model.Users, com.acn.training.model.Role, orm.com.acn.training.model.RoleDAO,
java.util.ArrayList, java.util.List, java.util.Arrays, org.orm.PersistentException "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update_user</title>
</head>
<body>
	<div align="center">
		<h3>UPDATE USER</h3>
	</div>
	<br>
	<br>
	<div align="center">
		<a href="ViewUsers">View Users</a>&nbsp;&nbsp; <a href="Home">Home</a>&nbsp;&nbsp;
		<a href="logout">Logout</a>
	</div>
	<br>
	<br>

	<div align="center">
		<form name='updateuser' action="DeleteUsers" method='POST'>
			<%
			List<Role> y = null;
			try {

				Role[] x = RoleDAO.listRoleByQuery(null, null);

				y = new ArrayList<Role>(Arrays.asList(x));

			} catch (PersistentException e1) {

				// TODO Auto-generated catch block

				e1.printStackTrace();

			}
					Users usr = (Users) request.getAttribute("userData");
					if (usr != null) {
			%>
			<table border="1" style="width: 300px">
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstname"
						value=<%=usr.getFirstname()%>></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastname"
						value=<%=usr.getLastname()%>></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" readonly name="email"
						value=<%=usr.getEmail()%>></td>
				</tr>
				<tr>
					<td>Enabled:</td>
					<td><input type="number" name="enabled" min="0" max="1"
						value=<%=usr.getEnabled()%>></td>
				</tr>
				<tr>
					<td>Role:</td>
					<td>
						<select name="role">
							<%for(Role rol : y) {%>
							<option <%= (rol.getName().equals(usr.getRole().getName()))?"selected":"" %>> 	
							<%= rol.getName() %>
							</option>
							<%} %>
					</select>
					</td>
				</tr>
				<tr>
					<td>Summary:</td>
					<td><input type="text" name="summary"
						value=<%=usr.getSummary()%>></td>
				</tr>
				<tr>
					<td>Available:</td>
					<td><input type="text" readonly name="available"
						value=<%=usr.getAvailable()%>></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="hidden" name="id" value=<%=usr.getId()%>><input
						type="submit" value="Submit"> <a href="EditUsers"> <input
							type="button" value="Cancel" />
					</a>
				</tr>
			</table>
			<%
				//close the if statement  
					}
			%>
		</form>
	</div>

	<%
		//get value sent by Delete user servlet  
			String name = request.getParameter("var1");
			if (name != null && name.equals("failure")) {
	%>
	<font color="red"><i>validation failed!</i></font>
	<%
		//close the if statement  
			}
	%>

</body>
</html>