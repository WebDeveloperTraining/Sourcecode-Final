<!DOCTYPE html>
<html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Meta, title, CSS, favicons, etc. -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Duyệt Bài</title>

  <!-- Bootstrap -->
  <link href="./public/css/bootstrap.min.css" rel="stylesheet">
  <!-- Font Awesome -->
  <link href="./public/font-awesome/css/font-awesome.min.css" rel="stylesheet">

  
  <!-- custom design  -->
  <link href="./public/css/myStyles.css" rel="stylesheet">
  
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
          <a class="dropdown-toggle"  href="#" data-toggle="dropdown"><img style="height: 20px;width: 20px; padding: 0 0 0px" src=<%=session.getAttribute("Hinh") %> class="img-circle" alt="">
            <%=request.getSession().getAttribute("TenNguoiDung") %>
            <span class="fa fa-angle-down"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="${pageContext.request.contextPath}/ThongTinCaNhanControllers"><i class="fa fa-user"></i> Trang cá nhân</a></li>
           
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
          <div class="hidesmall">
            <h4><%=request.getSession().getAttribute("TenNguoiDung") %></h4>
          </div>
        </div>
        <div class="clearfix"></div>

      </div>
      <div class="hidesmall"><span>Tổng thể</span></div>
      <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>

      <div class="menu-list">

        <ul id="menu-content" class="menu-content collapse out">
          <li>
            <a href="${pageContext.request.contextPath}/TrangCaNhanControllers">
              <i class="fa fa-dashboard fa-lg"></i> Trang cá nhân
            </a>
          </li>

          <li  data-toggle="collapse" data-target="#products" class="collapsed">
            <a href="#"><i class="fa fa-asterisk fa-lg"></i> Bài của bạn <span class="arrow"></span></a>
          </li>
          <ul class="sub-menu collapse" id="products">
            <li class="active"><a href="#">Danh tham gia</a></li>
            <li><a href="newpost.html">Đăng kí tham gia mới</a></li>
          </ul> 
          <li class="active">
            <a href="#">
              <i class="fa fa-bell-o fa-lg"></i> Đọc và duyệt bài
            </a>
          </li>
        </ul>
        </div>
      </div>
      <!-- end left navigation -->
      <!-- page content -->
      <div class="x-panel">
        <h1 class="tismal-page">Danh sách bài</h1>
        <div class="row">
          <div class="col-lg-4 co-md-4 col-xs-12">
            
          </div>
          <div class="col-lg-8 col-md-12 col-xs-12 search-post" style="padding-bottom: 5px;">
            <button>Go!</button><input type="text" name="search" placeholder="Search for..." class="ipsearch">
          </div>
        </div>
        <div class="panel panel-default" style="width: 100%;">
          <div class="panel-heading" style="padding:0px; width: 100%;">
            <div class="row">
              <div class="col-lg-6 col-md-6 col-xs-12">
                <h3 class="detaillistt">Danh sách bài</h3>
              </div>
              <div class="col-lg-6 col-md-6 col-xs-12">
                <small class="smalldetaillistt" style="padding-top: 40px; float: right;">Ngày cập nhật: Tusesday, October 3, 2017</small>
              </div>
            </div>
          </div>
          <div class="panel-body">
            <div class="sorttable">
                <div class="row">
                  <div class="col-md-4">
                    <div class="form-group">
                      <label for="list topic">Chủ đề: </label>
                      <select class="topicsel" id="danh-sach-chu-de">
                      </select>
                    </div> 
                  </div>
                  <div class="col-md-4">
                    <div class="form-group">
                      <label for="list topic">Trạng thái: </label>
                      <select class="topicsel" id="danh-sach-trang-thai">
                        
                      </select>
                    </div>
                  </div>
                  <div class="col-md-4">
                    <button class="btn btn-success" style="border-radius: 0px;" id="loc-bai-viet">Tìm Kiếm</button>
                  </div>
                </div>
              
            </div>
            <table class="table table-bordered custable" id="table-tblriview">
              <thead>
                <tr>
                  <th>Mã bài viết</th>
                  <th>Tên bài viết</th>
                  <th>Tác giả</th>
                  <th>Trạng thái</th>
                </tr>
              </thead>
              <tbody id="ds-bai-theo-chuyen-gia">
                
              </tbody>
            </table>
            <p id="status-rearch" style="color: red; text-align: center;"></p>
            <br>
            <hr>

            <!-- detail -->
            <div class="info">
              <div class="row">
                <div class="col-lg-9 -sty-form">
                  <form id="form-post" class="blocks" action="#" method="post">
                    <div class="row" style="padding-top: 30px;">
                      <div class="col-md-3 spacetoge">
                        <label>Chủ đề * </label>
                      </div>
                      <div class="col-md-9 spacetoge">
                        <select disabled="true" id="ds-chu-de">
                          
                        </select>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-3 spacetoge">
                        <label id="pn">Mã bài viết * </label>
                      </div>
                      <div class="col-md-9 spacetoge">
                        <input type="text " name="namepost" id="ma-bai"  disabled="true">
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-3 spacetoge">
                        <label id="pn">Tên bài viết * </label>
                      </div>
                      <div class="col-md-9 spacetoge">
                        <input type="text " name="namepost" id="ten-bai"  disabled="true">
                      </div>
                    </div>
                    <div class="clearfix"></div>
                    <div class="row">
                      <div class="col-md-3 spacetoge">
                        <label id="nc">Tên tác giả * </label>
                      </div>
                      <div class="col-md-9 spacetoge">
                        <input type="text" name="" id="ten-tac-gia"  disabled="true">
                      </div>
                    </div>
                    <div class="clearfix"></div>
                    <div class="row">
                      <div class="col-md-3 spacetoge">
                        <label id="dc">Tóm tắt nội dung * </label>

                      </div>
                      <div class="col-md-9 spacetoge">
                        <textarea rows="15" name="summary" id="tom-tat-noi-dung"  disabled="true"></textarea>
                      </div>
                    </div>
                      <div class="clearfix"></div>
                    </form>
                  </div>
                  <br>
                  <br>
                  <div class="col-md-3">
                   <div class="panel panel-default">
                     <div class="panel-body"></div>
                   </div>
                 </div>
                 <div class="col-lg-3">
                  <img src="./public/images/day-pass.png" width="100%">
                </div>
              </div>
              <hr>
              <div class="row">
                <div class="col-md-8 col-md-offset-2">
                  <iframe id="noi-dung-bai" src="" frameborder="2" width="100%" height="800px"></iframe>
                </div>
              </div>
            </div>
          <hr>
          <form>
            <div class="row">
            	<div class="col-md-6 col-xs-12">
            		<div class="form-group">
		              <label for="status">Trạng thái</label>
		              <select class="form-control" id="trang-thai-review-bai-viet">
		              
		              </select>
		            </div>
            	</div>
            	<div class="col-md-6 col-xs-12">
            		<div class="form-group">
		              <label for="status">Điểm số</label>
		              <input type="number" name="" class="form-control" id="diem-so">
		            </div>
            	</div>
            </div>
            
            <div class="form-group">
              <label for="notice">Nhận xét</label>
              <textarea class="form-control" rows="5" id="nhan-xet"></textarea>
            </div>
          </form>
          <div class="warningsubmit">
            <p id="errorsubmit"></p>
          </div>
          <div class="submitp">
            <button class="btn btn-warning custombutton" id="btn-danh-gia-bai-viet">Nhận xét <i class="fa fa-send"></i></button>
           <button class="btn btn-info custombutton" id="btnsubmitpost">Hủy bỏ <i class="fa fa-close"></i></button>
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
   <script src="./public/js/review2.js"></script>
  
</body>
</html>