package Controllers.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAL.AdminDAL;
import Models.LinhVucModels;

@WebServlet("/LayDanhSachLinhVuc")
public class LayDanhSachLinhVuc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LayDanhSachLinhVuc() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		ArrayList<LinhVucModels> lstLinhVuc=AdminDAL.LayDanhSachLinhVucConHoatDong();
		Gson gson=new Gson();
		String objectToReturn = gson.toJson(lstLinhVuc);
        out.write(objectToReturn);
        out.flush();
	}

}
