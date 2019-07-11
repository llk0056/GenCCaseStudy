<%--
  Created by IntelliJ IDEA.
  User: 794396
  Date: 7/1/2019
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .hidden{
            display: none;
        }
        .leftColor{
            background-color: rgba(0,0,0,0.11)
        }
    </style>
    <title>Title</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript">
    $(document).ready(function() {
            if($('#bookIdentification').is(':checked') ){
                $( "#bookID" ).insertAfter( $( "#rightColor" ) );
                $( "#bookID" ).show();
            }
            else if($('#bookIdentification').not(':checked') ){
                $( "#bookID" ).hide();
                $( "#bookID" ).insertAfter( $( "#rightColor" ) );

            }
            else{
                $( "#bookID" ).insertAfter( $( "#rightColor" ) );
            }
        });
    </script>
</head>
<body>
    <div class ="container-fluid">
        <div class = "row">
            <div class = "col-md-3 leftColor">
                <input type="checkbox" name="search" value="bookID" id="bookIdentification"> Book ID<br>
                <input type="checkbox" name="search" value="authorID"> Author ID<br>

            </div>
            <div class = "col-md-9 rightColor">

            </div>
        </div>
    </div>


    <form class="bookID hidden" id="formByID" method = "post" action = "sBIDView">
        <div class="form-group type1">
            <label for="BID">Book ID:</label>
            <input type="tel" step = "1" class="form-control" id="bid" name="BID" placeholder="Book ID" pattern="[0-9]*">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</body>
</html>
