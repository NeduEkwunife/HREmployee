<%@ page import="com.acn.training.model.Users, com.acn.training.model.Role, orm.com.acn.training.model.RoleDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit user</title>
</head>
<body>
	<div align="center">
		<h3>EDIT USER</h3>
	</div>
	<br>
	<br>
	<div align="center">
		<a href="Home">Home</a>&nbsp;&nbsp; <a href="logout">Logout</a>
	</div>
	<br>
	<br>

	<div align="center">
		<%
				Users usr = (Users) request.getAttribute("userProfile");
				String pic_path = "";
			   
			   if(usr.getPicture() == null) {
				   pic_path = "images/default.png";
			   } else {
				   pic_path = "images/"  + usr.getId() + ".jpg";
			   } 
			%>
		<form name='uploadPicture' action="upload" method='POST'
			enctype="multipart/form-data">
			<table border="1" style="width: 300px">

				<tr>
					<td style="width:70%">Profile Picture:</td>
					<td style="width:30%"><img src=<%=pic_path%> alt="" border=3 height=100
						width=100><input type="file" name="file"> <input
						type="submit" value="Upload Picture"></td>
			</table>
		</form>
		<form name='edituser' action="EditUser" method='POST'>

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
						readonly value=<%=usr.getEnabled()%>></td>
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
						type="submit" value="Submit"> <a href="EditUser"> <input
							type="button" value="Cancel" />
					</a>
				</tr>
			</table>
		</form>



		<%
		//get value sent by EditUser user servlet  
			String name = request.getParameter("var1");
			if (name != null && name.equals("failure")) {
	%>
		<font color="red"><i>Cannot save file as picture!</i></font>
<%}//close the if %>
	</div>
</body>
</html>