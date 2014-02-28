<%@ page
	import="com.acn.training.model.Users, com.acn.training.model.Role, orm.com.acn.training.model.RoleDAO, com.acn.training.utilities.Configs"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit user</title>
<style type="text/css">
body {
	color: #6B2400;
}

#logout {
	text-decoration: none;
	color: #6B2400;
	font-size: 18px;
}

#menu ul {
	margin: 0;
	padding: 0;
	list-style: none;
	font-family: "Myriad Pro", "Trebuchet MS", sans-serif;
	font-size: 18px;
	width: 1020px;
}

#menu a {
	text-decoration: none;
	outline: none;
	img-src: images/add-user.png;
}

li {
	float: left;
	width: 170px;
	height: 85px;
	position: relative;
	cursor: pointer;
	display: inline;
}

#menu a:link {
	display: block;
	background-color: #6B2400;
	color: white;
	text-decoration: none;
	width: 120px;
	height: 120px;
	text-align: center;
	padding: 4px;
	font-weight: bold;
	border-radius: 25px;
}

}
a.add {
	content: url('images/add-skill.png');
}

a.edit {
	content: url('images/edit-profile.png');
}

a.view {
	content: url('images/user.png');
}

a.home {
	content: url('images/profile.png');
}

#menu p {
	margin-top: 45px;
	color: white;
}

#headerfix {
	height: 40px;
	background-color: #6B2400;
	border-bottom: 3px solid black;
	z-index: 99999;
	width: 1000px;
	float: right;
	margin-left: 330px;
}

p {
	color: white;
	margin-left: 30px;
	font-size: 20px;
	text-align: center;
}

#hello {
	margin-left: 50px;
}

#menu {
	margin-left: 20px;
	width: 300px;
}

#feed {
	float: right;
	margin: 0px;
	padding: 0px;
}

iframe.frame {
	color: #6B2400;
	background-color: #FFFFCC;
}

a.feed-item-title {
	color: #6B2400;
}

td {
	border: none;
}

td.heading {
	font-weight: bold;
}

.auto-style6 {
	color: #AB4BCE;
	text-align: right;
}

.auto-style8 {
	text-align: center;
}

.auto-style10 {
	text-align: right;
	background-color: #D7D7D4;
}

.auto-style11 {
	background-color: #D7D7D4;
}

.auto-style12 {
	text-align: center;
	background-color: #D7D7D4;
}

.auto-style13 {
	font-weight: bold;
	font-size: medium;
	background-color: #E2BFEE;
}
</style>
</head>
<body style="background-color: #E6B85C;">
	<div class="auto-style8">
		<a href="logout" id="logout"><p class="auto-style6">Logout</p> </a>
	</div>
	<div class="auto-style8">
		<div align="center">
			<h3>EDIT USER</h3>
		</div>

		<div align="center">
			<%
				Users usr = (Users) request.getAttribute("userProfile");
				String pic_path = "";

				if (usr.getPicture() == null || usr.getPicture().equals("") || request.getAttribute("userProfile") == null) {
					pic_path = "images/default.png";
				} else {
					pic_path = "images/" + usr.getId() + ".jpg";
				}
			%>
			<form name='uploadPicture' id='uploadPicture' action="upload"
				method='POST' enctype="multipart/form-data">
				<table border="1" style="width: 487px">

					<tr>
						<td style="width: 64%"><strong>Profile Picture:</strong></td>
						<td style="width: 43%"><img src=<%=pic_path%> alt="" border=3
							height=108 width=149><input type="file" name="file"
							onchange="myFunction()"></td>
				</table>
			</form>

			<script>
				function myFunction() {

					document.getElementById('uploadPicture').submit();

				}
			</script>

			<form name='edituser' action="EditUser" method='POST'>

				<table border="1" style="width: 500px">
					<tr>
						<td class="auto-style11"><strong>First Name:</strong></td>
						<td class="auto-style12"><input type="text" name="firstname"
							value=<%=usr.getFirstname()%> style="width: 400px"></td>
					</tr>
					<tr>
						<td class="auto-style11"><strong>Last Name:</strong></td>
						<td class="auto-style11"><input type="text" name="lastname"
							value=<%=usr.getLastname()%> style="width: 400px"></td>
					</tr>
					<tr>
						<td class="auto-style11"><strong>Email:</strong></td>
						<td class="auto-style11"><input type="email" readonly
							name="email" value=<%=usr.getEmail()%> style="width: 400px"></td>
					</tr>
					<tr>
						<td class="auto-style11"><strong>Enabled:</strong></td>
						<td class="auto-style11"><input type="number" name="enabled"
							min="0" max="1" readonly value=<%=usr.getEnabled()%>
							style="width: 400px"></td>
					</tr>

					<tr>
						<td class="auto-style11"><strong>Summary:</strong></td>
						<td class="auto-style11"><input type="text" name="summary"
							value=<%=usr.getSummary()%> style="width: 400px"></td>
					</tr>
					<tr>
						<td class="auto-style11"><strong>Available:</strong></td>
						<td class="auto-style11"><input type="text" readonly
							name="available" value=<%=usr.getAvailable()%>
							style="width: 400px"></td>
					</tr>
					<tr>
						<td class="auto-style11"></td>
						<td class="auto-style10"><input type="hidden" name="id"
							value=<%=usr.getId()%>> <strong> <input
								type="submit" value="Submit" class="auto-style13"></strong> <strong>
								<a href="ViewProfile"> <input type="button"
									value="Cancel" class="auto-style13"/>
							</a>
						</strong> 
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