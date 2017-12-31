package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAL.AdminDAL;
import Models.LoginModels;

@WebServlet("/ThemChuDe")
public class ThemChuDe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ThemChuDe() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tenChuDe = request.getParameter("tenChuDe");
		int maLinhVuc = Integer.parseInt(request.getParameter("maLinhVuc"));
		String giaiNhat=request.getParameter("giaiNhat");
		String giaiNhi=request.getParameter("giaiNhi");
		String giaiBa=request.getParameter("giaiBa");
		Date ngayBatDau=Date.valueOf(request.getParameter("ngayBatDau"));
		Date ngayKetThuc=Date.valueOf(request.getParameter("ngayKetThuc"));
		String duongDanHinh=request.getParameter("duongDanHinh");
		Date ngayThongBaoKetQua=Date.valueOf(request.getParameter("ngayThongBaoKetQua"));
		
		String[] lstDanhSachChuyenGia = request.getParameterValues("danhSachChuyenGia[]");
		PrintWriter out = response.getWriter();
		
		if (AdminDAL.ThemChuDe(tenChuDe, maLinhVuc, ngayBatDau, ngayKetThuc, duongDanHinh, ngayThongBaoKetQua)) {
			if(AdminDAL.ThemGiaiThuongChoChuDe("Giải nhất", giaiNhat)){
			}
			if(AdminDAL.ThemGiaiThuongChoChuDe("Giải nhì", giaiNhi)){
			}
			if(AdminDAL.ThemGiaiThuongChoChuDe("Giải ba", giaiBa)){
			}
			for (int i = 0; i < lstDanhSachChuyenGia.length; i++) {
				int maChuyenGia = Integer.parseInt(lstDanhSachChuyenGia[i]);
				if(AdminDAL.ThemChuyenGiaChoChuDe(maChuyenGia, maLinhVuc)){
					continue;
				}
			}
			out.print("true");
		}
		else{
			out.print("false");
		}
	}

}
