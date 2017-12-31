$(document).ready(function(){
	// Danh Sachs Linh Vuc
	var lstChuyenGia;
	$.ajax({
		type : 'POST',
		url : 'LayDanhSachLinhVuc',
		success :  function(result){
			$('#chonlinhvuc option').remove();
			var $select=$('#chonlinhvuc');
			result.forEach(function(value){
				$('<option class="option-linhvuc">').val(value['MaLinhVuc']).text(value['TenLinhVuc']).appendTo($select);
			});
			$.ajax({
				type : 'POST',
				data: {
					maLinhVuc : $('#chonlinhvuc .option-linhvuc:selected').val()
				},
				url : 'LayDanhSachChuDeTheoLinhVuc',
				success :  function(result){
					$('#chonchude option').remove();
					var $select=$('#chonchude');
					result.forEach(function(value){
						$('<option class="option-chude">').val(value['MaChuDe']).text(value['TenChuDe']).appendTo($select);
					});
					//
					$.ajax({
						type : 'POST',
						url : 'LayDanhSachTrangThaiBaiViet',
						success :  function(result){
							$('.laytrangthai option').remove();
							var $select=$('.laytrangthai');
							result.forEach(function(value){
								$('<option class="option-trangthai">').val(value['MaTrangThai']).text(value['TenTrangThai']).appendTo($select);
							});
						}
					});
				}
			});
		}
	});

	
	$('#chonlinhvuc').change(function(){
		$.ajax({
			type : 'POST',
			data: {
				maLinhVuc : $('#chonlinhvuc .option-linhvuc:selected').val()
			},
			url : 'LayDanhSachChuDeTheoLinhVuc',
			success :  function(result){
				$('#chonchude option').remove();
				var $select=$('#chonchude');
				result.forEach(function(value){
					$('<option class="option-chude" style="width : 100%;">').val(value['MaChuDe']).text(value['TenChuDe']).appendTo($select);
				});

				
			}
		});
	})
	//
	
	/*$('#btn-review').click(function(){
		console.log("a");
		if($('#namepostt').val()=="" || $('#nameauthorr').val()=="" || $('#summaryy').val()==""){
			alert('Thông tin bắt buột. Vui lòng thử lại...');
		}
		else{
			$.ajax({
				type : 'POST',
				data : {
					trangThaiTimKiem : $('#chontrangthai option:selected').val(),
					maBaiViet : $mabaiviet,
					maTrangThai : $('#capnhattrangthai option:selected').val(),
					noiDungThongBao : $('#noidung-thongbao').val(),
					chuDeThongBao : $('#chude-thongbao').val()
				},
				url : 'ReviewerCapNhatThongBao',
				success : function(result){
					var stt=0;
					$('#tbl-review tr').remove();
					result.forEach(function(value){
						$row=$('<tr><td></td><td></td><td class="hidden"></td><td></td><td></td><td></td></tr>');
						stt++;
						$row.children().eq(0).text(stt);
						$row.children().eq(1).text(value['TenTacGia']);
						$row.children().eq(2).text(value['MaBaiViet']);
						$row.children().eq(3).text(value['TenBaiViet']);
						$row.children().eq(4).text(value['TomTat']);
						$row.children().eq(5).text(value['DiemSo']);
						$row.appendTo($('#tbl-review'));
					});
					$('#tblriview tbody tr td').click(function (e) {
						e.preventDefault();
						$(".info").css("display","block");
						$('#namepostt').val($(this).closest('tr').find('td:eq(3)').text()); 
						$('#nameauthorr').val($(this).closest('tr').find('td:eq(1)').text()); 
						$('#summaryy').val($(this).closest('tr').find('td:eq(4)').text()); 
						$mabaiviet=$(this).closest('tr').find('td:eq(2)').text();
					});
				}
			});
		}
	});*/
	
	var  $mabaiviet, $chudethongbao, $noidungthongbao, $mathongbao, $trangthaicapnhat;
	$('#tblriview tbody tr td').click(function (e) {
		e.preventDefault();
		$(".info").css("display","block");
		$('#namepostt').val($(this).closest('tr').find('td:eq(3)').text()); 
		$('#nameauthorr').val($(this).closest('tr').find('td:eq(1)').text()); 
		$('#summaryy').val($(this).closest('tr').find('td:eq(4)').text()); 
		$mabaiviet=$(this).closest('tr').find('td:eq(2)').text();
	});
	
	$('#btn-timkiem').click(function(){
		var stt=0;
		$.ajax({
			type : 'POST',
			data: {
				maChuDe : $('.option-chude:selected').val(),
				maTrangThai : $('.option-trangthai:selected').val()
			},
			url : 'LayDanhSachBaiVietTheoChuDeVaTrangThai',
			success : function(result){
				$('#tbl-review tr').remove();
				result.forEach(function(value){
					$row=$('<tr><td></td><td></td><td class="hidden"></td><td></td><td></td><td></td></tr>');
					stt++;
					$row.children().eq(0).text(stt);
					$row.children().eq(1).text(value['TenTacGia']);
					$row.children().eq(2).text(value['MaBaiViet']);
					$row.children().eq(3).text(value['TenBaiViet']);
					$row.children().eq(4).text(value['TomTat']);
					$row.children().eq(5).text(value['DiemSo']);

					$row.appendTo($('#tbl-review'));
				});
				$('#tblriview tbody tr td').click(function (e) {
					e.preventDefault();
					$(".info").css("display","block");
					$('#namepostt').val($(this).closest('tr').find('td:eq(3)').text()); 
					$('#nameauthorr').val($(this).closest('tr').find('td:eq(1)').text()); 
					$('#summaryy').val($(this).closest('tr').find('td:eq(4)').text()); 
					$mabaiviet=$(this).closest('tr').find('td:eq(2)').text();
				});
				$('#btn-review').click(function(){
					console.log("a");
					if($('#namepostt').val()=="" || $('#nameauthorr').val()=="" || $('#summaryy').val()==""){
						alert('Thông tin bắt buột. Vui lòng thử lại...');
					}
					else{
						$.ajax({
							type : 'POST',
							data : {
								trangThaiTimKiem : $('#chontrangthai option:selected').val(),
								maBaiViet : $mabaiviet,
								maTrangThai : $('#capnhattrangthai option:selected').val(),
								noiDungThongBao : $('#noidung-thongbao').val(),
								chuDeThongBao : $('#chude-thongbao').val()
							},
							url : 'ReviewerCapNhatThongBao',
							success : function(result){
								alert('Cập nhật thông báo thành công!');
								var stt=0;
								$('#tbl-review tr').remove();
								result.forEach(function(value){
									$row=$('<tr><td></td><td></td><td class="hidden"></td><td></td><td></td><td></td></tr>');
									stt++;
									$row.children().eq(0).text(stt);
									$row.children().eq(1).text(value['TenTacGia']);
									$row.children().eq(2).text(value['MaBaiViet']);
									$row.children().eq(3).text(value['TenBaiViet']);
									$row.children().eq(4).text(value['TomTat']);
									$row.children().eq(5).text(value['DiemSo']);
									$row.appendTo($('#tbl-review'));
								});
								$('#tblriview tbody tr td').click(function (e) {
									e.preventDefault();
									$(".info").css("display","block");
									$('#namepostt').val($(this).closest('tr').find('td:eq(3)').text()); 
									$('#nameauthorr').val($(this).closest('tr').find('td:eq(1)').text()); 
									$('#summaryy').val($(this).closest('tr').find('td:eq(4)').text()); 
									$mabaiviet=$(this).closest('tr').find('td:eq(2)').text();
								});
							}
						});
					}
				});
			}
		});
	});
	// Danh Sach Chuyen Gia
	$('#search').click(function(){
		$.ajax({
			type : 'POST',
			data : {
				maLinhVuc : $('.option-linhvuc:selected').val()
			},
			url : 'TimChuyenGiaTheoLinhVuc',
			success : function(result){
				$('#myTable tr').remove();
				result.forEach(function(value){
					$row=$('<tr><td></td><td></td><td></td><td><input type="checkbox" class="chonchuyengia"></td></tr>');
					$row.children().eq(1).text(value['MaChuyenGia']);
					$row.children().eq(2).text(value['TenChuyenGia']);
					$row.appendTo($('#myTable'));
				});
				
				lstChuyenGia=new Array();
				
				$('input.chonchuyengia').on('click', function() {
					if ($('.chonchuyengia').is(':checked')) {
						lstChuyenGia.push($(this).closest('td').closest('tr').find('td:eq(1)').text());
					}
				});
			}
		});
	});
	
	$('#themchude').click(function(e){
		e.preventDefault();
		if($('#themtenchude').val()==""){
			alert('Tên chủ đề không được để trống');
			return;
		};
		if($('#numberone').val()=="" || $('#numbertwo').val()=="" || $('#numberthree').val()==""){
			alert('Giải thưởng không được để trống');
			return;
		};
		var form=$('#frm-uploadhinh')[0];
		var data=new FormData(form);
		$.ajax({
			type : 'POST',
			url : 'UploadFile',
			data : data,
			enctype : 'multipart/form-data',
			contentType : false,
			processData : false,
			success : function(result){
				$.ajax({
				type : 'POST',
				data : {
					tenChuDe : $('#themtenchude').val(),
					giaiNhat : $('#numberone').val(),
					giaiNhi : $('#numbertwo').val(),
					giaiBa : $('#numberthree').val(),
					giaiKhac : $('#themgiaikhac').val(),
					maLinhVuc : $('.option-linhvuc:selected').val(),
					ngayBatDau : $('#startda').val(),
					ngayKetThuc : $('#endda').val(),
					duongDanHinh : result,
					danhSachChuyenGia : lstChuyenGia,
					ngayThongBaoKetQua : $('#enddanotify').val()
				
					},
					url : 'ThemChuDe',
					success : function(result){
						/*$('#thongbaothemchude div').remove();
						$notify=$('<div class="alert alert-success" role="alert">Thêm chủ đề thành công!</div>');
						$notify.appendTo($('#thongbaothemchude'));*/
						alert("Thêm chủ đề thành công !");
					}
				});
			}
		});
	});
	// tab chinh sua 
	var $maChuDe, $tenChuDe, $ngayBatDau, $ngayKetThuc, $ngayThongBaoKetQua, $hinh;
	
	$('#myTableChinhSua tr').click(function(){
		$('#myTableChinhSua tr').removeClass('active');
		$(this).addClass('active');
		
		$maChuDe=$(this).find('td:eq(1)').text().trim();
		$tenChuDe=$(this).find('td:eq(2)').text().trim();
		$ngayBatDau=$(this).find('td:eq(4)').text().trim();
		$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
		$ngayThongBaoKetQua=$(this).find('td:eq(6)').text().trim();
		$hinh=$(this).find('td:eq(7)').text().trim();
		//
		$('#tenchude-chinhsua').val($tenChuDe);
		$('#startda2').val($ngayBatDau);
		$('#endda2').val($ngayKetThuc);
		$('enddanotify2').val($ngayThongBaoKetQua);
		$('#chinhsuahinh img').remove();
		var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
		$img.appendTo('#chinhsuahinh');
		//
		$.ajax({
			type : 'POST',
			data : {
				maLinhVuc : $maChuDe
			},
			url : 'TimChuyenGiaTheoChuDe',
			success : function(result){
				countSTT=0;
				$('#myTableChinhSuaChuyenGia tr').remove();
				result.forEach(function(value){
					countSTT++;
					$row=$('<tr><td></td><td></td><td></td></tr>');
					$row.children().eq(0).text(countSTT);
					$row.children().eq(1).text(value['MaChuyenGia']);
					$row.children().eq(2).text(value['TenChuyenGia']);
					$row.appendTo($('#myTableChinhSuaChuyenGia'));
				});
				
			}
		});
	});
	
	$('#tab-chinhsuachude').click(function(){
		$.ajax({
			type : 'POST',
			url : 'LayDanhSachLinhVuc',
			success :  function(result){
				$('#chonlinhvucchinhsua option').remove();
				var $select=$('#chonlinhvucchinhsua');
				result.forEach(function(value){
					$('<option class="option-linhvuc2">').val(value['MaLinhVuc']).text(value['TenLinhVuc']).appendTo($select);
				});
			}
		});
		
//		$('#myTableChinhSua tr').click(function(){
//			$('#myTableChinhSua tr').removeClass('active');
//			$(this).addClass('active');
//			
//			$maChuDe=$(this).find('td:eq(1)').text().trim();
//			$tenChuDe=$(this).find('td:eq(2)').text().trim();
//			$ngayBatDau=$(this).find('td:eq(4)').text().trim();
//			$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
//			$hinh=$(this).find('td:eq(6)').text().trim();
//			console.log($tenChuDe);
//			//
//			$('#tenchude-chinhsua').val($tenChuDe);
//			$('#startda2').val($ngayBatDau);
//			$('#endda2').val($ngayKetThuc);
//			$('#chinhsuahinh img').remove();
//			var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
//			$img.appendTo('#chinhsuahinh');
//		});
		
		var countSTT;
		$('#searchchinhsua').click(function(){
			countSTT=0;
			$.ajax({
				type : 'POST',
				data : {
					maLinhVuc : $('.option-linhvuc2:selected').val()
				},
				url : 'LayDanhSachChuDeTheoLinhVuc',
				success : function(result){
					$('#myTableChinhSua tr').remove();
					result.forEach(function(value){
						countSTT++;
						$row=$('<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="hidden"></td><td></td></tr>');
						$row.children().eq(0).text(countSTT);
						$row.children().eq(1).text(value['MaChuDe']);
						$row.children().eq(2).text(value['TenChuDe']);
						$row.children().eq(3).text(value['TenLinhVuc']);
						$row.children().eq(4).text(value['NgayBatDau']);
						$row.children().eq(5).text(value['NgayKetThuc']);
						$row.children().eq(6).text(value['NgayThongBaoKetQua']);
						$row.children().eq(7).text(value['Hinh']);
						if($.trim(value['Hinh'])!=""){
							$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(8));
						}
						else{
							$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(8));
						}
						$row.appendTo($('#myTableChinhSua'));
						//
						
					});
					
					$('#myTableChinhSua tr').click(function(){
						$('#myTableChinhSua tr').removeClass('active');
						$(this).addClass('active');
						//
						$maChuDe=$(this).find('td:eq(1)').text().trim();
						$tenChuDe=$(this).find('td:eq(2)').text().trim();
						$ngayBatDau=$(this).find('td:eq(4)').text().trim();
						$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
						$ngayThongBaoKetQua=$(this).find('td:eq(6)').text().trim();
						$hinh=$(this).find('td:eq(7)').text().trim();
						//
						$('#tenchude-chinhsua').val($tenChuDe);
						$('#startda2').val($ngayBatDau);
						$('#endda2').val($ngayKetThuc);
						$('#enddanotify2').val($ngayThongBaoKetQua);
						$('#chinhsuahinh img').remove();
						var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
						$img.appendTo('#chinhsuahinh');
						//
						$.ajax({
							type : 'POST',
							data : {
								maChuDe : $maChuDe
							},
							url : 'TimChuyenGiaTheoChuDe',
							success : function(result){
								countSTT=0;
								$('#myTableChinhSuaChuyenGia tr').remove();
								result.forEach(function(value){
									countSTT++;
									$row=$('<tr><td></td><td></td><td></td></tr>');
									$row.children().eq(0).text(countSTT);
									$row.children().eq(1).text(value['MaChuyenGia']);
									$row.children().eq(2).text(value['TenChuyenGia']);
									$row.appendTo($('#myTableChinhSuaChuyenGia'));
								});
								
							}
						});
					});
					
					
				}
			});
			
		});
		$('#capnhatchude').click(function(e){
			var $malinhvuc=$('.option-linhvuc2:selected').val();
			var $tenLinhVuc=$('.option-linhvuc2:selected').text();
			$tenchude=$('#tenchude-chinhsua').val();
			$ngaybatdau=$('#startda2').val();
			$ngayketthuc=$('#endda2').val();
			$ngayThongBaoKetQua=$('#enddanotify2').val();
			
			
			if($tenchude=="" || $ngaybatdau=="" || $ngayketthuc=="" || $ngayThongBaoKetQua==""){
				alert('Thông tin là bắt buộc!');
			}
			else{
				if($('#img-new-chinhsua').val()!=""){
					e.preventDefault();
					var form=$('#frm-uploadhinhchinhsua')[0];
					var data=new FormData(form);
					$.ajax({
						type : 'POST',
						url : 'UploadFile',
						data : data,
						enctype : 'multipart/form-data',
						contentType : false,
						processData : false,
						success : function(result){
							$('#img-new-chinhsua').val("");
							$.ajax({
							type : 'POST',
							data : {
								maChuDe : $maChuDe,
								tenChuDe : $tenchude,
								maLinhVuc : $malinhvuc,
								tenLinhVuc : $tenLinhVuc,
								ngayBatDau : $ngaybatdau,
								ngayKetThuc : $ngayketthuc,
								duongDanHinh : result,
								ngayThongBaoKetQua : $ngayThongBaoKetQua
								},
								url : 'CapNhatChuDe',
								success : function(result){

									countSTT=0;
//									$('#thongbaocapnhatchude div').remove();
//									$notify=$('<div class="alert alert-success" role="alert">Cập nhật chủ đề thành công!</div>');
//									$notify.appendTo($('#thongbaocapnhatchude'));
									alert("Cập nhật chủ đề thành công");
									$('#myTableChinhSua tr').remove();
									result.forEach(function(value){
										countSTT++;
										$row=$('<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="hidden"></td><td></td></tr>');
										$row.children().eq(0).text(countSTT);
										$row.children().eq(1).text(value['MaChuDe']);
										$row.children().eq(2).text(value['TenChuDe']);
										$row.children().eq(3).text(value['TenLinhVuc']);
										$row.children().eq(4).text(value['NgayBatDau']);
										$row.children().eq(5).text(value['NgayKetThuc']);
										$row.children().eq(6).text(value['NgayThongBaoKetQua']);
										$row.children().eq(7).text(value['Hinh']);
										if($.trim(value['Hinh'])!=""){
											$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(8));
										}
										else{
											$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(8));
										}
										$row.appendTo($('#myTableChinhSua'));
									});
									
									$('#myTableChinhSua tr').click(function(){
										$('#myTableChinhSua tr').removeClass('active');
										$(this).addClass('active');
										//
										$maChuDe=$(this).find('td:eq(1)').text().trim();
										$tenChuDe=$(this).find('td:eq(2)').text().trim();
										$ngayBatDau=$(this).find('td:eq(4)').text().trim();
										$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
										$ngayThongBaoKetQua=$(this).find('td:eq(6)').text().trim();
										$hinh=$(this).find('td:eq(7)').text().trim();
										//
										$('#tenchude-chinhsua').val($tenChuDe);
										$('#startda2').val($ngayBatDau);
										$('#endda2').val($ngayKetThuc);
										$('#enddanotify2').val($ngayThongBaoKetQua);
										$('#chinhsuahinh img').remove();
										var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
										$img.appendTo('#chinhsuahinh');
										//
										$.ajax({
											type : 'POST',
											data : {
												maChuDe : $maChuDe
											},
											url : 'TimChuyenGiaTheoChuDe',
											success : function(result){
												countSTT=0;
												$('#myTableChinhSuaChuyenGia tr').remove();
												result.forEach(function(value){
													countSTT++;
													$row=$('<tr><td></td><td></td><td></td></tr>');
													$row.children().eq(0).text(countSTT);
													$row.children().eq(1).text(value['MaChuyenGia']);
													$row.children().eq(2).text(value['TenChuyenGia']);
													$row.appendTo($('#myTableChinhSuaChuyenGia'));
												});
												
											}
										});
									});
								}
							});
						}
					})
				}
				else{
							$.ajax({
							type : 'POST',
							data : {
								maChuDe : $maChuDe,
								tenChuDe : $tenchude,
								maLinhVuc : $malinhvuc,
								tenLinhVuc : $tenLinhVuc,
								ngayBatDau : $ngaybatdau,
								ngayKetThuc : $ngayketthuc,
								duongDanHinh : $hinh,
								ngayThongBaoKetQua : $ngayThongBaoKetQua
								},
								url : 'CapNhatChuDe',
								success : function(result){
									countSTT=0;
//									$('#thongbaocapnhatchude div').remove();
//									$notify=$('<div class="alert alert-success" role="alert">Cập nhật chủ đề thành công!</div>');
//									$notify.appendTo($('#thongbaocapnhatchude'));
									alert("Cập nhật chủ đề thành công");
									$('#myTableChinhSua tr').remove();
									result.forEach(function(value){
										countSTT++;
										$row=$('<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td class="hidden"></td><td></td></tr>');
										$row.children().eq(0).text(countSTT);
										$row.children().eq(1).text(value['MaChuDe']);
										$row.children().eq(2).text(value['TenChuDe']);
										$row.children().eq(3).text(value['TenLinhVuc']);
										$row.children().eq(4).text(value['NgayBatDau']);
										$row.children().eq(5).text(value['NgayKetThuc']);
										$row.children().eq(6).text(value['NgayThongBaoKetQua']);
										$row.children().eq(7).text(value['Hinh']);
										if($.trim(value['Hinh'])!=""){
											$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(8));
										}
										else{
											$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(8));
										}
										$row.appendTo($('#myTableChinhSua'));
									});
									
									$('#myTableChinhSua tr').click(function(){
										$('#myTableChinhSua tr').removeClass('active');
										$(this).addClass('active');
										//
										$maChuDe=$(this).find('td:eq(1)').text().trim();
										$tenChuDe=$(this).find('td:eq(2)').text().trim();
										$ngayBatDau=$(this).find('td:eq(4)').text().trim();
										$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
										$ngayThongBaoKetQua=$(this).find('td:eq(6)').text().trim();
										$hinh=$(this).find('td:eq(7)').text().trim();
										//
										$('#tenchude-chinhsua').val($tenChuDe);
										$('#startda2').val($ngayBatDau);
										$('#endda2').val($ngayKetThuc);
										$('#enddanotify2').val($ngayThongBaoKetQua);
										$('#chinhsuahinh img').remove();
										var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
										$img.appendTo('#chinhsuahinh');
										//
										$.ajax({
											type : 'POST',
											data : {
												maChuDe : $maChuDe
											},
											url : 'TimChuyenGiaTheoChuDe',
											success : function(result){
												countSTT=0;
												$('#myTableChinhSuaChuyenGia tr').remove();
												result.forEach(function(value){
													countSTT++;
													$row=$('<tr><td></td><td></td><td></td></tr>');
													$row.children().eq(0).text(countSTT);
													$row.children().eq(1).text(value['MaChuyenGia']);
													$row.children().eq(2).text(value['TenChuyenGia']);
													$row.appendTo($('#myTableChinhSuaChuyenGia'));
												});
												
											}
										});
									});
								}
							});
				}
					
			}
		});
	});
	
	
	
	$('#tab-xoachude').click(function(){
		var $malinhvuc=$('.option-linhvuc2:selected').val();
		var $tenLinhVuc=$('.option-linhvuc2:selected').text();
		$.ajax({
			type : 'POST',
			url : 'LayDanhSachLinhVuc',
			success :  function(result){
				$('#chonlinhvucxoa option').remove();
				var $select=$('#chonlinhvucxoa');
				result.forEach(function(value){
					$('<option class="option-linhvuc3">').val(value['MaLinhVuc']).text(value['TenLinhVuc']).appendTo($select);
				});
			}
		});
		
		var countSTT;
		$('#searchxoachude').click(function(){
			var $malinhvuc=$('.option-linhvuc3:selected').val();
			var $tenLinhVuc=$('.option-linhvuc3:selected').text();
			$tenchude=$('#tenchude-xoa').val();
			$ngaybatdau=$('#startda3').val();
			$ngayketthuc=$('#endda3').val();
			$ngayThongBaoKetQua=$('#enddanotify3').val();
			countSTT=0;
			$.ajax({
				type : 'POST',
				data : {
					maLinhVuc : $('.option-linhvuc3:selected').val()
				},
				url : 'LayDanhSachChuDeTheoLinhVuc',
				success : function(result){
					$('#myTableXoaChuDe tr').remove();
					result.forEach(function(value){
						countSTT++;
						$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td></td><td></td><td class="hidden"></td><td></td></tr>');
						$row.children().eq(0).text(countSTT);
						$row.children().eq(1).text(value['MaChuDe']);
						$row.children().eq(2).text(value['TenChuDe']);
						$row.children().eq(3).text(value['TenLinhVuc']);
						$row.children().eq(4).text(value['NgayBatDau']);
						$row.children().eq(5).text(value['NgayKetThuc']);
						$row.children().eq(6).text(value['NgayThongBaoKetQua']);
						$row.children().eq(7).text(value['Hinh']);
						if($.trim(value['Hinh'])!=""){
							$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(8));
						}
						else{
							$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(8));
						}
						$row.appendTo($('#myTableXoaChuDe'));
					});
					
					$('#myTableXoaChuDe tr').click(function(){
						$('#myTableXoaChuDe tr').removeClass('active');
						$(this).addClass('active');
						//
						$maChuDe=$(this).find('td:eq(1)').text().trim();
						$tenChuDe=$(this).find('td:eq(2)').text().trim();
						$ngayBatDau=$(this).find('td:eq(4)').text().trim();
						$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
						$ngayThongBaoKetQua=$(this).find('td:eq(6)').text().trim();
						$hinh=$(this).find('td:eq(7)').text().trim();
						//
						$('#tenchude-xoa').val($tenChuDe);
						$('#startda3').val($ngayBatDau);
						$('#endda3').val($ngayKetThuc);
						$('#enddanotify3').val($ngayThongBaoKetQua);
					});
				}
			});
			
			
		});
		
		$('#btn-xoachude').click(function(){
			var $malinhvuc=$('.option-linhvuc3:selected').val();
			var $tenLinhVuc=$('.option-linhvuc3:selected').text();
			if($('#tenchude-xoa').val()=="" || $('#startda3').val()=="" || $('#endda3').val()=="" || $('#enddanotify3').val()==""){
				alert('Vui lòng chọn chủ đề để tiến hành xóa');
			}
			else{
				$.ajax({
					type : 'POST',
					data : {
						maChuDe : $maChuDe,
						tenChuDe : $tenChuDe,
						maLinhVuc : $malinhvuc,
						tenLinhVuc : $tenLinhVuc,
						ngayBatDau : $ngayBatDau,
						ngayKetThuc : $ngayKetThuc,
						ngayThongBaoKetQua : $ngayThongBaoKetQua,
						hinh : $hinh
					},
					url : 'XoaChuDe',
					success : function(result){
						countSTT=0;
						alert('Xoá chủ đề '+$tenChuDe+' thành công!');
						$('#myTableXoaChuDe tr').remove();
						result.forEach(function(value){
							countSTT++;
							$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td></td><td></td><td class="hidden"></td><td></td></tr>');
							$row.children().eq(0).text(countSTT);
							$row.children().eq(1).text(value['MaChuDe']);
							$row.children().eq(2).text(value['TenChuDe']);
							$row.children().eq(3).text(value['TenLinhVuc']);
							$row.children().eq(4).text(value['NgayBatDau']);
							$row.children().eq(5).text(value['NgayKetThuc']);
							$row.children().eq(6).text(value['NgayThongBaoKetQua']);
							$row.children().eq(7).text(value['Hinh']);
							if($.trim(value['Hinh'])!=""){
								$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(8));
							}
							else{
								$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(8));
							}
							$row.appendTo($('#myTableXoaChuDe'));
						});
						
						$('#myTableXoaChuDe tr').click(function(){
							$('#myTableXoaChuDe tr').removeClass('active');
							$(this).addClass('active');
							//
							$maChuDe=$(this).find('td:eq(1)').text().trim();
							$tenChuDe=$(this).find('td:eq(2)').text().trim();
							$ngayBatDau=$(this).find('td:eq(4)').text().trim();
							$ngayKetThuc=$(this).find('td:eq(5)').text().trim();
							$ngayThongBaoKetQua=$(this).find('td:eq(6)').text().trim();
							$hinh=$(this).find('td:eq(7)').text().trim();
							//
							$('#tenchude-xoa').val($tenChuDe);
							$('#startda3').val($ngayBatDau);
							$('#endda3').val($ngayKetThuc);
							$('#enddanotify3').val($ngayThongBaoKetQua);
							
						});
					}
				});
			}
		})
	});
	
	
});

function searchFunc() {
    // Declare variables 
    var input, filter, table, tr, td, i;
    input = document.getElementById("searchchinhsua");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTableChinhSua");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[2];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
    
}

function searchFunc(element, table) {
    // Declare variables 
    var input, filter, table, tr, td, i;
    input = document.getElementById(element);
    filter = input.value.toUpperCase();
    table = document.getElementById(table);
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[2];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}