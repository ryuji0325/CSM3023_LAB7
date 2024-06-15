<%-- 
    Document   : editUser
    Created on : 10 Jun 2024, 12:06:46 am
    Author     : amirf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit User</title>
    </head>
    <body>
        <h1>Updating User Profile</h1>
        <form name="frmEditUser" action="UserController" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td>User ID:</td>
                        <td><input type="text" name="userid" readonly="readonly" value="<c:out value="${user.userid}"/>" size="25"/></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstname"  value="<c:out value="${user.firstname}"/>" size="40"/></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastname"  value="<c:out value="${user.lastname}"/>" size="40"/></td>
                    </tr>
                    <tr>
                        <td><input type="hidden" name="action" value="edit"/></td>
                    </tr>
                     <tr>
                        <td><input type="submit" name="Submit" value="submit"/></td>
                    </tr>
                </tbody>
   
            </table>
        </form>
    </body>
</html>
