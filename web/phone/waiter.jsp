<%--
  Created by IntelliJ IDEA.
  User: Wind
  Date: 2016/3/18
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>欢迎光临斯巴达主页</title>
<link href="bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<style>


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
    /*body { padding-top: 30px; }*/
</style>
</head>
<body>
<!--<ul class="nav nav-tabs  navbr-fixed-top navbar-inverse">-->
<!--<li><a href="##">斯巴达主页</a></li>-->
<!--<li><a href="##">登录</a></li>-->
<!--</ul>-->

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
            <li class="active" style="padding:2px;font-size: 1.2em;background-color: #00aced"><span class="glyphicon glyphicon-th"
                                                                           aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;
                餐桌状态</li>
            <li style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-grain" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;菜肴信息
            </li>
            <li style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;即时信息
            </li>
            <li style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-yen" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;今日销售</li>
            <li class="active" style="padding:2px;font-size: 1.2em"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;&nbsp;&nbsp;个人信息
            </li>
        </ul>
    </div>
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ff5f25">
            <div class="thumbnail">
                <img src="img/2.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ff5f25">
            <div class="thumbnail">
                <img src="img/2.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ff5f25">
            <div class="thumbnail">
                <img src="img/2.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ff5f25">
            <div class="thumbnail">
                <img src="img/2.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ff5f25">
            <div class="thumbnail">
                <img src="img/2.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#543030">
            <div class="thumbnail">
                <img src="img/3.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-xs-3 col-sm-3 col-md-3" style="background-color:#ffffff">
            <div class="thumbnail">
                <img src="img/1.png" alt="...">

                <div class="caption">
                    <ul class="list-unstyled">
                        <li class="list-group-item text-center">
                            餐桌1
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-primary btn-xs">下单</button>
                            <button class="btn btn-info btn-xs">账单</button>
                        </li>
                        <li class="list-group-item pagination-centered">
                            <button class="btn btn-success btn-xs">预定</button>
                            <button class="btn btn-danger btn-xs">结账</button>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="bootstrap-3.3.5/js/bootstrap.min.js"></script>
</body>
</html>
