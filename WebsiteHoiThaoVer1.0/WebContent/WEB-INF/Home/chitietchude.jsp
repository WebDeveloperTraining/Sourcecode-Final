<html lang="en">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thông tin chủ đề</title>
    <!-- Bootstrap -->
    <link href="./public/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="./public/font-awesome/css/font-awesome.min.css" rel="stylesheet">

    <!-- custom design  -->
    <link rel="stylesheet" href="./public/css/home.css">
    
</head>

<body >
	<input type="text " name="namepost" id="ma-chude" style="display: none;" value="<%=request.getAttribute("id") %>"  disabled="true">
    <div class="headerpage">
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-6 col-sm-4 col-md-4">
                    <img class="img-responsive" src="./public/images/home/Logo.png" alt="Chania">
                </div>
                <div class="col-xs-6 col-sm-4 col-md-4 col-md-offset-4 col-xs-offset-0 aline-t">
                    <h4 class="text-right"><strong> Social Network</strong></h4>
                    <div class="row">
                        <div class="col-xs-12 col-md-6 col-md-offset-6 col-xs-offset-0">
                            <a target="_blank" href="https://www.facebook.com/" class="fa fa-facebook icon-face"></a>
                            <a target="_blank" href="https://www.google.com.vn/" class="fa fa-google icon-goo"></a>
                            <a target="_blank" href="https://twitter.com/" class="fa fa-twitter icon-tw"></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                        
                </button>
                <a class="navbar-brand" href="#">Website Hội Thảo</a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li><a href="${pageContext.request.contextPath}/Home">Trang Chủ</a></li>
                    <li class="active">
                        <a href="${pageContext.request.contextPath}/ChuDeControllers">Chủ đề </a>
                    </li>
                    <% if(session.getAttribute("Quyen")!=null){ 
                    		int maQuyen=Integer.parseInt(session.getAttribute("Quyen").toString()); %>
                    		<% if(maQuyen==1){%>
                    			<li><a href="${pageContext.request.contextPath}/QuanLyChung">Trang Admin</a></li>
                    		<%}%>
                    		<% if(maQuyen==2){%>
                    			<li><a href="${pageContext.request.contextPath}/TrangCaNhanControllers">Trang chuyên gia</a></li>
                    		<%}%>
                    		<% if(maQuyen==3){%>
                    			<li><a href="${pageContext.request.contextPath}/QuanLyBaiViet">Trang thư ký</a></li>
                    		<%}%>
                    <%} %>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                	<% if(session.getAttribute("TenNguoiDung")!=null){%>
                		<li><a href="${pageContext.request.contextPath}/TrangCaNhanControllers"><%= session.getAttribute("TenNguoiDung").toString() %></a></li>
                		<li><a href="${pageContext.request.contextPath}/DangXuatControllers">Đăng Xuất</a></li>
                	<%} else { %>
                    	<li><a href="${pageContext.request.contextPath}/DangKyTaiKhoan"><span class="fa fa-sign-in"></span> Đăng kí</a></li>
                    	<li><a href="${pageContext.request.contextPath}/Login"><span class="fa fa-sign-out"></span> Đăng Nhập</a></li>
                    <%} %>
                </ul>
            </div>
        </div>
    </nav>
    <div id="first-slider" class="">
        <div id="carousel-example-generic" class="carousel slide carousel-fade">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>
                <li data-target="#carousel-example-generic" data-slide-to="1" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2" class=""></li>
                <li data-target="#carousel-example-generic" data-slide-to="3" class=""></li>
            </ol>
            <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <!-- Item 1 -->
                <div class="item slide1">
                    <div class="row">
                        <div class="container">
                            <div class="col-md-3 text-right">
                                <img  style="max-width: 200px;" data-animation="animated zoomInLeft" src="./public/images/home/window-domain.png"
                                class="resp">
                            </div>
                            <div class="col-md-9 text-left">
                                <h3 data-animation="animated bounceInDown" class="">New Technology!</h3>

                                <h4 data-animation="animated bounceInUp" class=""></h4> 
                           </div>
                       </div>
                   </div>
               </div>
               <!-- Item 2 -->
               <div class="item slide2 active">
                    <div class="row">
                        <div class="container">
                            <div class="col-md-7 text-left">
                               <h3 data-animation="animated bounceInDown" class=""> World Technology Trends</h3>
                               <h4 data-animation="animated bounceInUp" class=""></h4>
                            </div>
                            <div class="col-md-5 text-right">
                                <img style="max-width: 200px;" data-animation="animated zoomInLeft" src="./public/images/home/rack-server-unlock.png"
                                class="resp">
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Item 3 -->
                <div class="item slide3">
                    <div class="row">
                        <div class="container">
                            <div class="col-md-7 text-left">
                                <h3 data-animation="animated bounceInDown" class="">IOT and API are growing rapidly</h3>
                                <h4 data-animation="animated bounceInUp" class=""></h4>
                            </div>
                            <div class="col-md-5 text-right">
                                <img style="max-width: 200px;" data-animation="animated zoomInLeft" src="./public/images/home/globe-network.png"
                                class="resp">
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Item 4 -->
                <div class="item slide4">
                    <div class="row">
                        <div class="container">
                            <div class="col-md-7 text-left">
                                <h3 data-animation="animated bounceInDown" class="">Creativity never ceases</h3>

                                <h4 data-animation="animated bounceInUp" class=""></h4>

                            </div>
                            <div class="col-md-5 text-right">
                                <img style="max-width: 200px;" data-animation="animated zoomInLeft" src="./public/images/home/internet-speed.png"
                                class="resp">
                            </div>
                        </div>
                    </div>
                </div>
            <!-- End Item 4 -->
            </div>
            <!-- End Wrapper for slides--> 
            <a class="left carousel-control" href="#carousel-example-generic" role="button"
            data-slide="prev">
            <i class="fa fa-angle-left"></i><span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#carousel-example-generic"
            role="button" data-slide="next">
            <i class="fa fa-angle-right"></i><span class="sr-only">Next</span>
            </a>
        </div>
    </div>
    
    <!--   <hr class="linehr"> -->
    <div class="page-panel">
        <div class="information message">
            <h2 id="ten-chu-de"></h2>
            <hr>
            <p>Lời nói đầu: Chúng tôi cảm ơn bạn đã và đang quan tâm đến các chủ đề mà ban tôt chức đưa ra. Tiếp nối sự thành công của chủ đề trước. Trong chủ đề lần này chúng tôi hi vọng sẽ có thật nhiều những bài viết mới mang tầm cỡ vĩ mô được ứng dụng vào trong cuộc sống.</p>
            <p>Mục tiêu: Thông qua chủ đề chúng tôi hi vọng có thật nhiều những giải pháp mới, với tính sáng tạo và khả năng ứng dụng cao trong cuộc sống. Từ đó nâng cao được vị trí quốc gia trên trường quốc tế.</p>
        </div>
        <div class="announcement message">
            <h2>Lịch trình</h2>
            <hr>
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <p>Thời gian bắt đầu đăng kí và gửi bài: </p>
                </div>
                <div class="col-md-8 col-sm-8 col-xs-12">
                    <p id="thoi-gian-dang-ki"></p>
                </div>
            </div>

            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <p>Thời gian tổ chức báo cáo hội thảo và công bố bài viết đạt giải cao(dự tính): </p>
                </div>
                <div class="col-md-8 col-sm-8 col-xs-12">
                    <p>Ngày 30/01/2017 </p>
                </div>
            </div>                 
        </div>
        <div class="success message" id="doi-ngu-chuyen-gia">

        </div>
        <div class="warning message" id="giai-thuong">

        </div>
       <div class="btnbtn-thamgia">
           <button class="btn btn-info" id="tham-gia-chu-de"> Tham Gia Ngay <i class="fa fa-send"></i></button>
       </div>
    </div>
    <footer>
        <div class="footer-home">
            <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <h2> Website Hội Thảo - Trường Đại Học Sư Phạm Kĩ Thuật Thành Phố Hồ Chí Minh</h2>
                    <p>Website được thiết kiế bởi ...</p>
                </div>
                <div class="col-md-4 col-sm-4 col-xs-12">
                    <h2>Liên Hệ Với Chúng Tôi</h2>
                    <h6><strong>Địa Chỉ :</strong> Số 01, Võ Văn Ngân, Phường Linh Chiểu, Quận Thủ Đức, Thành Phố Hồ Chí Minh</h6>
                    <h6><strong>Điện Thoại :</strong> (+84) 1684 648 350</h6>
                    <h6><strong>E-mail :</strong> trungtamhoithao@gmail.com</h6>
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
    
    <!-- Custom styling plus plugins -->
    <script src="./public/jQuery/jquery-3.2.1.min.js"></script>
    <script src="./public/js/bootstrap.min.js"></script>
    <script src="./public/js/homejs.js"></script>
    <script src="./public/js/chitietchude2.js"></script>
</body>

</html>