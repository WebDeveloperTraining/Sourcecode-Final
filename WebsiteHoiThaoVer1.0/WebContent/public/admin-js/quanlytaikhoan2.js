$(document).ready(function(){
	var $maTaiKhoan, $tenDangNhap, $matKhau, $maNguoiDung, $maQuyen, $tenNguoiDung, $tenQuyen;
	$('#li-tabchinhsuanguoidung').click(function(){
		var stt;
		$.ajax({
			type : 'POST',
			url : 'LayDanhSachTaiKhoanNguoiDung',
			success : function(result){
				stt=0;
				$('#myTable tr').remove();
				$table=$('#myTable');
				result.forEach(function(value){
					stt++;
					var $row=$('<tr><td></td><td class="hidden"></td><td></td><td class="hidden"></td><td class="hidden"></td><td class="hidden"></td><td></td><td></td></tr>');
					$row.children().eq(0).text(stt);
					$row.children().eq(1).text(value['MaTaiKhoan']);
					$row.children().eq(2).text(value['TenDangNhap']);
					$row.children().eq(3).text(value['MatKhau']);
					$row.children().eq(4).text(value['MaNguoiDung']);
					$row.children().eq(5).text(value['MaQuyen']);
					$row.children().eq(6).text(value['TenNguoiDung']);
					$row.children().eq(7).text(value['TenQuyen']);
					$row.appendTo($table);
				});
				$('tbody tr').click(function(){
					$('tbody tr').removeClass('active');
					$(this).addClass('active');
					$maTaiKhoan=$(this).find('td:eq(1)').text().trim();
					$tenDangNhap=$(this).find('td:eq(2)').text().trim();
					$matKhau=$(this).find('td:eq(3)').text().trim();
					$maNguoiDung=$(this).find('td:eq(4)').text().trim();
					$maQuyen=$(this).find('td:eq(5)').text().trim();
					$tenNguoiDung=$(this).find('td:eq(6)').text().trim();
					$tenQuyen=$(this).find('td:eq(7)').text().trim();
					
					$('#capnhattendangnhap').val($tenDangNhap);
					$('#capnhatmatkhau').val($matKhau);
					$('.chonquyen').each(function(){
						if(this.value==$maQuyen){
							this.selected='selected';
						}
					});
				});
				$('.doan').pageMe({pagerSelector:'#myPager',showPrevNext:true,hidePageNumbers:false,perPage:5});
			}
		});
	});
	
	$('#li-tabxoanguoidung').click(function(){
		$.ajax({
			type : 'POST',
			url : 'LayDanhSachTaiKhoanNguoiDung',
			success : function(result){
				$('#myTable2 tr').remove();
				$table=$('#myTable2');
				result.forEach(function(value){
					var $row=$('<tr><td></td><td class="hidden"></td><td></td><td class="hidden"></td><td class="hidden"></td><td class="hidden"></td><td></td><td></td></tr>');
					$row.children().eq(1).text(value['MaTaiKhoan']);
					$row.children().eq(2).text(value['TenDangNhap']);
					$row.children().eq(3).text(value['MatKhau']);
					$row.children().eq(4).text(value['MaNguoiDung']);
					$row.children().eq(5).text(value['MaQuyen']);
					$row.children().eq(6).text(value['TenNguoiDung']);
					$row.children().eq(7).text(value['TenQuyen']);
					$row.appendTo($table);
				});
			}
		});
	});
	
	
	$('#btn-capnhatnguoidung').click(function(){
		$('#final ul li').remove();
		var stt;
		$matKhau=$('#capnhatmatkhau').val();
		$maQuyen=$('.chonquyen:selected').val();
		
		
			$.ajax({
				type : 'POST',
				url : 'CapNhatTaiKhoanNguoiDung',
				data : {
					maTaiKhoan : $maTaiKhoan,
					tenDangNhap : $tenDangNhap,
					matKhau : $matKhau,
					maNguoiDung : $maNguoiDung,
					maQuyen : $maQuyen
				},
				success : function(){
					
					stt=0;
					$('#thongbaocapnhat div').remove();
					$notify=$('<div class="alert alert-success" role="alert">Cập nhật thành công!</div>');
					$notify.appendTo($('#thongbaocapnhat'));
					$.ajax({
						type : 'POST',
						url : 'LayDanhSachTaiKhoanNguoiDung',
						success : function(result){
							
							$('#myTable tr').remove();
							$table=$('#myTable');
							result.forEach(function(value){
								stt++;
								var $row=$('<tr><td></td><td class="hidden"></td><td></td><td class="hidden"></td><td class="hidden"></td><td class="hidden"></td><td></td><td></td></tr>');
								$row.children().eq(0).text(stt);
								$row.children().eq(1).text(value['MaTaiKhoan']);
								$row.children().eq(2).text(value['TenDangNhap']);
								$row.children().eq(3).text(value['MatKhau']);
								$row.children().eq(4).text(value['MaNguoiDung']);
								$row.children().eq(5).text(value['MaQuyen']);
								$row.children().eq(6).text(value['TenNguoiDung']);
								$row.children().eq(7).text(value['TenQuyen']);
								$row.appendTo($table);
							});
							$('tbody tr').click(function(){
								$('tbody tr').removeClass('active');
								$(this).addClass('active');
								$('#xoatendangnhap').val($(this).find('td:eq(2)').text().trim());
								$('#xoamatkhau').val($(this).find('td:eq(3)').text().trim());
							});
							$('tbody tr').click(function(){
								$('tbody tr').removeClass('active');
								$(this).addClass('active');
								$maTaiKhoan=$(this).find('td:eq(1)').text().trim();
								$tenDangNhap=$(this).find('td:eq(2)').text().trim();
								$matKhau=$(this).find('td:eq(3)').text().trim();
								$maNguoiDung=$(this).find('td:eq(4)').text().trim();
								$maQuyen=$(this).find('td:eq(5)').text().trim();
								$tenNguoiDung=$(this).find('td:eq(6)').text().trim();
								$tenQuyen=$(this).find('td:eq(7)').text().trim();
								
								$('#capnhattendangnhap').val($tenDangNhap);
								$('#capnhatmatkhau').val($matKhau);
								$('.chonquyen').each(function(){
									if(this.value==$maQuyen){
										this.selected='selected';
									}
								});
							});
							
				
							$('.doan').pageMe({pagerSelector:'#myPager',showPrevNext:true,hidePageNumbers:false,perPage:5});
						}
					});
				},
				error : function(result){
					$('#thongbaocapnhat div').remove();
					$notify=$('<div class="alert alert-danger" role="alert">Cập nhật thất bại! Vui lòng kiểm tra lại!</div>');
					$notify.appendTo($('#thongbaocapnhat'));
				}
			});
		
	})
});

