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
    
    out.println("searchBar passed");
    out.println("continue");
    //create an arraylist
    List<Person> searchedPeople;
    searchedPeople = tagCreater.tagMatch(searchItem);
    
    out.println("searche people created");
    if (searchedPeople.size() == 0 )
    {
        out.println("No User Found");
    }
    else 
    {
        
    }
    

%>


</html>