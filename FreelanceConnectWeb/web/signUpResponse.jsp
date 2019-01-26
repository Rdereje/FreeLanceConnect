<%-- 
    Document   : signUpResponse
    Created on : Jan 26, 2019, 9:21:03 AM
    Author     : muhin
--%>

<%@page import="myPackage.FreeLance"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            String name, email, password, passwordReEnter, confirmedPassword;
            
            String accountType;
            
            boolean passwordsMatch; //will verify if password inputs are matching
            int ID;
            
            //declaring the database that will hold the freelancers
            FreeLance database = new FreeLance();
            
            //declaring the database that will hold the customers
            
            //declaring the database that will hold the investors 
            
            //initialize name, email,and passwords
            name = request.getParameter("name");
            email = request.getParameter("email");
            password = request.getParameter("password");
            passwordReEnter = request.getParameter("re_password");
            accountType = request.getParameter("typeOfAccount");
   
            //Step 1: verify that the inputs in both password fields are correct
            //by sending both inputs to a method and comparing them to see
            //if they are the same
            if (password.equals(passwordReEnter))
            {
                passwordsMatch = true;
                confirmedPassword = password;
                
                //Step 2: Send name and password to the Add(..) method where
                //a new person object will be created, then assigned an ID, then 
                //added to the dataBase
                ID = database.Add(name, confirmedPassword, email, accountType);
            }
            else 
            { 
                //Fill in Later
            }
           
            
            
        %>
    </body>
</html>
