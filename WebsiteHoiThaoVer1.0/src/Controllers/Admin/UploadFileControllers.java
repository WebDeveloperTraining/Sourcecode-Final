package Controllers.Admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import DAL.ThongTinCaNhanDAL;

/**
 * Servlet implementation class UploadFileControllers
 */
@WebServlet("/UploadFileControllers")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 100, // 10MB
maxRequestSize = 1024 * 1024 * 200) // 50MB
public class UploadFileControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String SAVE_DIRECTORY = "UploadFile";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFileControllers() {
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
		System.out.println("vÃ´ nha");
		try {
	           // Ä�Æ°á»�ng dáº«n tuyá»‡t Ä‘á»‘i tá»›i thÆ° má»¥c gá»‘c cá»§a web app.
	           String appPath = request.getServletContext().getRealPath("");
	           appPath = appPath.replace('\\', '/');
	 
	  
	           // ThÆ° má»¥c Ä‘á»ƒ save file táº£i lÃªn.
	           String fullSavePath = null;
	           if (appPath.endsWith("/")) {
	               fullSavePath = appPath + SAVE_DIRECTORY;
	           } else {
	               fullSavePath = appPath + "/" + SAVE_DIRECTORY;
	           }
	  
	           // Táº¡o thÆ° má»¥c náº¿u nÃ³ khÃ´ng tá»“n táº¡i.
	           File fileSaveDir = new File(fullSavePath);
	           if (!fileSaveDir.exists()) {
	               fileSaveDir.mkdir();
	           }
	  
	           // Danh má»¥c cÃ¡c pháº§n Ä‘Ã£ upload lÃªn (CÃ³ thá»ƒ lÃ  nhiá»�u file).
	           for (Part part : request.getParts()) {
	               String fileName = extractFileName(part);
	               if (fileName != null && fileName.length() > 0) {
	                   String filePath = fullSavePath + File.separator + fileName;
	                   System.out.println("Write attachment to file: " + filePath);
	                   request.setAttribute("link", fileName);
	                   // Ghi vÃ o file.
	                   part.write(filePath);
	                   out.write(fileName);
	                   out.flush();
	               }
	           }
	  
	           // Upload thÃ nh cÃ´ng.
	           
	       } catch (Exception e) {
	           e.printStackTrace();
	           System.out.println("loi nay la gi: "+ e.getMessage());
	           
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
