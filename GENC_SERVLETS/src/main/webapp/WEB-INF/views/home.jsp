<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<tags:template>
	<jsp:attribute name="head">
		<script type="text/javascript">
			// inline JavaScript here
		</script>
		<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
			<meta name="description" content="">
			<meta name="author" content="">
			<link rel="icon" href="/docs/4.0/assets/img/favicons/favicon.ico">

			<title>Blog Template for Bootstrap</title>

			<link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/blog/">

			<!-- Bootstrap core CSS -->
			<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

			<!-- Custom styles for this template -->
			<link href="https://fonts.googleapis.com/css?family=Playfair+Display:700,900" rel="stylesheet">
			<link href="blog.css" rel="stylesheet">
		<style>
			.jumbotron{
				background-image: url(http://batdongsanvincom.info/wp-content/uploads/2018/03/wallpaper-library-wall-paper-book-wallpaper-library-photo-collection-library-books-wallpaper-wallpaper-looks-like-library-books-books-library-wallpaper-design-uk.jpg);
				width: 100%;
				height: 100%;
				max-width:1400px;
				background-repeat: no-repeat;
			}
			.container-fluid {
				padding-right:0;
				padding-left:0;
				margin-right:auto;
				margin-left:auto
			}
			body{
				background-color: #333333;
			}
		</style>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand" href="#">
				Dewey Decimation
			</a>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
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
							<a class="dropdown-item" href="sAID">By Author ID</a>
							<a class="dropdown-item" href="sBID">By Book ID</a>
							<a class="dropdown-item" href="searchAllBooks">List All Books</a>
							<a class="dropdown-item" href="searchAll">List All</a>
						</div>
					</li>
				</ul>
			</div>
		</nav>
  	</jsp:attribute>
	<jsp:body>

		<body>
		<div class="jumbotron bg-dark">
			<div class="col-md-6 px-0 hidden">
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<h1 class="display-4 font-italic text-white" style="font-size:0;">lkdjksfjshfdsfkdshfkdsjfdlsfdsj</h1>
				<p class="lead my-3>Multiple lines of text that form the lede, informing new readers quickly and efficiently about what's most interesting in this post's contents.</p>
				<p class="lead mb-0><a href="#" class="text-white font-weight-bold " style="font-size:0;">kjlhddddddddddddddddddddddddddddddddddddddddddddddddk</a></p>

			</div>

		</div>
		<div class="container-fluid">


			<div class="row mb-2">
				<div class="col-md-6">
					<div class="card flex-md-row mb-4 box-shadow h-md-250">
						<div class="card-body d-flex flex-column align-items-start">
							<strong class="d-inline-block mb-2 text-primary">World</strong>
							<h3 class="mb-0">
								<a class="text-dark" href="#">Featured post</a>
							</h3>
							<div class="mb-1 text-muted">Jun 26</div>
							<p class="card-text mb-auto">Even if you're not a book lover, these photos will make you want to save your local library</p>
							<a href="https://www.independent.co.uk/arts-entertainment/books/features/beautiful-libraries-world-book-day-a8810586.html">Continue reading</a>
						</div>
						<img class="card-img-right flex-auto d-none d-md-block" data-src="holder.js/200x250?theme=thumb" alt="Thumbnail [200x250]" style="width: 200px; height: 250px;" src="https://static.independent.co.uk/s3fs-public/thumbnails/image/2015/01/02/16/franckbohbot5.jpg?w645" data-holder-rendered="true">
					</div>
				</div>
				<div class="col-md-6">
					<div class="card flex-md-row mb-4 box-shadow h-md-250">
						<div class="card-body d-flex flex-column align-items-start">
							<strong class="d-inline-block mb-2 text-success">Design</strong>
							<h3 class="mb-0">
								<a class="text-dark" href="#">Building a library</a>
							</h3>
							<div class="mb-1 text-muted">Jan 11</div>
							<p class="card-text mb-auto">Planning and designing library buildings and services</p>
							<a href="http://www.designinglibraries.org.uk/?PageID=43">Continue reading</a>
						</div>
						<img class="card-img-right flex-auto d-none d-md-block" data-src="holder.js/200x250?theme=thumb" alt="Thumbnail [200x250]" src="http://www.designinglibraries.org.uk/images/design_guidelines_m.jpg" data-holder-rendered="true" style="width: 200px; height: 250px;">
					</div>
				</div>
			</div>
		</div>

		<!-- Bootstrap core JavaScript
        ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
		<script src="../../assets/js/vendor/popper.min.js"></script>
		<script src="../../dist/js/bootstrap.min.js"></script>
		<script src="../../assets/js/vendor/holder.min.js"></script>
		<script>
			Holder.addTheme('thumb', {
				bg: '#55595c',
				fg: '#eceeef',
				text: 'Thumbnail'
			});
		</script>


		<svg xmlns="http://www.w3.org/2000/svg" width="200" height="250" viewBox="0 0 200 250" preserveAspectRatio="none" style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;"><defs><style type="text/css"></style></defs><text x="0" y="13" style="font-weight:bold;font-size:13pt;font-family:Arial, Helvetica, Open Sans, sans-serif">Thumbnail</text></svg>
		</body>
	</jsp:body>
</tags:template>