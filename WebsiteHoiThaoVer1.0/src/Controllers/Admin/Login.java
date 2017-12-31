package Controllers.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAL.AdminDAL;
import Models.LoginModels;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String tenDangNhap=request.getParameter("username");
			String matKhau=request.getParameter("password");
			
			LoginModels login=AdminDAL.Login(tenDangNhap, matKhau);
			
			if(login==null){
				response.sendRedirect("Login?failed=-1");
				return;
			}
			
			// Them session MaNguoiDung vao day de Cong xu ly...
			request.getSession().setAttribute("TenNguoiDung", login.getTenNguoiDung());
			request.getSession().setAttribute("Quyen", login.getMaQuyen());
			request.getSession().setAttribute("MaNguoiDung", login.getMaNguoiDung());
			request.getSession().setAttribute("TenDangNhap", tenDangNhap);
			if(login.getHinh()==null){
				request.getSession().setAttribute("Hinh", "./public/images/1.jpg");	
			}
			else
			request.getSession().setAttribute("Hinh", "./UploadFile/"+login.getHinh());	
			RequestDispatcher dispatcher= this.getServletContext().getRequestDispatcher("/WEB-INF/Admin/Home.jsp");
			dispatcher.forward(request, response);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
