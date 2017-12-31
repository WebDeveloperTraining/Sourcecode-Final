package DAL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.ReviewBaiViet;
import Models.ReviewModel;

public class ReviewDAL extends SQLProvider {
	private static java.sql.PreparedStatement unitcommand=null;
	
	public static List<ReviewModel> DanhSachBaiReview(int maNguoiDung, int maChuDe, int maTrangThai){
		System.out.println("sai dau ma sai 1");
		List<ReviewModel> dsChuDe = new ArrayList<ReviewModel>();
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_DanhSachBaiVietCanDuyet(?,?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maNguoiDung);
				unitcommand.setInt(2, maChuDe);
				unitcommand.setInt(3, maTrangThai);
				ResultSet rs=unitcommand.executeQuery(); 
				while(rs.next()) {
					int maBaiViet = rs.getInt("MaBaiViet");
					String tenBaiViet = rs.getString("TenBaiViet");
					int MaChuDe = rs.getInt("MaChuDe");
					String tenTrangThai = rs.getString("TenTrangThai");
					String tenTacGia = rs.getString("TenNguoiDung");
					String tomTat = rs.getString("TomTat");
					String diaChuFile = rs.getString("DiaChiFile");
					 
					dsChuDe.add(new ReviewModel(maBaiViet, tenBaiViet, MaChuDe, tenTrangThai, tenTacGia, tomTat, diaChuFile));
				}
				System.out.println("ko sai ma");
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
	
	
	public static Boolean DanhGia(ReviewBaiViet baiviet){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_DuyetBai(?,?,?,?,?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, baiviet.getMaBaiViet());
				unitcommand.setInt(2, baiviet.getMaChuyenGia());
				unitcommand.setInt(3, baiviet.getMaChuDe());
				unitcommand.setInt(4, baiviet.getMaTrangThai());
				unitcommand.setString(5, baiviet.getNhanXet());
				unitcommand.setInt(6, baiviet.getDiemSo());
				
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
