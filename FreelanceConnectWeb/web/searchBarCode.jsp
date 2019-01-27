<%-- 
    Document   : searchBarCode
    Created on : Jan 26, 2019, 8:18:15 PM
    Author     : muhin
--%>

<%@page import="java.util.List"%>
<%@page import="myPackage.FreeLance.Person"%>
<%@page import="myPackage.FreeLance"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Searching!</h1>
        
        <% 
           
             FreeLance tagCreater = FreeLance.getInstance();
                //create an arraylist
            
            String searchItem = request.getParameter("searchBar");
            
            String[] searchedPeopleStrings = tagCreater.tagMatch(searchItem);
    
    if (searchedPeopleStrings.length > 0)
    {
        for (int i =0; i < searchedPeopleStrings.length; i ++)
        {
            out.println(searchedPeopleStrings[i]);
        }
    }
    out.println("searche people created");
    if (searchedPeopleStrings.length == 0 )
    {
        out.println("No User Found");
    }
            
           
        
            
           /*
                 FreeLance tagCreater = FreeLance.getInstance();
                //create an arraylist
            
            String searchItem = request.getParameter("searchBar");
            
            String searchedPeopleStrings = tagCreater.tagMatch(searchItem);
    
    if (searchedPeopleStrings.isEmpty())
    {
        
    }
    else
    {
      
            out.println(searchedPeopleStrings);
        
    }
    out.println("searche people ended");
            */
 
            

            %>
    </body>
</html>
