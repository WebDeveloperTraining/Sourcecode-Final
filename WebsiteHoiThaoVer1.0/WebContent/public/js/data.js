/**
 * 
 */$(document).ready(function(){
	
	$.ajax({
		type: 'POST',
        		data: {},
        		dataType : 'json',
        		url: 'ThongTinCaNhanControllers',
        		success: function(result){
        			$("#ho-ten").html("<i class='fa fa-user user-profile-icon'></i> "+ result.tenNguoiDung);
        			$("#dia-chi").html("<i class='fa fa-map-marker user-profile-icon'></i> "+ result.diaChi );
        			$("#nghe-nghiep").html("<i class='fa fa-briefcase user-profile-icon'></i> Công việc: "+ result.ngheNghiep );
        			$("#mail").html("<i class='glyphicon glyphicon-envelope'></i> Email: "+ result.email );
        			

        			$("#ten-nguoi-dung").val(result.tenNguoiDung);
        			if(result.gioiTinh==true){
        				$("#gioi-tinh").val("true");
        			}
        			else{
        				$("#gioi-tinh").val("false");
        			}
        			$("#mail-nguoi-dung").val(result.email);
        			$("#dia-chi-nguoi-dung").val(result.diaChi);
        			$("#ngay-sinh-nguoi-dung").val(result.ngaySinh);
        			$("#dt-nguoi-dung").val(result.dienThoai);
        			$("#cmnd-nguoi-dung").val(result.CMND);
        			$("#hoc-van-nguoi-dung").val(result.hocVan);
        			$("#cong-viec-nguoi-dung").val(result.ngheNghiep);
        			$("#kinh-nghiem-nguoi-dung").val(result.kinhNghiem);
        			if(result.hinhAnh!=null){
        			$("#anh-dai-dien").attr({'src':"./UploadFile/"+result.hinhAnh});
        			}else{
        				$("#anh-dai-dien").attr({'src':"./public/images/1.jpg"});
        			}
        		}
	});

	$.ajax({
		type: 'POST',
        data: {},
        dataType : 'json',
        url: 'LoadThongTinDangNhapControllers',
        success: function(result){
        	console.log(result);
        	if(result!="1"){
	        	$("#ten-dang-nhap").val(result.tenDangNhap);
	        	$("#mat-khau").val(result.matKhau);
	        	$("#email-khoi-phuc").val(result.email);
	        	$("#passcu").val(result.matKhau);
        	}else{
        		console.log("error");
        	}
        	$("#doimatkhau").click(function() {
        		$("#statusupdate").html("");
        		var pass = $("#mat-khau").val();
        		var oldpass = $("#passcu").val();
        		var mail = $("#email-khoi-phuc").val();
        		var confirmpass = $("#xac-nhan-mat-khau").val();
        		
        		if($.trim(pass)==""||$.trim(confirmpass)==""||$.trim(mail)==""){
        			$("#statusupdate").html("Vui lòng điền đầy đủ thông tin!");
        		}else if($.trim(pass)!=$.trim(confirmpass)){
        			$("#statusupdate").html("Xác nhận mật khẩu không trùng khớp! Vui lòng kiểm tra lại.");
        		}else if($.trim(pass)==$.trim(oldpass)){
        			$("#statusupdate").html("Mật khẩu mới phải khác mật khẩu cũ!");
        		}else{
	        		$.ajax({
	        			type: 'POST',
	        	        data: { MatKhau: $.trim(pass),
	        	        	    Email: $.trim(mail)},
	        	        url: 'DoiMatKhauControllers',
	        	        success: function(kq){
	        	        	$("#confirmpass").css("display", "none");
	        	        	$("#mat-khau").prop('disabled', true);
	        	        	$("#email-khoi-phuc").prop('disabled', true);
	        	        	console.log(result);
	        	        	if(kq== true){
	        	        		$("#statusupdate").html("Cập nhật thành công!");
	        	        	}else{
	        	        		$("#statusupdate").html("Đã có lỗi sảy ra, Vui lòng thử lại sau!");
	        	        	}
	        	        }
	        		})
        		}
			})
        }
	});
	
	
	
	$("#btn-cap-nhat-anh-dai-dien").click(function() {

		var file = $('#upload-file').get()[0].files[0];
		var fileUpload = $('#upload-file').val();
		if(!file){
			alert("Vui lòng chọn file");
			return;
		} 
		$.ajax({
			url: 'CapNhatAnhDaiDienControllers',
			type: 'POST',
			data: new FormData($('#capnhatanhdaidien')[0]),
			processData: false,
			contentType: false
		}).done(function (result) {
			console.log(result);
			$("#anh-dai-dien").attr({'src':result});
		});
	});
	
	
	$("#btn-cap-nhat-thong-tin-ca-nhan").click(function() {
		console.log($("#gioi-tinh").val());
		if($.trim($("#ten-nguoi-dung").val())==""){
			$("#trang-thai-cap-nhat").html("Vui nhập đầy đủ thông tin!!")
		}else{
			$.ajax({
				type: 'POST',
        		data: {TenNguoiDung: $("#ten-nguoi-dung").val(),
        				GioiTinh: $("#gioi-tinh").val(),
        				DiaChi: $("#dia-chi-nguoi-dung").val(),
        				Email: $("#mail-nguoi-dung").val(),
        				DT: $("#dt-nguoi-dung").val(),
        				HocVan: $("#hoc-van-nguoi-dung").val(),
        				NgheNghiep: $("#cong-viec-nguoi-dung").val(),
        				CMND: $("#cmnd-nguoi-dung").val(),
        				NgaySinh: $("#ngay-sinh-nguoi-dung").val(),
        				KinhNghiem: $("#kinh-nghiem-nguoi-dung").val()
        		},
        		url: 'CapNhatThongTinCaNhanControllers',
        		success: function(result){
        			if(result=="true"){
        				$("#trang-thai-cap-nhat").html("Cập nhật thành công!")
        			}else{
        				$("#trang-thai-cap-nhat").html("Cập nhật không thành công! Vui lòng kiểm tra lại thông tin.")
        			}
        		}
			});
		}
	});
	

	$.ajax({
		type: 'POST',
        data: {},
        dataType : 'json',
        url: 'DanhSachChuDeControllers',
        success: function(result){
        	var items = "";
        	$.each(result, function(key, value){
        	   items += "<option value='" + value.maChuDe+ "'>" + value.tenChuDe + "</option>";
        	});
        	$("#danh-sach-chu-de").html(items);
        }
	});
	
	
	
	$("#btnsubmitpost").click(function(){
		var tenBai = $("#namepost").val();
		var maChuDe = $("#danh-sach-chu-de").val();
		var tomTat = $("#summary").val();
		var filedinhkem= $("#fileName").val();

		if($.trim(tenBai)==""||$.trim(tomTat)==""||$.trim(filedinhkem)==""){
			$("#trang-thai-gui-bai").html("Chắc chắn bạn đã điền đầy đủ thông tin và tệp đính kèm!.")
			$("#trang-thai-gui-bai").css("display", "block");
		}else{
			$.ajax({
				type: 'POST',
				data: { TenBaiDuThi: tenBai,
					    MaChuDe: maChuDe,
					    TomTat: tomTat,
					    TepDinhKem: filedinhkem
				},
				url: 'DangKiBaiDuThiControllers',
				success: function(result){
        			if(result=="1"){
        				$("#trang-thai-gui-bai").html("Gửi bài thành công!. Hãy đến trang Danh Sách Tham Gia để xem trạng thái bài!")
        				$("#trang-thai-gui-bai").css("display", "block");
        			}else if(result=="0"){
        				$("#trang-thai-gui-bai").html("Bạn đã đăng kí tham dự thi chủ đề này rồi!")
        				$("#trang-thai-gui-bai").css("display", "block");
        			}else if(result=="2"){
        				$("#trang-thai-gui-bai").html("Lỗi hệ thống, Vui lòng thử lại sau!")
        				$("#trang-thai-gui-bai").css("display", "block");
        			}
        			
        			$("#btnsubmitpost").click(function(){
        				var tenBai = $("#namepost").val();
        				var maChuDe = $("#danh-sach-chu-de").val();
        				var tomTat = $("#summary").val();
        				var filedinhkem= $("#fileName").val();

        				if($.trim(tenBai)==""||$.trim(tomTat)==""||$.trim(filedinhkem)==""){
        					$("#trang-thai-gui-bai").html("Chắc chắn bạn đã điền đầy đủ thông tin và tệp đính kèm!.")
        					$("#trang-thai-gui-bai").css("display", "block");
        				}else{
        					$.ajax({
        						type: 'POST',
        						data: { TenBaiDuThi: tenBai,
        							    MaChuDe: maChuDe,
        							    TomTat: tomTat,
        							    TepDinhKem: filedinhkem
        						},
        						url: 'DangKiBaiDuThiControllers',
        						success: function(result){
        		        			if(result=="1"){
        		        				$("#trang-thai-gui-bai").html("Gửi bài thành công!. Hãy đến trang Danh Sách Tham Gia để xem trạng thái bài!")
        		        				$("#trang-thai-gui-bai").css("display", "block");
        		        			}else if(result=="0"){
        		        				$("#trang-thai-gui-bai").html("Bạn đã đăng kí tham dự thi chủ đề này rồi!")
        		        				$("#trang-thai-gui-bai").css("display", "block");
        		        			}else if(result=="2"){
        		        				$("#trang-thai-gui-bai").html("Lỗi hệ thống, Vui lòng thử lại sau!")
        		        				$("#trang-thai-gui-bai").css("display", "block");
        		        			}
        		        		}
        		        	})
        				}
        			})

        		}
        	})
		}
	})



	
	
	$("#file").on("change",function(e){
		
		var files=$(this)[0].files;
		
		if(files.lenth==0){

		}else
			{
			
			console.log(files);
			$.ajax({
				url: 'UploadFileControllers',
				type: 'POST',
				data: new FormData($('#dinh-kem-tep')[0]),
				processData: false,
				contentType: false
			}).done(function (result) {
				console.log(result);
				$("#review-tep").attr({'src': "./UploadFile/" + result});
				$("#fileName").val(result);
			});
				
			}
	})

	
	
})