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
    System.out.println(path);
%>
<html>

<head>
    <%--<base href="<%=basePath%>">--%>
    <title>首页测试</title>
</head>
<body>
<a href="<%=basePath %>index.jsp">跳回首页</a>
欢迎d
<%=basePath %>
<%--<%=path %>--%>
${pageContext.request.contextPath}
</body>
</html>
