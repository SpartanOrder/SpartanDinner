<%--
  Created by IntelliJ IDEA.
  User: Wind
  Date: 2016/4/24
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>欢迎光临斯巴达主页</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        /*.row {*/
        /*margin-bottom: 0px;*/
        /*}*/

        /*.row.row {*/
        /*margin-top: 0px;*/
        /*margin-bottom: 0px;*/
        /*}*/

        /*[class*="col-"] {*/
        /*padding-top: 5px;*/
        /*padding-bottom: 5px;*/
        /*border: 0px;*/

        /*}*/
        .navbar {
            background-color: #222;
        }

        body {
            background: #03a9f4;
        }

    </style>
</head>
<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                <span class="glyphicon glyphicon-align-justify" aria-hidden="true"></span>
            </a>
            <a class="navbar-brand" href="#">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                餐单
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <span class="glyphicon glyphicon-menu-left" aria-hidden="true" style="margin-right:5px"></span>
            </a>
        </div>

    </div>
</nav>
<ul class="list-group">
    <li class="list-group-item">大白菜
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;15元/例&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></div>
        2
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></div>
    </li>
    <li class="list-group-item">青菜
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;15元/例&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></div>
        1
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></div>
    </li>
    <li class="list-group-item">小龙虾
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;78元/例&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></div>
        1
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></div>
    </li>
    <li class="list-group-item">蛋花汤
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;35元/例&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></div>
        1
        <div class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></div>
    </li>
</ul>
<div id="footer" class="container">
    <nav class="navbar navbar-default navbar-fixed-bottom">
        <div class="navbar-inner navbar-content-center">
            <p class="text-muted credit" style="font-size: 150%">

            <div class="btn btn-primary" style="margin-left: 15px;">确认</div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            已点菜&nbsp;4&nbsp;份&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;￥&nbsp;158&nbsp;元
            </p>

        </div>
    </nav>
</div>
</body>
</html>
