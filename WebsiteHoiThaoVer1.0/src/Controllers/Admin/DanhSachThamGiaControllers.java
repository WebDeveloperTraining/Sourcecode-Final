package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAL.DangKiChuDeDAL;
import Models.ReviewBaiVietModel;

/**
 * Servlet implementation class DanhSachThamGiaControllers
 */
@WebServlet("/DanhSachThamGiaControllers")
public class DanhSachThamGiaControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachThamGiaControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("MaNguoiDung")!=null) {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/User/danhsachbaiduthi.jsp");
			dispatcher.forward(request, response);
		}else {
			
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp");
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
		
			List<ReviewBaiVietModel> dsBaiViet = DangKiChuDeDAL.DanhSachDuThi((int)request.getSession().getAttribute("MaNguoiDung"));
			
			if (!dsBaiViet.isEmpty()) {

	            response.setCharacterEncoding("UTF8");
	            response.setContentType("application/json");
	            //Import gson-2.2.2.jar
	            Gson gson = new Gson();
	            String objectToReturn = gson.toJson(dsBaiViet); //Convert List -> Json
	            out.write(objectToReturn); //Ä�Æ°a Json tráº£ vá»� Ajax
	            out.flush();

	        } else {
	            response.setCharacterEncoding("UTF8");
	            response.setContentType("application/json");
	            out.write("{\"check\":\"fail\"}");
	            out.flush();
	        }
			
	}

}
