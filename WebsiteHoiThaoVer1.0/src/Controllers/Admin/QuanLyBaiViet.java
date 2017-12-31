package Controllers.Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuanLyBaiViet")
public class QuanLyBaiViet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("MaNguoiDung")!=null)
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/QuanLyBaiViet.jsp").forward(request, response);
		else this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
