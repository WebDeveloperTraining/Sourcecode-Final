package Controllers.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TrangCaNhanControllers
 */
@WebServlet("/TrangCaNhanControllers")
public class TrangCaNhanControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrangCaNhanControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		if(request.getSession().getAttribute("MaNguoiDung")==null){
//			this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
//			return;
//		}
		if(request.getSession().getAttribute("MaNguoiDung")!=null)
			this.getServletContext().getRequestDispatcher("/WEB-INF/User/trangcanhan.jsp").forward(request, response);
		else
			this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
