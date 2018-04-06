<%--
  Created by IntelliJ IDEA.
  User: J-Mo
  Date: 23/3/18
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    boolean submitted = request.getParameter("submitted") != null;

    if (submitted) {
%>
    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String favcol = request.getParameter("favcol");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        if (gender.equals("on")) {
            gender = "Male";
        }
        else {
            gender = "Female";
        }
        boolean tos = request.getParameter("tos") != null;
    %>
    <html>
        <head>
            <title>welcome.jsp</title>
        </head>
        <% if (tos) { %>
            <body bgcolor="<%= favcol %>">
                <p>Welcome, <%= name %>!</p>
                <p>Your Email is <%= email %>.</p>
                <p>Your password is <%= password %>.</p>
                <p>Your gender is <%= gender %>.</p>
                <p>Your favourite colour is <%= favcol %>.</p>
            </body>
        <% } else { %>
            <body>
                <p>Sorry, you must agree to the Terms of Service.</p>
                <p>Click <a href="./one.jsp">here</a> to go back.</p>
            </body>
        <% } %>
    </html>
<%
    } else {
%>
    <html>
        <head>
            <title>register.jsp</title>
        </head>
        <body>
            <h1>Register</h1>
            <form action="one.jsp" method="post">
                <input type="hidden" name="submitted" value="yes">
                <table>
                    <tbody>
                    <tr>
                        <td><p>Email</p></td>
                        <td><input name="email" type="text" value=""></td>
                    </tr>
                    <tr>
                        <td><p>Full name</p></td>
                        <td><input name="name" type="text" value=""></td>
                    </tr>
                    <tr>
                        <td><p>Password</p></td>
                        <td><input name="password" type="password" value=""></td>
                    </tr>
                    <tr>
                        <td><p>Gender</p></td>
                        <td>
                            <div>
                                <input name="gender" type="radio">Male</div>
                            <div>
                                <input name="gender" type="radio">Female</div>
                        </td>
                    </tr>
                    <tr>
                        <td><p>Favourite colour</p></td>
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
                        <td><p>Agree to TOS</p></td>
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
<%
    }
%>