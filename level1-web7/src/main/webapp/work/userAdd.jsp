<%--
  Created by IntelliJ IDEA.
  User: hello
  Date: 2018/12/16
  Time: 1:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form action = "addServlet" method = "post" >
    用户姓名 <input type="text" maxlength=10 name="userName"/><br>
    用户密码 <input  type="password" maxlength=16 name="password"/> <br>
    <input type="hidden" name="action" value="add"/>
    <input type="submit" name="commit" value="提交"/>
    <input type="reset" value="重置" />
</form>
