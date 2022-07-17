<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: VagramsMac
  Date: 03.07.2022
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowToDO</title>
</head>
<body>
    <h3>Название дела:</h3>
    <h4>${thingsToDo.nameToDo}</h4>
    <br>
    <br>
    <h3>Контекст дела:</h3>
    <h4>${thingsToDo.contextToDo}</h4>
    <br><br>
    <h3>Приоритет дела:</h3>
    <h4>${thingsToDo.priority}</h4>
    <br>
    <br>
</body>
</html>
