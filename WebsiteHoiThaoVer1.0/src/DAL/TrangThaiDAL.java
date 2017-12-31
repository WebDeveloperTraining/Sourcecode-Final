package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.TrangThaiModel;

public class TrangThaiDAL extends SQLProvider {
private static java.sql.PreparedStatement unitcommand=null;
	
	public static List<TrangThaiModel> LoadTrangThai(){
		
		List<TrangThaiModel> dsChuDe = new ArrayList<TrangThaiModel>();
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_DanhSachTrangThai()}";
				unitcommand=conn.prepareStatement(sqlExecute);

				ResultSet rs=unitcommand.executeQuery(); 
				while(rs.next()) {
					String tenTrangThai = rs.getString("TenTrangThai");
					int maTrangThai = rs.getInt("MaTrangThai");
					 
					dsChuDe.add(new TrangThaiModel(maTrangThai, tenTrangThai));
				}
				unitcommand.close();
				conn.close();
				return dsChuDe;
			}
			catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
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
		return null;
	}
	
}
