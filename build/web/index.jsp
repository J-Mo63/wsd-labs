<%--
  Created by IntelliJ IDEA.
  User: J-Mo
  Date: 21/3/18
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="uts.wsd.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = null;

    if (session.getAttribute("user") != null) {
        user = (User) session.getAttribute("user");
    }
%>
<html>
  <head>
    <title>index.jsp</title>
  </head>
  <body>
    <h1>Diary Keeper</h1>
    <% if (user != null) { %>
        <p>You are logged in as <%= user.getName() %> &lt;<%= user.getEmail() %>&gt;</p>
        <a href="logout.jsp">Logout</a>
        <ul>
            <li><a href="edit_user.jsp">My Account</a></li>
        </ul>
    <% } else { %>
        <p>You are not logged in</p>
        <a href="login.jsp">Login</a>
        <span> | </span>
        <a href="register.jsp">Register</a>
    <% } %>
  </body>
</html>
