<!DOCTYPE html>
<html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Trang cá nhân</title>

  <!-- Bootstrap -->
  <link href="./public/css/bootstrap.min.css" rel="stylesheet">
  <!-- Font Awesome -->
  <link href="./public/font-awesome/css/font-awesome.min.css" rel="stylesheet">

  
  <!-- custom design  -->
  <link href="./public/css/myStyles.css" rel="stylesheet">


<style type="text/css">
.file-upload-button {
	text-aline: center;
	margin-top: 20px;
	width: 100%;
}
.cus-bor button{
text-aline: center;
}
.upload-label {
	text-aline: center !important;
	position: relative;
	display: inline-block;
	padding: 5px;
	background-color: skyblue;
	overflow: hidden;
	color: white;
	font-family: sans-serif;
	width: 100%;
	cursor: pointer;
	
}
.information-user input{
margin-top: 5px;
margin-bottom: 5px;
}
.information-user label{
margin-left: 10%; 
}
.input-file {
	opacity: 0;
	position: absolute;
	top: 0;
	left: 0;
	width: 20px;
	height: 20px;
	padding: 10px;
}

.-pic-dtai span {
	margin-top: 10px;
}
.change-info {
	text-align: center;
	float: none;
}
 .change-info button{
 text-align: center;
 border-radius: 0px;
 }
