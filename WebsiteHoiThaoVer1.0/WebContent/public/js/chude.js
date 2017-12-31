$(document).ready(function(){
	
	$.ajax({
		type: 'POST',
        data: {},
        dataType : 'json',
        url: 'LoadDanhSachChuDeControllers',
        success: function(result){
        	var items = "";
        	var k = 0;
        	$.each(result, function(key, value){
        		if(k==0){
        		items += "<div class='col-lg-4 col-md-4 col-sm-4 col-xs-12'>"+
			                "<div class='price_card alpha'>"+
			                    "<div class='header'>"+
			                        "<span class='price'> Hội thảo với chủ đề "+value.tenChuDe+"</span>"+
			                        "<span class='name'></span>"+
			                    "</div>"+
			                    "<ul class='features'>"+
			                        "<li>Thời gian đăng kí và gửi bài viết đến hết ngày "+value.ngayKetThuc+"</li>"+
			                        "<li>Thời gian công bố kết quả dự kiến "+value.ngayThongBaoKQ+"</li>"+
			                    "</ul>"+
			                    "<button id="+value.maChuDe+">Chi Tiết</button>"+
			                "</div>"+
			            "</div>"
			                k=1;
        		}else if(k==1){
        			items += "<div class='col-lg-4 col-md-4 col-sm-4 col-xs-12'>"+
					                "<div class='price_card bravo'>"+
					                    "<div class='header'>"+
					                        "<span class='price'> Hội thảo với chủ đề "+value.tenChuDe+"</span>"+
					                        "<span class='name'></span>"+
					                    "</div>"+
					                    "<ul class='features'>"+
					                        "<li>Thời gian đăng kí và gửi bài viết đến hết ngày "+value.ngayKetThuc+"</li>"+
					                        "<li>Thời gian công bố kết quả dự kiến "+value.ngayThongBaoKQ+"</li>"+
					                    "</ul>"+
					                    "<button id="+value.maChuDe+">Chi Tiết</button>"+
					                "</div>"+
					            "</div>"
	                k=2;
        		}else{
        			items += "<div class='col-lg-4 col-md-4 col-sm-4 col-xs-12'>"+
				                "<div class='price_card charlie'>"+
				                    "<div class='header'>"+
				                        "<span class='price'> Hội thảo với chủ đề "+value.tenChuDe+"</span>"+
				                        "<span class='name'></span>"+
				                    "</div>"+
				                    "<ul class='features'>"+
				                        "<li>Thời gian đăng kí và gửi bài viết đến hết ngày "+value.ngayKetThuc+"</li>"+
				                        "<li>Thời gian công bố kết quả dự kiến "+value.ngayThongBaoKQ+"</li>"+
				                    "</ul>"+
				                    "<button id="+value.maChuDe+">Chi Tiết</button>"+
				                "</div>"+
				            "</div>"
	                k=0;
        		}
        	});
        	$("#ds-cac-chu-de-moi").html(items);
        	$("#ds-cac-chu-de-moi button").click(function(event){
        		var id = event.target.id;
        		window.location.href="ChiTietChuDeControllers?id="+id;
        	})
        }
	});
	

})