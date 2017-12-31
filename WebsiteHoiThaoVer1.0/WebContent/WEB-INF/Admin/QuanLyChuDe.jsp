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

<title>Quản lý chủ đề</title>

<!-- Bootstrap -->
<link href="./public/css/bootstrap.min.css" rel="stylesheet">
<!-- Font Awesome -->
<link href="./public/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">

<!-- custom design  -->
<link href="./public/css/myStyles.css" rel="stylesheet">

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
							<% if (session.getAttribute("TenNguoiDung") != null) { %> 
							<%=session.getAttribute("TenNguoiDung").toString()%> <%
 							} else {
 								this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Home.jsp").forward(request, response);
 							}
 							%> <span class="fa fa-angle-down"></span> </a>
						<ul class="dropdown-menu">
							<li><a href="${pageContext.request.contextPath}/TrangCaNhanControllers"><i class="fa fa-user"></i>
									Trang cá nhân</a></li>
				
							<li><a href="${pageContext.request.contextPath}/Login"><i
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
							<h4> <%=session.getAttribute("TenNguoiDung").toString()%></h4>
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

						<li ><a href="${pageContext.request.contextPath}/QuanLyBaiViet"><i
								class="fa fa-asterisk fa-lg"></i> Quản lý bài đăng</a></li>

						<li data-toggle="collapse" data-target="#new" class="collapsed">
							<a href="#"><i class="fa fa-newspaper-o fa-lg"></i> Quản lý
								tin tức và sự kiện <span class="arrow"></span></a>
						</li>
						<ul class="sub-menu collapse" id="new">
							<li><a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Thêm mới</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Chỉnh sửa</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyTinTucSuKien">Xóa</a></li>
						</ul>

						<li data-toggle="collapse" data-target="#topics"
							class="collapsed active"><a href="#"><i
								class="fa fa-newspaper-o fa-lg"></i> Quản lý chủ đề <span
								class="arrow"></span></a></li>
						<ul class="sub-menu collapse in" id="topics">
							<li class="active"><a href="${pageContext.request.contextPath}/QuanLyChuDe">Thêm
									mới</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyChuDe">Chỉnh sửa</a></li>
							<li><a href="${pageContext.request.contextPath}/QuanLyChuDe">Xóa</a></li>
						</ul>


						<li><a href="${pageContext.request.contextPath}/TrangCaNhanControlers"> <i class="fa fa-users fa-lg"></i>
								Trang cá nhân
						</a></li>

					</ul>
				</div>
			</div>
			<!-- end left navigation -->
			<!-- page content -->
			<div class="x-panel">
				<h1 class="tismal-page">
					<i class="fa fa-dashboard"></i> Quản lý chủ đề
				</h1>
				<div class="panel panel-default" style="border-radius: 0px;">
					<div class="panel-body">
						<div class="card">
							<ul class="nav nav-tabs cus" role="tablist">
								<li role="presentation" class="active"><a
									href="#createtopic" aria-controls="home" role="tab"
									data-toggle="tab"><i class="fa fa-arrows"></i> <span>Tạo
											mới</span></a></li>
								<li id="tab-chinhsuachude" role="presentation"><a
									href="#modidytopic" aria-controls="profile" role="tab"
									data-toggle="tab"><i class="fa fa-edit"></i> <span>Chỉnh
											sửa</span></a></li>
								<li id="tab-xoachude" role="presentation"><a href="#removetopic"
									aria-controls="messages" role="tab" data-toggle="tab"><i
										class="fa fa-remove"></i> <span>Xóa</span></a></li>
								<li role="presentation"><a href="#settings"
									aria-controls="settings" role="tab" data-toggle="tab"><i
										class="fa fa-cog"></i> <span>Cài đặt</span></a></li>

							</ul>

							<!-- Tab panes -->
							<div class="tab-content">
								<div role="tabpanel" class="tab-pane active" id="createtopic">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-xs-12">
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thông
												tin chủ đề</span>
										</div>
										<div class="col-lg-6 col-md-6 col-xs-12">
											<div class="search-message modifytopic-tab">
												<button>Go!</button>
												<input id="input-search" type="text" name="search"
													placeholder="Search for..." class="ipsearchmes">
											</div>
										</div>
									</div>

									<div id="thongbaothemchude"></div>
									<div class="clearfix"></div>
									<hr>
									<div class="formtopic">
										<form>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Tên chủ đề </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="themtenchude" type="text" name="nametopic"
														required="">
												</div>
											</div>
											<div class="clearfix"></div>

											<hr>
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Cấu
												trúc giải thưởng</span>
											<hr>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Giải nhất </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5" id="numberone"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Giải nhì</label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5" id="numbertwo"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Giải ba </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5" id="numberthree"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>
											<hr>
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thời
												gian nộp bài</span>
											<hr>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày bắt đầu nộp bài </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="startda" required="">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày kết thúc nộp bài </label><span
														class="require">*</span>
												</div>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="endda" required="">
												</div>
											</div>
											<div class="clearfix"></div>
											
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày thông báo kết quả </label><span
														class="require">*</span>
												</div>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="enddanotify" required="">
												</div>
											</div>
											<div class="clearfix"></div>
											<hr>


										</form>
										<span
											style="font-size: 16px; font-weight: bold; color: #73879C;">Đội
											ngũ chuyên gia</span>
										<hr>
										<div class="row space-fiels">
											<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
												<label for="nametopic">Chọn lĩnh vực </label><span
													class="require">*</span>
											</div>
											<div class="col-md-9 col-sm-9 col-xs-12"
												style="text-align: center;">
												<div class="row">
													<div class="col-md-9">
														<select id="chonlinhvuc" class="form-control"
															style="border-radius: 0px;">

															<!-- Ajax load chủ đề -->

														</select>
													</div>
													<div class="col-md-3">
														<small class="err-sea" id="err-sea">Vui lòng nhập
															thông tin tìm kiếm *</small>
														<button class="btn btn-primary" id="search"
															style="border-radius: 0px;">Tìm kiếm</button>
													</div>
												</div>
												<hr>
												<!-- <div class="tbl-search-experts"> -->
												<div class="tbl">
													<table class="table table-bordered custable table-hover"
														id="tablestatistic">
														<thead>
															<tr>
																<th>Stt</th>
																<th>Tên tác giả</th>
																<th>Lĩnh vực</th>
																<th>Lựa chọn</th>
															</tr>
														</thead>
														<tbody id="myTable">
															<!-- Ajax load chuyen gia -->
														</tbody>
													</table>
												</div>
											</div>
										</div>
										<!-- <div style="text-align: center;">
											<small id="stter" class="sttus-err">Vui lòng điền đầy
												đủ thông tin *</small><br>
											 <button type="button" class="btn btn-danger" id="themchude"
												style="border-radius: 0px;">
												Thêm mới <i class="fa fa-send"></i>
											</button> 
										</div> -->
										<form enctype="multipart/form-data" id="frm-uploadhinh">
											<hr>
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Hình
												ảnh mô tả</span>
											<hr>
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
											<div style="text-align: center;">
												<small id="stter" class="sttus-err">Vui lòng điền
													đầy đủ thông tin *</small><br>
												<button type="button" class="btn btn-danger" id="themchude"
													style="border-radius: 0px;">
													Thêm mới chủ đề <i class="fa fa-send"></i>
												</button>
											</div>
										</form>
									</div>
								</div>
								<!--  tab 2 -->
								<div role="tabpanel" class="tab-pane" id="modidytopic">

									<div class="row space-fiels">
										<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
											<label for="nametopic">Chọn lĩnh vực </label><span
												class="require">*</span>
										</div>
										<div class="col-md-9 col-sm-9 col-xs-12"
											style="text-align: center;">
											<div class="row">
												<div class="col-md-9">
													<select id="chonlinhvucchinhsua" class="form-control"
														style="border-radius: 0px;">

														<!-- Ajax load chủ đề -->

													</select>
												</div>
												<div class="col-md-3">
													<small class="err-sea" id="err-sea">Vui lòng nhập
														thông tin tìm kiếm *</small>
													<button class="btn btn-primary" id="searchchinhsua"
														style="border-radius: 0px;">Tìm kiếm</button>
												</div>
											</div>
										</div>
									</div>
									<hr>
									<div class="row">
										<div class="col-lg-6 col-md-6 col-xs-12">
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thông
												tin chủ đề</span>
										</div>

										<div class="col-lg-6 col-md-6 col-xs-12">
											<div class="search-message modifytopic-tab">
												<button>Go!</button>
												<input id="timkiemsuachude" type="text" name="search"
													placeholder="Search for..." class="ipsearchmes"
													onkeyup="searchFunc('timkiemsuachude','myTableChinhSua');">
											</div>
										</div>
									</div>

									<hr>
									<div class="clearfix"></div>
									<table
										class="table table-bordered custable customtable2 table-hover"
										id="tablestatistic">
										<thead>
											<tr>
												<th>Stt</th>
												<th>Mã chủ đề</th>
												<th>Tên chủ đề</th>
												<th>Lĩnh vực</th>
												<th>Ngày bắt đầu</th>
												<th>Ngày kết thúc</th>
												<th>Ngày thông báo kết quả</th>
												<th class="hidden">Hình ảnh</th>
												<th>Hình ảnh</th>
											</tr>
										</thead>
										<tbody id="myTableChinhSua">
											<!-- Ajax load table -->
										</tbody>
									</table>
									<div class="formtopic">
										<form>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Tên chủ đề </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="tenchude-chinhsua" type="text" name="nametopic"
														required="">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày bắt đầu </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="startda2" required="">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày kết thúc </label><span
														class="require">*</span>
												</div>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="endda2" required="">
												</div>
											</div>
											<div class="clearfix"></div>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày thông báo kết quả </label><span
														class="require">*</span>
												</div>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="enddanotify2" required="">
												</div>
											</div>
											<div class="clearfix"></div>
											<hr>
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Đội
												ngũ chuyên gia</span>
											<hr>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Chuyên gia </label><span
														class="require">*</span>
												</div>
												<div class="col-md-9 col-sm-9 col-xs-12"
													style="text-align: center;">
													<div class="">
														<table class="table table-bordered custable table-hover"
															id="tablestatistic">
															<thead>
																<tr>
																	<th>Stt</th>
																	<th>Tên tác giả</th>
																	<th>Lĩnh vực</th>
																	<th class="hidden"></th>
																</tr>
															</thead>
															<tbody id="myTableChinhSuaChuyenGia">
																<!-- Ajax load dữ lli -->
															</tbody>
														</table>
													</div>
												</div>
											</div>
											<!-- <span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Cấu
												trúc giải thưởng</span>
											<hr>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Giải nhất </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Giải nhì </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Giải ba </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Khác </label><span class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<textarea rows="5"></textarea>
												</div>
											</div>
											<div class="clearfix"></div>
											<hr> -->
										</form>

										<form enctype="multipart/form-data"
											id="frm-uploadhinhchinhsua">

											<hr>
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Hình
												ảnh mô tả</span>
											<hr>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Hình ảnh mô tả </label><span
														class="require">*</span>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<div id="chinhsuahinh" class="imgnew">
														<img id="hinhchude" src=""
															class="img-rounded file-upload-image" width="100%">
													</div>
													<input type="file" name="imgnews" value=""
														onchange="readURL(this);" id="img-new-chinhsua"
														accept="image/*">
												</div>
											</div>
											<div style="text-align: center;">
												<small id="stter" class="sttus-err">Vui lòng điền
													đầy đủ thông tin *</small><br>
												<button type="button" class="btn btn-danger"
													id="capnhatchude" style="border-radius: 0px;">
													Cập nhật chủ đề <i class="fa fa-send"></i>
												</button>
											</div>
										</form>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="removetopic">
									<div class="row space-fiels">
										<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
											<label for="nametopic">Chọn lĩnh vực </label><span
												class="require">*</span>
										</div>
										<div class="col-md-9 col-sm-9 col-xs-12"
											style="text-align: center;">
											<div class="row">
												<div class="col-md-9">
													<select id="chonlinhvucxoa" class="form-control"
														style="border-radius: 0px;">

														<!-- Ajax load chủ đề -->

													</select>
												</div>
												<div class="col-md-3">
													<small class="err-sea" id="err-sea">Vui lòng nhập
														thông tin tìm kiếm *</small>
													<button class="btn btn-primary" id="searchxoachude"
														style="border-radius: 0px;">Tìm kiếm</button>
												</div>
											</div>
										</div>
									</div>
								
									<div class="row">
										<div class="col-lg-6 col-md-6 col-xs-12">
											<span
												style="font-size: 16px; font-weight: bold; color: #73879C;">Thông
												tin chủ đề</span>
										</div>
										<div class="col-lg-6 col-md-6 col-xs-12">
											<div class="search-message modifytopic-tab">
												<button>Go!</button>
												<input id="timkiemxoachude" type="text" name="search" placeholder="Search for..."
													class="ipsearchmes" onkeyup="searchFunc('timkiemxoachude','myTableXoaChuDe')">
											</div>
										</div>
									</div>
									<div class="clearfix"></div>
									<hr>
									<table
										class="table table-bordered custable customtable2 table-hover"
										id="tablestatistic">
										<thead>
											<tr>
												<th>Stt</th>
												<th class="hidden">Mã chủ đề</th>
												<th>Tên chủ đề</th>
												<th>Lĩnh vực</th>
												<th>Ngày bắt đầu</th>
												<th>Ngày kết thúc</th>
												<th>Ngày thông báo kết quả</th>
												<th class="hidden">Hình ảnh</th>
												<th>Hình ảnh</th>
											</tr>
										</thead>
										<tbody id="myTableXoaChuDe">
											<!-- Ajax load table -->
										</tbody>
									</table>
									<div class="formtopic">
										<form>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Tên chủ đề </label>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input id="tenchude-xoa" type="text" name="nametopic" disabled="true">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày bắt đầu </label>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="startda3" required="" readonly="readonly">
												</div>
											</div>
											<div class="clearfix"></div>

											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày kết thúc</label>
												</div>
												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="endda3" required="" readonly="readonly">
												</div>
											</div>
											<div class="clearfix"></div>
											<div class="row space-fiels">
												<div class="col-md-3 col-sm-3 col-xs-12 alinetexxt">
													<label for="nametopic">Ngày thông báo kết quả </label><span
														class="require">*</span>
												</div>

												<div class="col-md-6 col-sm-6 col-xs-12">
													<input type="date" name="" id="enddanotify3" required="">
												</div>
											</div>
											<div class="clearfix"></div>
											<hr>
										</form>
										<div style="text-align: center;">
											<button class="btn btn-danger" id="btn-xoachude"
												style="border-radius: 0px;">
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
	<!--  -->
	<!-- Custom styling plus plugins -->
	<script src="./public/jQuery/jquery-3.2.1.min.js"></script>
	<script src="./public/js/bootstrap.min.js"></script>
	<script src="./public/js/jsCustom.js"></script>
	<script type="text/javascript" src="./public/admin-js/quanlychude.js"></script>
</body>
</html>