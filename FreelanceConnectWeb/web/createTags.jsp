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
    
    
    boolean checkExistence = addTag(ID, possibleTag);
    
    
    String tempTag = request.getParameter("userTag");
%>
