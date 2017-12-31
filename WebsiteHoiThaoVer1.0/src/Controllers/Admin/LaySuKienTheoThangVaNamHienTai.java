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
import Models.SuKienModels;

@WebServlet("/LaySuKienTheoThangVaNamHienTai")
public class LaySuKienTheoThangVaNamHienTai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LaySuKienTheoThangVaNamHienTai() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		
		ArrayList<SuKienModels> lstSuKien=AdminDAL.LaySuKienTheoThangVaNamHienTai();
		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String objectToReturn = gson.toJson(lstSuKien);
        out.write(objectToReturn);
        out.flush();
	}

}
