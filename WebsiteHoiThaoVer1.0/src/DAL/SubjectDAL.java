package DAL;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.ChuDeModel;
import Models.ChuyenGiaModel;
import Models.DetailsSubjectModel;
import Models.GiaiThuongModel;
import Models.SubjectModel;

public class SubjectDAL extends SQLProvider {
private static java.sql.PreparedStatement unitcommand=null;
	
	public static List<SubjectModel> LoadDanhSachChuDe(){
		
		List<SubjectModel> dsChuDe = new ArrayList<SubjectModel>();
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongTinDanhSachChuDe()}";
				unitcommand=conn.prepareStatement(sqlExecute);

				ResultSet rs=unitcommand.executeQuery(); 
				while(rs.next()) {
					String tenChuDe = rs.getString("TenChuDe");
					int maChuDe = rs.getInt("MaChuDe");
					Date ngayBatDau = rs.getDate("NgayBatDau");
					Date ngayKetThuc = rs.getDate("NgayKetThuc");
					String hinh = rs.getString("Hinh");
					Date ngayThongBaoKQ = rs.getDate("NgayThongBaoKetQua");
					dsChuDe.add(new SubjectModel(maChuDe, tenChuDe, ngayBatDau, ngayKetThuc, hinh, ngayThongBaoKQ));
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
	
	
	public static DetailsSubjectModel ChiTietChuDe(int MaChuDe){
		
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongTinChuTietChuDe(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, MaChuDe);
				ResultSet rs=unitcommand.executeQuery(); 
				if(rs.next()) {
					int maChuDe = rs.getInt("MaChuDe");
					String tenChuDe = rs.getString("TenChuDe");
					int maLinhVuc = rs.getInt("MaLinhVuc");
					String tenLinhVuc = rs.getString("TenLinhVuc");
					Date ngayBatDau = rs.getDate("NgayBatDau");
					Date ngayKetThuc = rs.getDate("NgayKetThuc");
					Date ngayThongBaoKQ = rs.getDate("NgayThongBaoKetQua");
					
					return new DetailsSubjectModel(maChuDe, tenChuDe, maLinhVuc, tenLinhVuc, ngayBatDau, ngayKetThuc, ngayThongBaoKQ);
				}
				unitcommand.close();
				conn.close();
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
	
	public static List<GiaiThuongModel> ChiTietGiaiThuong(int MaChuDe){
		
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongTinGiaiThuong(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, MaChuDe);
				ResultSet rs=unitcommand.executeQuery(); 
				List<GiaiThuongModel> dsGiaiThuong = new ArrayList<GiaiThuongModel>();
				while(rs.next()) {
					int maGiaiThuong = rs.getInt("MaGiaiThuong");
					String tenGiaiThuong = rs.getString("TenGiaiThuong");
					String noiDung = rs.getString("NoiDung");
					dsGiaiThuong.add(new GiaiThuongModel(maGiaiThuong, tenGiaiThuong, noiDung));
				}
				unitcommand.close();
				conn.close();
				return dsGiaiThuong;
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
	
	public static List<ChuyenGiaModel> ChiTietChuyenGia(int MaChuDe){
		
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongTinChuyenGiaTheoChuDe(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, MaChuDe);
				ResultSet rs=unitcommand.executeQuery(); 
				
				List<ChuyenGiaModel> dsChuyenGia = new ArrayList<ChuyenGiaModel>();
				while(rs.next()) {
					System.out.println("tét chuyen gia");
					int maChuyenGia = rs.getInt("MaChuyenGia");
					String tenChuyenGia = rs.getString("TenNguoiDung");
					String hocVan = rs.getString("GiaoDuc");
					String kinhNghiem = rs.getString("KinhNghiem");
					String hinh = rs.getString("Hinh");
					dsChuyenGia.add(new ChuyenGiaModel(maChuyenGia, tenChuyenGia, hinh, kinhNghiem, hocVan));
				}
				unitcommand.close();
				conn.close();
				return dsChuyenGia;
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