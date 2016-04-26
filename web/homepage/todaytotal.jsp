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

        body {
            background: #03a9f4;
        }

        .navbar {
            margin-bottom: 0px;
        }

        .row {
            padding-left: 0px;
            padding-right: 0px;
        }

        .thumbnail {
            padding: 0px;
            margin-bottom: 0px;
            border: 1px #03a9f4;

        }

        .thumbnail .caption {
            padding: 0px;
        }

        ul {
            margin-bottom: 0px;
        }

        .list-group-item {
            padding: 0;
            border: 0px;
        }

        [class*="col-xs-"] {
            padding-left: 0px;
            padding-right: 0px;
            border: 3px #03e9f4;
        }

        [class*="col-sm-"] {
            padding-left: 0px;
            padding-right: 0px;
            border: 3px #03e9f4;
        }

        [class*="col-md-"] {
            padding-left: 0px;
            padding-right: 0px;
            border: 3px #03e9f4;
        }

        .btn-group-xs > .btn, .btn-xs {
            padding: 0px;
            width: 48%;
        }
        li{
            margin:3px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
    <div class="navbar-header" style="background-color:#03a9f4;">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
                data-target="#example-navbar-collapse">
            <span class="sr-only">切换导航</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">斯巴达餐厅&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;</a>

        <a class="navbar-brand" href="#">王小明</a>
    </div>
    <div class="collapse navbar-collapse" id="example-navbar-collapse">
        <ul class="nav navbar-nav">
            <li><span class="glyphicon glyphicon-th" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;
                餐桌状态
            </li>
            <li style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-grain" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;菜肴信息
            </li>
            <li style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;即时信息
            </li>
            <li class="active" style="padding:2px;font-size: 1.2em;background-color: #00aced"><span class="glyphicon glyphicon-yen"
                                                                                                    aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;今日销售
            </li>
            <li style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;个人信息
            </li>
        </ul>
    </div>
</nav>
<ul class="list-group">
    <li class="list-group-item">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;餐单流水号
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        总 &nbsp;&nbsp;&nbsp;价
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        状&nbsp;&nbsp;&nbsp;态
    </li>
    <li class="list-group-item">145201601120035
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ￥&nbsp;265&nbsp;元
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-danger btn-sm">结账</div>
    </li>
    <li class="list-group-item">145201601120036
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ￥&nbsp;598&nbsp;元
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-info btn-sm">挂账</div>
    </li>
    <li class="list-group-item">145201601120037
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ￥&nbsp;113&nbsp;元
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-danger btn-sm">结账</div>
    </li>
    <li class="list-group-item">145201601120038
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        ￥&nbsp;200&nbsp;元
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <div class="btn btn-danger btn-sm">结账</div>
    </li>


</ul>
<div id="footer" class="container">
    <nav class="navbar navbar-default navbar-fixed-bottom">
        <div class="navbar-inner navbar-content-center">
            <p class="text-muted credit" style="font-size: 150%;">

            <div class="btn btn-primary" style="margin-left: 15px;">返回</div>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            总计&nbsp;4&nbsp;单&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;共￥&nbsp;1176&nbsp;元
            </p>

        </div>
    </nav>
</div>
</body>
</html>
