$(document).ready(function(){
	$.ajax({
		type : 'POST',
		url : 'LaySuKienTheoThangVaNamHienTai',
		success : function(result){
			result.forEach(function(value){
				$div=$('<div class="row">'+
                            '<div class="col-md-3" style="padding: 0px;">'+
                                '<img src="'+value['Hinh']+'" class="img-thumbnail img-responsive">'+
                            '</div>'+
                            '<div class="col-md-9" style="margin: 0px;">'+
                                '<div class="caption-event">'+
                                    '<a href="./ChiTietTinTuc?ma-tin-tuc='+value['MaSuKien']+'">'+value['TenSuKien']+'</a>'+
                                '</div>'+
                            '</div>'+
                        '</div><hr>');
				$div.appendTo($('#div-sukien'));
			});
			//
			$.ajax({
				type : 'POST',
				url : 'LayChuDeTheoThangVaNamHienTai',
				success : function(result){
					var count=0;
					result.forEach(function(value){
						console.log(count);
						if(count<=3){
							count++;
							$div=$('<p><a href="#">'+value['TenChuDe']+'</a></p>');
							$div.appendTo($('#div-chudethang'));
						}
						
					});
				}
			});
		}
	});
})