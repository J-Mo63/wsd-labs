<%-- 
    Document   : login
    Created on : 11/04/2018, 5:18:52 PM
    Author     : J-Mo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login.jsp</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="loginAction.jsp" method="post">
            <table>
                <tbody>
                <tr>
                    <td><p>Email</p></td>
                    <td><input name="email" type="text" value=""></td>
                </tr>
                <tr>
                    <td><p>Password</p></td>
                    <td><input name="password" type="password" value=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input name="submit" type="submit" value="Login"></td>
                </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
