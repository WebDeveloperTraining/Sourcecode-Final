<%@page import="Models.LoginModels"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang chủ</title>
    <!-- Bootstrap -->
    <link href="./public/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="./public/font-awesome/css/font-awesome.min.css" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <script src="./public/jQuery/jquery-3.2.1.min.js"></script>
    <script src="./public/js/bootstrap.min.js"></script>

    <!-- custom design  -->

    <link rel="stylesheet" href="./public/css/home.css">
    <script src="./public/js/homejs.js"></script>
    <style type="text/css">
    	.captiactivi a{
    		font: normal normal 16px/30px Times New Roman, serif;
    	}
    	.cusste {
    		font: italic bold 13px/30px Georgia, serif;
    	}
    </style>
</head>

<body >
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
                <a class="navbar-brand" href="${pageContext.request.contextPath}/Home">Website Hội Thảo</a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="${pageContext.request.contextPath}/Home">Trang Chủ</a></li>
                    <li>
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
        <div class="row" >
            <div class="col-md-8 col-sm-8 col-xs-12" >
                <div class="information message">
                    <h2>Lời nói đầu</h2>
                    <p>Chúng tôi cảm ơn bạn đã ghé thăng trang web của chúng tôi. Website Hội Thảo được xây dựng nhằm tìm kiếm cũng như ứng dụng các nghiên cứu mới trong tất cả các lĩnh vực cuộc sống để từ đó tiến tới xây dụng một quốc gia phát triển mang tầm cỡ thế giới</p>
                    <p>Chúng tôi rất hân hạnh được mời bạn tham quan cũng như tham gia vào các bài viết chủ đề được ban tổ chức đưa ra. Và trước tiên hãy coi xem website của chúng tôi có những gì?</p>
                </div>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12" >
                <div class="panel panel-primary">
                    <div class="panel-heading">Tin tức và sự kiện</div>
                    <div id="div-sukien" class="panel-body cuspanel-body">
                        <!-- <div class="row" >
                            <div class="col-md-3" style="padding: 0px;">
                                <img src="./public/images/1.jpg" class="img-thumbnail img-responsive">
                            </div>
                            <div class="col-md-9" style="margin: 0px;">
                                <div class="caption-event">
                                    <a href="#">Hội thảo về công nghệ IOT sẽ diễn ra vào ngày 20/11/2017</a>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="row" style="margin: 0px;">
                            <div class="col-md-3" style="padding: 0px;">
                                <img src="./public/images/1.jpg" class="img-thumbnail img-responsive">
                            </div>
                            <div class="col-md-9" style="margin: 0px;">
                                <div class="caption-event">
                                    <a href="#">Hội thảo về công nghệ IOT sẽ diễn ra vào ngày 20/11/2017</a>
                                </div>
                            </div>
                        </div>
                        <hr>
                        <div class="row" style="margin: 0px;">
                            <div class="col-md-3" style="padding: 0px;">
                                <img src="./public/images/1.jpg" class="img-thumbnail img-responsive">
                            </div>
                            <div class="col-md-9" style="margin: 0px;">
                                <div class="caption-event">
                                    <a href="#">Hội thảo về công nghệ IOT sẽ diễn ra vào ngày 20/11/2017</a>
                                </div>
                            </div>
                        </div>
                        <hr> -->
                    </div>
                </div>
            </div>
        </div>

        <div class="activities">
            <div class="heading-activi">
                <div class="row">
                    <div class="col-md-8 col-sm-8 col-xs-12">
                        <h4>Hội Thảo Sắp Diễn Ra</h4>
                    </div>
                    <div class="col-md-4 col-sm-4 col-xs-12 ali-ele">
                        <button class="btn btn-default custombtn">Tìm Hiểu Thêm <i class="fa fa-rocket"></i></button>
                    </div>
                </div>
            </div>
            <div class="body-activi">
                <div class="row" style="margin: 0px;">
                    <div class="col-md-5 col-sm-4 col-xs-12">
                        <div id="div-chudethang" class="captiactivi" id="ds-chu-de">
                            <h2>Top 5 chủ đề mới nhất</h2>
                            <hr>
                            <!-- <p><a> Xu thế công nghệ thế giời có gì thay đổi?</a></p>
                            <p><a>Trí tuệ nhân tạo đã tiến tới đâu?</a></p>
                            <p><a>Sức mạnh của IOT?</a></p> -->
                           
                        </div>
                        <div class='pull-right cusste'>
                        	<a href='${pageContext.request.contextPath}/ChuDeControllers'>Tìm hiểu thêm...</a>
                        </div>
                        <div class="next-view-topic">
                            <a href="#listacti"  data-slide="next"><i class="fa fa-angle-left"></i> </a>
                            <a href="#listacti"  data-slide="prev"><i class="fa fa-angle-right"></i> </a>
                        </div>
                    </div>
                    <div class="col-md-7 col-sm-8 col-xs-12" style="padding: 0px;">
                        <div id="listacti" class="carousel slide" data-ride="carousel">
                            <div class="carousel-inner" id="dsChuDe">

