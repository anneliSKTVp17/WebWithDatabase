<%-- 
    Document   : users
    Created on : 13.05.2019, 19:05:39
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Title</title>
        <link href="../css/styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="form-style-2">
            <div class="form-style-2-heading">
                Alreadi registered!
            </div>
            <table>
            <tr>
                <th>First Name</th>
            </tr>
            <c:forEach items="${usersFromServer}" var="users">
                <tr>
                    <td>${user.firstName}</td>
                </tr>
            </c:forEach>
            </table>
        </div>
    </body>
</html>
