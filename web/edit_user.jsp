<%--
  Created by IntelliJ IDEA.
  User: J-Mo
  Date: 30/3/18
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="uts.wsd.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user;

    if (session.getAttribute("user") != null) {

        boolean submitted = request.getParameter("submitted") != null;

        user = (User) session.getAttribute("user");

        if (submitted) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String favcol = request.getParameter("favcol");
            String password = request.getParameter("password");

            String gender = request.getParameter("gender");
            if (gender.equals("on")) {
                gender = "Male";
            } else {
                gender = "Female";
            }

            user.setName(name);
            user.setEmail(email);
            user.setFavouriteColour(favcol);
            user.setPassword(password);
            user.setGender(gender);
        }
%>
<html>
<head>
    <title>edit_user.jsp</title>
</head>
<body>
    <h1>Register</h1>
    <form action="edit_user.jsp" method="post">
        <table>
            <tbody>
            <tr>
                <td><p>Email</p></td>
                <td><input name="email" type="text" value="<%= user.getEmail() %>"></td>
            </tr>
            <tr>
                <td><p>Full name</p></td>
                <td><input name="name" type="text" value="<%= user.getName() %>"></td>
            </tr>
            <tr>
                <td><p>Password</p></td>
                <td><input name="password" type="password" value="<%= user.getPassword() %>"></td>
            </tr>
            <tr>
                <td><p>Gender</p></td>
                <td>
                    <div>
                        <input name="gender" type="radio" checked="<%= user.getGender().equals("Male")%>">Male</div>
                    <div>
                        <input name="gender" type="radio" checked="<%= user.getGender().equals("Female")%>">Female</div>
                </td>
            </tr>
            <tr>
                <td><p>Favourite colour</p></td>
                <td>
                    <select name="favcol" >
                        <option <% if (user.getFavouriteColour().equals("Red")) { out.print("selected"); }%>>Red</option>
                        <option <% if (user.getFavouriteColour().equals("Green")) { out.print("selected"); }%>>Green</option>
                        <option <% if (user.getFavouriteColour().equals("Blue")) { out.print("selected"); }%>>Blue</option>
                        <option <% if (user.getFavouriteColour().equalsIgnoreCase("yellow")) { out.print("selected"); }%>>Yellow</option>
                        <option <% if (user.getFavouriteColour().equals("orange")) { out.print("selected"); }%>>orange</option>
                        <option <% if (user.getFavouriteColour().equals("pink")) { out.print("selected"); }%>>pink</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input name="submit" type="submit" value="Save"></td>
            </tr>
            </tbody>
        </table>
        <input type="hidden" name="submitted" value="yes">
    </form>
    <p>Return to the <a href="index.jsp">main page</a>.</p>
</body>
</html>
<% } %>