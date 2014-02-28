<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Added Skills</title>
<style type="text/css">
body
{
	color:#6B2400;
}
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
}
a.add
{
	content:url('images/add-skill.png');
}
a.edit
{
	content:url('images/edit-profile.png');
}
a.view
{
	content:url('images/user.png');
}
a.home
{
	content:url('images/profile.png');
}
#menu p
{
	margin-top:45px;
	color:white;
}
.auto-style3 {
	text-align: left;
	margin-left: 0;
}
#headerfix {
    height: 40px;
    background-color:#6B2400;
    border-bottom: 3px solid black;
    z-index: 99999;
    width: 1000px;
    float:right;
    margin-left:330px;
}
p
{
	color:white;
	margin-left:30px;
	font-size:20px;
	text-align:center;
}
#hello
{
	margin-left:50px;
}
#menu
{
	margin-left:20px;
	width:300px;
}
#feed
{
	
	float:right;
	margin:0px;
	padding:0px;
	
}
iframe.frame
{
	color:#6B2400;
	background-color: #FFFFCC;
}
a.feed-item-title
{
color:#6B2400;
}
td 
{
    border:none;
}
td.heading
{
	font-weight:bold;
}
.auto-style6 {
	color: #AB4BCE;
	text-align: right;
}
.auto-style8 {
	text-align: center;
}
.auto-style9 {
	text-align: left;
}
.auto-style10 {
	background-color: #D7D7D4;
}
</style>
</head>
<body style="background-color: #E6B85C; ">
<div class="auto-style8"><a href="logout" id="logout"><p class="auto-style6">Logout</p>
	</a></div>
<div class="auto-style8">
<div align="center" id="menu">
<ul class="auto-style3" style="width: 514px">

<li><a href="ViewProfile" class="home"><p class="auto-style8">VIEW PROFILE</p></a>
<div class="auto-style8">
	&nbsp;&nbsp;</div>
	</li>
<li style="left: -1px; top: 0px; width: 171px"><a href="EditUser" class="edit">
<p class="auto-style8">ADD SKILLS</p></a>
	</div>
<br>
	<div align="center">
	<br><br><br><br><br><br>
		<h3 class="auto-style9">ADDED SKILLS</h3>
	</div>
	<div align="center">

		<table border="1" style="width: 465px" align="left" class="auto-style10">
			<tr>
				<th class="auto-style8" style="width: 154px">Skill name</th>
				<th class="auto-style8" style="width: 143px">Action</th>
			</tr>
			<c:forEach var="element" items="${skillsData}">
				<tr>
					<td class="auto-style8" style="width: 154px">${element.skill_name}</td>
					
					<td class="auto-style8" style="width: 143px"><a href=""
						Onclick="return confirm('Are you sure want to delete?')">Remove</a>&nbsp;&nbsp;
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>