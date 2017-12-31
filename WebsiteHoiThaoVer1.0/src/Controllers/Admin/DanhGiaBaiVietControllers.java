package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.ReviewDAL;
import Models.ReviewBaiViet;

/**
 * Servlet implementation class DanhGiaBaiVietControllers
 */
@WebServlet("/DanhGiaBaiVietControllers")
public class DanhGiaBaiVietControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhGiaBaiVietControllers() {
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
		int MaChuDe = Integer.parseInt(request.getParameter("MaChuDe"));
		int MaBaiViet = Integer.parseInt(request.getParameter("MaBaiViet"));
		System.out.println("ma trang thai: "+request.getParameter("TrangThaiBaiViet"));
		int MaTrangThai = Integer.parseInt(request.getParameter("TrangThaiBaiViet"));
		int DiemSo = Integer.parseInt(request.getParameter("DiemSo"));
		String nhanxet = request.getParameter("NhanXet");
		if(ReviewDAL.DanhGia(new ReviewBaiViet(MaBaiViet, MaChuDe, (int)request.getSession().getAttribute("MaNguoiDung"), DiemSo, nhanxet, MaTrangThai))==true) {
			 out.write("true");
            out.flush();
		}else {
			out.write("false");
           out.flush();
		}
		
	}

}
