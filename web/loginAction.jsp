<%-- 
    Document   : loginAction
    Created on : 11/04/2018, 5:22:53 PM
    Author     : J-Mo
--%>

<%@page import="uts.wsd.User"%>
<%@page import="uts.wsd.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% String filePath = application.getRealPath("WEB-INF/users.xml"); %>
<jsp:useBean id="diaryApp" class="uts.wsd.DiaryApplication" scope="application">
    <jsp:setProperty name="diaryApp" property="filePath" value="<%=filePath%>"/>
</jsp:useBean>

<% 
    Users users = diaryApp.getUsers();
    
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    User user = users.login(email, password);
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>loginAction.jsp</title>
    </head>
    <body>
        <%
            if (user != null) {
                session.setAttribute("user", user);
        %>
            <p>Login successful. Click <a href="index.jsp">here</a> to return to the main page.</p>
        <%
            }
            else {
        %>
            <p>Password incorrect. Click <a href="login.jsp">here</a> to try again.</p>
        <%
            }
        %>
    </body>
</html>
