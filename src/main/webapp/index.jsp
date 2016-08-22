<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
    测试 <br/>
    <a href="${ctx}/test/delete.htm?id=23">删除</a>
  </body>
</html>
