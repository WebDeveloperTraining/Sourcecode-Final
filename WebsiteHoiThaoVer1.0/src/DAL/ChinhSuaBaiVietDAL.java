package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.BaiVietModel;
import Models.ThongBaoBaiVietModel;

public class ChinhSuaBaiVietDAL extends SQLProvider {
	private static java.sql.PreparedStatement unitcommand=null;
	public static Boolean KiemTraChinhSua(int maBaiViet){
		if(ConnectDB()){
			try{
				System.out.println("test loi thoi l1");
				String sqlExecute= "{call sp_KiemTraTrangThaiChinhSua(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maBaiViet);
				
				ResultSet rs=unitcommand.executeQuery(); 
				Boolean flag=true;
				while(rs.next()) {
					flag = false;
					System.out.println("test loi thoi");
				}
				System.out.println("flag: " + flag);
				return flag;
			}
			catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return true;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return true;
			}
			finally {
				try {
					unitcommand.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		return true;
	}
	
	
	public static Boolean ChinhSuaBai(int maNguoiDung, BaiVietModel baiViet){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_CapNhatBaiViet(?,?,?,?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setString(1, baiViet.getTenBaiViet());
				unitcommand.setString(2, baiViet.getTomTat());
				unitcommand.setString(3, baiViet.getDiaChiFile());
				unitcommand.setInt(4, baiViet.getMaChuDe());
				unitcommand.setInt(5, baiViet.getMaBaiViet());
				
				if(unitcommand.executeUpdate()==1) {
					return true;
				}
				else {
					return false;
				}
			}
			catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			}
			finally {
				try {
					unitcommand.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	
}
