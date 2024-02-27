<%-- 
    Document   : Index
    Created on : Feb 18, 2024, 6:06:29 PM
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
        
       <h1>HTTP Headers Display</h1>
    <p>This page displays the HTTP headers sent by your browser.</p>

    <form action="Tableservlet" method="GET">
        
        <input type="submit" value="Show Headers">
        
    </form>
    
    </body>
</html>
