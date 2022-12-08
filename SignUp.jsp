<%-- 
    Document   : SignUp
    Created on : 8 Nov, 2022, 11:59:24 AM
    Author     : BASAVARAJU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Sign Up</h1>
        <hr>
        <form method="post" action="AddStudent">
            <table border="1">
                <tr>
                    <th>Enter the First Name:</th>
                    <td><input type="text" name="fname"></td>
                </tr>
                <tr>
                    <th>Enter the Last Name:</th>
                    <td><input type="text" name="lname"></td>
                </tr>

                <tr>
                    <th>Enter the DOB:</th>
                    <td><input type="date" name="dob"></td>
                </tr>
                <tr>
                    <td colspan="2"><center>
                    <input type="submit" value="Sign Up"></center>
                </td>
                </tr>
            </table>
        </form>
    </body>
</html>
