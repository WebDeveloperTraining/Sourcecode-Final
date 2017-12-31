$(document).ready(function() {
	$('#btn-themsukien').click(function(e) {
		if ($('#tensukien').val().trim() == ""
				|| $('#themngaybatdausukien').val().trim() == ""
				|| $('#themngayketthucsukien').val().trim() == ""
				|| $('#noidungsukien').val().trim() == "") {
					alert('Thông tin là bắt buộc !\n Vui lòng điền đầy đủ thông tin.');
		} else {
			e.preventDefault();
			var form = $('#frm-themhinhanhsukien')[0];
			var data = new FormData(form);
			$.ajax({
				type : 'POST',
				url : 'UploadFile',
				data : data,
				enctype : 'multipart/form-data',
				contentType : false,
				processData : false,
				success : function(result) {
					$.ajax({
						type : 'POST',
						data : {
							tenSuKien : $('#tensukien').val(),
							ngayBatDauSuKien : $('#themngaybatdausukien').val(),
							ngayKetThucSuKien : $('#themngayketthucsukien').val(),
							noiDung : $('#noidungsukien').val(),
							duongDanHinh : result
						},
						url : 'ThemSuKien',
						success : function(result) {

							alert("Thêm sự kiện thành công !");
						}
					});
				}
			});
		
		}
	});
	
	//
	$('#li-tabchinhsuasukien').click(function(){
		var stt,$masukien,$tensukien,$ngaybatdau,$ngayketthuc,$noidung,$hinh;
		$('#btn-timkiemsukien').click(function(){
			$.ajax({
				type : 'POST',
				data : {
					thangketthuc : $('#chonthangsukien option:selected').val(),
					namketthuc : $('#chonnamsukien option:selected').val()
				},
				url : 'LaySuKienTheoThangKetThucVaNam',
				success : function(result){
					stt=0;
					$('#myTableChinhSuaSuKien tr').remove();
					result.forEach(function(value){
						$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td class="hidden"></td><td class="hidden"></td><td></td></tr>');
						stt++;
						$row.children().eq(0).text(stt);
						$row.children().eq(1).text(value['MaSuKien']);
						$row.children().eq(2).text(value['TenSuKien']);
						$row.children().eq(3).text(value['NgayBatDauSuKien']);
						$row.children().eq(4).text(value['NgayKetThucSuKien']);
						$row.children().eq(5).text(value['NoiDung']);
						$row.children().eq(6).text(value['Hinh']);
						if($.trim(value['Hinh'])!=""){
							$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(7));
						}
						else{
							$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(7));
						}

						$row.appendTo($('#myTableChinhSuaSuKien'));
					});
					//
					$('#myTableChinhSuaSuKien tr').click(function(){
						$('#myTableChinhSuaSuKien tr').removeClass('active');
						$(this).addClass('active');
						//
						$masukien=$(this).find('td:eq(1)').text().trim();
						$tensukien=$(this).find('td:eq(2)').text().trim();
						$ngaybatdau=$(this).find('td:eq(3)').text().trim();
						$ngayketthuc=$(this).find('td:eq(4)').text().trim();
						$noidung=$(this).find('td:eq(5)').text().trim();
						$hinh=$(this).find('td:eq(6)').text().trim();
						//
						$('#chinhsuatensukien').val($tensukien);
						$('#chinhsuangaybatdau').val($ngaybatdau);
						$('#chinhsuangayketthuc').val($ngayketthuc);
						$('#chinhsuanoidung').val($noidung);
						$('#chinhsuahinhsukien img').remove();
						var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
						$img.appendTo('#chinhsuahinhsukien');
					});
					//
					$('#btn-capnhatsukien').click(function(e){
						var countSTT;
						$tensukien=$('#chinhsuatensukien').val();
						$ngaybatdau=$('#chinhsuangaybatdau').val();
						$ngayketthuc=$('#chinhsuangayketthuc').val();
						$noidung=$('#chinhsuanoidung').val();
						
						if($tensukien=="" || $ngaybatdau=="" || $ngayketthuc=="" || $noidung==""){
							alert('Thông tin là bắt buộc !\nVui lòng điền đầy đủ!!!');
						}
						else{
							if($('#img-new-chinhsuasukien').val()!=""){
								e.preventDefault();
								var form=$('#frm-chinhsuahinhanhsukien')[0];
								var data=new FormData(form);
								$.ajax({
									type : 'POST',
									url : 'UploadFile',
									data : data,
									enctype : 'multipart/form-data',
									contentType : false,
									processData : false,
									success : function(result){
										$('#img-new-chinhsuasukien').val("");
										$.ajax({
										type : 'POST',
										data : {
											maSuKien : $masukien,
											tenSuKien : $tensukien,
											ngayBatDau : $ngaybatdau,
											ngayKetThuc : $ngayketthuc,
											noiDung : $noidung,
											duongDanHinh : result,
											thangKetThuc : $('#chonthangsukien option:selected').val(),
											namKetThuc : $('#chonnamsukien option:selected').val()
											},
											url : 'CapNhatSuKien',
											success : function(result){
												countSTT=0;
												alert("Cập nhật sự kiện thành công !");
												$('#myTableChinhSua tr').remove();
												result.forEach(function(value){
													countSTT++;
													$('#myTableChinhSuaSuKien tr').remove();
													result.forEach(function(value){
														$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td class="hidden"></td><td class="hidden"></td><td></td></tr>');
														stt++;
														$row.children().eq(0).text(stt);
														$row.children().eq(1).text(value['MaSuKien']);
														$row.children().eq(2).text(value['TenSuKien']);
														$row.children().eq(3).text(value['NgayBatDauSuKien']);
														$row.children().eq(4).text(value['NgayKetThucSuKien']);
														$row.children().eq(5).text(value['NoiDung']);
														$row.children().eq(6).text(value['Hinh']);
														if($.trim(value['Hinh'])!=""){
															$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(7));
														}
														else{
															$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(7));
														}

														$row.appendTo($('#myTableChinhSuaSuKien'));
													});
													$row.appendTo($('#myTableChinhSuaSuKien'));
												});
												
												$('#myTableChinhSuaSuKien tr').click(function(){
													$('#myTableChinhSuaSuKien tr').removeClass('active');
													$(this).addClass('active');
													//
													$masukien=$(this).find('td:eq(1)').text().trim();
													$tensukien=$(this).find('td:eq(2)').text().trim();
													$ngaybatdau=$(this).find('td:eq(3)').text().trim();
													$ngayketthuc=$(this).find('td:eq(4)').text().trim();
													$noidung=$(this).find('td:eq(5)').text().trim();
													$hinh=$(this).find('td:eq(6)').text().trim();
													//
													$('#chinhsuatensukien').val($tensukien);
													$('#chinhsuangaybatdau').val($ngaybatdau);
													$('#chinhsuangayketthuc').val($ngayketthuc);
													$('#chinhsuanoidung').val($noidung);
													$('#chinhsuahinhsukien img').remove();
													var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
													$img.appendTo('#chinhsuahinhsukien');
												});
													//
											}
										});
									}
								})
							}
							else{
										$.ajax({
										type : 'POST',
										data : {
											maSuKien : $masukien,
											tenSuKien : $tensukien,
											ngayBatDau : $ngaybatdau,
											ngayKetThuc : $ngayketthuc,
											noiDung : $noidung,
											duongDanHinh : $hinh,
											thangKetThuc : $('#chonthangsukien option:selected').val(),
											namKetThuc : $('#chonnamsukien option:selected').val()
										},
										url : 'CapNhatSuKien',
										success : function(result){
											countSTT=0;
											alert("Cập nhật sự kiện thành công !");
											$('#myTableChinhSua tr').remove();
											result.forEach(function(value){
												countSTT++;
												$('#myTableChinhSuaSuKien tr').remove();
												result.forEach(function(value){
													$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td class="hidden"></td><td class="hidden"></td><td></td></tr>');
													stt++;
													$row.children().eq(0).text(stt);
													$row.children().eq(1).text(value['MaSuKien']);
													$row.children().eq(2).text(value['TenSuKien']);
													$row.children().eq(3).text(value['NgayBatDauSuKien']);
													$row.children().eq(4).text(value['NgayKetThucSuKien']);
													$row.children().eq(5).text(value['NoiDung']);
													$row.children().eq(6).text(value['Hinh']);
													if($.trim(value['Hinh'])!=""){
														$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(7));
													}
													else{
														$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(7));
													}

													$row.appendTo($('#myTableChinhSuaSuKien'));
												});
												$row.appendTo($('#myTableChinhSuaSuKien'));
											});
											
											$('#myTableChinhSuaSuKien tr').click(function(){
												$('#myTableChinhSuaSuKien tr').removeClass('active');
												$(this).addClass('active');
												//
												$masukien=$(this).find('td:eq(1)').text().trim();
												$tensukien=$(this).find('td:eq(2)').text().trim();
												$ngaybatdau=$(this).find('td:eq(3)').text().trim();
												$ngayketthuc=$(this).find('td:eq(4)').text().trim();
												$noidung=$(this).find('td:eq(5)').text().trim();
												$hinh=$(this).find('td:eq(6)').text().trim();
												//
												$('#chinhsuatensukien').val($tensukien);
												$('#chinhsuangaybatdau').val($ngaybatdau);
												$('#chinhsuangayketthuc').val($ngayketthuc);
												$('#chinhsuanoidung').val($noidung);
												$('#chinhsuahinhsukien img').remove();
												var $img=$('<img src= "'+$hinh+'" class="img-rounded file-upload-image" width="100%">');
												$img.appendTo('#chinhsuahinhsukien');
											});
											}
										});
							}
						}
					});
				}
			});
		});
		//
		
	});
	
	$('#li-tabxoasukien').click(function(){
		var stt,$masukien,$tensukien,$ngaybatdau,$ngayketthuc,$noidung;
		$('#btn-timkiemsukienxoa').click(function(){
			$.ajax({
				type : 'POST',
				data : {
					thangketthuc : $('#chonthangsukienxoa option:selected').val(),
					namketthuc : $('#chonnamsukienxoa option:selected').val()
				},
				url : 'LaySuKienTheoThangKetThucVaNam',
				success : function(result){
					stt=0;
					$('#myTableXoaSuKien tr').remove();
					result.forEach(function(value){
						$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td class="hidden"></td><td class="hidden"></td><td></td></tr>');
						stt++;
						$row.children().eq(0).text(stt);
						$row.children().eq(1).text(value['MaSuKien']);
						$row.children().eq(2).text(value['TenSuKien']);
						$row.children().eq(3).text(value['NgayBatDauSuKien']);
						$row.children().eq(4).text(value['NgayKetThucSuKien']);
						$row.children().eq(5).text(value['NoiDung']);
						$row.children().eq(6).text(value['Hinh']);
						if($.trim(value['Hinh'])!=""){
							$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(7));
						}
						else{
							$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(7));
						}

						$row.appendTo($('#myTableXoaSuKien'));
					});
					//
					$('#myTableXoaSuKien tr').click(function(){
						$('#myTableXoaSuKien tr').removeClass('active');
						$(this).addClass('active');
						//
						$masukien=$(this).find('td:eq(1)').text().trim();
						$tensukien=$(this).find('td:eq(2)').text().trim();
						$ngaybatdau=$(this).find('td:eq(3)').text().trim();
						$ngayketthuc=$(this).find('td:eq(4)').text().trim();
						$noidung=$(this).find('td:eq(5)').text().trim();
						$hinh=$(this).find('td:eq(6)').text().trim();
						//
						$('#xoatensukien').val($tensukien);
						$('#xoangaybatdau').val($ngaybatdau);
						$('#xoangayketthuc').val($ngayketthuc);
						$('#xoanoidung').val($noidung);
					});
					//
					$('#btn-xoasukien').click(function(){
						$tensukien=$('#xoatensukien').val();
						$ngaybatdau=$('#xoangaybatdau').val();
						$ngayketthuc=$('#xoangayketthuc').val();
						$noidung=$('#xoanoidung').val();
						//
						if($tensukien=="" || $ngaybatdau=="" || $ngayketthuc=="" || $noidung==""){
							alert('Thông tin là bắt buộc.\nVui lòng kiểm tra lại!');
						}
						else{
							$.ajax({
								type : 'POST',
								data : {
									maSuKien : $masukien,
									thangketthuc : $('#chonthangsukienxoa option:selected').val(),
									namketthuc : $('#chonnamsukienxoa option:selected').val()
								},
								url : 'XoaSuKien',
								success : function(result){
									alert('Xóa sự kiện '+$tensukien+' thành công ! Dữ liệu đã được reload lại...');
									stt=0;
									$('#myTableXoaSuKien tr').remove();
									result.forEach(function(value){
										$row=$('<tr><td></td><td class="hidden"></td><td></td><td></td><td></td><td class="hidden"></td><td class="hidden"></td><td></td></tr>');
										stt++;
										$row.children().eq(0).text(stt);
										$row.children().eq(1).text(value['MaSuKien']);
										$row.children().eq(2).text(value['TenSuKien']);
										$row.children().eq(3).text(value['NgayBatDauSuKien']);
										$row.children().eq(4).text(value['NgayKetThucSuKien']);
										$row.children().eq(5).text(value['NoiDung']);
										$row.children().eq(6).text(value['Hinh']);
										if($.trim(value['Hinh'])!=""){
											$('<i class="fa fa-check" aria-hidden="true" style="color: green;"></i>').appendTo($row.children().eq(7));
										}
										else{
											$('<i class="fa fa-check" aria-hidden="true" style="color: transparent;"></i>').appendTo($row.children().eq(7));
										}

										$row.appendTo($('#myTableXoaSuKien'));
									});
									
								}
							});
						}
					})
				}
			})
		});
	});
	
});