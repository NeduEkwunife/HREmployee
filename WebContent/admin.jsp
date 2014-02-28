<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
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
.auto-style3 {
	text-align: left;
	margin-left: 0;
}
.auto-style4 {
	text-align: center;
}
.auto-style5 {
	text-align: center;
	color: #B532E5;
}
</style>
</head>
<body style="background-color: #E6B85C; ">
<div align="right"><a href="logout" id="logout"><p>Logout</p></a></div>
<div class="auto-style2">
<h3 class="auto-style5">WELCOME ADMIN,</h3>
	
	<p class="auto-style4">Please use the links below to navigate your way 
	through this application.<o:p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </o:p>
	</p>
<div align="center" id="menu">
<ul class="auto-style3" style="width: 514px">
<li class="auto-style2" style="left: 0px; top: 0px; height: 84px; width: 170px"><a href="ViewUsers" class="view">
<p>VIEW USERS</p></a>
<div class="auto-style4">
	&nbsp;&nbsp;</div>
	</li>
<li style="left: -1px; top: 0px; width: 171px"><a href="EditUsers" class="edit">
<p>EDIT USERS</p></a>
<div class="auto-style4">
	&nbsp;&nbsp;</div>
	</li>
<li><a href="adduser.jsp" class="add"><p>ADD USERS</p></a>
<div class="auto-style4">
	&nbsp;&nbsp;</div>
	</li>

	</div>
	

</body>
</html>