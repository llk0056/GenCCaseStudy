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
        .hidden{
            display:none;
        }
    </style>
    <title>Find Books By Author</title>
    <script>
        $( "#formByID" ).submit(function( event ) {
            event.preventDefault();
            event.hide();
            $("#submissionID").show();
        });
    </script>
    <%@include file="navbar.jsp" %>
</head>
<body>
<form id="formByID" method = "post" action = "findView">
    <div class="form-group type1">
        <label for="aName">Author Name:</label>
        <input type="text" step = "1" class="form-control" id="aName" name="name" placeholder="Author Name">
    </div>
    <button type="submit" id="submit_form" class="btn btn-primary">Submit</button>
</form>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</body>
</html>