// SEARCH FUNCTION :

function searchFunc() {
    // Declare variables 
    var input, filter, table, tr, td, i;
    input = document.getElementById("input-search");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTable");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[6];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

function searchFunc2() {
    // Declare variables 
    var input, filter, table, tr, td, i;
    input = document.getElementById("input-search2");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTable2");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[6];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}

$.fn.pageMe = function(opts){
	console.log("aaaaa");
    var $this = this,
        defaults = {
            perPage: 10,
            showPrevNext: false,
            hidePageNumbers: false
        },
        settings = $.extend(defaults, opts); 
    
    var listElement = $this;
    var perPage = settings.perPage; 
    var children = listElement.children();
    var pager = $('.pager');
    
    if (typeof settings.childSelector!="undefined") {
        children = listElement.find(settings.childSelector);
    }
    
    if (typeof settings.pagerSelector!="undefined") {
        pager = $(settings.pagerSelector);
    }
    
    var numItems = children.length;
    var numPages = Math.ceil(numItems/perPage);

    pager.data("curr",0);
    
    if (settings.showPrevNext){
        $('<li><a href="#" class="prev_link">«</a></li>').appendTo(pager);
    }
    
    var curr = 0;
    while(numPages > curr && (settings.hidePageNumbers==false)){
        $('<li><a href="#" class="page_link">'+(curr+1)+'</a></li>').appendTo(pager);
        curr++;
    }
    
    if (settings.showPrevNext){
        $('<li><a href="#" class="next_link">»</a></li>').appendTo(pager);
    }
    
    pager.find('.page_link:first').addClass('active');
    pager.find('.prev_link').hide();
    if (numPages<=1) {
        pager.find('.next_link').hide();
    }
      pager.children().eq(1).addClass("active");
    
    children.hide();
    children.slice(0, perPage).show();
    
    pager.find('li .page_link').click(function(){
        var clickedPage = $(this).html().valueOf()-1;
        goTo(clickedPage,perPage);
        return false;
    });
    pager.find('li .prev_link').click(function(){
        previous();
        return false;
    });
    pager.find('li .next_link').click(function(){
        next();
        return false;
    });
    
    function previous(){
        var goToPage = parseInt(pager.data("curr")) - 1;
        goTo(goToPage);
    }
     
    function next(){
        goToPage = parseInt(pager.data("curr")) + 1;
        goTo(goToPage);
    }
    
    function goTo(page){
        var startAt = page * perPage,
            endOn = startAt + perPage;
        
        children.css('display','none').slice(startAt, endOn).show();
        
        if (page>=1) {
            pager.find('.prev_link').show();
        }
        else {
            pager.find('.prev_link').hide();
        }
        
        if (page<(numPages-1)) {
            pager.find('.next_link').show();
        }
        else {
            pager.find('.next_link').hide();
        }
        
        pager.data("curr",page);
      	pager.children().removeClass("active");
        pager.children().eq(page+1).addClass("active");
        
    
    }
};