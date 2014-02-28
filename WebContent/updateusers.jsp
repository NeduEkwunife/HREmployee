<%@ page import="com.acn.training.model.Users, com.acn.training.model.Role, orm.com.acn.training.model.RoleDAO,
java.util.ArrayList, java.util.List, java.util.Arrays, org.orm.PersistentException "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update_user</title>
<style type="text/css" media="screen">
#logout
{
	text-decoration:none;
	color:#6B2400;
	font-size:18px;
}
#menu ul
{
	margin:0;
	padding:0;
	list-style: none;
	font-family:"Myriad Pro", "Trebuchet MS", sans-serif;
	font-size:18px;
	width:1020px;
	
	
}

#menu a{
	text-decoration:none;
	outline:none;
	img-src:images/add-user.png;
}


li{
	float:left;
	width:170px;
	height:85px;
	position:relative;
	cursor:pointer;
	display:inline;
	
	
}
#menu a:link
{
	display:block;
	background-color:#6B2400;
	color:white;
	text-decoration:none;
	width:120px;
	height:120px;
	text-align:center;
	padding:4px;
	font-weight:bold;
	border-radius:25px;
	
}
a.add
{
	content:url('images/add-user.png');
}
a.edit
{
	content:url('images/edit-user.png');
}
a.view
{
	content:url('images/user.png');
}
a.home
{
	content:url('images/home.png');
}
#menu p
{
	margin-top:45px;
	color:white;
}
.auto-style2 {
	text-align: left;
}
.auto-style5 {
	text-align: center;
	color: #B532E5;
}
.auto-style9 {
	text-align: right;
	background-color: #D7D7D4;
}
.auto-style10 {
	background-color: #D7D7D4;
}
.auto-style11 {
	text-align: center;
	background-color: #D7D7D4;
}
.auto-style12 {
	background-color: #D1A1E3;
	font-size: medium;
	font-weight: bold;
}
</style>

</head>
<body style="background-color: #E6B85C; ">
<div align="right"><a href="logout" id="logout"><p>Logout</p></a></div>
<div class="auto-style2">
<h3 class="auto-style5">ADMIN -&gt; Edit Users -&gt; Update User</h3>
	
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
			<table border="1" style="width: 500px">
				<tr>
					<td class="auto-style11"><strong>First Name:</strong></td>
					<td class="auto-style10">
					<input type="text" name="firstname"
						value=<%=usr.getFirstname()%> style="width: 400px"></td>
				</tr>
				<tr>
					<td class="auto-style11"><strong>Last Name:</strong></td>
					<td class="auto-style10">
					<input type="text" name="lastname"
						value=<%=usr.getLastname()%> style="width: 400px"></td>
				</tr>
				<tr>
					<td class="auto-style11"><strong>Email:</strong></td>
					<td class="auto-style10"><input type="email" readonly name="email"
						value=<%=usr.getEmail()%> style="width: 400px"></td>
				</tr>
				<tr>
					<td class="auto-style11"><strong>Enabled:</strong></td>
					<td class="auto-style10"><input type="number" name="enabled" min="0" max="1"
						value=<%=usr.getEnabled()%> style="width: 400px"></td>
				</tr>
				<tr>
					<td class="auto-style11"><strong>Role:</strong></td>
					<td class="auto-style10">
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
					<td class="auto-style11"><strong>Summary:</strong></td>
					<td class="auto-style10">
					<input type="text" name="summary"
						value=<%=usr.getSummary()%> style="width: 400px" ></td>
				</tr>
				<tr>
					<td class="auto-style11"><strong>Available:</strong></td>
					<td class="auto-style10">
					<input type="text" readonly name="available"
						value=<%=usr.getAvailable()%> style="width: 400px"></td>
				</tr>
				<tr>
					<td class="auto-style11"></td>
					<td class="auto-style9"><input type="hidden" name="id" value=<%=usr.getId()%>>
					<strong>
					<input
						type="submit" value="Submit" class="auto-style12"></strong> <a href="EditUsers"> 
					<strong> 
					<input
							type="button" value="Cancel" class="auto-style12" /></strong>
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