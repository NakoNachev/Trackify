<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Welcome to Trackify</h1>
        
        <div id="inner_content">
        
        	<p>Trackify is an application for storing goals.It is your own decision what type of information
        	you will save inside. You can edit/save/store/reorganize your data as much as you want.  </p>
        	<img src="<%=request.getContextPath()%>/resources/images/notebook_logo.jpg" />
        
        </div>
        
        <a href="home/displayNotes">Go to current goals</a>
        
    </body>
</html>
