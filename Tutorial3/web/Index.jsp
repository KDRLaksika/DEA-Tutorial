<%-- 
    Document   : Index
    Created on : Feb 18, 2024, 4:09:25 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
               <%-- Display error message --%>
    <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
    <% if (errorMessage != null) { %>
        <p style="color: red;"><%= errorMessage %></p>
    <% } %>
    
    <%-- Display success message --%>
    <% String successMessage = (String) request.getAttribute("successMessage"); %>
    <% if (successMessage != null) { %>
        <p style="color: green;"><%= successMessage %></p>
    <% } %>
    
        <form action ="SignupServlet" method ="post">
            
            <table border="1"> 
                
                    <tr>
                        <td>Username : </td>
                        <td><input type = "text" name = "username" required></td>
                    </tr>
                    <tr>
                        <td>Email : </td>
                        <td><input type = "text" name = "email" required></td>
                    </tr>
                    <tr>
                        <td>Password : </td>
                        <td><input type = "password" name = "password" required></td>
                    </tr>
                    <tr>
                        <td>Confirm Password : </td>
                        <td><input type = "password" name = "conpassword" required=""></td>
                    </tr>
                
            </table>     
            
            <input type ="submit" value ="Submit">
        </form>
        
            
    </body>
</html>
