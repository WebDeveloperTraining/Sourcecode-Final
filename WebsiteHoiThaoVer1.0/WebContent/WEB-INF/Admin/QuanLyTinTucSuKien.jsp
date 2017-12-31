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

<title>Quản Lý Tin Tức & Sự Kiện</title>

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
						
							<li><a href="${pageContext.request.contextPath}/DangXuatControllers"><i class="fa fa-sign-out"></i> Đăng xuất</a></li>
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
							<h4><%=session.getAttribute("TenNguoiDung") %></h4>
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
						<li><a href="${pageContext.request.contextPath}/QuanLyChung"> <i
								class="fa fa-dashboard fa-lg"></i> Bảng điều khiển
						</a></li>

						<li><a href="${pageContext.request.contextPath}/QuanLyBaiViet"><i
								class="fa fa-asterisk fa-lg"></i> Quản lý bài viết</a></li>

						<li data-toggle="collapse" data-target="#new"
							class="collapsed active"><a href="#"><i
								class="fa fa-newspaper-o fa-lg"></i> Quản lý tin tức và sự kiện
								<span class="arrow"></span></a></li>
						<ul class="sub-menu collapse in" id="new">
							<li><a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Thêm mới</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Chỉnh sửa</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Xóa</a></li>
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
					<i class="fa fa-dashboard"></i> Quản lý tin tức & sự kiện
				</h1>

				<!--         <div class="row">
          <div class="col-lg-8 col-md-8 col-xs-12" style="padding: 0px;"> -->
				<div class="panel panel-default" style="border-radius: 0px;">
					<div class="panel-body">
						<div class="card">
							<ul class="nav nav-tabs cus" role="tablist">
								<li role="presentation" class="active"><a href="#creatnews"
									aria-controls="home" role="tab" data-toggle="tab"><i
										class="fa fa-arrows"></i> <span>Tạo mới</span></a></li>
								<li role="presentation" id="li-tabchinhsuasukien"><a
									href="#modidynews" aria-controls="profile" role="tab"
									data-toggle="tab"><i class="fa fa-edit"></i> <span>Chỉnh
											sửa</span></a></li>
								<li role="presentation" id="li-tabxoasukien"><a href="#removenews"
									aria-controls="messages" role="tab" data-toggle="tab"><i
										class="fa fa-remove"></i> <span>Xóa</span></a></li>
								<li role="presentation"><a href="#settings"
									aria-controls="settings" role="tab" data-toggle="tab"><i
										class="fa fa-cog"></i> <span>Cài đặt</span></a></li>

							</ul>

							<!-- Tab panes -->
							<div class="tab-content">
								<div role="tabpanel" class="tab-pane active" id="creatnews">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-xs-12">
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thông
												tin tin tức & sự kiện</span>
										</div>
										<div class="col-lg-6 col-md-6 col-xs-12">
											<div class="search-message modifytopic-tab">
												<button>Go!</button>
												<input type="text" name="search" placeholder="Search for..."
													class="ipsearchmes">
											</div>
										</div>
									</div>

									<div class="clearfix"></div>
									<hr>
									<div class="formtopic">
										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Tên sự kiện </label><span
													class="require">*</span>
											</div>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="text" name="" id="tensukien" required="">
											</div>
										</div>
										<div class="clearfix"></div>

										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Ngày bắt đầu sự kiện </label><span
													class="require">*</span>
											</div>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="date" name="" id="themngaybatdausukien"
													required="">
											</div>
										</div>
										<div class="clearfix"></div>

										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Ngày kết thúc sự kiện </label><span
													class="require">*</span>
											</div>

											<div class="col-md-6 col-sm-6 col-xs-12">
												<input type="date" name="" id="themngayketthucsukien"
													required="">
											</div>
										</div>
										<div class="clearfix"></div>

										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Nội dung </label><span
													class="require">*</span>
											</div>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<textarea rows="10" id="noidungsukien" required=""></textarea>
											</div>
										</div>
										<div class="clearfix"></div>
										<form enctype="multipart/form-data" id="frm-themhinhanhsukien">
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Hình ảnh mô tả </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<div class="imgnew">
														<img src="./public/images/1.jpg"
															class="img-rounded file-upload-image" alt="Cinque Terre"
															width="100%">
													</div>
													<input type="file" name="imgnews" value=""
														onchange="readURL(this);" id="img-new" accept="image/*">
												</div>
											</div>
											<!-- <div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Tệp đính kèm </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<div class="addfile">
														<div class="space-fileup" style="margin-top: 0px;">
															<label class="input-label" for="file"> <i
																class="fa fa-upload"></i> <span class="label-span">Tải
																	lên tệp</span></label> <input type="file" name="filepost" id="file"
																accept=".pdf">
														</div>
													</div>
												</div>
											</div> -->
											<div class="clearfix"></div>
											<hr>
											<div style="text-align: center;">
												<small class="sttus-er" id="stter">Vui lòng điền đầy
													đủ thông tin *</small><br>
												<button type="button" class="btn btn-danger"
													id="btn-themsukien" style="border-radius: 0px;">
													Thêm mới <i class="fa fa-send"></i>
												</button>
											</div>
										</form>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="modidynews">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-xs-12">
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thông
												tin tin tức/sự kiện</span>
										</div>
										<div class="col-lg-6 col-md-6 col-xs-12">
											<div class="search-message modifytopic-tab">
												<button>Go!</button>
												<input type="text" name="search" placeholder="Search for..."
													class="ipsearchmes">
											</div>
										</div>
									</div>

									<div class="clearfix"></div>
									<hr>
									<div class="row">
										<div class="col-md-4"></div>
										<div class="col-md-4">
											<div class="form-group">
												<label for="list topic">Sắp xếp sự kiện theo tháng :
												</label> <select id="chonthangsukien" class="topicsel "
													style="width: 100%">
													<option value="1">Tháng 1</option>
													<option value="2">Tháng 2</option>
													<option value="3">Tháng 3</option>
													<option value="4">Tháng 4</option>
													<option value="5">Tháng 5</option>
													<option value="6">Tháng 6</option>
													<option value="7">Tháng 7</option>
													<option value="8">Tháng 8</option>
													<option value="9">Tháng 9</option>
													<option value="10">Tháng 10</option>
													<option value="11">Tháng 11</option>
													<option value="12" selected>Tháng 12</option>
												</select>
											</div>
										</div>

										<div class="col-md-4">
											<div class="form-group">
												<label for="list topic">Sắp xếp sự kiện theo năm : </label>
												<select id="chonnamsukien" class="topicsel "
													style="width: 100%">
													<option value="2010">2010</option>
													<option value="2011">2011</option>
													<option value="2012">2012</option>
													<option value="2013">2013</option>
													<option value="2014">2014</option>
													<option value="2015">2015</option>
													<option value="2016">2016</option>
													<option value="2017" selected>2017</option>
													<option value="2018">2018</option>
													<option value="2019">2019</option>
													<option value="2020">2020</option>
												</select>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4"></div>
										<div class="col-md-4" style="text-align: center;">
											<button type="button" id="btn-timkiemsukien"
												class="btn btn-success"
												style="border-radius: 0px; text-align: center;">Tìm
												Kiếm</button>
										</div>
										<div class="col-md-4"></div>
									</div>
									<div class="clearfix"></div>
									<hr>
									<table
										class="table table-bordered custable customtable2 table-hover"
										id="tablestatistic">
										<thead>
											<tr>
												<th>Stt</th>
												<th>Tên sự kiện</th>
												<th>Ngày bắt đầu</th>
												<th>Ngày kết thúc</th>
												<th>Hình ảnh</th>
											</tr>
										</thead>
										<tbody id="myTableChinhSuaSuKien">

										</tbody>
									</table>
									<div class="formtopic">
										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Tên sự kiện </label><span
													class="require">*</span>
											</div>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input id="chinhsuatensukien" type="text" name="nametopic"
													required="">
											</div>
										</div>
										<div class="clearfix"></div>

										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">ngày bắt đầu </label><span
													class="require">*</span>
											</div>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<input id="chinhsuangaybatdau" type="date" name="nametopic"
													required="">
											</div>
										</div>
										<div class="clearfix"></div>

										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">ngày kết thúc </label><span
													class="require">*</span>
											</div>

											<div class="col-md-6 col-sm-6 col-xs-12">
												<input id="chinhsuangayketthuc" type="date" name="nametopic"
													required="">
											</div>
										</div>
										<div class="clearfix"></div>

										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Nội dung </label><span
													class="require">*</span>
											</div>
											<div class="col-md-6 col-sm-6 col-xs-12">
												<textarea id="chinhsuanoidung" rows="10" required=""></textarea>
											</div>
										</div>
										<div class="clearfix"></div>
										<form enctype="multipart/form-data" id="frm-chinhsuahinhanhsukien">
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Hình ảnh </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<div class="imgnew" id="chinhsuahinhsukien">
														<img src="./public/images/1.jpg"
															class="img-rounded file-upload-image" alt="Cinque Terre"
															width="100%">
													</div>
													<input type="file" name="imgnews" value=""
														onchange="readURL(this);" id="img-new-chinhsuasukien" accept="image/*">
												</div>
											</div>
											<div class="clearfix"></div>
											<hr>
											<div style="text-align: center;">
												<button id="btn-capnhatsukien" type="button" class="btn btn-danger" style="border-radius: 0px;">
													Lưu thay đổi <i class="fa fa-send"></i>
												</button>
											</div>
										</form>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="removenews">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-xs-12">
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thông
												tin tin tức/sự kiện</span>
										</div>
										<div class="col-lg-6 col-md-6 col-xs-12">
											<div class="search-message modifytopic-tab">
												<button>Go!</button>
												<input type="text" name="search" placeholder="Search for..."
													class="ipsearchmes">
											</div>
										</div>
									</div>
									<div class="clearfix"></div>
									<hr>
									<div class="row">
										<div class="col-md-4"></div>
										<div class="col-md-4">
											<div class="form-group">
												<label for="list topic">Sắp xếp sự kiện theo tháng :
												</label> <select id="chonthangsukienxoa" class="topicsel "
													style="width: 100%">
													<option value="1">Tháng 1</option>
													<option value="2">Tháng 2</option>
													<option value="3">Tháng 3</option>
													<option value="4">Tháng 4</option>
													<option value="5">Tháng 5</option>
													<option value="6">Tháng 6</option>
													<option value="7">Tháng 7</option>
													<option value="8">Tháng 8</option>
													<option value="9">Tháng 9</option>
													<option value="10">Tháng 10</option>
													<option value="11">Tháng 11</option>
													<option value="12" selected>Tháng 12</option>
												</select>
											</div>
										</div>

										<div class="col-md-4">
											<div class="form-group">
												<label for="list topic">Sắp xếp sự kiện theo năm : </label>
												<select id="chonnamsukienxoa" class="topicsel "
													style="width: 100%">
													<option value="2010">2010</option>
													<option value="2011">2011</option>
													<option value="2012">2012</option>
													<option value="2013">2013</option>
													<option value="2014">2014</option>
													<option value="2015">2015</option>
													<option value="2016">2016</option>
													<option value="2017" selected>2017</option>
													<option value="2018">2018</option>
													<option value="2019">2019</option>
													<option value="2020">2020</option>
												</select>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4"></div>
										<div class="col-md-4" style="text-align: center;">
											<button type="button" id="btn-timkiemsukienxoa"
												class="btn btn-success"
												style="border-radius: 0px; text-align: center;">Tìm
												Kiếm</button>
										</div>
										<div class="col-md-4"></div>
									</div>
									<div class="clearfix"></div>
									<hr>
									<table
										class="table table-bordered custable customtable2 table-hover"
										id="tablestatistic">
										<thead>
											<tr>
												<th>Stt</th>
												<th>Tên sự kiện</th>
												<th>Ngày bắt đầu</th>
												<th>Ngày kết thúc</th>
												<th>Hình ảnh</th>
											</tr>
										</thead>
										<tbody id="myTableXoaSuKien">
											
										</tbody>
									</table>
									<div class="formtopic">
										<form>
											

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Tên sự kiện </label>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="xoatensukien" type="text" name="nametopic" required=""
														readonly="readonly">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày bắt đầu </label>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="xoangaybatdau" type="date" name="nametopic" required=""
														readonly="readonly">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày kết thúc</label>
												</div>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="xoangayketthuc" type="date" name="nametopic" required=""
														readonly="readonly">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Nội dung </label>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea id="xoanoidung" rows="10" required="" readonly="readonly"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>
											<hr>
										</form>
										<div style="text-align: center;">
											<button id="btn-xoasukien" type="button" class="btn btn-danger" style="border-radius: 0px;">
												Xóa <i class="fa fa-send"></i>
											</button>
										</div>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="settings">
									Updating...</div>
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
	<script type="text/javascript" src="./public/admin-js/quanlysukien.js"></script>
</body>
</html>