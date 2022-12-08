<%-- 
    Document   : Search
    Created on : 9 Nov, 2022, 9:17:13 AM
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
        <h1>Search Student Details</h1>
        <hr>
        <div>
            <form method="post" action="DeleteStudent">
                <table border="1">
                    <tr>
                        <th>Enter the Student ID:</th>
                        <td><input type="text" name="sid"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                    <center><input type="submit" value="Delete"></center>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
