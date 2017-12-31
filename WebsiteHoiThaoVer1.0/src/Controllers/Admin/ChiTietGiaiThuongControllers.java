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
import com.google.gson.GsonBuilder;

import DAL.SubjectDAL;
import Models.GiaiThuongModel;

/**
 * Servlet implementation class ChiTietGiaiThuongControllers
 */
@WebServlet("/ChiTietGiaiThuongControllers")
public class ChiTietGiaiThuongControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietGiaiThuongControllers() {
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
		
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		
		
		int maChuDe = Integer.parseInt(request.getParameter("MaChuDe"));
		List<GiaiThuongModel> dsGiaiThuong = SubjectDAL.ChiTietGiaiThuong(maChuDe);
		
		if (!dsGiaiThuong.isEmpty()) {
            response.setCharacterEncoding("UTF8");
            response.setContentType("application/json");
           
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            String objectToReturn = gson.toJson(dsGiaiThuong);
            out.write(objectToReturn); 
            out.flush();

        } else {
            response.setCharacterEncoding("UTF8");
            response.setContentType("application/json");
            out.write("{\"check\":\"fail\"}");
            out.flush();
        }
		
	}

}
