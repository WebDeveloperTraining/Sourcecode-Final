<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Dash board</title>

<!-- Bootstrap -->
<link href="./public/css/bootstrap.min.css" rel="stylesheet">
<!-- Font Awesome -->
<link href="./public/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">

<!-- Custom styling plus plugins -->
<script src="./public/jQuery/jquery-3.2.1.min.js"></script>
<script src="./public/js/bootstrap.min.js"></script>
<!-- custom design  -->
<link href="./public/css/myStyles.css" rel="stylesheet">
<script src="./public/js/jsCustom.js"></script>
</head>
<body>
	<div class="container-body">
		<div class="row">
			<!--  top navigation -->
			<div class="top-navigation">
				<ul class="navbar-nav">
					<li role="presentation" class="dropdown"><a
						href="javascript:;" class="dropdown-toggle info-number"
						data-toggle="dropdown" aria-expanded="false"><i id="inbox"
							class="fa fa-envelope-o" aria-hidden="true"
							style="font-size: 15px;"> <sup><span
									class="badge badge-default" style="background-color: #1ABB9C;">3</span></sup></i>
					</a>


						<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
							role="menu">
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li>
								<div class="text-center" style="text-align: center;">
									<a> <strong>Xem toàn bộ</strong> <i
										class="fa fa-angle-right"></i>
									</a>
								</div>
							</li>
						</ul></li>
					<li role="presentation" class="dropdown"><a
						href="javascript:;" class="dropdown-toggle info-number"
						data-toggle="dropdown" aria-expanded="false"><i id="notify"
							class="fa fa-bell-o" aria-hidden="true" style="font-size: 15px;">
								<sup><span class="badge badge-default"
									style="background-color: #1ABB9C;">7</span></sup>
						</i> </a>


						<ul id="menu1" class="dropdown-menu list-unstyled msg_list"
							role="menu">
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li><a> <span class="image"><img
										src="./public/images/1.jpg" alt="Profile Image" /></span> <span>
										<span>Hoàng Kim Vũ</span> <span class="time">3 phút
											trước</span>
								</span> <span class="message"> bala bala bala bala... </span>
							</a></li>
							<li>
								<div class="text-center" style="text-align: center;">
									<a> <strong>Xem toàn bộ</strong> <i
										class="fa fa-angle-right"></i>
									</a>
								</div>
							</li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle" href="#"
						data-toggle="dropdown"><img
							style="height: 20px; width: 20px; padding: 0 0 0px"
							src=<%=session.getAttribute("Hinh") %> class="img-circle" alt=""> 
							 <%=session.getAttribute("TenNguoiDung").toString()%> 
							  <span class="fa fa-angle-down"></span> </a>
						<ul class="dropdown-menu">
							<li><a href="${pageContext.request.contextPath}/TrangCaNhanControllers"><i class="fa fa-user"></i>
									Trang cá nhân</a></li>
						
							<li><a href="${pageContext.request.contextPath}/DangXuatControllers"><i
									class="fa fa-sign-out"></i> Đăng xuất</a></li>
						</ul></li>
				</ul>
			</div>
			<div class="clearfix"></div>
			<!-- end top navigation -->
			<!--  left navigation -->
			<div class="nav-side-menu">
				<div class="">
					<div class="title-web">
						<h3>
							<a href="${pageContext.request.contextPath}/Home"><i class="fa fa-mortar-board"></i> <span>Website
									Hội Thảo</span></a>
						</h3>
					</div>
					<div class="clearfix"></div>
					<div class="img-info hidesmall">
						<div class="pic">
							<img src=<%=session.getAttribute("Hinh") %> class="img-circle"
								alt="Cinque Terre" width="50" height="50"> Xin chào,
						</div>
						<div>
							<h4>
								
								<%=session.getAttribute("TenNguoiDung").toString()%>
								
							</h4>
						</div>
					</div>
					<div class="clearfix"></div>

				</div>
				<div class="hidesmall">
					<span>General</span>
				</div>
				<i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse"
					data-target="#menu-content"></i>

				<div class="menu-list">

					<ul id="menu-content" class="menu-content collapse out">
						<li class="active"><a
							href="${pageContext.request.contextPath}/QuanLyChung"> <i
								class="fa fa-dashboard fa-lg"></i> Bảng điều khiển
						</a></li>
						<li><a href="${pageContext.request.contextPath}/QuanLyBaiViet"><i
								class="fa fa-asterisk fa-lg"></i> Quản lý bài viết</a></li>
						
						<li data-toggle="collapse" data-target="#new" class="collapsed">
							<a href="#"><i class="fa fa-newspaper-o fa-lg"></i> Quản lý
								tin tức và sự kiện <span class="arrow"></span></a>
						</li>
						<ul class="sub-menu collapse" id="new">
							<li><a
								href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Thêm
									mới</a></li>
							<li><a
								href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Chỉnh
									sửa</a></li>
							<li><a
								href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Xóa</a></li>
						</ul>

						<li data-toggle="collapse" data-target="#topics" class="collapsed">
							<a href="#"><i class="fa fa-newspaper-o fa-lg"></i> Quản lý
								chủ đề <span class="arrow"></span></a>
						</li>
						<ul class="sub-menu collapse" id="topics">
							<li><a href="${pageContext.request.contextPath}/QuanLyChuDe">Thêm mới</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyChuDe">Chỉnh sửa</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyChuDe">Xóa</a></li>
						</ul>

						<li><a href="${pageContext.request.contextPath}/TrangCaNhanControllers"> <i class="fa fa-users fa-lg"></i>
								Trang cá nhân
						</a></li>

					</ul>
				</div>
			</div>
			<!-- end left navigation -->
			<!-- page content -->
			<div class="x-panel">
				<h1 class="tismal-page">
					<i class="fa fa-dashboard"></i> Bảng điều khiển chung
				</h1>


				<div class="row">
					<div class="col-lg-6 col-md-6 colxs-6">
					<h4 class="managecate">
						<i class="fa fa-newspaper-o"></i> Quản lý tin tức & sự kiện
					</h4>
					</div>
					<div class="col-lg-6 col-md-6 colxs-6">
					
					<h4 class="managecate">
						<i class="fa fa-newspaper-o"></i> Quản lý người dùng
					</h4>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-6 col-md-6 colxs-6 widget-holder">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-8 col-md-8 col-xs-8">
										<div class="widget-counter">
											<h6>
												Quản lý tin tức/sự kiện <small>một tuần trước</small>
											</h6>
											<h3>
												<span class="counter">10</span>
											</h3>
										</div>
									</div>
									<div class="col-lg-4 col-md-4 col-xs-4">
										<i class="fa fa-newspaper-o material-icons"></i>
									</div>
								</div>
							</div>
							<div class="panel-footer modycol">
								<div style="float: right;">
									<a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien"
										type="button" class="btn btn-primary btn-xs" id="mananew1">
										<i class="fa fa-gears"></i> Đi đến...
									</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>


					<div class="col-lg-6 col-md-6 colxs-6 widget-holder">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-8 col-md-8 col-xs-8">
										<div class="widget-counter">
											<h6>
												Quản lý người dùng <small>1 tuần trước</small>
											</h6>
											<h3>
												<span class="counter">10</span>
											</h3>
										</div>
									</div>
									<div class="col-lg-4 col-md-4 col-xs-4">
										<i class="fa fa-users material-icons"></i>
									</div>
								</div>
							</div>
							<div class="panel-footer modycol">
								<div style="float: right;">
									<a href="${pageContext.request.contextPath}/QuanLyNguoiDung"
										type="button" class="btn btn-primary btn-xs" id="manauser1">
										<i class="fa fa-gears"></i> Đi tới...
									</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>


				<div class="row">
					<div class="col-lg-6 col-md-6 colxs-6">
						<h4 class="managecate">
					<i class="fa fa-newspaper-o"></i> Quản lý bài viết
					</h4>
					</div>
					<div class="col-lg-6 col-md-6 colxs-6">
						<h4 class="managecate">
						<i class="fa fa-bookmark-o"></i> Quản lý chủ đề
						</h4>
					</div>
				</div>

				

				<div class="row">
					<div class="col-lg-6 col-md-6 colxs-6 widget-holder">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-8 col-md-8 col-xs-8">
										<div class="widget-counter">
											<h6>
												Quản lý bài viết <small>1 tuần trước</small>
											</h6>
											<h3>
												<span class="counter">10</span>
											</h3>
										</div>
									</div>
									<div class="col-lg-4 col-md-4 col-xs-4">
										<i class="fa fa-users material-icons"></i>
									</div>
								</div>
							</div>
							<div class="panel-footer modycol">
								<div style="float: right;">
									<a href="${pageContext.request.contextPath}/QuanLyBaiViet"
										type="button" class="btn btn-primary btn-xs" id="manauser1">
										<i class="fa fa-gears"></i> Đi tới...
									</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					
					<div class="col-lg-6 col-md-6 colxs-6 widget-holder">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="row">
									<div class="col-lg-8 col-md-8 col-xs-8">
										<div class="widget-counter">
											<h6>
												Quản lý chủ đề <small>1 tuần trước</small>
											</h6>
											<h3>
												<span class="counter">10</span>
											</h3>
										</div>
									</div>
									<div class="col-lg-4 col-md-4 col-xs-4">
										<i class="fa fa-bell-o material-icons"></i>
									</div>
								</div>
							</div>
							<div class="panel-footer modycol">
								<div style="float: right;">
									<a href="${pageContext.request.contextPath}/QuanLyChuDe"
										type="button" class="btn btn-primary btn-xs" id="manatopic1">
										<i class="fa fa-gears"></i> Đi tới...
									</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--  end page content -->
			<footer>
			<div class="row">
				<div class="col-lg-4 col-md-4 col-xs-12"></div>
				<div class="col-lg-4 col-md-4 col-xs-12"></div>
				<div class="col-lg-4 col-md-4 col-xs-12">
					<h5>CopyRight &copy; 2017 - Trung tâm hội thảo Việt Nam
						Express</h5>
					<h6>
						<strong>Địa chỉ :</strong> 01 Võ Văn Ngân, phường Linh Chiểu, quận
						Thủ Đức, TP.Hồ Chí Minh
					</h6>
					<h6>
						<strong>Điện thoại :</strong> (+84) 1684 648 350
					</h6>
					<h6>
						<strong>E-mail :</strong> trungtamhoithao@gmail.com
					</h6>
				</div>
			</div>
			</footer>
		</div>
	</div>
</body>
</html>
