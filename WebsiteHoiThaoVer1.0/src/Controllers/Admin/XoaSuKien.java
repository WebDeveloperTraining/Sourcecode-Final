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

@WebServlet("/XoaSuKien")
public class XoaSuKien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public XoaSuKien() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int maSuKien=Integer.parseInt(request.getParameter("maSuKien"));
		
		int thangKetThuc=Integer.parseInt(request.getParameter("thangketthuc"));
		int namKetThuc=Integer.parseInt(request.getParameter("namketthuc"));
		
		if(AdminDAL.XoaSuKien(maSuKien)){
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
