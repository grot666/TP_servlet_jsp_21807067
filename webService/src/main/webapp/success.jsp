<%@ page import="tdgr1.meng3.webService.user" %><%--
  Created by IntelliJ IDEA.
  User: mengSan
  Date: 2021/2/28
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    if(session.getAttribute("user")!=null){

%>
<h1>welcome</h1>
<%=session.getAttribute("user")%>
<br>
<a href="list.jsp">you can delete you account here if u want</a>
<%
}else{
%>
<!--directly get post success.jsp-->
<div class="login">
    <div class="header">
        <h1>well ,i trust you ,so ,please dont make this tough<a href="login.jsp">please login</a>!</h1>
    </div>
</div>
<%
    }
%>

</body>
</html>
