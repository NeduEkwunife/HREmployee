<%@ page
	import="com.acn.training.model.Users, com.acn.training.utilities.Configs, java.io.File"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User Profile</title>
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

a.new {
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

.auto-style2 {
	text-align: left;
}

.auto-style3 {
	text-align: left;
	margin-left: 0;
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

.auto-style7 {
	text-align: right;
}

.auto-style8 {
	text-align: center;
}
</style>
</head>
<body style="background-color: #E6B85C;">
	<div align="right">
		<a href="logout" id="logout"><p class="auto-style6">Logout</p> </a>
	</div>
	<div class="auto-style7">
		<div align="center" id="menu">
			<ul class="auto-style3" style="width: 514px">

				<li><a href="EditUser" class="edit"><p class="auto-style8">EDIT
							PROFILE</p></a>
					<div class="auto-style8">&nbsp;&nbsp;</div></li>
				<li style="left: -1px; top: 0px; width: 171px"><a
					href="AddedSkills" class="new">
						<p class="auto-style8">ADD SKILLS</p>
				</a>
		</div>
		<div class="auto-style8">
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
		</div>
		<div align="left" id="hello">
			<h3 class="auto-style2" style="width: 815px">
			<%
				Users user =(Users) request.getAttribute("userProfile");%>
				Welcome <%=user.getFirstname()%>
			</h3>
		</div>
		<div id="headerfix">
			<p>Accenture News Feed</p>
		</div>
		<br>
		<br>
		<br>
		<iframe frameborder="0" name="Accenture in the news !" class="frame"
			color="#6B2400" width="1000" height="700" align="right"
			src="http://rss.bloople.net/?url=https%3A%2F%2Fnews.google.co.uk%2Fnews%2Ffeeds%3Fpz%3D1%26cf%3Dall%26ned%3Duk%26hl%3Den%26q%3DAccenture%26output%3Drss&detail=200&limit=5&showtitle=false&striphtml=true&type=html">
		</iframe>
		<div align="left" id="menu">
			<%
				String img_path = "";
					if(request.getAttribute("userProfile") == null || user.getPicture() == null || user.getPicture().equals("")) {
					   img_path = "images/default.png";
					}
					else if(user.getPicture() != null) 
				{
					   img_path = "images/"  + user.getId() + ".jpg";
				 }
			%>
			<img src=<%=img_path%> alt="" border=3 height=150 width=150>
			<table border="1"
				style="width: 300px; border: 0px; background-color: #6B2400; height: 300px; color: #FFFFCC;">
				<tr style="border: none">
					<td class="heading">Name:</td>
					<td><%=user.getFirstname()+" "+ user.getLastname()%></td>
				</tr>
				<tr>
					<td class="heading">Email:</td>
					<td><%=user.getEmail()%></td>
				</tr>
				<tr>
					<td class="heading">Enabled:</td>
					<td>
						<%
							String enabled="false";
								      if(user.getEnabled() == (byte)1) {
							   		enabled = "true";
								   	   }
						%><%=enabled%></td>
				</tr>
				<tr>
					<td class="heading">Role:</td>
					<td><%=user.getRole().getName()%></td>
				</tr>
				<tr>
					<td class="heading">Summary:</td>
					<td><%=user.getSummary()%></td>
				</tr>
				<tr>
					<td class="heading">Assigned Project:</td>
					<td>
						<%
							String proj_name="";
									if(user.getProjects() != null) 
									{
								   		proj_name = user.getProjects().getName();
							   		}
						%><%=proj_name%></td>
				</tr>
				<tr>
					<td class="heading">Available:</td>
					<td><%=user.getAvailable()%></td>
				</tr>
			</table>
		</div>
		<div align="right" id="feed"></div>
		<br>
		<br>
</body>
</html>