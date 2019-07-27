<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <#include "../common/static.ftl">
    <script src="https://cdn.bootcss.com/socket.io/2.2.0/socket.io.js"></script>
    <style>
        .sender{background-color: #2683F5;border-radius: 10px;color: white;margin-top: 10px;text-align: right;display: inline-block;}
        .receiver{background-color: #EEEEEE;border-radius: 10px;margin-top: 10px;display: inline-block;margin-bottom: 10px}
        .bottomDiv{height: 150px;background-color: #ffffff;margin-top: 10px;position:fixed}
        .well{height: 300px;
            overflow-x:hidden;
            overflow-y:auto;
        }
    </style>
</head>
<body>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-header">与123的对话</div>
                <div class="layui-card-body">
                    <div>
                        <div  id="console" class="well"></div>
                        <div class="bottomDiv">
                            接收方：<input type="text" id="user" value="123">
                            消息：<input type="text" id="msg">
                            <button type="button" id="sendMsg">发送消息</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</div>

<script>
    $(function () {



       $("#sendMsg").click(function () {
           var dateTime = "${.now}"
           var msg = $("#msg").val();
           var aa = $("<div class='sender' > " + msg + "</div><span>：我(${.now})</span><br>");
           $('#console').append(aa);

           $.ajax({
               url: "${request.getContextPath()}/login/sendMsg",
               type: "post",
               data: {"receiver":$("#user").val(),"content":$("#msg").val(),"sender":"${user.name}"},
               dataType:"json",
               success: function (data) {
                   if(data.success){
                   }else{
                       layer.msg(data.msg, {icon: 5});
                   }
               }
           });
       });
    });

    var socket;
    connect();
    function connect() {
        var loginUserNum = "${user.username}";
        console.log(loginUserNum);
        var opts = {
            query: 'loginUserNum=' + loginUserNum
        };
        socket = io.connect('http://10.0.120.243:9099', opts);
        socket.on('connect', function () {
            console.log("连接成功");
            //serverOutput('<span class="connect-msg">连接成功</span>');
        });
        socket.on('push_event', function (data) {
            output(""+data.sender+"",""+data.content+"");
            console.log(data.content);
        });

        socket.on('disconnect', function () {
            serverOutput('<span class="disconnect-msg">' + '已下线! </span>');
        });
    }

    function output(sender,content) {
        var element = $("<span>"+sender+"(${.now})：</span><div class='receiver'>" + " " + content + "</div><br/>");
        $('#console').append(element);
    }

    function serverOutput(message) {
        var element = $("<div>" + message + "</div>");
        $('#console').prepend(element);
    }
</script>
</body>
</html>    