package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import DAL.AdminDAL;
import Models.BaiVietModels;
import Models.ChuDeModels;

@WebServlet("/ReviewerCapNhatThongBao")
public class ReviewerCapNhatThongBao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReviewerCapNhatThongBao() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chuDeThongBao=request.getParameter("chuDeThongBao");
		String noiDungThongBao=request.getParameter("noiDungThongBao");
		int maBaiViet=Integer.parseInt(request.getParameter("maBaiViet"));
		int maTrangThai=Integer.parseInt(request.getParameter("maTrangThai"));
		int trangThaiTimKiem=Integer.parseInt(request.getParameter("trangThaiTimKiem"));
		
		
		if(AdminDAL.ReviewerCapNhatThongBao(chuDeThongBao,noiDungThongBao,maBaiViet,maTrangThai)){
			response.setContentType("application/json;charset=utf-8");
	        response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			
			ArrayList<BaiVietModels> lstChuDe=AdminDAL.LayDanhSachBaiVietTheoChuDeVaTrangThai(trangThaiTimKiem, maTrangThai);
			Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();;
			String objectToReturn = gson.toJson(lstChuDe);
	        out.write(objectToReturn);
	        out.flush();
			return;
		}
	}

}
