<%-- 
    Document   : user
    Created on : 9 Jun 2024, 11:51:10 pm
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New record</title>
    </head>
    <body>
        <br/>
        <p><b>New record</b></p>
        <form name="frmAddUser" action="UserController" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>User ID : </td>
                        <td><input type="text" name="userid" value="" size="25" required /></td>
                    </tr>
                    <tr>
                        <td>First Name :</td>
                        <td><input type="text" name="firstname" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td>Last Name :</td>
                        <td><input type="text" name="lastname" value="" size="40" /></td>
                    </tr>
                    <tr>
                        <td><input type="hidden" name="action" value="insert"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Submit" name="submit"/>
                            <input type="reset" value="Cancel" name="cancel"/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
