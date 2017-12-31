$(document).ready(function(){
	
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
	
	
	
	$.ajax({
		type: 'POST',
        data: {},
        dataType : 'json',
        url: 'DanhSachThamGiaControllers',
        success: function(result){
        	var items = "";
        	var flagg=0;
        	if (result.check == "fail") {
        		$("#status-rearch").html("Không tìm thấy kết quả!");
                return;
            }
        	$.each(result, function(key, value){
        		
        		if(flagg==0){
	        	   items += "<tr class='cus-colo'>" +
		        	   			"<td>"+ value.maBaiViet +"</td>"+
		        	   			"<td>"+ value.tenBaiViet +"</td>"+
		        	   			"<td>"+ value.tenChuDe +"</td>"+
		        	   			"<td>"+ value.trangThai +"</td>"+
		        	   			"<td>"+ value.diaChiFile +"</td>"+
		        	   			"<td><button type='button' class='btn btn-warning btn-xs sizebutton' data-toggle='modal' data-id='"+value.maBaiViet+"' data-target='#message-box'>thông báo</button></td>"+
		        	   			"<td style='display: none;'>"+ value.maChuDe +"</td>"+
		        	   			"<td style='display: none;'>"+ value.tomTat +"</td>"+
	        	   			"</tr>";
	        	   flagg=1;
        		}else{
        			items += "<tr>" +
			    	   			"<td>"+ value.maBaiViet +"</td>"+
			    	   			"<td>"+ value.tenBaiViet +"</td>"+
			    	   			"<td>"+ value.tenChuDe +"</td>"+
			    	   			"<td>"+ value.trangThai +"</td>"+
			    	   			"<td>"+ value.diaChiFile +"</td>"+
			    	   			"<td><button type='button' class='btn btn-warning btn-xs sizebutton'  data-toggle='modal' data-id='"+value.maBaiViet+"' data-target='#message-box'>thông báo</button></td>"+
			    	   			"<td style='display: none;'>"+ value.maChuDe +"</td>"+
			    	   			"<td style='display: none;'>"+ value.tomTat +"</td>"+
		    	   			"</tr>";
        			flagg=0;
        		}
        	});
        	$("#danh-sach-bai-da-dang-ki-du-thi").html(items);
        	
        	$('#root-danh-sach-du-thi tbody tr td').click(function (e) {
        		e.preventDefault();
        		$('#danh-sach-chu-de').val($(this).closest('tr').find('td:nth-child(7)').text()); 
        		$('#ma-bai-du-thi').val($(this).closest('tr').find('td:nth-child(1)').text()); 
        		$('#ten-bai-du-thi').val($(this).closest('tr').find('td:nth-child(2)').text());
        		$('#tom-tat-bai-du-thi').val($(this).closest('tr').find('td:nth-child(8)').text()); 
        		$("#re-review-tep").attr({'src': "./UploadFile/" + $(this).closest('tr').find('td:nth-child(5)').text()});
        		$("#fileName").val($(this).closest('tr').find('td:nth-child(5)').text());
        	});
        	
    	    $("#root-danh-sach-du-thi").find('tr td button[data-target]').on('click', function(){
    	    	
    	    	$.ajax({
        			type: 'POST',
        	        data: {MaBaiViet: $(this).data('id')},
        	        dataType : 'json',
        	        url: 'ThongBaoBaiVietControllers',
        	        success: function(result){
        	        	console.log(result);
        	        	$.each(result, function(key, value){
        	        		$('#chu-de-thong-bao').html(value.chuDeThongBao);
        	        		$('#noi-dung-thong-bao').html(value.noiDung);
        	        	});
        	        	
        	        }
        		});
    	    		
    	    });
        	

        	
        	
        	
//        	$('#root-danh-sach-du-thi tbody tr td button').click(function (event){
//        		var mabaiviet = $(this).closest('tr').find('td:nth-child(1)').text();
//        		console.log(mabaiviet);
//        		$.ajax({
//        			type: 'POST',
//        	        data: {MaBaiViet: mabaiviet},
//        	        dataType : 'json',
//        	        url: 'ThongBaoBaiVietControllers',
//        	        success: function(result){
//        	        	$.each(result, function(key, value){
//        	        		$('#danh-sach-chu-de').html(value.chuDeThongBao);
//        	        		$('#noi-dung-thong-bao').html(value.noiDung);
//        	        	});
//        	        	
//        	        }
//        		});
//        		
//        	});
        	
        	
        	$("#file").on("change",function(e){
        		
        		var files=$(this)[0].files;
        		
        		if(files.lenth==0){

        		}else
        			{
        			
        			console.log(files);
        			$.ajax({
        				url: 'UploadFileControllers',
        				type: 'POST',
        				data: new FormData($('#dinh-kem-tep-chinh-sua')[0]),
        				processData: false,
        				contentType: false
        			}).done(function (result) {
        				console.log(result);
        				$("#re-review-tep").attr({'src': "./UploadFile/" + result});
        				$("#fileName").val(result);
        			});
        				
        			}
        	})
        	
        	 $('#btn-cap-nhat-bai-viet').click(function() {
        		 var maBai = $("#ma-bai-du-thi").val();
        		 console.log(maBai);
        		 var tenBai = $("#ten-bai-du-thi").val();
        		 console.log(tenBai);
        			var maChuDe = $("#danh-sach-chu-de").val();
        		 console.log(maChuDe);
        			var tomTat = $("#tom-tat-bai-du-thi").val();
        		 console.log(tomTat);
        			var filedinhkem= $("#fileName").val();
        		 console.log(filedinhkem);

        			if($.trim(tenBai)==""||$.trim(tomTat)==""||$.trim(filedinhkem)==""||$.trim(maBai)==""){
        				$("#trang-thai-gui-bai").html("Chắc chắn bạn đã điền đầy đủ thông tin và tệp đính kèm!.")
        				$("#trang-thai-gui-bai").css("display", "block");
        			}else{
        				$.ajax({
        					type: 'POST',
        					data: {
        							MaBaiViet : maBai,
        							TenBaiDuThi: tenBai,
        						    MaChuDe: maChuDe,
        						    TomTat: tomTat,
        						    TepDinhKem: filedinhkem
        					},
        					url: 'CapNhatBaiVietControllers',
        					success: function(result){
        	        			if(result=="1"){
        	        				$("#trang-thai-gui-bai").html("Cập nhật bài thành công!")
        	        				$("#trang-thai-gui-bai").css("display", "block");
        	        			}else if(result=="0"){
        	        				$("#trang-thai-gui-bai").html("Bài viết đã được gửi đi. Bạn Không thể chỉnh sửa bài viết này!")
        	        				$("#trang-thai-gui-bai").css("display", "block");
        	        			}else if(result=="2"){
        	        				$("#trang-thai-gui-bai").html("Lỗi hệ thống, Vui lòng thử lại sau!")
        	        				$("#trang-thai-gui-bai").css("display", "block");
        	        			}

        	        		}
        	        	})
        			}
        			
        	 });
        	 
        }
	});
})

        	    