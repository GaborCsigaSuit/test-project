<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Test project</title>
</head>
<body>
    <%
       if(request.getAttribute("name") != null
               && !request.getAttribute("name").equals("")) {
    %>
    <h1>Hello ${name}</h1>
    <%
        }
    %>

    <form method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>Tax number:</td>
                <td><input type="text" name="taxNumber"/></td>
            </tr>
            <tr>
                <td><input type="submit"/></td>
            </tr>
        </table>
    </form>

</body>
</html>