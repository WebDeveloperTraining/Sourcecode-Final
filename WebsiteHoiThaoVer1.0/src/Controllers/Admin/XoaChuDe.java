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

@WebServlet("/XoaChuDe")
public class XoaChuDe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XoaChuDe() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int maLinhVuc=Integer.parseInt(request.getParameter("maLinhVuc"));
		String tenLinhVuc=request.getParameter("tenLinhVuc");
		int maChuDe=Integer.parseInt(request.getParameter("maChuDe"));
		String tenChuDe=request.getParameter("tenChuDe");
		Date ngayBatDau=Date.valueOf(request.getParameter("ngayBatDau"));
		Date ngayKetThuc=Date.valueOf(request.getParameter("ngayKetThuc"));
		String hinh=request.getParameter("hinh");
		Date ngayThongBaoKetQua=Date.valueOf(request.getParameter("ngayThongBaoKetQua"));
		
		ChuDeModels chude=new ChuDeModels(maChuDe,tenChuDe,maLinhVuc,tenLinhVuc,ngayBatDau,ngayKetThuc,hinh,ngayThongBaoKetQua);
		if(AdminDAL.XoaChuDe(chude)){
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
		else{
			PrintWriter out = response.getWriter();
			out.println("false");
		}
	}

}
