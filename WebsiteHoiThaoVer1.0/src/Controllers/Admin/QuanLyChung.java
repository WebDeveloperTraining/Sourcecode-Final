package Controllers.Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

@WebServlet("/QuanLyChung")
public class QuanLyChung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuanLyChung() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("MaNguoiDung")!=null)
			this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/QuanLyChung.jsp").forward(request, response);
		else
			this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
