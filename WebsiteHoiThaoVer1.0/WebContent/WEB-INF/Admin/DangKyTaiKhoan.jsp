<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng kí</title>
<!-- Bootstrap -->
<link href="./public/css/bootstrap.min.css" rel="stylesheet">
<!-- Font Awesome -->
<link href="./public/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">

<!-- Custom styling plus plugins -->
<script src="./public/jQuery/jquery-3.2.1.min.js"></script>
<script src="./public/js/bootstrap.min.js"></script>

<!-- custom design  -->
<link rel="stylesheet" href="./public/css/home.css">
<script src="./public/js/homejs.js"></script>
<style type="text/css">
	.login{
		padding-left : 10%;
		padding-right : 10%;
	}
</style>
</head>

<body>
	<div class="headerpage">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-6 col-sm-4 col-md-4">
					<img class="img-responsive" src="./public/images/home/Logo.png"
						alt="Chania">
				</div>
				<div
					class="col-xs-6 col-sm-4 col-md-4 col-md-offset-4 col-xs-offset-0 aline-t">
					<h4 class="text-right">
						<strong> Social Network</strong>
					</h4>
					<div class="row">
						<div class="col-xs-12 col-md-6 col-md-offset-6 col-xs-offset-0">
							<a target="_blank" href="https://www.facebook.com/"
								class="fa fa-facebook icon-face"></a> <a target="_blank"
								href="https://www.google.com.vn/" class="fa fa-google icon-goo"></a>
							<a target="_blank" href="https://twitter.com/"
								class="fa fa-twitter icon-tw"></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand"
				href="${pageContext.request.contextPath}/Home">Website Hội Thảo</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}/Home">Trang
						Chủ</a></li>
				<li><a href="${pageContext.request.contextPath}/ChuDeControllers">Chủ đề </a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${pageContext.request.contextPath}/DangKyTaiKhoan"><span class="fa fa-sign-in"></span>
						Đăng kí</a></li>
				<li><a href="${pageContext.request.contextPath}/Login"><span class="fa fa-sign-out"></span> Đăng
						Nhập</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<%	if(request.getParameter("failed")!=null){
	if(request.getParameter("failed").equals("-1")) { %>
		<div class="col-md-3"></div>
		<div class="col-md-6 alert alert-danger" role="alert">Tên đăng nhập đã có người sử dụng! Vui lòng kiểm tra lại!</div>
		<div class="col-md-3"></div>
	<% }} %>
	<div class="page-panel backgr-login">
		<div class="wrap-login">
			<form action="DangKyTaiKhoan" method="post" class="login">
				<h1>Thông tin người dùng</h1>
				<hr>
				<div class="form-group">
					<label for="email">Tên người dùng *</label> <input type="text"
						name="fullname" placeholder="Tên người dùng" id="mailregis"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="username">Tên đăng nhập *</label> <input type="text"
						name="username" placeholder="Tên đăng nhập" class="form-control"
						id="usernameregis">
				</div>
				<div class="form-group">
					<label for="password">Mật khẩu *</label> <input type="password"
						name="password" placeholder="Mật khẩu" id="passregis"
						class="form-control">
				</div>
				<div class="form-group">
					<label for="password">Xác nhận mật khẩu *</label> <input
						type="password" name="re-password" placeholder="Mật khẩu"
						id="confipassregis" class="form-control">
				</div>
				<div class="form-group">
					<label for="email">E-mail *</label> <input type="E-mail"
						name="email" placeholder="jonh@example.com" id="mailregis"
						class="form-control">
				</div>
				<hr>
				<small class="sttslogin" id="sttslogin">Vui lòng nhập đầy đủ
					thông tin *</small><br> <small class="sttslogin" id="sttspas">Mật
					khẩu không khớp *</small><br>
				<button class="btn btn-default" id="btnregispage">Đăng Kí</button>

			</form>
		</div>
	</div>
	<footer>
	<div class="footer-home">
		<div class="row">
			<div class="col-md-4 col-sm-4 col-xs-12">
				<h2>Website Hội Thảo - Trường Đại Học Sư Phạm Kĩ Thuật Thành
					Phố Hồ Chí Minh</h2>
				<p>Website được thiết kế bởi Venus Team</p>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12">
				<h2>Liên Hệ Với Chúng Tôi</h2>
				<h6>
					<strong>Địa Chỉ :</strong> Số 01, Võ Văn Ngân, Phường Linh Chiểu,
					Quận Thủ Đức, Thành Phố Hồ Chí Minh
				</h6>
				<h6>
					<strong>Điện Thoại :</strong> (+84) 1684 648 350
				</h6>
				<h6>
					<strong>E-mail :</strong> trungtamhoithao@gmail.com
				</h6>
			</div>
			<div class="col-md-4 col-sm-4 col-xs-12">
				<h5>CopyRight &copy; 2017 - Trung tâm hội thảo Việt Nam Express</h5>
			</div>
		</div>
	</div>
	<div class="icon-footer">
		<div class="container ">
			<ul class="social-footer list-unstyled list-inline pull-right">
				<li><a href="#"><i class="fa fa-facebook"></i></a></li>
				<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
				<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
				<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
				<li><a href="#"><i class="fa fa-twitter"></i></a></li>
				<li><a href="#"><i class="fa fa-skype"></i></a></li>
				<li><a href="#"><i class="fa fa-github"></i></a></li>
				<li><a href="#"><i class="fa fa-youtube"></i></a></li>
				<li><a href="#"><i class="fa fa-dropbox"></i></a></li>
			</ul>
		</div>
	</div>

	</footer>

</body>

</html>