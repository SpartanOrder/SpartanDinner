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
<title>SpartanDinner</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet">
<link href="css/site.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet"/>
<!--[if lt IE 9]>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->

<link rel="stylesheet" href="css/bootstraptable/bootstrap-table.css"/>


</head>
<body>
<div class="container">
    <div class="navbar">
        <div class="navbar-inner">
            <div class="container">
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span
                        class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#">SpartanDinner</a>

                <div class="nav-collapse">
                    <ul class="nav">
                        <li class="active">
                            <a href="index.html">餐桌状态</a>
                        </li>
                        <li>
                            <a href="todaycarte.htm">今日账单</a>
                        </li>
                        <li>
                            <a href="help.htm">帮助</a>
                        </li>
                        <li class="dropdown">
                            <a href="help.htm" class="dropdown-toggle" data-toggle="dropdown">指导 <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="help.htm">Introduction Tour</a>
                                </li>
                                <li>
                                    <a href="help.htm">Project Organisation</a>
                                </li>
                                <li>
                                    <a href="help.htm">Task Assignment</a>
                                </li>
                                <li>
                                    <a href="help.htm">Access Permissions</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li class="nav-header">
                                    Files
                                </li>
                                <li>
                                    <a href="help.htm">How to upload multiple files</a>
                                </li>
                                <li>
                                    <a href="help.htm">Using file version</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-search pull-left" action="">
                        <input type="text" class="search-query span2" placeholder="查找"/>
                    </form>
                    <ul class="nav pull-right">
                        <li>
                            <a href="profile.htm">@username</a>
                        </li>
                        <li>
                            <a href="login.htm">退出</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="row-fluid">
        <div class="span2">
            <div class="well" style="padding: 8px 0;">
                <ul class="nav nav-list">
                    <li class="nav-header">
                        <a href="#articleMenu" class="nav-header menu-first collapsed" data-toggle="collapse"><i
                                class="icon-book icon-large"></i> 餐厅管理
                        </a>
                        <ul id="articleMenu" class="nav nav-list collapse menu-second in">
                            <li class="active"><a href="index.html"><i class="icon-check"></i> 餐桌状态</a></li>
                            <li><a href="todaycarte.htm"><i class="icon-check"></i> 今日账单</a></li>
                            <li><a href="index.html"><i class="icon-check"></i> 菜肴管理</a></li>
                            <li><a href="index.html"><i class="icon-check"></i> 餐桌信息</a></li>
                        </ul>
                    </li>
                    <li role="separator" class="divider"></li>
                    <li class="nav-header">
                        <a href="#articleMenu1" class="nav-header menu-first collapsed" data-toggle="collapse"><i
                                class="icon-book icon-large"></i>
                            人事管理</a>
                        <ul id="articleMenu1" class="nav nav-list collapse menu-second">
                            <li><a href="index.html"><i class="icon-check"></i> 部门信息</a></li>
                            <li><a href="index.html"><i class="icon-check"></i> 员工信息</a></li>
                            <li><a href="test.htm"><i class="icon-check"></i> 测试</a></li>
                        </ul>
                    </li>
                    <li role="separator" class="divider"></li>
                    <li class="nav-header">
                        <a href="#articleMenu2" class="nav-header menu-first collapsed" data-toggle="collapse"><i
                                class="icon-book icon-large"></i> 会员管理</a>
                        <ul id="articleMenu2" class="nav nav-list collapse menu-second">
                            <li><a href="index.html"><i class="icon-check"></i> 会员信息</a></li>
                            <li><a href="index.html"><i class="icon-check"></i> 优惠设定</a></li>
                        </ul>
                    </li>
                    <li role="separator" class="divider"></li>
                    <li class="nav-header">
                        <a href="#articleMenu3" class="nav-header menu-first collapsed" data-toggle="collapse"><i
                                class="icon-book icon-large"></i>
                            营业统计</a>
                        <ul id="articleMenu3" class="nav nav-list collapse menu-second">
                            <li><a href="index.html"><i class="icon-check"></i> 月季年绩</a></li>
                            <li><a href="index.html"><i class="icon-check"></i> 员工绩效</a></li>
                        </ul>
                    </li>
                    <li role="separator" class="divider"></li>
                    <li class="nav-header">
                        <a href="#articleMenu4" class="nav-header menu-first collapsed" data-toggle="collapse"><i
                                class="icon-book icon-large"></i>
                            餐厅信息</a>
                        <ul id="articleMenu4" class="nav nav-list collapse menu-second">
                            <li><a href="index.html"><i class="icon-check"></i> 基本信息</a></li>
                            <li><a href="index.html"><i class="icon-check"></i> 特殊信息</a></li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
        <div class="span10">
            <div class="bootstrap-table">
                <div class="fixed-table-toolbar">
                    <div class="bars pull-left">
                        <div id="toolbar">
                            <button id="remove" class="btn btn-danger" disabled="">
                                <i class="glyphicon glyphicon-remove icon-remove"></i> Delete
                            </button>
                        </div>
                    </div>
                    <div class="columns columns-right btn-group pull-right">
                        <button class="btn btn-default" type="button" name="paginationSwitch" title="Hide/Show pagination"><i
                                class="glyphicon glyphicon-collapse-down icon-chevron-down"></i></button>
                        <button class="btn btn-default" type="button" name="refresh" title="Refresh"><i
                                class="glyphicon glyphicon-refresh icon-refresh"></i></button>
                        <button class="btn btn-default" type="button" name="toggle" title="Toggle"><i
                                class="glyphicon glyphicon-list-alt icon-list-alt"></i></button>
                        <div class="keep-open btn-group" title="Columns">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"><i
                                    class="glyphicon glyphicon-th icon-th"></i> <span class="caret"></span></button>
                            <ul class="dropdown-menu" role="menu">
                                <li><label><input type="checkbox" data-field="id" value="1" checked="checked"> 餐单流水号</label></li>
                                <li><label><input type="checkbox" data-field="name" value="2" checked="checked"> 餐单金额</label></li>
                                <li><label><input type="checkbox" data-field="price" value="3" checked="checked"> 餐单结账金额</label></li>
                                <li><label><input type="checkbox" data-field="operate" value="4" checked="checked"> 餐单状态</label></li>
                            </ul>
                        </div>
                        <div class="export btn-group">
                            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" type="button"><i
                                    class="glyphicon glyphicon-export icon-share"></i> <span class="caret"></span></button>
                            <ul class="dropdown-menu" role="menu">
                                <li data-type="json"><a href="javascript:void(0)">JSON</a></li>
                                <li data-type="xml"><a href="javascript:void(0)">XML</a></li>
                                <li data-type="csv"><a href="javascript:void(0)">CSV</a></li>
                                <li data-type="txt"><a href="javascript:void(0)">TXT</a></li>
                                <li data-type="sql"><a href="javascript:void(0)">SQL</a></li>
                                <li data-type="excel"><a href="javascript:void(0)">MS-Excel</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="pull-right search"><input class="form-control" type="text" placeholder="Search"></div>
                </div>
                <div class="fixed-table-container" style="height: 0px; padding-bottom: 81px;">
                    <div class="fixed-table-header" style="margin-right: 0px;">
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th class="detail" rowspan="2">
                                    <div class="fht-cell" style="width: 30px;"></div>
                                </th>
                                <th class="bs-checkbox " style="text-align: center; vertical-align: middle; width: 36px; " rowspan="2"
                                    data-field="state" tabindex="0">
                                    <div class="th-inner "><input name="btSelectAll" type="checkbox"></div>
                                    <div class="fht-cell" style="width: 34.0909px;"></div>
                                </th>
                                <th style="text-align: center; vertical-align: middle; " rowspan="2" data-field="id" tabindex="0">
                                    <div class="th-inner sortable both">餐单流水号</div>
                                    <div class="fht-cell" style="width: 222.091px;"></div>
                                </th>
                                <th style="text-align: center; " colspan="3" tabindex="0">
                                    <div class="th-inner ">餐单信息</div>
                                    <div class="fht-cell"></div>
                                </th>
                            </tr>
                            <tr>
                                <th style="text-align: center; " data-field="name" tabindex="0">
                                    <div class="th-inner sortable both">餐单金额</div>
                                    <div class="fht-cell" style="width: 285.091px;"></div>
                                </th>
                                <th style="text-align: center; " data-field="price" tabindex="0">
                                    <div class="th-inner sortable both">餐单结账金额</div>
                                    <div class="fht-cell" style="width: 276.091px;"></div>
                                </th>
                                <th style="text-align: center; " data-field="operate" tabindex="0">
                                    <div class="th-inner ">餐单状态</div>
                                    <div class="fht-cell" style="width: 270.091px;"></div>
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr data-index="0">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="0" name="btSelectItem" type="checkbox" value="0"></td>
                                <td style="text-align: center; vertical-align: middle; ">0</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="0" data-value="Item 0"
                                                                    class="editable editable-click" data-original-title="" title="">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="0" data-value="$0"
                                                                    class="editable editable-click">$0</a></td>
                                <td style="text-align: center; ">
                                    <a class="remove" href="javascript:" title="Remove"><i class="glyphicon glyphicon-remove icon-remove"></i></a>
                                </td>
                            </tr>
                            <tr data-index="1">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="1" name="btSelectItem" type="checkbox" value="1"></td>
                                <td style="text-align: center; vertical-align: middle; ">1</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="1" data-value="Item 1"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="1" data-value="$1"
                                                                    class="editable editable-click">$1</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="2">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="2" name="btSelectItem" type="checkbox" value="2"></td>
                                <td style="text-align: center; vertical-align: middle; ">2</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="2" data-value="Item 2"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="2" data-value="$2"
                                                                    class="editable editable-click">$2</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="3">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="3" name="btSelectItem" type="checkbox" value="3"></td>
                                <td style="text-align: center; vertical-align: middle; ">3</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="3" data-value="Item 3"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="3" data-value="$3"
                                                                    class="editable editable-click">$3</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="4">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="4" name="btSelectItem" type="checkbox" value="4"></td>
                                <td style="text-align: center; vertical-align: middle; ">4</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="4" data-value="Item 4"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="4" data-value="$4"
                                                                    class="editable editable-click">$4</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="5">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="5" name="btSelectItem" type="checkbox" value="5"></td>
                                <td style="text-align: center; vertical-align: middle; ">5</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="5" data-value="Item 5"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="5" data-value="$5"
                                                                    class="editable editable-click">$5</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="6">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="6" name="btSelectItem" type="checkbox" value="6"></td>
                                <td style="text-align: center; vertical-align: middle; ">6</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="6" data-value="Item 6"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="6" data-value="$6"
                                                                    class="editable editable-click">$6</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="7">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="7" name="btSelectItem" type="checkbox" value="7"></td>
                                <td style="text-align: center; vertical-align: middle; ">7</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="7" data-value="Item 7"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="7" data-value="$7"
                                                                    class="editable editable-click">$7</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="8">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="8" name="btSelectItem" type="checkbox" value="8"></td>
                                <td style="text-align: center; vertical-align: middle; ">8</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="8" data-value="Item 8"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="8" data-value="$8"
                                                                    class="editable editable-click">$8</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="9">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="9" name="btSelectItem" type="checkbox" value="9"></td>
                                <td style="text-align: center; vertical-align: middle; ">9</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="9" data-value="Item 9"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="9" data-value="$9"
                                                                    class="editable editable-click">$9</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="10">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="10" name="btSelectItem" type="checkbox" value="10"></td>
                                <td style="text-align: center; vertical-align: middle; ">10</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="10" data-value="Item 10"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="10" data-value="$10"
                                                                    class="editable editable-click">$10</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="11">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="11" name="btSelectItem" type="checkbox" value="11"></td>
                                <td style="text-align: center; vertical-align: middle; ">11</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="11" data-value="Item 11"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="11" data-value="$11"
                                                                    class="editable editable-click">$11</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="12">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="12" name="btSelectItem" type="checkbox" value="12"></td>
                                <td style="text-align: center; vertical-align: middle; ">12</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="12" data-value="Item 12"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="12" data-value="$12"
                                                                    class="editable editable-click">$12</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="13">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="13" name="btSelectItem" type="checkbox" value="13"></td>
                                <td style="text-align: center; vertical-align: middle; ">13</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="13" data-value="Item 13"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="13" data-value="$13"
                                                                    class="editable editable-click">$13</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="14">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="14" name="btSelectItem" type="checkbox" value="14"></td>
                                <td style="text-align: center; vertical-align: middle; ">14</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="14" data-value="Item 14"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="14" data-value="$14"
                                                                    class="editable editable-click">$14</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="15">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="15" name="btSelectItem" type="checkbox" value="15"></td>
                                <td style="text-align: center; vertical-align: middle; ">15</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="15" data-value="Item 15"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="15" data-value="$15"
                                                                    class="editable editable-click">$15</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="16">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="16" name="btSelectItem" type="checkbox" value="16"></td>
                                <td style="text-align: center; vertical-align: middle; ">16</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="16" data-value="Item 16"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="16" data-value="$16"
                                                                    class="editable editable-click">$16</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="17">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="17" name="btSelectItem" type="checkbox" value="17"></td>
                                <td style="text-align: center; vertical-align: middle; ">17</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="17" data-value="Item 17"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="17" data-value="$17"
                                                                    class="editable editable-click">$17</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="18">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="18" name="btSelectItem" type="checkbox" value="18"></td>
                                <td style="text-align: center; vertical-align: middle; ">18</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="18" data-value="Item 18"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="18" data-value="$18"
                                                                    class="editable editable-click">$18</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="19">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="19" name="btSelectItem" type="checkbox" value="19"></td>
                                <td style="text-align: center; vertical-align: middle; ">19</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="19" data-value="Item 19"
                                                                    class="editable editable-click">$20</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="19" data-value="$19"
                                                                    class="editable editable-click">$19</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="fixed-table-body">
                        <div class="fixed-table-loading" style="top: 82px; display: none;">Loading, please wait...</div>
                        <table id="table" data-toolbar="#toolbar" data-search="true" data-show-refresh="true" data-show-toggle="true"
                               data-show-columns="true" data-show-export="true" data-detail-view="true" data-detail-formatter="detailFormatter"
                               data-minimum-count-columns="2" data-show-pagination-switch="true" data-pagination="true" data-id-field="id"
                               data-page-list="[10, 25, 50, 100, ALL]" data-show-footer="false" data-side-pagination="server"
                               data-url="data/table.json" data-response-handler="responseHandler" class="table table-hover"
                               style="margin-top: -81px;">
                            <thead>
                            <tr>
                                <th class="detail" rowspan="2">
                                    <div class="fht-cell"></div>
                                </th>
                                <th class="bs-checkbox " style="text-align: center; vertical-align: middle; width: 36px; " rowspan="2"
                                    data-field="state" tabindex="0">
                                    <div class="th-inner "><input name="btSelectAll" type="checkbox"></div>
                                    <div class="fht-cell"></div>
                                </th>
                                <th style="text-align: center; vertical-align: middle; " rowspan="2" data-field="id" tabindex="0">
                                    <div class="th-inner sortable both">餐单流水号</div>
                                    <div class="fht-cell"></div>
                                </th>
                                <th style="text-align: center; " colspan="3" tabindex="0">
                                    <div class="th-inner ">餐单信息</div>
                                    <div class="fht-cell"></div>
                                </th>
                            </tr>
                            <tr>
                                <th style="text-align: center; " data-field="name" tabindex="0">
                                    <div class="th-inner sortable both">餐单金额</div>
                                    <div class="fht-cell"></div>
                                </th>
                                <th style="text-align: center; " data-field="price" tabindex="0">
                                    <div class="th-inner sortable both">餐单结账金额</div>
                                    <div class="fht-cell"></div>
                                </th>
                                <th style="text-align: center; " data-field="operate" tabindex="0">
                                    <div class="th-inner ">餐单状态</div>
                                    <div class="fht-cell"></div>
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr data-index="0">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="0" name="btSelectItem" type="checkbox" value="0"></td>
                                <td style="text-align: center; vertical-align: middle; ">0</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="0" data-value="Item 0"
                                                                    class="editable editable-click" data-original-title="" title="">Item 0</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="0" data-value="$0"
                                                                    class="editable editable-click">$0</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="1">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="1" name="btSelectItem" type="checkbox" value="1"></td>
                                <td style="text-align: center; vertical-align: middle; ">1</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="1" data-value="Item 1"
                                                                    class="editable editable-click">Item 1</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="1" data-value="$1"
                                                                    class="editable editable-click">$1</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="2">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="2" name="btSelectItem" type="checkbox" value="2"></td>
                                <td style="text-align: center; vertical-align: middle; ">2</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="2" data-value="Item 2"
                                                                    class="editable editable-click">Item 2</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="2" data-value="$2"
                                                                    class="editable editable-click">$2</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="3">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="3" name="btSelectItem" type="checkbox" value="3"></td>
                                <td style="text-align: center; vertical-align: middle; ">3</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="3" data-value="Item 3"
                                                                    class="editable editable-click">Item 3</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="3" data-value="$3"
                                                                    class="editable editable-click">$3</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="4">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="4" name="btSelectItem" type="checkbox" value="4"></td>
                                <td style="text-align: center; vertical-align: middle; ">4</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="4" data-value="Item 4"
                                                                    class="editable editable-click">Item 4</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="4" data-value="$4"
                                                                    class="editable editable-click">$4</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="5">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="5" name="btSelectItem" type="checkbox" value="5"></td>
                                <td style="text-align: center; vertical-align: middle; ">5</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="5" data-value="Item 5"
                                                                    class="editable editable-click">Item 5</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="5" data-value="$5"
                                                                    class="editable editable-click">$5</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="6">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="6" name="btSelectItem" type="checkbox" value="6"></td>
                                <td style="text-align: center; vertical-align: middle; ">6</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="6" data-value="Item 6"
                                                                    class="editable editable-click">Item 6</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="6" data-value="$6"
                                                                    class="editable editable-click">$6</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="7">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="7" name="btSelectItem" type="checkbox" value="7"></td>
                                <td style="text-align: center; vertical-align: middle; ">7</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="7" data-value="Item 7"
                                                                    class="editable editable-click">Item 7</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="7" data-value="$7"
                                                                    class="editable editable-click">$7</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="8">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="8" name="btSelectItem" type="checkbox" value="8"></td>
                                <td style="text-align: center; vertical-align: middle; ">8</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="8" data-value="Item 8"
                                                                    class="editable editable-click">Item 8</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="8" data-value="$8"
                                                                    class="editable editable-click">$8</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="9">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="9" name="btSelectItem" type="checkbox" value="9"></td>
                                <td style="text-align: center; vertical-align: middle; ">9</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="9" data-value="Item 9"
                                                                    class="editable editable-click">Item 9</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="9" data-value="$9"
                                                                    class="editable editable-click">$9</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="10">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="10" name="btSelectItem" type="checkbox" value="10"></td>
                                <td style="text-align: center; vertical-align: middle; ">10</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="10" data-value="Item 10"
                                                                    class="editable editable-click">Item 10</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="10" data-value="$10"
                                                                    class="editable editable-click">$10</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="11">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="11" name="btSelectItem" type="checkbox" value="11"></td>
                                <td style="text-align: center; vertical-align: middle; ">11</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="11" data-value="Item 11"
                                                                    class="editable editable-click">Item 11</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="11" data-value="$11"
                                                                    class="editable editable-click">$11</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="12">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="12" name="btSelectItem" type="checkbox" value="12"></td>
                                <td style="text-align: center; vertical-align: middle; ">12</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="12" data-value="Item 12"
                                                                    class="editable editable-click">Item 12</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="12" data-value="$12"
                                                                    class="editable editable-click">$12</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="13">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="13" name="btSelectItem" type="checkbox" value="13"></td>
                                <td style="text-align: center; vertical-align: middle; ">13</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="13" data-value="Item 13"
                                                                    class="editable editable-click">Item 13</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="13" data-value="$13"
                                                                    class="editable editable-click">$13</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="14">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="14" name="btSelectItem" type="checkbox" value="14"></td>
                                <td style="text-align: center; vertical-align: middle; ">14</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="14" data-value="Item 14"
                                                                    class="editable editable-click">Item 14</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="14" data-value="$14"
                                                                    class="editable editable-click">$14</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="15">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="15" name="btSelectItem" type="checkbox" value="15"></td>
                                <td style="text-align: center; vertical-align: middle; ">15</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="15" data-value="Item 15"
                                                                    class="editable editable-click">Item 15</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="15" data-value="$15"
                                                                    class="editable editable-click">$15</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="16">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="16" name="btSelectItem" type="checkbox" value="16"></td>
                                <td style="text-align: center; vertical-align: middle; ">16</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="16" data-value="Item 16"
                                                                    class="editable editable-click">Item 16</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="16" data-value="$16"
                                                                    class="editable editable-click">$16</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="17">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="17" name="btSelectItem" type="checkbox" value="17"></td>
                                <td style="text-align: center; vertical-align: middle; ">17</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="17" data-value="Item 17"
                                                                    class="editable editable-click">Item 17</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="17" data-value="$17"
                                                                    class="editable editable-click">$17</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="18">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="18" name="btSelectItem" type="checkbox" value="18"></td>
                                <td style="text-align: center; vertical-align: middle; ">18</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="18" data-value="Item 18"
                                                                    class="editable editable-click">Item 18</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="18" data-value="$18"
                                                                    class="editable editable-click">$18</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            <tr data-index="19">
                                <td><a class="detail-icon" href="javascript:"><i class="glyphicon glyphicon-plus icon-plus"></i></a></td>
                                <td class="bs-checkbox "><input data-index="19" name="btSelectItem" type="checkbox" value="19"></td>
                                <td style="text-align: center; vertical-align: middle; ">19</td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="name" data-pk="19" data-value="Item 19"
                                                                    class="editable editable-click">Item 19</a></td>
                                <td style="text-align: center; "><a href="javascript:void(0)" data-name="price" data-pk="19" data-value="$19"
                                                                    class="editable editable-click">$19</a></td>
                                <td style="text-align: center; "><a class="remove" href="javascript:void(0)" title="Remove"><i
                                        class="glyphicon glyphicon-remove icon-remove"></i></a></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="fixed-table-footer" style="display: none;">
                        <table>
                            <tbody>
                            <tr></tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="fixed-table-pagination" style="display: block;">
                        <div class="pull-left pagination-detail"><span class="pagination-info">Showing 1 to 10 of 800 rows</span><span
                                class="page-list"><span class="btn-group dropup"><button type="button" class="btn btn-default  dropdown-toggle"
                                                                                         data-toggle="dropdown"><span class="page-size">10</span>
                            <span class="caret"></span></button><ul class="dropdown-menu" role="menu">
                            <li class="active"><a href="javascript:void(0)">10</a></li>
                            <li><a href="javascript:void(0)">25</a></li>
                            <li><a href="javascript:void(0)">50</a></li>
                            <li><a href="javascript:void(0)">100</a></li>
                            <li><a href="javascript:void(0)">All</a></li>
                        </ul></span> records per page</span></div>
                        <div class="pull-right pagination">
                            <ul class="pagination">
                                <li class="page-pre"><a href="javascript:void(0)">‹</a></li>
                                <li class="page-number active"><a href="javascript:void(0)">1</a></li>
                                <li class="page-number"><a href="javascript:void(0)">2</a></li>
                                <li class="page-number"><a href="javascript:void(0)">3</a></li>
                                <li class="page-number"><a href="javascript:void(0)">4</a></li>
                                <li class="page-number"><a href="javascript:void(0)">5</a></li>
                                <li class="page-last-separator disabled"><a href="javascript:void(0)">...</a></li>
                                <li class="page-last"><a href="javascript:void(0)">80</a></li>
                                <li class="page-next"><a href="javascript:void(0)">›</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/site.js"></script>
<script src="js/bootstraptable/bootstrap-table.js"></script>

<!-- Latest compiled and minified Locales -->
<script src="js/bootstraptable/bootstrap-table-zh-CN.js"></script>
</body>
</html>
