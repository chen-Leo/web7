<%--
  Created by IntelliJ IDEA.
  User: hello
  Date: 2018/12/22
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="MessageAddServlet" method="post" name="f">
    <table>
        <tr><td>姓名：</td>
            <td>
                <C:if test="${user=null}">
                    <a href="index.jsp">请登陆</a>
                </C:if>
                <C:if test="${user !=null}">${user.user_count}</C:if>
            </td></tr>
        <tr><td>内容：</td>
            <td>
                <textarea name="content" rows="10" cols="40"></textarea>
            </td>
        </tr>
        <tr id=CommmonListCell height="30">
            <td align="center" colspan="2">
                <input type="submit" value="提交">
                <input type="button" value="取消">
            </td>
        </tr>
    </table>
</form>
<h3> 留言显示</h3>
<C:if test="${meList!=null}">
    <C:forEach items="${meList}" var="ml">
        <table>
            <tr>
                <td>${ml.user.user_account}<b>${ml.message_time}</b></td>
            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;${ml.message_content}</td>
            </tr>
        </table>
    </C:forEach>
</C:if>