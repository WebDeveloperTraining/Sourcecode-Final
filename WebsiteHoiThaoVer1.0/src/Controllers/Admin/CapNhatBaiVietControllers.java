package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.ChinhSuaBaiVietDAL;
import DAL.DangKiChuDeDAL;
import Models.BaiVietModel;

/**
 * Servlet implementation class CapNhatBaiVietControllers
 */
@WebServlet("/CapNhatBaiVietControllers")
public class CapNhatBaiVietControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapNhatBaiVietControllers() {
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
		
		PrintWriter out = response.getWriter();
		
		
		if(request.getSession().getAttribute("MaNguoiDung")==null) {
			out.write("3");
			out.flush();
		}else {
			
			
			String tenBaiViet = request.getParameter("TenBaiDuThi");
			int maChuDe = Integer.parseInt(request.getParameter("MaChuDe"));
			String tomTat = request.getParameter("TomTat");
			String diaChiFile = request.getParameter("TepDinhKem");
			int maBaiViet = Integer.parseInt(request.getParameter("MaBaiViet"));
			
			if (ChinhSuaBaiVietDAL.KiemTraChinhSua(maBaiViet)==false) {
				if (ChinhSuaBaiVietDAL.ChinhSuaBai((int) request.getSession().getAttribute("MaNguoiDung"), new BaiVietModel(maBaiViet, tenBaiViet, tomTat, diaChiFile, maChuDe))) {
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
