<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>登陆</h2>
<%--    这里的方式以post形式提交表单--%>
    <div style="text-align: center">
        <form action="${pageContext.request.contextPath}/login" method="get">
            用户名 <input type="text" name="username"><br>
            密码 <input type="password" name="password"><br>
            爱好:
            <input type="checkbox" name="hobby" value="女孩">女孩 <br>
            <input type="checkbox" name="hobby" value="游戏">游戏 <br>
            <input type="checkbox" name="hobby" value="tv">电视 <br>
            <input type="submit">
        </form>
    </div>
</body>
</html>
