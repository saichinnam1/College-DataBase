<%-- 
    Document   : Update
    Created on : 9 Nov, 2022, 9:59:29 AM
    Author     : BASAVARAJU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student Details</title>
    </head>
    <body>
        <h1>Update Student Details</h1>
        <%
            int sid = Integer.parseInt(request.getParameter("sid"));
            String firstname = request.getParameter("firstname");
            String Lastname = request.getParameter("Lastname");
            String dob = request.getParameter("dob");
        %>

        <form method="post" action="UpdateStudentDet">
            <table border="1">
                <tr>
                    <th>SID</th>
                    <td><input type="text" name="sid" value="<%=sid%>" readonly></td>
                </tr>
                <tr>
                    <th>FirstName</th>
                    <td><input type="text" name="firstname" value="<%=firstname%>"></td>
                </tr>
                <tr>
                    <th>LastName</th>
                    <td><input type="text" name="lastname" value="<%=Lastname%>"></td>
                </tr>

                <tr>
                    <th>DOB</th>
                    <td><input type="date" name="dob" value="<%=dob%>"></td>
                </tr>

                <tr>
                    <td colspan="2">
                        <center><input type="submit" value="Update">
                        </center></td>
            </tr>
            </table>
        </form>
    </body>
</html>
