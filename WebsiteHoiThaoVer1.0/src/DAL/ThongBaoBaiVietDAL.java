package DAL;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.ThongBaoBaiVietModel;

public class ThongBaoBaiVietDAL extends SQLProvider {
	private static java.sql.PreparedStatement unitcommand=null;
	public static List<ThongBaoBaiVietModel> ThongBao(int maBaiViet){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongBaoBaiViet(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maBaiViet);
				
				ResultSet rs=unitcommand.executeQuery(); 
				
				List<ThongBaoBaiVietModel> dsThongBao = new ArrayList<ThongBaoBaiVietModel>();
				while(rs.next()) {
					String chuDeThongBao = rs.getString("ChuDeThongBao");
					String noiDung = rs.getString("NoiDungThongBao");
					System.out.println("fsdkfsdjkfhsdjfhjksdfhsdhfjksdfhsjdkfhsdjfhsdj");
					dsThongBao.add(new ThongBaoBaiVietModel(chuDeThongBao, noiDung));
				}
				unitcommand.close();
				conn.close(); 
				return dsThongBao;
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
