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

@WebServlet("/LaySuKienTheoThangKetThucVaNam")
public class LaySuKienTheoThangKetThucVaNam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LaySuKienTheoThangKetThucVaNam() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		
		int thangKetThuc=Integer.parseInt(request.getParameter("thangketthuc"));
		int namKetThuc=Integer.parseInt(request.getParameter("namketthuc"));
		ArrayList<SuKienModels> lstSuKien=AdminDAL.LaySuKienTheoThangKetThucVaNam(thangKetThuc, namKetThuc);
		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String objectToReturn = gson.toJson(lstSuKien);
        out.write(objectToReturn);
        out.flush();
	}

}
