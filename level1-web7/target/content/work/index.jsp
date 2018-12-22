<%--
  Created by IntelliJ IDEA.
  User: hello
  Date: 2018/12/22
  Time: 6:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h3> 登陆界面</h3>
<form action="<% request.getContextPath();%>/work/UserloginServelt" name="form1" method="post">
    <table>
        用户姓名 <input type="text" size="30" name="account" value=""/><br>
        用户密码 <input type="password" size="30" name="pwd"/> <br>
        <input type="hidden" name="action" value="add"/>
        <input type="submit" value="登陆"/>
        <input type="button" value="取消"/>
       <a href="userAdd.jsp"> 注册</a>
    </table>
</form>