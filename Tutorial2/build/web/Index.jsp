<%-- 
    Document   : Index
    Created on : Feb 18, 2024, 1:39:28 PM
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
        
        <% String errorMessage = (String) request.getAttribute("errormessage"); %>
    <% if (errorMessage != null) { %>
        <p style="color: red;"><%= errorMessage %></p>
    <% } %>
    
    <%-- Display success message --%>
    <% String successMessage = (String) request.getAttribute("message"); %>
    <% if (successMessage != null) { %>
        <p style="color: green;"><%= successMessage %></p>
    <% } %>
        
        <form action ="LoginServlet" method ="post">
            
            Username : <input type ="text" name = "username"><br>
            Password : <input type ="password" name ="password"><br>
            <input type="submit" value ="Submit">
            
            
        </form>
             
    </body>
</html>
