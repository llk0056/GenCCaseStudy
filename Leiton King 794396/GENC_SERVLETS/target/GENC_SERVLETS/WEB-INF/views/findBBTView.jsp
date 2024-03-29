<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 794396
  Date: 6/26/2019
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">    <meta charset="UTF-8">
    <style>
        table{
            width: 100%;
        }
        tr:nth-child(even){
            background-color: gray;
        }
        tr:nth-child(odd){
            background-color: silver;
        }
        th, td {
            padding: 15px;
            text-align: center;
        }
    </style>
    <%@include file="navbar.jsp" %>
</head>
<body>
<table>
    <tr>
        <th>Title</th>
        <th>Number of pages</th>
        <th>ISBN</th>
        <th>Genre</th>
    </tr>
    <c:forEach items="${findBookByTitle}" var="b">
        <tr>
            <td>${b.title}</td>
            <td>${b.num_of_pages}</td>
            <td>${b.isbn}</td>
            <td>${b.genres}</td>
        </tr>
    </c:forEach>
</table>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>
