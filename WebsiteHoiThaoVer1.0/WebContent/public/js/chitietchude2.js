$(document).ready(function(){
	$.ajax({
		type: 'POST',
        data: {MaChuDe: $("#ma-chude").val()},
        dataType : 'json',
        url: 'ChiTietSubjectControllers',
        success: function(result){
        	$("#ten-chu-de").html("Chủ đề về "+result.tenChuDe);
        	$("#thoi-gian-dang-ki").html("Bắt đầu từ ngày "+result.ngayBatDau+" đến hết ngày "+result.ngayKetThuc);
        }
	})
	
	$.ajax({
		type: 'POST',
        data: {MaChuDe: $("#ma-chude").val()},
        dataType : 'json',
        url: 'ChiTietChuyenGiaControllers',
        success: function(result){
        	console.log(result);
        	var items=	"<h2>Đội ngũ chuyên gia</h2>";
        				
        	$.each(result, function(key, value){
        		var kinhnghiem = value.kinhNghiem;
        		var hinh = value.hinh;
        		if( value.kinhNghiem==undefined)
        			kinhnghiem = 'Đang cập nhật';
        		if(hinh==undefined)
        			hinh = './public/images/1.jpg';
        		else
        			hinh = './UploadFile/'+value.hinh;
        		items+= "<hr>"+
        				"<div class='row'>"+
			                "<div class='col-md-4 col-sm-4 col-xs-12'>"+
				                "<img src='"+hinh+"' class='img-responsive img-thumbnail'>"+
				            "</div>"+
				            "<div class='col-md-8 col-sm-8 col-xs-12'>"+
				                "<p>Chuyên gia: "+value.tenChuyenGia+"</p>"+
				                "<p>Chuyên ngành: "+value.hocVan+"</p>"+
				                "<p>Kinh nghiệm: "+kinhnghiem+"</p>"+
				            "</div>"+
				        "</div>"
        	})
        	$("#doi-ngu-chuyen-gia").html(items);
        }
	})
	
	$.ajax({
		type: 'POST',
        data: {MaChuDe: $("#ma-chude").val()},
        dataType : 'json',
        url: 'ChiTietGiaiThuongControllers',
        success: function(result){
        	console.log(result);
        	var items=	"<h2>Giải thưởng</h2>";
        				
        	$.each(result, function(key, value){
        		items+= "<hr>"+
        				"<div class='row'>"+
			                "<div class='col-md-4 col-sm-4 col-xs-12'>"+
				                " <p>"+value.TenGiaiThuong+"</p>"+
				            "</div>"+
				            "<div class='col-md-8 col-sm-8 col-xs-12'>"+
				                "<p>"+value.NoiDung+"</p>"+
				            "</div>"+
				        "</div>"
        	})
        	$("#giai-thuong").html(items);
        }
	})
	$("#tham-gia-chu-de").click(function(){
		window.location.href = "DangKiBaiDuThiControllers";
	})
})