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

import DAL.AdminDAL;
import Models.LoginModels;

@WebServlet("/CapNhatTaiKhoanNguoiDung")
public class CapNhatTaiKhoanNguoiDung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CapNhatTaiKhoanNguoiDung() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int maTaiKhoan=Integer.parseInt(request.getParameter("maTaiKhoan"));
		String tenDangNhap=request.getParameter("tenDangNhap");
		String matKhau=request.getParameter("matKhau");
		int maNguoiDung=Integer.parseInt(request.getParameter("maNguoiDung"));
		int maQuyen=Integer.parseInt(request.getParameter("maQuyen"));
		
		LoginModels account=new LoginModels(maTaiKhoan, tenDangNhap, matKhau, maNguoiDung, maQuyen);
		String err="";
		if(AdminDAL.CapNhatTaiKhoanNguoiDung(account,err)){
			response.setContentType("application/json;charset=utf-8");
	        response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			ArrayList<LoginModels> lstTaiKhoan=AdminDAL.LayDanhSachTaiKhoanNguoiDung();
			Gson gson=new Gson();
			String objectToReturn = gson.toJson(lstTaiKhoan);
	        out.write(objectToReturn);
	        out.flush();
			return;
		}
		else{
			response.setContentType("application/json;charset=utf-8");
	        response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			Gson gson=new Gson();
			String objectToReturn = gson.toJson(err);
	        out.write(objectToReturn);
	        out.flush();
			return;
		}
		
	}

}
