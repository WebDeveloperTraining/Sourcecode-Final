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

@WebServlet("/LayDanhSachTaiKhoanNguoiDung")
public class LayDanhSachTaiKhoanNguoiDung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LayDanhSachTaiKhoanNguoiDung() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		ArrayList<LoginModels> lstTaiKhoan=AdminDAL.LayDanhSachTaiKhoanNguoiDung();
		Gson gson=new Gson();
		String objectToReturn = gson.toJson(lstTaiKhoan);
        out.write(objectToReturn);
        out.flush();
	}

}
