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
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<style>
    .row {
        margin-bottom: 0px;
    }

    .row.row {
        margin-top: 0px;
        margin-bottom: 0px;
    }

    [class*="col-"] {
        padding-top: 5px;
        padding-bottom: 5px;
        border: 0px;

    }

    body {
        background: #03a9f4;
    }

    .container-fluid {
        background: url("image/container1.jpg");
        background-size: 100% 100%;
        background-repeat: no-repeat;

    }
</style>
</head>
<body>
<ul class="nav nav-tabs  navbr-fixed-top navbar-inverse">
    <li><a href="##">斯巴达主页</a></li>
    <li><a href="##">登录</a></li>
</ul>

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="image/index.jpg" alt="..." style=" width:100%">

            <div class="carousel-caption">
                ...
            </div>
        </div>
        <div class="item">
            <img src="image/1.jpg" alt="..." style=" width:100%">

            <div class="carousel-caption">
                ...
            </div>
        </div>
        <div class="item">
            <img src="image/2.jpg" alt="..." style=" width:100%">

            <div class="carousel-caption">
                ...
            </div>
        </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<div class="container-fluid">
    <div class="row">
        <!--<div class="col-xs-1"></div>-->
        <!--<div class="col-xs-4 text-center"><img src="image/f1.jpg" style="width: 100%;height: 50%;">菜单</div>-->
        <!--<div class="col-xs-2"></div>-->
        <!--<div class="col-xs-4 text-center"><img src="image/f2.jpg" style="width: 100%;">账单</div>-->
        <!--<div class="col-xs-1"></div>-->
        <div class="col-xs-2"></div>
        <div class="col-xs-4 text-center">
            <div class="btn-primary"><img src="image/f1.jpg" style="width: 100%;" class="img-thumbnail">菜单
            </div>
        </div>
        <div class="col-xs-4 text-center">
            <div class="btn-primary"><img src="image/f2.jpg" style="width: 100%;" class="img-thumbnail">账单</div>
        </div>
        <div class="col-xs-2"></div>
    </div>
    <div class="row">
        <!--<div class="col-xs-1"></div>-->
        <!--<div class="col-xs-4 text-center"><a href="##"><img src="image/f3.jpg" style="width: 100%;"></a>会员</div>-->
        <!--<div class="col-xs-2"></div>-->
        <!--<div class="col-xs-4 text-center"><a href="##"><img src="image/f4.jpg" style="width: 100%;"></a>呼叫</div>-->
        <!--<div class="col-xs-1"></div>-->
        <div class="col-xs-2"></div>
        <div class="col-xs-4 text-center">
            <div class="btn-primary"><img src="image/f3.jpg" style="width: 100%;" class="img-thumbnail">会员</div>
        </div>
        <div class="col-xs-4 text-center">
            <div class="btn-primary"><img src="image/f4.jpg" style="width: 100%;" class="img-thumbnail">呼叫</div>
        </div>
        <div class="col-xs-2"></div>
    </div>
</div>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>
