package DAL;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.BaiVietModel;
import Models.ChuDeModel;
import Models.ReviewBaiVietModel;
import Models.ThongTinCaNhanModel;

public class DangKiChuDeDAL extends SQLProvider {
	private static java.sql.PreparedStatement unitcommand=null;
	
	public static List<ChuDeModel> LoadChuDe(){
		
		List<ChuDeModel> dsChuDe = new ArrayList<ChuDeModel>();
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_DanhSachChuDe()}";
				unitcommand=conn.prepareStatement(sqlExecute);

				ResultSet rs=unitcommand.executeQuery(); 
				while(rs.next()) {
					String tenChuDe = rs.getString("TenChuDe");
					int maChuDe = rs.getInt("MaChuDe");
					 
					dsChuDe.add(new ChuDeModel(maChuDe, tenChuDe));
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
	
	
	public static Boolean DangKiDuThi(int maNguoiDung, BaiVietModel baiViet){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_DangKiDuThi(?,?,?,?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maNguoiDung);
				unitcommand.setString(2, baiViet.getTenBaiViet());
				unitcommand.setString(3, baiViet.getTomTat());
				unitcommand.setString(4, baiViet.getDiaChiFile());
				unitcommand.setInt(5, baiViet.getMaChuDe());
				
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
	
public static Boolean KiemTraDkThamGia(int MaNguoiDung, int MaChuDe){
		
		
		if(ConnectDB()){
			try{
				
				String sqlExecute= "{call sp_KiemTraDangKiThamGia(?,?)}";
				
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, MaNguoiDung);
				unitcommand.setInt(2, MaChuDe);
				
				ResultSet rs=unitcommand.executeQuery(); 
				int k = 0;
				while(rs.next()) {
					k++;
				}
				unitcommand.close();
				conn.close();
				System.out.println("kq : "+k);
				if(k==0)
					return true;
				else
					return false;
			}
			catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("eror : "+e.getMessage());
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

	public static List<ReviewBaiVietModel> DanhSachDuThi(int MaNguoiDung) {

		List<ReviewBaiVietModel> dsChuDe = new ArrayList<ReviewBaiVietModel>();
		if (ConnectDB()) {
			try {
				String sqlExecute = "{call sp_DanhSachDuThiTheoNguoiDung(?)}";
				unitcommand = conn.prepareStatement(sqlExecute);
				unitcommand.setInt(1, MaNguoiDung);
				ResultSet rs = unitcommand.executeQuery();
				while (rs.next()) {
					int maBaiViet = rs.getInt("MaBaiViet");
					String tenBaiViet = rs.getString("tenBaiViet");
					String tomTat = rs.getString("TomTat");
					String diaChiFile = rs.getString("DiaChiFile");
					int maChuDe = rs.getInt("MaChuDe");
					String trangThai = rs.getString("TenTrangThai");
					String tenChuDe = rs.getString("TenChuDe");
					dsChuDe.add(new ReviewBaiVietModel(maBaiViet, tenBaiViet, tomTat, diaChiFile, maChuDe, trangThai, tenChuDe));
				}
				unitcommand.close();
				conn.close();
				return dsChuDe;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			} finally {
				try {
					unitcommand.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
}
