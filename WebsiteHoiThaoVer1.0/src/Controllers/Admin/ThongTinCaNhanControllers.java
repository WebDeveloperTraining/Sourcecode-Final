package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Object;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import DAL.ThongTinCaNhanDAL;
import Models.ThongTinCaNhanModel;

/**
 * Servlet implementation class ThongTinCaNhanControllers
 */
@WebServlet("/ThongTinCaNhanControllers")
public class ThongTinCaNhanControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThongTinCaNhanControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("MaNguoiDung")==null) {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/Home/login.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		PrintWriter out = response.getWriter();
		
		
		int MaNguoiDung = Integer.parseInt(request.getSession().getAttribute("MaNguoiDung").toString());
		System.out.println(MaNguoiDung);
		ThongTinCaNhanModel ThongTin = ThongTinCaNhanDAL.ThongTinCaNhan(MaNguoiDung);
		Gson data = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		String dataJson = data.toJson(ThongTin);
		out.write(dataJson);
		out.flush();
		
//		ArrayList<HoaDonModels> lstHoaDonTheoThang=AdminDAL.LayDanhSachHoaDonTheoThang(month);
//		Gson gson=new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//		String objectToReturn = gson.toJson(lstHoaDonTheoThang);
//        out.write(objectToReturn);
//        out.flush();
//		
	}


}
