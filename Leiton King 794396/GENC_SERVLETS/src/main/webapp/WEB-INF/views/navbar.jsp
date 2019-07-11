<%--
  Created by IntelliJ IDEA.
  User: 794396
  Date: 6/27/2019
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="home">
        Dewey Decimation
    </a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item" >
                <a class="nav-link" href="page1">Main</a>
            </li>
            <li class="nav-item" >
                <a class="nav-link" href="mj">Nav</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Search
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" id = "sAID" href="sAID">By Author ID</a>
                    <a class="dropdown-item" id = "sBID" href="sBID">By Book ID</a>
                    <a class="dropdown-item" id = "searchAllBooks" href="searchAllBooks">List All Books</a>
                    <a class="dropdown-item" id = "searchAll" href="searchAll">List All</a>
                    <a class="dropdown-item" id = "find" href="find">Find Books By Author</a>
                    <a class="dropdown-item" id = "findBBT" href="findBBT">Find Books By Title</a>
                </div>
            </li>
            <li class="nav-item" >
                <a class="nav-link" href="insert">Add Author</a>
            </li>
        </ul>
    </div>
</nav>