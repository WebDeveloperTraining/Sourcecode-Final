package Controllers.Admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import DAL.ThongTinCaNhanDAL;


/**
 * Servlet implementation class CapNhatAnhDaiDienControllers
 */
@WebServlet("/CapNhatAnhDaiDienControllers")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB
public class CapNhatAnhDaiDienControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SAVE_DIRECTORY = "UploadFile";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapNhatAnhDaiDienControllers() {
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
		// Check that we have a file upload request
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8"); 
		
		PrintWriter out = response.getWriter();
		
		try {
	           
	           String appPath = request.getServletContext().getRealPath("");
	           appPath = appPath.replace('\\', '/');
	 
	  
	           
	           String fullSavePath = null;
	           if (appPath.endsWith("/")) {
	               fullSavePath = appPath + SAVE_DIRECTORY;
	           } else {
	               fullSavePath = appPath + "/" + SAVE_DIRECTORY;
	           }
	  
	           
	           File fileSaveDir = new File(fullSavePath);
	           if (!fileSaveDir.exists()) {
	               fileSaveDir.mkdir();
	           }
	  
	  
	           for (Part part : request.getParts()) {
	               String fileName = extractFileName(part);
	               if (fileName != null && fileName.length() > 0) {
	                   String filePath = fullSavePath + File.separator + fileName;
	                   System.out.println("Write attachment to file: " + filePath);
	                   request.setAttribute("link", fileName);
	                  
	                   part.write(filePath);
	                   ThongTinCaNhanDAL.CapNhatAnhDaiDien((int)request.getSession().getAttribute("MaNguoiDung"), fileName);
	                   out.write("./UploadFile/"+fileName);
	                   out.flush();
	               }
	           }
	  
	
	           
	       } catch (Exception e) {
	           e.printStackTrace();
	           
	       }
				
	}
	
	private String extractFileName(Part part) {
	       // form-data; name="file"; filename="C:\file1.zip"
	       // form-data; name="file"; filename="C:\Note\file2.zip"
	       String contentDisp = part.getHeader("content-disposition");
	       String[] items = contentDisp.split(";");
	       for (String s : items) {
	           if (s.trim().startsWith("filename")) {
	               // C:\file1.zip
	               // C:\Note\file2.zip
	               String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
	               clientFileName = clientFileName.replace("\\", "/");
	               int i = clientFileName.lastIndexOf('/');
	               // file1.zip
	               // file2.zip
	               return clientFileName.substring(i + 1);
	           }
	       }
	       return null;
	   }


}
