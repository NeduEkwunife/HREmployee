<%@ page import="com.acn.training.model.Users, com.acn.training.utilities.Configs"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User Profile</title>
</head>
<body>
	<div align="center">
		<h3>USER PROFILE</h3>
	</div>
	<br>
	<br>
	<div align="center">
		<a href="EditUser">Edit Profile</a>&nbsp;&nbsp; <a href="Home">Home</a>&nbsp;&nbsp;
		<a href="logout">Logout</a>
	</div>
	<br>
	<br>

	<div align="center">
		
			<%
				Users usr = (Users) request.getAttribute("userProfile");
				String enabled = "false";
				String proj_name = "";
				String pic_path = "";
			   if(usr.getEnabled() == (byte)1) {
				   enabled = "true";
			   }
			   if(usr.getPicture() == null) {
				   pic_path = "images/default.png";
			   } else {
				   pic_path = "images/"  + usr.getId() + ".jpg";
			   }
			   if(usr.getProjects() == null) {
				   proj_name = "";  
			   } else {
				   proj_name = usr.getProjects().getName();
			   }
			   
				   
			%>
			<table border="1" style="width: 300px">
				<tr>
					<td>First Name:</td>
					<td><%=usr.getFirstname()%></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><%=usr.getLastname()%></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><%=usr.getEmail()%></td>
				</tr>
				<tr>
					<td>Enabled:</td>
					<td><%=enabled%></td>
				</tr>
				<tr>
					<td>Role:</td>
					<td><%=usr.getRole().getName()%></td>
				</tr>
				<tr>
					<td>Summary:</td>
					<td><%=usr.getSummary()%></td>
				</tr>
				<tr>
					<td>Assigned Project:</td>
					<td><%=proj_name%></td>
				</tr>
				<tr>
					<td>Available:</td>
					<td><%=usr.getAvailable()%></td>
				</tr>
				<tr>
					<td>Profile Picture:</td>
					<td><img src=<%=pic_path%> alt="" border=3 height=100 width=100></td>
				</tr>
			</table>
	</div>
</body>
</html>