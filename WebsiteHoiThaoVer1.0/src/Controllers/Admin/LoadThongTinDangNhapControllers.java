package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import DAL.ThongTinCaNhanDAL;
import Models.ThongTinDangNhapModel;

/**
 * Servlet implementation class LoadThongTinDangNhapControllers
 */
@WebServlet("/LoadThongTinDangNhapControllers")
public class LoadThongTinDangNhapControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadThongTinDangNhapControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		System.out.println("ra ko thi bao");
		PrintWriter out = response.getWriter();
		ThongTinDangNhapModel thongtin = ThongTinCaNhanDAL.ThongTinDangNhap((int)request.getSession().getAttribute("MaNguoiDung"));
		if(thongtin!=null) {
			Gson gson = new Gson();
            String objectToReturn = gson.toJson(thongtin); 
            out.write(objectToReturn); 
            out.flush();
		}else {
			out.write("1"); 
            out.flush();
		}
	}

}
