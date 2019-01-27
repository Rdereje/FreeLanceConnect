<%-- 
    Document   : createTags
    Created on : Jan 26, 2019, 5:07:10 PM
    Author     : muhin
--%>

<%@page import="myPackage.FreeLance.Person"%>
<%@page import="myPackage.FreeLance"%>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
		<title>Theory by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>

<% 
     out.println("function entered");
    FreeLance tagCreater = FreeLance.getInstance();
    
    String possibleTag = request.getParameter("userTag");
    String password = request.getParameter("userPassword");
    
    int userID = tagCreater.login(password);
    
    boolean checkExistence = tagCreater.addTags(userID, possibleTag);
    //login searches by password
    
    String tempTag = request.getParameter("userTag");
    
    String searchItem = request.getParameter("searchBar");
    
    if (checkExistence)
    {
        out.println("print stuff here");
    }
    else 
    {
         out.println("searchBar DEAD");
    out.println("GOODNIGHT");
    }

    //create an arraylist


%>



</html>