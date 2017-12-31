package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLProvider {
	static String hostName="node6091-workshopwebsite.ocs.opusinteractive.io";
//	static String hostName="localhost";
	static String dbName="websitehoithaodb";
	
//	protected static String SqlConnectionString="jdbc:sqlserver://localhost:1433;databaseName=WebsiteHoiThaoDb;user=CNTT;password=cnttdhspkt;";
	protected static String SqlConnectionString="jdbc:mysql://" + hostName + "/" + dbName+"?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
	protected static Connection conn=null;
	
	public static Boolean ConnectDB(){
		try {
//			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 Class.forName("com.mysql.jdbc.Driver");
//			 conn=DriverManager.getConnection(SqlConnectionString,"root","1234");
			 conn=DriverManager.getConnection(SqlConnectionString,"root","LVLyhz48990");
	    }
		catch(SQLException e) {
	        	System.out.println("Database Connect Failed.");
	            return false;
	    }
		catch (ClassNotFoundException e) {
				e.printStackTrace();
				return false;
		}
		return true;
	}
}
