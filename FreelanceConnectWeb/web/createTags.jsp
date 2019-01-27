<%-- 
    Document   : createTags
    Created on : Jan 26, 2019, 5:07:10 PM
    Author     : muhin
--%>

<%@page import="myPackage.FreeLance"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
    
    FreeLance tagCreater = FreeLance.getInstance();
    
    String possibleTag = request.getParameter("userTag");
    String password = request.getParameter("userPassword");
    
    int userID = tagCreater.login(password);
    
    boolean checkExistence = tagCreater.addTags(userID, possibleTag);
    //login searches by password
    
    String tempTag = request.getParameter("userTag");
    
    
    
%>
