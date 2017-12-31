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
import Models.SuKienModels;

@WebServlet("/CapNhatSuKien")
public class CapNhatSuKien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CapNhatSuKien() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int maSuKien=Integer.parseInt(request.getParameter("maSuKien"));
		String tenSuKien=request.getParameter("tenSuKien");
		Date ngayBatDau=Date.valueOf(request.getParameter("ngayBatDau"));
		Date ngayKetThuc=Date.valueOf(request.getParameter("ngayKetThuc"));
		String noiDung=request.getParameter("noiDung");
		String hinh=request.getParameter("duongDanHinh");
		int thangKetThuc=Integer.parseInt(request.getParameter("thangKetThuc"));
		int namKetThuc=Integer.parseInt(request.getParameter("namKetThuc"));
		
		
		SuKienModels sukien=new SuKienModels(maSuKien, tenSuKien, ngayBatDau, ngayKetThuc, noiDung, hinh);
		if(AdminDAL.CapNhatSuKien(sukien)){
			response.setContentType("application/json;charset=utf-8");
	        response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			ArrayList<SuKienModels> lstChuDe=AdminDAL.LaySuKienTheoThangKetThucVaNam(thangKetThuc, namKetThuc);
			Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();;
			String objectToReturn = gson.toJson(lstChuDe);
	        out.write(objectToReturn);
	        out.flush();
			return;
		}
	}

}
