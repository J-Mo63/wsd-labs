<%--
  Created by IntelliJ IDEA.
  User: J-Mo
  Date: 21/3/18
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register.jsp</title>
</head>
<body>
    <h1>Register</h1>
    <form action="welcome.jsp" method="post">
        <table>
            <tbody>
            <tr>
                <td><label for="email">Email</label></td>
                <td><input name="email" type="text" value=""></td>
            </tr>
            <tr>
                <td><label for="name">Full name</label></td>
                <td><input name="name" type="text" value=""></td>
            </tr>
            <tr>
                <td><label for="password">Password</label></td>
                <td><input name="password" type="password" value=""></td>
            </tr>
            <tr>
                <td><label for="gender">Gender</label></td>
                <td>
                    <div>
                        <input name="gender" type="radio">Male</div>
                    <div>
                        <input name="gender" type="radio">Female</div>
                </td>
            </tr>
            <tr>
                <td><label for="favcol">Favourite colour</label></td>
                <td>
                    <select name="favcol"><option>Red</option>
                        <option>Green</option>
                        <option>Blue</option>
                        <option>Yellow</option>
                        <option>orange</option>
                        <option>pink</option></select>
                </td>
            </tr>
            <tr>
                <td><label for="tos">Agree to TOS</label></td>
                <td><input name="tos" type="checkbox" value=""></td>
            </tr>
            <tr>
                <td></td>
                <td><input name="submit" type="submit" value="Register"></td>
            </tr>
            </tbody>
        </table>
    </form>
</body>
</html>
