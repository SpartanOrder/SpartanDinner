<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/3/23
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>斯巴达会员登录</title>
  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
  <style>
  </style>
</head>
<body>
<div class="container">
  <h4 class="form-signin-heading">会员登录</h4>
<form role="form">
  <div class="form-group">
    <label for="exampleInputPhone">手机号：</label>
    <input type="phone" class="form-control" id="exampleInputPhone" placeholder="请输入您的手机号码"required autofocus>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">密码:</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="请输入您的密码"required>
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox"> 记住密码
    </label>
  </div>
<button class="btn btn-success btn-primary btn-block" type="submit">快速登陆</button><br>
  <a href="register.jsp">快速注册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="register.jsp">忘记密码</a>
</form>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>