<%--
  Created by IntelliJ IDEA.
  User: J-Mo
  Date: 21/3/18
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="uts.wsd.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<% if (tos) {
    User user = new User(email, name, password, gender, favcol);
    session.setAttribute("user", user);
%>
    <body bgcolor="<%= favcol %>">
        <p>Welcome, <%= name %>!</p>
        <p>Your Email is <%= email %>.</p>
        <p>Your password is <%= password %>.</p>
        <p>Your gender is <%= gender %>.</p>
        <p>Your favourite colour is <%= favcol %>.</p>
        <p>Click <a href="index.jsp">here</a> to proceed to the main page.</p>
    </body>
<% } else { %>
    <body>
        <p>Sorry, you must agree to the Terms of Service.</p>
        <p>Click <a href="register.jsp">here</a> to go back.</p>
    </body>
<% } %>
</html>
