<%--
  Created by IntelliJ IDEA.
  User: xhjy
  Date: 2018/7/7
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>录入学生信息</title>
</head>
<body>
<h2>学生信息</h2>
<form method="POST" action="/addStudent">
    <table>
        <tr>
            <td><label path="name">Name</label></td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td><label path="age">Age</label></td>
            <td><input type="text" name="age" /></td>
        </tr>
        <tr>
            <td><label path="id">ID</label></td>
            <td><input type="text" name="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
