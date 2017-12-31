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
import Models.BaiVietModels;

@WebServlet("/LayDanhSachToanBoBaiViet")
public class LayDanhSachToanBoBaiViet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LayDanhSachToanBoBaiViet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		ArrayList<BaiVietModels> lstBaiViet=AdminDAL.LayDanhSachBaiViet();
		Gson gson=new Gson();
		String objectToReturn = gson.toJson(lstBaiViet);
        out.write(objectToReturn);
        out.flush();
	}

}
