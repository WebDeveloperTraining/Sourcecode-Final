package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import DAL.SubjectDAL;
import Models.DetailsSubjectModel;

/**
 * Servlet implementation class ChiTietChuDeControllers
 */
@WebServlet("/ChiTietChuDeControllers")
public class ChiTietChuDeControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChiTietChuDeControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int maChuDe = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", maChuDe);
		System.out.println("id: "+maChuDe);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/Home/chitietchude.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
