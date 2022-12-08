<%-- 
    Document   : Dashboard
    Created on : 9 Nov, 2022, 10:26:49 AM
    Author     : BASAVARAJU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" type="text/css" href="studentcss.css">
    </head>
    <body class="format2">
        <div class="format1">
            <h1> Student Database Management System</h1>    
        </div>
        <hr>
        <div class="div1">
            <button><a href="SignUp.jsp" target="f1">Register</a></button>
            <button><a href="Search.jsp" target="f1">Search</a></button>
            <button><a href="DeleteSearch.jsp" target="f1">Delete</a></button>
            <button><a href="ViewAllStudent" target="f1">Update</a></button>
        </div>
        <br><br>
        <iframe name="f1"></iframe>
    </body>
</html>
