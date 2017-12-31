package DAL;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import Models.TaiKhoanModel;
import Models.ThongTinCaNhanModel;
import Models.ThongTinDangNhapModel;

public class ThongTinCaNhanDAL extends SQLProvider {
	private static java.sql.PreparedStatement unitcommand=null;
	public static ThongTinCaNhanModel ThongTinCaNhan(int maNguoiDung){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongTinCaNhan(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maNguoiDung);
				
				ResultSet rs=unitcommand.executeQuery(); 
				if (rs.next()) {
					String TenNguoiDung = rs.getString("TenNguoiDung");
					System.out.println(TenNguoiDung);
					Boolean GioiTinh = rs.getBoolean("GioiTinh");
					String Email = rs.getString("Email");
					String DiaChi = rs.getString("DiaChi");
					String CMND = rs.getString("CMND");
					Date NgaySinh = rs.getDate("NgaySinh");
					String NgheNghiep = rs.getString("NgheNghiep");
					String HocVan = rs.getString("GiaoDuc");
					String DienThoai = rs.getString("DienThoai");
					String Hinh = rs.getString("Hinh");
					String KinhNghiem = rs.getString("KinhNghiem");
					unitcommand.close();
					conn.close(); 
					return new ThongTinCaNhanModel(TenNguoiDung, GioiTinh, Email, DiaChi, CMND, NgaySinh, NgheNghiep, HocVan, DienThoai, Hinh, KinhNghiem);
				}
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
	
	public static Boolean CapNhatAnhDaiDien(int maNguoiDung, String fileName){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_CapNhatAnhDaiDien(?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maNguoiDung);
				unitcommand.setString(2, fileName);
				
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
	
	
	public static Boolean CapNhatThongTin(int MaNguoiDung, String TenNguoiDung, Boolean gioiTinh, String DiaChi, String Email, String CMND, Date NgaySinh, String NgheNghiep, 
			String Giaoduc, String DienThoai, String KinhNghiem){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_CapNhatThongTinCaNhan(?,?,?,?,?,?,?,?,?,?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, MaNguoiDung);
				unitcommand.setString(2, TenNguoiDung);
				unitcommand.setString(3, Email);
				unitcommand.setBoolean(4, gioiTinh);
				unitcommand.setString(5, DiaChi);
				unitcommand.setString(6, CMND);
				unitcommand.setDate(7, NgaySinh);
				unitcommand.setString(8, NgheNghiep);
				unitcommand.setString(9, Giaoduc);
				unitcommand.setString(10, DienThoai);
				unitcommand.setString(11, KinhNghiem);
				
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
	public static ThongTinDangNhapModel ThongTinDangNhap(int MaNguoiDung){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_ThongTinDangNhap(?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, MaNguoiDung);
				System.out.println("hello");
				
				ResultSet rs=unitcommand.executeQuery(); 
				
				if (rs.next()) {
					String tenDangNhap = rs.getString("TenDangNhap");
					String matKhau = rs.getString("MatKhau");
					String email = rs.getString("Email");
					unitcommand.close();
					conn.close(); 
					return new ThongTinDangNhapModel(tenDangNhap, matKhau, email);
				}
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
	
	public static Boolean DoiMatKhau(int maNguoiDung, String matKhau, String email){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call sp_DoiMatKhau(?,?,?)}";
				unitcommand=conn.prepareStatement(sqlExecute);
				
				unitcommand.setInt(1, maNguoiDung);
				unitcommand.setString(2, matKhau);
				unitcommand.setString(3, email);
				
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
