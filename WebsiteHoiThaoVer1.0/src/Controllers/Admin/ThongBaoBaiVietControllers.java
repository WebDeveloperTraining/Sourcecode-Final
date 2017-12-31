package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAL.ThongBaoBaiVietDAL;
import Models.ThongBaoBaiVietModel;

/**
 * Servlet implementation class ThongBaoBaiVietControllers
 */
@WebServlet("/ThongBaoBaiVietControllers")
public class ThongBaoBaiVietControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThongBaoBaiVietControllers() {
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
		int maBaiViet = Integer.parseInt(request.getParameter("MaBaiViet"));
		System.out.println(maBaiViet);
		List<ThongBaoBaiVietModel> dsthongbao = ThongBaoBaiVietDAL.ThongBao(maBaiViet);
		if (!dsthongbao.isEmpty()) {
            response.setCharacterEncoding("UTF8");
            response.setContentType("application/json");
            //Import gson-2.2.2.jar
            Gson gson = new Gson();
            String objectToReturn = gson.toJson(dsthongbao); //Convert List -> Json
            out.write(objectToReturn); //Ä�Æ°a Json tráº£ vá»� Ajax
            out.flush();

        } else {
            response.setCharacterEncoding("UTF8");
            response.setContentType("application/json");
            out.write("{\"check\":\"fail\"}");
            out.flush();
        }
	}

}
