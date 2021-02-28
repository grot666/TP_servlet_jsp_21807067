<%--
  Created by IntelliJ IDEA.
  User: mengSan
  Date: 2021/2/28
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Sign Up</title>
    <style>
<%--        set css style here--%>
        .container1280{
            width: 1280px
        }
        span{
            font-size: 30px;
        }
        .boxCenter{
            display: flex;
            justify-content: center;//d
            align-items: center;//v
        }
        .boxFrom{
            width: 200px;
            height: 100px;

        }
        .box1{

        }
    </style>
</head>
<body>

<div class="container1280 box1"><span>sign up</span></div>
<div>${code}</div>
<div>${msg}</div>
<div class="container1280 form boxCenter">

    <br>
    <form method="post" class="boxFrom" action="${pageContext.request.contextPath}/signup">
        <span>first name</span>
        <br>
        <label for="fn"></label><input required="true" type="text" name="firstname" id="fn">
        <br>
        <span>last name</span>
        <br>
        <label>
            <input type="text" name="lastname" required="true">
        </label>
        <br>
        <span>username</span>
        <br>
        <label for="un"></label><input type="text" name="username" required="true" id="un">
        <br>
        <span>password</span>
        <br>
        <label>
            <input type="password" name="password" required="true">
        </label>
        <br>
        <input class="subBox" type="submit" value="submit">

    </form>
    <div>
        <form action="${pageContext.request.contextPath}/signup" method="get">
            <input type="submit" value="get page">
        </form>
    </div>

</div>
</body>
</html>
