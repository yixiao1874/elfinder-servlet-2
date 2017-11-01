<%@ page  contentType="text/html;charset=utf-8" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>登录</title>

<body>
<form action="login" method="post">
    <tr>
        <td width="424" height="95" background="../skin/images/login_06.gif">&nbsp;</td>
        <td width="183" background="../skin/images/login_07.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="21%" height="30"><div align="center"><span class="STYLE3">用户</span></div></td>
                <td width="79%" height="30"><input type="text" name="userName"   style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
            </tr>
            <tr>
                <td height="30"><div align="center"><span class="STYLE3">密码</span></div></td>
                <td height="30"><input type="password" name="userPwd"  style="height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;"></td>
            </tr>
            <tr>
                <td height="30">&nbsp;</td>
                <td height="30">
                    <input type=submit value="登陆"/>
                </td>
            </tr>
</form>
</body>
</html>
