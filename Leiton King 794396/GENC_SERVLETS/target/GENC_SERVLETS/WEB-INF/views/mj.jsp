<%--
  Created by IntelliJ IDEA.
  User: 794396
  Date: 6/25/2019
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">    <meta charset="UTF-8">
    <style>
        #animate {
            position: relative;
            border: 1px solid green;
            background: yellow;
            width: 100px;
            height: 100px;
        }
    </style>
    <link type="text/css" rel="stylesheet" href="https://api.mqcdn.com/sdk/mapquest-js/v1.3.2/mapquest.css"/>

    <script src="https://code.jquery.com/jquery-3.2.1.min.js">
        $(document).ready(function(e) {
            var width = $(document).width();

            function goRight() {
                $("#animate").animate({
                    left: width
                }, 5000, function() {
                    setTimeout(goLeft, 50);
                });
            }
            function goLeft() {
                $("#animate").animate({
                    left: 0
                }, 5000, function() {
                    setTimeout(goRight, 50);
                });
            }

            setTimeout(goRight, 50);
        });
    </script>
</head>


<body>
<%@include file="navbar.jsp" %>
<div class="container-fluid" style="background-color: black">
    <img id="animate" src="resources/last.gif">
    <div class = "row">
        <div class = "col">
            <img src="resources/mj.gif">
        </div>
        <div class = "col">
            <img src="resources/mj1.gif">
        </div>
    </div>
    <div class="row">
        <div class = "col">
            <img src="resources/ra.gif">
        </div>
        <div class = "col">
            <img src="resources/ip man.gif">
        </div>
    </div>
    <div class="row">
        <div class = "col">
            <img src="resources/XaaW.gif">
        </div>
        <div class = "col">
            <img src="resources/zorn.gif">
        </div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>