</style>
</head>
<body>
  <div class="container-body">
    <div class="row">
     <!--  top navigation -->
     <div class="top-navigation">
      <ul class="navbar-nav">
        <li role="presentation" class="dropdown">
          <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false"><i id="inbox" class="fa fa-envelope-o" aria-hidden="true" style="font-size: 15px;">
            <sup><span class="badge badge-default"  style="background-color: #1ABB9C;">3</span></sup></i>
          </a>


          <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
            <li >
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                  bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                   bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                   bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                  bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <div class="text-center" style="text-align: center;">
                <a>
                  <strong>Xem toàn bộ</strong>
                  <i class="fa fa-angle-right"></i>
                </a>
              </div>
            </li>
          </ul>


        </li>
        <li role="presentation" class="dropdown">
          <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false"><i id="notify" class="fa fa-bell-o" aria-hidden="true" style="font-size: 15px;">
            <sup><span class="badge badge-default" style="background-color: #1ABB9C;">7</span></sup></i>
          </a>


          <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
            <li >
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                  bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                  bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                  bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <a>
                <span class="image"><img src="./public/images/1.jpg" alt="Profile Image" /></span>
                <span>
                  <span>Hoàng Kim Vũ</span>
                  <span class="time">3 phút trước</span>
                </span>
                <span class="message">
                  bala bala bala bala...
                </span>
              </a>
            </li>
            <li>
              <div class="text-center" style="text-align: center;">
                <a>
                  <strong>Xem toàn bộ</strong>
                  <i class="fa fa-angle-right"></i>
                </a>
              </div>
            </li>
          </ul>

          
        </li>
        <li class="dropdown">
        	
          <a class="dropdown-toggle"  href="#" data-toggle="dropdown"><img style="height: 20px;width: 20px; padding: 0 0 0px" src=<%=session.getAttribute("Hinh")%> class="img-circle" alt="">
            <%=request.getSession().getAttribute("TenNguoiDung") %>
            <span class="fa fa-angle-down"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/TrangCaNhanControllers"><i class="fa fa-user"></i> Trang cá nhân</a></li>
           
            <li><a href="${pageContext.request.contextPath}/DangXuatControllers"><i class="fa fa-sign-out"></i> Đăng xuất</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <div class="clearfix"></div>
    <!-- end top navigation -->
    <!--  left navigation -->
     <div class="nav-side-menu">
      <div class="">
        <div class="title-web">
          <h3><a href="${pageContext.request.contextPath}/Home"><i class="fa fa-mortar-board"></i> <span>Website Hội Thảo</span></a>
          </h3>
        </div>
        <div class="clearfix"></div>
        <div class="img-info hidesmall">
          <div class="pic">
            <img src=<%=session.getAttribute("Hinh") %> class="img-circle" alt="Cinque Terre" width="50" height="50">Xin Chào,
          </div>
          <div class=" hidesmall">
            <h4> <%=request.getSession().getAttribute("TenNguoiDung") %></h4>
          </div>
        </div>
        <div class="clearfix"></div>

      </div>
      <div class="hidesmall"><span>Tổng thể</span></div>
      <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

      <div class="menu-list">

        <ul id="menu-content" class="menu-content collapse out">
          <li class="active">
            <a href="${pageContext.request.contextPath}/TrangCaNhanControllers">
              <i class="fa fa-dashboard fa-lg"></i> Trang cá nhân
            </a>
          </li>

          <li  data-toggle="collapse" data-target="#products" class="collapsed">
            <a href="#"><i class="fa fa-asterisk fa-lg"></i> Bài của bạn <span class="arrow"></span></a>
          </li>
          <ul class="sub-menu collapse" id="products">
            <li class="active"><a href="${pageContext.request.contextPath}/DanhSachThamGiaControllers">Danh tham gia</a></li>
            <li><a href="${pageContext.request.contextPath}/DangKiBaiDuThiControllers">Đăng kí tham gia mới</a></li>
          </ul>
          <%if((int)request.getSession().getAttribute("Quyen") == 2){ %>
          <li>
            <a href="${pageContext.request.contextPath}/DuyetBaiReviewControllers">
              <i class="fa fa-bell-o fa-lg"></i> Đọc và duyệt bài
            </a>
          </li>
          <%} %>
        </ul>
        </div>
      </div>
      <!-- end left navigation -->
      <!-- page content -->
      <div class="x-panel">
         <h1  class="tismal-page"">Thông tin cá nhân</h1>
         <div class="panel panel-default">
           <div class="panel-heading prog-day">
            <h2>Thông tin chi tiết <small> tiến độ hoàn thành: <span id="perprog">87.5%</span>
              <br>ngày cập nhật: Thursday September 28, 2017
            </small></h2>
          </div>
          <div class="panel-body">
            <div class="row">
              <div class="col-lg-3 cus-bor">
                <div class="-pic-dtai" style="text-aline: center !important;">
                  <img id="anh-dai-dien" src="" class="img-rounded" alt="Cinque Terre" width="100%">
				</div>
				<form id="capnhatanhdaidien" class="form-horizontal" enctype="multipart/form-data"> 
					<span class="file-upload-button"> 
						<label for="upload-file" class="upload-label">Cập nhật hình ảnh</label>
						<input class="input-file" id="upload-file" name="upload-file" type="file">
						<span class="uploaded-file"></span>
					</span>
				</form>
				<button class="btn btn-success" style="width: 100%;" type="button" id="btn-cap-nhat-anh-dai-dien">Lưu thay đổi</button>
                <div class="maininfo">
                  <ul class="list-des">
                    <li id="ho-ten"> 
                    </li>
                    <li id="dia-chi">
                    </li>
                    <li id="nghe-nghiep">
                       
                    </li>
                    <li id="mail">
                    </li>
                    <li class="m-top-xs">
                      <i class="fa fa-external-link user-profile-icon"></i>
                      <a href="http://www.facebook.com/profile/" target="_blank">facebook.com</a>
                    </li>
                  </ul>
                  <br>
                  <h5><strong>Tiến trình: </strong></h5>
                  <ul class="progess">
                    <li>
                      <strong>Tiến trình hoàn thành:</strong>
                      <div class="progress" id="probarr">
                        <div class="progress-bar" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 87.5%">
                          87.5%
                        </div>
                      </div>
                    </li>

                  </ul>
                </div>
              </div>
              <div class="col-lg-9 cus-bor">
                 <!-- Nav tabs -->
                <div class="card">
                  <ul class="nav nav-tabs cus" role="tablist">
                    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab"><i class="fa fa-home"></i>  <span>Trang chủ</span></a></li>
                    <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab"><i class="fa fa-user"></i>  <span>Thông tin</span></a></li>
                    <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab"><i class="fa fa-envelope-o"></i>  <span>Tin nhắn</span></a></li>
                    <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab"><i class="fa fa-cog"></i>  <span>Cài đặt</span></a></li>
                    
                  </ul>
                  
                  <!-- Tab panes -->
                  <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="home">
                     <blockquote class="quote-box">
                      <p class="quotation-mark">
                        “
                      </p>
                      <p class="quote-text">
                        <p>7 Rules of Life<p>
                        <p></p>    
                        <p>1) Make peace with your past so it won't screw up the present.</p>
                        <p> 2) What others think of you is none of your business.</p>
                        <p>3) Time heals almost everything, give it time.</p>
                        <p>4) Don't compare your life to others and don't judge them. You have no idea what their journey is all about.</p>
                        <p>5) Stop thinking too much, it's alright not to know the answers. They will come to you when you least expect it.</p>
                        <p>6) No one is in charge of your happiness, except you.</p>
                        <p>7) Smile. You don't own all the problems in the world.</p>
                      </p>
                      <hr>
                      <div class="blog-post-actions">
                        <p class="blog-post-bottom pull-left">
                          NoName
                        </p>
                        <p class="blog-post-bottom pull-right">
                          <span class="badge quote-badge">896</span>  ❤
                        </p>
                      </div>
                    </blockquote>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="profile">
                      <h4 style="color: #1ABB9C; padding-left: 20px;"><i class="fa fa-user"></i><strong> Thông tin cá nhân:</strong> </h4>
                      <div id="information" class="information-user">
                      	<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="ten-nguoi-dung">Tên Người Dùng</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input type="text" class="form-control" name="ten-nguoi-dung" placeholder="Tên người dùng" id="ten-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="ten-nguoi-dung">Giới Tính</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <select class="form-control" id="gioi-tinh">
						      <option value="true">Nam</option>
						      <option value="false">Nữ</option>
						    </select>
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="mail">Email</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="mail" placeholder="E-mail" id="mail-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="dia-chi">Địa chỉ</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="dia-chi" placeholder="Địa Chỉ" id="dia-chi-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="ngay-sinh">Ngày Sinh</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="date" name="ngay-sinh" id="ngay-sinh-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="dt">Điện thoại</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="dia-chi" placeholder="Điện thoại" id="dt-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="dt">CMND</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="CMND" placeholder="Số CMND" id="cmnd-nguoi-dung">
						  </div>
						</div>
                      </div>

                      <div class="infor2">
                        <h4 style="color: #1ABB9C; padding-left: 20px;"><strong><i class="fa fa-mortar-board"></i> Công việc & Học vấn:</strong> </h4>
                        <div id="information" class="information-user">
                        <div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="hocvan">Học vấn</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="hocvan" placeholder="Học vấn" id="hoc-van-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="congviec">Công việc</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="congviec" placeholder="Công việc" id="cong-viec-nguoi-dung">
						  </div>
						</div>
						<div class="row">
						  <div class="col-md-4 col-xs-12">
						    <label for="khinhnghiem">Kinh Nghiệm</label>
						  </div>
						  <div class="col-md-8 col-xs-12">
						    <input class="form-control" type="text" name="kinhnghiem" placeholder="Kinh nghiệm" id="kinh-nghiem-nguoi-dung">
						  </div>
						</div>
                        </div>
                      </div>
                      <div class="change-info">
                      	<p style="color: red" id="trang-thai-cap-nhat"></p>
                        <button type="button" class="btn btn-danger" id="btn-cap-nhat-thong-tin-ca-nhan">Cập nhật <i class="fa fa-send"></i></button>
                      </div>
                      
                    </div>
                    <div role="tabpanel" class="tab-pane" id="messages">
                      <ul class="event-list">
                        <li>
                          <time datetime="2014-07-20 0000">
                            <span class="day">8</span>
                            <span class="month">Jul</span>
                            <span class="year">2014</span>
                            <span class="time">12:00 AM</span>
                          </time>
                          <div class="info">
                            <h2 class="title"n>Invited to attend the press conference</h2>
                            <p class="desc">PS Vita</p>
                            <ul>
                              <li style="width:50%;">Abort</a></li>
                              <li style="width:50%;">View</li>
                            </ul>
                          </div>
                          <div class="social">
                            <ul>
                              <li class="facebook" style="width:33%;"><a href="#facebook"><span class="fa fa-facebook"></span></a></li>
                              <li class="twitter" style="width:34%;"><a href="#twitter"><span class="fa fa-twitter"></span></a></li>
                              <li class="google-plus" style="width:33%;"><a href="#google-plus"><span class="fa fa-google-plus"></span></a></li>
                            </ul>
                          </div>
                        </li>

                        <li>
                          <time datetime="2014-07-20 0000">
                            <span class="day">8</span>
                            <span class="month">Jul</span>
                            <span class="year">2014</span>
                            <span class="time">12:00 AM</span>
                          </time>
                          <div class="info">
                            <h2 class="title">invited to attend the press conference</h2>
                            <p class="desc">PS Vita</p>
                            <ul>
                              <li style="width:50%;">Abort</a></li>
                              <li style="width:50%;">View</li>
                            </ul>
                          </div>
                          <div class="social">
                            <ul>
                              <li class="facebook" style="width:33%;"><a href="#facebook"><span class="fa fa-facebook"></span></a></li>
                              <li class="twitter" style="width:34%;"><a href="#twitter"><span class="fa fa-twitter"></span></a></li>
                              <li class="google-plus" style="width:33%;"><a href="#google-plus"><span class="fa fa-google-plus"></span></a></li>
                            </ul>
                          </div>
                        </li>
                      </ul>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="settings">
                      <div class="settingsuser">
                        <form id="settinguser">
                          <div class="row">
                            <div class="col-lg-4 col-md-4 col-xs-12">
                              <label for="">Tên đăng nhập: </label>
                            </div>
                            <div class="col-lg-8 col-md-8 col-xs-12">
                              <input type="text" name="UserName"  id="ten-dang-nhap" value="" disabled="true">
                            </div>
                          </div>
                          <div class="row">
                            <div class="col-lg-4 col-md-4 col-xs-12">
                              <label for="">Mật khẩu: </label>
                            </div>
                            <div class="col-lg-8 col-md-8 col-xs-12">
                              <input type="Password" name="Password" id="mat-khau" value="" disabled="true"> <span class="fa fa-edit" id="modifypass"> Thay đổi</span>
                            </div>
                          </div>
                          <div class="row" style="display: none;" id="confirmpass">
                            <div class="col-lg-4 col-md-4 col-xs-12">
                              <label for="">Xác nhận mật khẩu: </label>
                            </div>
                            <div class="col-lg-8 col-md-8 col-xs-12">
                              <input type="Password" name="ConfirmPassword" id="xac-nhan-mat-khau" value="">
                            </div>
                          </div>
                          <div class="row">
                            <div class="col-lg-4 col-md-4 col-xs-12">
                              <label for="E-mail">Email: </label>
                            </div>
                            <div class="col-lg-8 col-md-8 col-xs-12">
                              <input type="E-mail" name="email" id="email-khoi-phuc" value="" disabled="true"> <span class="fa fa-edit" id="modifyemail">Thay đổi</span>
                            </div>
                            <input type="E-mail" name="email" id="passcu" style="display:none;" value="" disabled="true">
                          </div>
                        </form>
                        <p style="color: red; text-align: center;" id="statusupdate"></p>
                        <div class="changessitting">
                          <button type="button" class="btn btn-primary" id="doimatkhau">Lưu thay đổi</button>
                        </div>
                        
                      </div>
                    </div>
                  </div>
                </div>
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
            <h5>CopyRight &copy; 2017 - Trung tâm hội thảo Việt Nam Express</h5>
            <h6><strong>Địa chỉ :</strong> 01 Võ Văn Ngân, phường Linh Chiểu, quận Thủ Đức, TP.Hồ Chí Minh</h6>
            <h6><strong>Điện thoại :</strong> (+84) 1684 648 350</h6>
            <h6><strong>E-mail :</strong> trungtamhoithao@gmail.com</h6>
          </div>
        </div>
      </footer>
    </div>
  </div>
  
  
  <!-- Custom styling plus plugins -->
  <script src="./public/jQuery/jquery-3.2.1.min.js"></script>
  <script src="./public/js/bootstrap.min.js"></script>
    <script src="./public/js/jsCustom.js"></script>
    <script src="./public/js/data.js"></script>
    
</body>
</html>
