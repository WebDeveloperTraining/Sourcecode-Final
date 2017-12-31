package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.ThongTinCaNhanDAL;

/**
 * Servlet implementation class CapNhatThongTinCaNhanControllers
 */
@WebServlet("/CapNhatThongTinCaNhanControllers")
public class CapNhatThongTinCaNhanControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapNhatThongTinCaNhanControllers() {
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
		
		
		String ten = request.getParameter("TenNguoiDung");
		Boolean gioitinh = Boolean.valueOf(request.getParameter("GioiTinh"));
		System.out.println(gioitinh);
		String Email = request.getParameter("Email");
		String diaChi = request.getParameter("DiaChi");
		String CMND = request.getParameter("CMND");
		Date ngaySinh = Date.valueOf(request.getParameter("NgaySinh"));
        String ngheNghiep = request.getParameter("NgheNghiep");
        String DT = request.getParameter("DT");
        String giaoduc = request.getParameter("HocVan");
        String kinhNghiem = request.getParameter("KinhNghiem");
        
		if(ThongTinCaNhanDAL.CapNhatThongTin((int)request.getSession().getAttribute("MaNguoiDung"), ten, gioitinh, diaChi, Email, CMND, ngaySinh, ngheNghiep, giaoduc, DT, kinhNghiem)==true) {
			out.write("true");
			out.flush();
		}else {
			out.write("false");
			out.flush();
		}
		
	}

}
