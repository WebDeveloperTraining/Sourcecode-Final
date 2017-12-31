package Controllers.Admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.AdminDAL;
import Models.QuyenModels;

@WebServlet("/QuanLyNguoiDung")
public class QuanLyNguoiDung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public QuanLyNguoiDung() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("MaNguoiDung")!=null){
			ArrayList<QuyenModels> lstQuyen=AdminDAL.LayDanhSachQuyen();
			request.setAttribute("DanhSachQuyen", lstQuyen);
			this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/QuanLyNguoiDung.jsp").forward(request, response);
		}
			else 
				this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
