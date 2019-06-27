<%--
  Created by IntelliJ IDEA.
  User: 794396
  Date: 6/26/2019
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
        <form method = "post" action = "insertAll">
            <div class="form-group">
                <label for="author">Author name:</label>
                <input type="email" class="form-control" id="Author" aria-describedby="emailHelp" placeholder="Author's Name">
            </div>
            <div class="form-group">
                <label for="title">Book Title:</label>
                <input type="text" class="form-control" id="title" placeholder="Book Title">
            </div>
            <div class="form-group">
                <label for="pages">Number of pages:</label>
                <input type="tel" class="form-control" id="pages" placeholder="Number of Pages" pattern="[0-9]*">
            </div>
            <div class="form-group">
                <label for="ISBN">ISBN:</label>
                <input type="text" class="form-control" id="isbn" placeholder="ISBN">
            </div>
            <div class="form-group">
                <label for="genre">Book genre:</label>
                <input type="text" class="form-control" id="genre" placeholder="Genre">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </body>
</html>
