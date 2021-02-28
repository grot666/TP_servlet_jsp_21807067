<%--
  Created by IntelliJ IDEA.
  User: mengSan
  Date: 2021/2/28
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="/webService_war_exploded/login" method="post">
    <table>
        <tr>
            <td class="td1">username</td>
                                                                                <%--set a default username here--%>
            <td><input type="text"  name="username" value="<%=session.getAttribute("username")%>"></td>
        </tr>
        <tr>
            <td class="td1">password</td>
            <td><input type="password" name="password" ></td>
        </tr>

        <tr>
            <td colspan="2">
                <div class="btn-red">
                    <input type="submit" value="login">
                </div>
            </td>
        </tr>
    </table>
</form>
