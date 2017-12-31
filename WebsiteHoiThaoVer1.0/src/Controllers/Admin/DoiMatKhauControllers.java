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

/**
 * Servlet implementation class DoiMatKhauControllers
 */
@WebServlet("/DoiMatKhauControllers")
public class DoiMatKhauControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoiMatKhauControllers() {
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
		String MatKhau = request.getParameter("MatKhau");
		String Email= request.getParameter("Email");
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		Boolean flag = ThongTinCaNhanDAL.DoiMatKhau((int)request.getSession().getAttribute("MaNguoiDung"), MatKhau, Email);
		System.out.println(flag);
		if(flag==true) {
			
            out.write("true"); 
            out.flush();
		}else {
			out.write("false"); 
            out.flush();
		}
	}

}
