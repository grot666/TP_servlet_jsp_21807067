<%--
  Created by IntelliJ IDEA.
  User: mengSan
  Date: 2021/2/28
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--dont give up !!!!!!!--%>

<%@page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@page import="tdgr1.meng3.webService.user" %>
<%--import packages here--%>
<html>
<head>
    <title>list of all users info</title>
</head>
<body>
<% if(session.getAttribute("user")!= null) { %>
<%--not username it should be userobject--%>
<%=session.getAttribute("username")%>
<form action="deleteaccount" method="post">
    <input type="hidden" value="<%=session.getAttribute("username")%>" name="username">
    <input type="submit" value="delete">
</form>


<% }%>
<p>list of all users info</p>
<table border="1">
    <% ServletContext servletContext = request.getServletContext();
        List userList = (List) servletContext.getAttribute("list");%>
    <tr>
        <% for (Iterator it=userList.iterator();it.hasNext(); ) { %>

    <td><%= it.next()%></td>

    </tr>
<% } %>
</table>


</body>
</html>
