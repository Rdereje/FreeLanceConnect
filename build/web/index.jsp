<%-- 
    Document   : index
    Created on : Jan 25, 2019, 9:09:40 PM
    Author     : muhin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Freelance Connect</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="myForm" action="display.jsp" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>First Name: </td>
                        <td><input type="text" name="First" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Last Name: </td>
                        <td><input type="text" name="Last" value="" size="50"  /></td>
                    </tr>
                    <tr>
                        <td>Email Address: </td>
                        <td><input type="text" name="Email" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Gender: </td>
                        <td><select name="Gender">
                                <option>Male</option>
                                <option>Female</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Date of Birth:</td>
                        <td><input type="text" name="Dob" value="MM/DD/YYYY" size="15" /></td>
                    </tr>
                </tbody>  
            </table>

            <input type="submit" value="Clear" name="clear" />
            <input type="submit" value="Submit" name="Submit" />
            
        </form>
        
    </body>
</html>
