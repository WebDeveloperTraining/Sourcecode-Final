package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.AdminDAL;

@WebServlet("/ThemSuKien")
public class ThemSuKien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThemSuKien() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenSuKien=request.getParameter("tenSuKien");
		Date ngayBatDauSuKien=Date.valueOf(request.getParameter("ngayBatDauSuKien"));
		Date ngayKetThucSuKien=Date.valueOf(request.getParameter("ngayKetThucSuKien"));
		String noiDung=request.getParameter("noiDung");
		String hinh=request.getParameter("duongDanHinh");
		
		if(AdminDAL.ThemSuKien(tenSuKien, ngayBatDauSuKien, ngayKetThucSuKien, noiDung, hinh)){
			response.setContentType("application/json;charset=utf-8");
	        response.setCharacterEncoding("UTF-8");

			PrintWriter out = response.getWriter();
			out.println("true");
		}
	}

}