<!--                                 <div class="item active"> -->
<!--                                     <div class="thumbnail"> -->
<!--                                         <img src="./public/images/1.jpg" alt="Avatar" class="image"> -->
<!--                                         <div class="overlay"> -->
<!--                                             <div class="btnacti"> -->
<!--                                                 <button class="btn btn-default">Tham Gia <i class="fa fa-rocket"></i></button> -->
<!--                                                 <button class="btn btn-default">Tìm Hiểu Thêm <i class="fa fa-link"></i></button> -->
<!--                                             </div> -->
<!--                                         </div> -->
<!--                                         <div class="caption"> -->
<!--                                             <h3>Chủ đề: <small>Ứng dụng trí tuệ nhân tạo vào cuộc sống.</small></h3> -->
<!--                                         </div> -->
<!--                                     </div> -->
<!--                                 </div> -->

<!--                                 <div class="item"> -->
<!--                                     <div class="thumbnail"> -->
<!--                                         <img src="./public/images/1.jpg" alt="Avatar" class="image"> -->
<!--                                         <div class="overlay"> -->
<!--                                             <div class="btnacti"> -->
<!--                                                 <button class="btn btn-default">Tham Gia <i class="fa fa-rocket"></i></button> -->
<!--                                                 <button class="btn btn-default">Tìm Hiểu Thêm <i class="fa fa-link"></i></button> -->
<!--                                             </div> -->
<!--                                         </div> -->
<!--                                         <div class="caption"> -->
<!--                                             <h3>Chủ đề: <small>Ứng dụng trí tuệ nhân tạo vào cuộc sống.</small></h3> -->
<!--                                         </div> -->
<!--                                     </div> -->
<!--                                 </div> -->

<!--                                 <div class="item"> -->
<!--                                     <div class="thumbnail"> -->
<!--                                         <img src="./public/images/1.jpg" alt="Avatar" class="image"> -->
<!--                                         <div class="overlay"> -->
<!--                                             <div class="btnacti"> -->
<!--                                                 <button class="btn btn-default">Tham Gia <i class="fa fa-rocket"></i></button> -->
<!--                                                 <button class="btn btn-default">Tìm Hiểu Thêm <i class="fa fa-link"></i></button> -->
<!--                                             </div> -->
<!--                                         </div> -->
<!--                                         <div class="caption"> -->
<!--                                             <h3>Chủ đề: <small>Ứng dụng trí tuệ nhân tạo vào cuộc sống.</small></h3> -->
<!--                                         </div> -->
<!--                                     </div> -->
<!--                                 </div> -->
                          </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <hr>
        <div class="expertss">
            <div id="wrapper">
                <section id="generic-tabs">
                    <ul id="tabs">
                        <li>
                            <a title="Home" href="#first-tab"><i class="fa fa-home"></i> Thông tin</a>           
                        </li>
                        <li>
                            <a title="Photos" href="#second-tab"><i class="fa fa-picture-o"></i> Hình ảnh</a> 
                        </li>
                        <li>
                            <a title="About" href="#third-tab"><i class="fa fa-info-circle"></i> Chuyên gia</a>  
                        </li>               
                        <li>
                            <a title="Contact" href="#fourth-tab"><i class="fa fa-envelope"></i> Liên hệ</a>        
                        </li>
                    </ul>
                    <div id="first-tab" class="tab-content">        
                      <h1>Đôi nét về chúng tôi</h1>
                      <p><strong><a href="#">Website hội thảo</a> chúng tôi tự hào là một trong những trang web chất lượng cho các chương trinh hội thảo</strong></p>
                      <p> WorkShop Website - HoChiMinh University of Technology and Education</p>
                      <p>Website được thiết kế bởi team Venus</p>
                  </div>

                  <div id="second-tab" class="tab-content">        
                      <h1>Không gian làm việc của chúng tôi!</h1>
                      <a href="#" title="#"><img src="./public/images/home/space.jpg" alt="Twitter Boston"></a>
                      <p>Không gian làm việc là vấn đề luôn được chúng tôi quan tâm và chú trọng. Bởi lẽ, không gian góp phần mới vào sự hiệu quả cũng như năng suất công việc</p>
                  </div>

                  <div id="third-tab" class="tab-content">        
                      <h1>Chuyên Gia</h1>
                      <p>Chúng tôi tự hào khi có đội ngũ chuyên gia mạnh mẽ trong nhiều lĩnh vực, dù là nhỏ nhất, chúng tôi quan tâm đến tất cả các vấn đề mà bạn gạp phải, đồng thời sẵn sàng cùng bạn phát triển nó!</p>
                  </div>
                  <div id="fourth-tab" class="tab-content">   
                      <h1>Liên hệ với chúng tôi</h1>
                      <p><strong><a href="#">Website hội thảo</a> WorkShop Website - HoChiMinh University of Technology and Education</strong></p>
                      <p><strong>Address :</strong> 01 Vo Van Ngan, Linh Chieu Ward, Thu Duc District, Ho Chi Minh City</p>
                      <p><strong>Phone :</strong> (+84) 1684 648 350</p>
                      <p><strong>E-mail :</strong> trungtamhoithao@gmail.com</p>
                  </div>

              </section>  
          </div>
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

	<script type="text/javascript" src="./public/admin-js/home2.js"></script>
</body>

</html>