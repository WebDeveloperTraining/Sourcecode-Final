package Controllers.Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.AdminDAL;

@WebServlet("/DangKyTaiKhoan")
public class DangKyTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DangKyTaiKhoan() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/DangKyTaiKhoan.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");*/
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
		String tenNguoiDung=request.getParameter("fullname");
		String tenDangNhap=request.getParameter("username");
		String matKhau=request.getParameter("password");
		String email=request.getParameter("email");
		
		if(AdminDAL.DangKyTaiKhoan(tenNguoiDung, tenDangNhap, matKhau, email)==1){
			this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
		}
		else{
			
			response.sendRedirect("DangKyTaiKhoan?failed=-1");
		}
	}

}
