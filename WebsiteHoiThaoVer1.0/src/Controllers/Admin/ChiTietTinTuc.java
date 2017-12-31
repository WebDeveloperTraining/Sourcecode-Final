package Controllers.Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.AdminDAL;
import Models.SuKienModels;

@WebServlet("/ChiTietTinTuc")
public class ChiTietTinTuc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChiTietTinTuc() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int maSuKien=Integer.parseInt(request.getParameter("ma-tin-tuc"));
		SuKienModels suKien=AdminDAL.LaySuKienTheoMaSuKien(maSuKien);
		request.setAttribute("SuKien", suKien);
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/ChiTietTinTuc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
