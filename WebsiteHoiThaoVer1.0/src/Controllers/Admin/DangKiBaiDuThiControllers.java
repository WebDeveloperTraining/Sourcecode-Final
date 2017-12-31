package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.DangKiChuDeDAL;
import Models.BaiVietModel;

/**
 * Servlet implementation class DangKiBaiDuThiControllers
 */
@WebServlet("/DangKiBaiDuThiControllers")
public class DangKiBaiDuThiControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKiBaiDuThiControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("MaNguoiDung")!=null) {
			
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/User/dangbai.jsp");
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
		if(request.getSession().getAttribute("MaNguoiDung")==null) {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/Home/login.jsp");
			dispatcher.forward(request, response);
			return;
		}else {
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8"); 
			
			PrintWriter out = response.getWriter();
			
			String TenBaiDuThi = request.getParameter("TenBaiDuThi");
			int MaChuDe = Integer.parseInt(request.getParameter("MaChuDe"));
			String TomTat = request.getParameter("TomTat");
			String TepDinhKem = request.getParameter("TepDinhKem");
			if (DangKiChuDeDAL.KiemTraDkThamGia((int) request.getSession().getAttribute("MaNguoiDung"), MaChuDe)==true) {
				if (DangKiChuDeDAL.DangKiDuThi((int) request.getSession().getAttribute("MaNguoiDung"),
						new BaiVietModel(0, TenBaiDuThi, TomTat, TepDinhKem, MaChuDe))) {
					out.write("1");
					out.flush();
				} else {
					out.write("2");
					out.flush();
				}
			} else {
				out.write("0");
				out.flush();
			}
			
		}
	}

}
