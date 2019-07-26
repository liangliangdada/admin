<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="shortcut icon" href="./favicon.ico">
    <#include "../common/static.ftl">
    <link href="${request.getContextPath()}/css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="login_box">
    <div class="login_l_img"><img src="${request.getContextPath()}/images/login/login-img.png"/></div>
    <div class="login">
        <div class="login_logo"><a href="#"><img src="${request.getContextPath()}/images/login/login_logo.png"/></a></div>
        <div class="login_name">
            <p>后台管理系统</p>
        </div>
        <form class="layui-form" method="post" action="${request.getContextPath()}/login/loginto">
            <input name="username" id="username" type="text" placeholder="用户名" autocomplete="off" />
            <input name="password" type="password" id="password" placeholder="密码" autocomplete="off"/>
            <input value="登录" style="width:100%;" lay-submit lay-filter="loginForm" type="submit" id="submit">
        </form>
    </div>
</div>
<script>
    layui.use(['form','layer'], function () {
        var $  = layui.jquery;
        var form = layui.form;
        var layer = layui.layer;
        //监听提交
        form.on('submit(loginForm)', function(data){
            var username = $("#username").val();
            var password = $("#password").val();
            if(username === ""){
                layer.msg("请输入用户名",{icon:5})
                return false;
            }
            if(password === ""){
                layer.msg("请输入密码",{icon:5})
                return false;
            }
            $.ajax({
                url: data.form.action,
                type: data.form.method,
                data: $(data.form).serialize(),
                dataType:"json",
                success: function (data) {
                    if(data.success){
                        window.location.href="${request.getContextPath()}/home";
                    }else{
                        layer.msg(data.msg, {icon: 5});
                    }
                }
            });
            return false;
        });
    });

</script>

</body>
</html>    