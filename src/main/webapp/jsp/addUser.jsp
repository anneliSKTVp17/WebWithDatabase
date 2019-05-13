<%-- 
    Document   : addUser
    Created on : 13.05.2019, 18:47:14
    Author     : user
--%>

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
                Please add user
            </div>
            <form method="post" action="/addUser">
                <label for="first-name">First Name
                    <input class="input-field" type="text" id="first-name" name="first-name">
                    </label>
                <label for="last-name">Last Name
                    <input class="input-field" type="text" id="last-name" name="last-name">
                </label>
                <input type="submit" value="Add user" >
            </form>
        </div>
    </body>
</html>
