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
import com.google.gson.GsonBuilder;

import DAL.AdminDAL;
import Models.ChuDeModels;

@WebServlet("/CapNhatChuDe")
public class CapNhatChuDe extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int maChuDe=Integer.parseInt(request.getParameter("maChuDe"));
		System.out.print(maChuDe);
		String tenChuDe=request.getParameter("tenChuDe");
		int maLinhVuc=Integer.parseInt(request.getParameter("maLinhVuc"));
		String tenLinhVuc=request.getParameter("tenLinhVuc");
		Date ngayBatDau=Date.valueOf(request.getParameter("ngayBatDau"));
		Date ngayKetThuc=Date.valueOf(request.getParameter("ngayKetThuc"));
		String hinh=request.getParameter("duongDanHinh");
		Date ngayThongBaoKetQua=Date.valueOf(request.getParameter("ngayThongBaoKetQua"));
		
		ChuDeModels chude=new ChuDeModels(maChuDe,tenChuDe,maLinhVuc,tenLinhVuc,ngayBatDau,ngayKetThuc,hinh,ngayThongBaoKetQua);
		if(AdminDAL.CapNhatChuDe(chude)){
			response.setContentType("application/json;charset=utf-8");
	        response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			ArrayList<ChuDeModels> lstChuDe=AdminDAL.layDanhSachChuDeTheoLinhVuc(maLinhVuc);
			Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();;
			String objectToReturn = gson.toJson(lstChuDe);
	        out.write(objectToReturn);
	        out.flush();
			return;
		}
	}

}
