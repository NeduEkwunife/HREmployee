<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
.auto-style6 {
	text-align: right;
}
.auto-style7 {
	font-size: medium;
	font-weight: bold;
}
</style>

</head>
<body style="background-color: #E6B85C; ">
<div align="right"><a href="logout" id="logout"><p>Logout</p></a></div>
<div class="auto-style2">
<h3 class="auto-style5">ADMIN -&gt; Add Users</h3>
	
	<p class="auto-style4">Please use the links below to navigate your way 
	through this application.<o:p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </o:p>
	</p>
<div align="center" id="menu">
<ul class="auto-style3" style="width: 514px">

<li><a href="admin.jsp" class="home"><p>HOME</p></a>&nbsp;&nbsp;</li>
<li class="auto-style2" style="left: 0px; top: 0px; height: 84px; width: 170px"><a href="ViewUsers" class="view">
<p>VIEW USERS</p></a>
<div class="auto-style4">
	&nbsp;&nbsp;</div>
<li style="left: -1px; top: 0px; width: 171px"><a href="EditUsers" class="edit">
<p>EDIT USERS</p></a>
<div class="auto-style4">
	&nbsp;&nbsp;</div>
	</li>

	</div>
	<br><br>	<br><br>	<br><br>	<br><br><br>

	
	<div align="center">
	<form name='registration' action="Registration" method='POST'>
	<table border="1" style="width: 400px">
	<tr><td style="width: 103px"><strong>Name:</strong></td><td>
		<input type="text" name="name" style="width: 280px"></td></tr>
	<tr><td style="width: 103px"><strong>Email:</strong></td><td> 
		<input type="text" name="email" style="width: 280px"></td></tr>
	<tr><td style="width: 103px"><strong>Password:</strong></td><td>
		<input type="password" name="password" style="width: 280px"></td></tr>
	<tr><td style="width: 103px"></td><td class="auto-style6"><strong>
		<input type="submit" value="Submit" class="auto-style7"></strong></td></tr>
	</table>
	</form>
	<% //get value sent by Registration servlet  
   String name = request.getParameter("var1"); 
   if (name != null && name.equals("success")){ %>
		<font color="red"><i>The data was saved correctly</i></font>
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