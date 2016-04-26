<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/3/23
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>斯巴达会员注册</title>

  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body>
<div class="container">

  <form class="form-signin">
    <h4 class="form-signin-heading">请填写如下真实信息</h4>
    <label for="inputPhone">手机号：</label>
    <input type="text" id="inputPhone" class="form-control" placeholder="请输入您的手机号" required autofocus>
    <label for="inputPassword">密码:</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="请输入您的密码" required>
    <label for="inputPassword1">确认密码:</label>
    <input type="password" id="inputPassword1" class="form-control" placeholder="请再次输入您的密码" required>
    <label for="inputEmail">常用邮箱：</label>
    <input type="text" id="inputEmail" class="form-control" placeholder="请输入您的邮箱" required autofocus>
    <div class="checkbox">
      <label>
        <input type="checkbox" value="remember-me">显示密码
      </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">提交注册信息</button>
  </form>

</div> <!-- /container -->


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>