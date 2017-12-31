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
        	$("#ds-chu-de").html(items);
        }
	});
	$.ajax({
		type: 'POST',
        data: {},
        dataType : 'json',
        url: 'TrangThaiControllers',
        success: function(result){
        	var items = "";
        	$.each(result, function(key, value){
        	   items += "<option value='" + value.maTrangThai+ "'>" + value.tenTrangThai + "</option>";
        	});
        	$("#danh-sach-trang-thai").html(items);
        	$("#trang-thai-review-bai-viet").html(items);
        }
	});
	
	$("#loc-bai-viet").click(function() {
		$("#ds-bai-theo-chuyen-gia").html("");
		$("#status-rearch").html("");
		var maChuDe = $("#danh-sach-chu-de").val();
		var maTrangThai = $("#danh-sach-trang-thai").val();
		console.log(maChuDe);
		console.log(maTrangThai);
		$.ajax({
			type: 'POST',
	        data: {
	        	MaChuDe: maChuDe,
	        	MaTrangThai: maTrangThai
	        },
	        dataType : 'json',
	        url: 'DanhSachBaiVietTheoChuyenGiaControllers',
	        success: function(result){
	        	console.log(result);
	        	if (result.check == "fail") {
	        		$("#status-rearch").html("Không tìn thấy kết quả!");
                    return;
                }
	        	var items = "";
	        	var flagg=0;
	        	$.each(result, function(key, value){
	        		if(flagg==0){
		        	   items += "<tr class='cus-colo'>" +
			        	   			"<td>"+ value.maBaiViet +"</td>"+
			        	   			"<td>"+ value.tenBaiViet +"</td>"+
			        	   			"<td>"+ value.tenTacGia +"</td>"+
			        	   			"<td>"+ value.tenTrangThai +"</td>"+
			        	   			"<td style='display: none;'>"+ value.diaChuFile +"</td>"+
			        	   			"<td style='display: none;'>"+ value.maTrangThai +"</td>"+
			        	   			"<td style='display: none;'>"+ value.maChuDe +"</td>"+
			        	   			"<td style='display: none;'>"+ value.tomTat +"</td>"+
		        	   			"</tr>";
		        	   flagg=1;
	        		}else{
	        			items += "<tr>" +
				        			"<td>"+ value.maBaiViet +"</td>"+
			        	   			"<td>"+ value.tenBaiViet +"</td>"+
			        	   			"<td>"+ value.tenTacGia +"</td>"+
			        	   			"<td>"+ value.tenTrangThai +"</td>"+
			        	   			"<td style='display: none;'>"+ value.diaChuFile +"</td>"+
			        	   			"<td style='display: none;'>"+ value.maTrangThai +"</td>"+
			        	   			"<td style='display: none;'>"+ value.maChuDe +"</td>"+
			        	   			"<td style='display: none;'>"+ value.tomTat +"</td>"+
			    	   			"</tr>";
	        			flagg=0;
	        		}
	        	})
	        	
	        	$("#ds-bai-theo-chuyen-gia").html(items);
	        	
	        	$('#table-tblriview tbody tr td').click(function (e) {
	        		$('.info').show();
	        		e.preventDefault();
	        		$('#ds-chu-de').val($(this).closest('tr').find('td:nth-child(7)').text()); 
	        		$('#ma-bai').val($(this).closest('tr').find('td:nth-child(1)').text()); 
	        		$('#ten-bai').val($(this).closest('tr').find('td:nth-child(2)').text());
	        		$('#tom-tat-noi-dung').val($(this).closest('tr').find('td:nth-child(8)').text()); 
	        		$("#noi-dung-bai").attr({'src': "./UploadFile/" + $(this).closest('tr').find('td:nth-child(5)').text()});
	        		$("#ten-tac-gia").val($(this).closest('tr').find('td:nth-child(3)').text())
	        		$("#trang-thai-review-bai-viet").val($(this).closest('tr').find('td:nth-child(6)').text())
	        	});
	        	
	        	$("#btn-danh-gia-bai-viet").click(function(){
	        		$("#errorsubmit").html("");
	        		var trangthai = $("#trang-thai-review-bai-viet").val();
	        		var nhanxet= $("#nhan-xet").val();
	        		var machude = $("#ds-chu-de").val();
	        		var mabaiviet = $("#ma-bai").val();
	        		var diemso = $("#diem-so").val();
	        		if($.trim(trangthai)==""||$.trim(nhanxet)==""||$.trim(machude)==""||$.trim(mabaiviet)==""||$.trim(diemso)==""){
	        			$("#errorsubmit").html("Vui lòng chọn và đánh giá bài viết!");
	        		}
	        		else{
	        			$.ajax({
	        				type: 'POST',
	        		        data: {
	        		        	MaChuDe: machude,
	        		        	MaBaiViet: mabaiviet,
	        		        	TrangThaiBaiViet: trangthai,
	        		        	NhanXet: nhanxet,
	        		        	DiemSo: diemso
	        		        },
	        		        url: 'DanhGiaBaiVietControllers',
	        		        success: function(result){
	        		        	if(result=="true"){
	        		        		$("#errorsubmit").html("Đánh Giá Thành Công!");
	        		        	}else{
	        		        		$("#errorsubmit").html("Đã sảy ra lỗi, vui lòng thử lại sau!");
	        		        	}
	        		        }
	        			});
	        		}
	        	})
	        }
		})
	})

})