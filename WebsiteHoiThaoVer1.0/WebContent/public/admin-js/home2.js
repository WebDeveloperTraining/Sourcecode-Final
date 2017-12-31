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
						if(count<=4){
							count++;
							$div=$('<p><a href="ChiTietChuDeControllers?id='+value['MaChuDe']+'">'+value['TenChuDe']+'</a></p>');
							$div.appendTo($('#div-chudethang'));
						}
						
					});
					$.ajax({
						type : 'POST',
						url : 'LayChuDeTheoThangVaNamHienTai',
						success : function(result){
							var count=0;
							var flag=0;
							var items="";
							result.forEach(function(value){
								console.log(value['MaChuDe']);
								if(flag<1){
									if(count==0){
										items+="<div class='item active'>"+
				                                    "<div class='thumbnail'>"+
				                                    "<img src='"+value["Hinh"]+"' alt='Avatar' class='image'>"+
				                                    "<div class='overlay'>"+
				                                        "<div class='btnacti'>"+
				                                            "<button class='btn btn-default'id='tham-gia'>Tham Gia <i class='fa fa-rocket'></i></button>"+
				                                            "<a class='btn btn-default' href='ChiTietChuDeControllers?id="+value["MaChuDe"]+"'>Tìm Hiểu Thêm <i class='fa fa-link'></i></a>"+
				                                        "</div>"+
				                                    "</div>"+
				                                    "<div class='caption'>"+
				                                        "<h3>Chủ đề: <small>"+value["TenChuDe"]+"</small></h3>"+
				                                    "</div>"+
				                                "</div>"+
				                            "</div>"
				                                count++;
									}else{
										items+="<div class='item'>"+
			                                    "<div class='thumbnail'>"+
			                                    "<img src='"+value["Hinh"]+"' alt='Avatar' class='image'>"+
			                                    "<div class='overlay'>"+
			                                        "<div class='btnacti'>"+
			                                            "<button class='btn btn-default' id='tham-gia'>Tham Gia <i class='fa fa-rocket'></i></button>"+
			                                            "<a class='btn btn-default' href='ChiTietChuDeControllers?id="+value["MaChuDe"]+"'>Tìm Hiểu Thêm <i class='fa fa-link'></i></a>"+
			                                        "</div>"+
			                                    "</div>"+
			                                    "<div class='caption'>"+
			                                        "<h3>Chủ đề: <small>"+value["TenChuDe"]+"</small></h3>"+
			                                    "</div>"+
			                                "</div>"+
			                            "</div>"
									}
									flag++;
								}
								
							});
							$("#dsChuDe").html(items);
							
							$("#tham-gia").click(function(){
								window.location.href="DangKiBaiDuThiControllers"
							})
							
						}
					});
				}
			});
			
			
		}
	});
})