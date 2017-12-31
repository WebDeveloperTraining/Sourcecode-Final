package DAL;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Models.BaiVietModels;
import Models.ChuDeModels;
import Models.ChuyenGiaModels;
import Models.LinhVucModels;
import Models.LoginModels;
import Models.QuyenModels;
import Models.SuKienModels;
import Models.TrangThaiBaiVietModels;

public class AdminDAL extends SQLProvider {
	private static PreparedStatement pstm=null;
	private static ArrayList<QuyenModels> lstQuyen;
	private static ArrayList<LoginModels> lstTaiKhoan;
	private static ArrayList<LinhVucModels> lstLinhVuc;
	private static ArrayList<ChuyenGiaModels> lstChuyenGia;
	private static ArrayList<ChuDeModels> lstChuDe;
	private static ArrayList<TrangThaiBaiVietModels> lstTrangThai;
	private static ArrayList<BaiVietModels> lstBaiViet;
	private static ArrayList<SuKienModels> lstSuKien;
	
	public static LoginModels Login(String tenDangNhap, String matKhau){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_Login(?,?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setString(1, tenDangNhap);
				pstm.setString(2, matKhau);
				
				ResultSet rs=pstm.executeQuery(); 
				if (rs.next()) {
					int maTaiKhoan=rs.getInt("MaTaiKhoan");
					String tenNguoiDung=rs.getString("TenNguoiDung");
					int maQuyen=rs.getInt("MaQuyen");
					int maNguoiDung=rs.getInt("MaNguoiDung");
					String hinh=rs.getString("Hinh");
					return new LoginModels(maTaiKhoan, tenNguoiDung, maQuyen,maNguoiDung,hinh);
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<QuyenModels> LayDanhSachQuyen(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LayDanhSachQuyen()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				ResultSet rs=pstm.executeQuery(); 
				lstQuyen = new ArrayList<QuyenModels>();
				while (rs.next()) {
					int maQuyen=rs.getInt("MaQuyen");
					String tenQuyen=rs.getString("TenQuyen");
					lstQuyen.add(new QuyenModels(maQuyen,tenQuyen));
				}
				return lstQuyen;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<LoginModels> LayDanhSachTaiKhoanNguoiDung(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LayDanhSachTaiKhoanNguoiDung()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				ResultSet rs=pstm.executeQuery(); 
				lstTaiKhoan = new ArrayList<LoginModels>();
				while (rs.next()) {
					int maTaiKhoan=rs.getInt("MaTaiKhoan");
					String tenDangNhap=rs.getString("TenDangNhap");
					String matKhau=rs.getString("MatKhau");
					String tenNguoiDung=rs.getString("TenNguoiDung");
					String tenQuyen=rs.getString("TenQuyen");
					int maNguoiDung=rs.getInt("MaNguoiDung");
					int maQuyen=rs.getInt("maQuyen");
					lstTaiKhoan.add(new LoginModels(maTaiKhoan,tenDangNhap,matKhau,maNguoiDung,maQuyen,tenNguoiDung,tenQuyen));
				}
				return lstTaiKhoan;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static Boolean CapNhatTaiKhoanNguoiDung(LoginModels account,String err){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_CapNhatTaiKhoanNguoiDung(?,?,?,?,?)}";
				pstm = conn.prepareStatement(sqlExecute);

				pstm.setInt(1, account.getMaTaiKhoan());
				pstm.setString(2, account.getTenDangNhap());
				pstm.setString(3, account.getMatKhau());
				pstm.setInt(4, account.getMaNguoiDung());
				pstm.setInt(5, account.getMaQuyen());
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				err=e.getMessage();
				System.out.println(err);
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				err=e.getMessage();
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<LinhVucModels> LayDanhSachLinhVucConHoatDong(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LayDanhSachLinhVucDangHoatDong()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				ResultSet rs=pstm.executeQuery(); 
				lstLinhVuc = new ArrayList<LinhVucModels>();
				while (rs.next()) {
					int maLinhVuc=rs.getInt("MaLinhVuc");
					String tenLinhVuc=rs.getString("TenLinhVuc");
					lstLinhVuc.add(new LinhVucModels(maLinhVuc, tenLinhVuc));
				}
				return lstLinhVuc;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<ChuyenGiaModels> LayDanhSachChuyenGiaTheoChuDe(int maChuDe){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_TimChuyenGiaTheoChuDe(?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setInt(1, maChuDe);
				
				ResultSet rs=pstm.executeQuery(); 
				lstChuyenGia = new ArrayList<ChuyenGiaModels>();
				while (rs.next()) {
					int maChuyenGia=rs.getInt("MaChuyenGia");
					String TenChuyenGia=rs.getString("TenNguoiDung");
					lstChuyenGia.add(new ChuyenGiaModels(maChuyenGia,TenChuyenGia));
				}
				return lstChuyenGia;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<ChuyenGiaModels> LayDanhSachChuyenGiaTheoLinhVuc(int maLinhVuc){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_TimChuyenGiaTheoLinhVuc(?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setInt(1, maLinhVuc);
				
				ResultSet rs=pstm.executeQuery(); 
				lstChuyenGia = new ArrayList<ChuyenGiaModels>();
				while (rs.next()) {
					int maChuyenGia=rs.getInt("MaChuyenGia");
					String TenChuyenGia=rs.getString("TenNguoiDung");
					lstChuyenGia.add(new ChuyenGiaModels(maChuyenGia,TenChuyenGia));
				}
				return lstChuyenGia;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static Boolean ThemChuDe(String tenChuDe, int maLinhVuc, Date ngayBatDau, Date ngayKetThuc, String hinh, Date ngayKetThucDangKy){
		if(ConnectDB()){
			if(ConnectDB()){
				try {
					String sqlExecute = "{call Sp_ThemChuDe(?,?,?,?,?,?)}";
					pstm = conn.prepareStatement(sqlExecute);

					pstm.setString(1, tenChuDe);
					pstm.setInt(2, maLinhVuc);
					pstm.setDate(3, ngayBatDau);
					pstm.setDate(4, ngayKetThuc);
					pstm.setString(5, hinh);
					pstm.setDate(6, ngayKetThucDangKy);
					
					int effectedRow = pstm.executeUpdate();
					if (effectedRow > 0)
						return true;
					return false;
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				} finally {
					try {
						pstm.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						return false;
					}
				}
			}
		}
		return false;
	}
	
	public static Boolean ThemChuyenGiaChoChuDe(int maChuyenGia, int maLinhVuc){
		if(ConnectDB()){
			if(ConnectDB()){
				try {
					String sqlExecute = "{call Sp_ThemChuyenGiaChoChuDe(?,?)}";
					pstm = conn.prepareStatement(sqlExecute);

					pstm.setInt(1, maChuyenGia);
					pstm.setInt(2, maLinhVuc);
					
					int effectedRow = pstm.executeUpdate();
					if (effectedRow > 0)
						return true;
					return false;
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				} finally {
					try {
						pstm.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						return false;
					}
				}
			}
		}
		return false;
	}
	
	public static Boolean ThemGiaiThuongChoChuDe(String TenGiaiThuong, String NoiDung){
		if(ConnectDB()){
			if(ConnectDB()){
				try {
					String sqlExecute = "{call Sp_ThemGiaiThuongChoChuDe(?,?)}";
					pstm = conn.prepareStatement(sqlExecute);

					pstm.setString(1, TenGiaiThuong);
					pstm.setString(2, NoiDung);
					
					int effectedRow = pstm.executeUpdate();
					if (effectedRow > 0)
						return true;
					return false;
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				} finally {
					try {
						pstm.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
						return false;
					}
				}
			}
		}
		return false;
	}
	//
	public static ArrayList<ChuDeModels> layDanhSachChuDeTheoLinhVuc(int maLinhVuc){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_layDanhSachChuDeTheoLinhVuc(?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setInt(1, maLinhVuc);
				
				ResultSet rs=pstm.executeQuery(); 
				lstChuDe = new ArrayList<ChuDeModels>();
				while (rs.next()) {
					int maChuDe=rs.getInt("MaChuDe");
					String tenChuDe=rs.getString("TenChuDe");
					String tenLinhVuc=rs.getString("TenLinhVuc");
					Date ngayBatDau=rs.getDate("NgayBatDau");
					Date ngayKetThuc=rs.getDate("NgayKetThuc");
					String hinh=rs.getString("Hinh");
					Date ngayThongBaoKetQua=rs.getDate("NgayThongBaoKetQua");
					lstChuDe.add(new ChuDeModels(maChuDe,tenChuDe,maLinhVuc, tenLinhVuc,ngayBatDau,ngayKetThuc,hinh,ngayThongBaoKetQua));
				}
				return lstChuDe;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	//
	public static Boolean CapNhatChuDe(ChuDeModels chude){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_CapNhatChuDe(?,?,?,?,?,?,?,?)}";
				pstm = conn.prepareStatement(sqlExecute);

				
				pstm.setInt(1, chude.getMaChuDe());
				pstm.setString(2, chude.getTenChuDe());
				pstm.setInt(3, chude.getMaLinhVuc());
				pstm.setBoolean(4, true);
				pstm.setDate(5,chude.getNgayBatDau());
				pstm.setDate(6, chude.getNgayKetThuc());
				pstm.setString(7, chude.getHinh());
				pstm.setDate(8, chude.getNgayThongBaoKetQua());
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static Boolean XoaChuDe(ChuDeModels chude){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_XoaChuDe(?,?,?,?,?,?,?)}";
				pstm = conn.prepareStatement(sqlExecute);

				
				pstm.setInt(1, chude.getMaChuDe());
				pstm.setString(2, chude.getTenChuDe());
				pstm.setInt(3, chude.getMaLinhVuc());
				pstm.setDate(4,chude.getNgayBatDau());
				pstm.setDate(5, chude.getNgayKetThuc());
				pstm.setString(6, chude.getHinh());
				pstm.setDate(7, chude.getNgayThongBaoKetQua());
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<TrangThaiBaiVietModels> LayDanhSachTraiThaiBaiViet(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_layDanhSachTrangThaiBaiViet()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				ResultSet rs=pstm.executeQuery(); 
				lstTrangThai = new ArrayList<TrangThaiBaiVietModels>();
				while (rs.next()) {
					int maTrangThai=rs.getInt("MaTrangThai");
					String tenTrangThai=rs.getString("TenTrangThai");
					lstTrangThai.add(new TrangThaiBaiVietModels(maTrangThai, tenTrangThai));
				}
				return lstTrangThai;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<BaiVietModels> LayDanhSachBaiViet(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_layDanhSachBaiViet()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				ResultSet rs=pstm.executeQuery(); 
				lstBaiViet = new ArrayList<BaiVietModels>();
				while (rs.next()) {
					int maBaiViet=rs.getInt("MaBaiViet");
					String tenBaiViet=rs.getString("TenBaiViet");
					String tomTat=rs.getString("TomTac");
					String diaChiFile=rs.getString("DiaChiFile");
					int maChuDe=rs.getInt("MaChuDe");
					int maTrangThai=rs.getInt("MaTrangThai");
					String tenTacGia=rs.getString("TenNguoiDung");
					float diemSo=rs.getFloat("DiemSo");
					lstBaiViet.add(new BaiVietModels(maBaiViet, tenBaiViet, tomTat, diaChiFile, maChuDe, maTrangThai,tenTacGia, diemSo));
				}
				return lstBaiViet;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<BaiVietModels> LayDanhSachBaiVietTheoChuDeVaTrangThai(int maChuDe, int maTrangThai){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_layDanhSachBaiVietTheoChuDeVaTrangThai(?,?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setInt(1, maChuDe);
				pstm.setInt(2, maTrangThai);
				
				ResultSet rs=pstm.executeQuery(); 
				lstBaiViet = new ArrayList<BaiVietModels>();
				while (rs.next()) {
					int maBaiViet=rs.getInt("MaBaiViet");
					String tenBaiViet=rs.getString("TenBaiViet");
					String tomTat=rs.getString("TomTat");
					String diaChiFile=rs.getString("DiaChiFile");
					String tenTacGia=rs.getString("TenNguoiDung");
					float diemSo=rs.getFloat("DiemSo");
					lstBaiViet.add(new BaiVietModels(maBaiViet, tenBaiViet, tomTat, diaChiFile, maChuDe, maTrangThai,tenTacGia,diemSo));
				}
				return lstBaiViet;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static Boolean ReviewerCapNhatThongBao(String ChuDe, String NoiDung, int MaBaiViet,int MaTrangThai){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_ReviewerCapNhatThongBao(?,?,?,?)}";
				pstm = conn.prepareStatement(sqlExecute);

				pstm.setString(1, ChuDe);
				pstm.setString(2, NoiDung);
				pstm.setInt(3, MaBaiViet);
				pstm.setInt(4, MaTrangThai);
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static boolean ThemSuKien(String TenSuKien, Date NgayBatDauSuKien,Date NgayKetThucSuKien, String NoiDung, String Hinh){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_ThemSuKien(?,?,?,?,?)}";
				pstm = conn.prepareStatement(sqlExecute);

				pstm.setString(1, TenSuKien);
				pstm.setDate(2, NgayBatDauSuKien);
				pstm.setDate(3, NgayKetThucSuKien);
				pstm.setString(4, NoiDung);
				pstm.setString(5, Hinh);
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<SuKienModels> LaySuKienTheoThangKetThucVaNam(int thangKetThuc, int namKetThuc){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LaySuKienTheoThangVaNam(?,?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setInt(1, thangKetThuc);
				pstm.setInt(2, namKetThuc);
				
				ResultSet rs=pstm.executeQuery(); 
				lstSuKien = new ArrayList<SuKienModels>();
				while (rs.next()) {
					int maSuKien=rs.getInt("MaSuKien");
					String tenSuKien=rs.getString("TenSuKien");
					Date ngayBatDauSuKien=rs.getDate("NgayBatDauSuKien");
					Date ngayKetThucSuKien=rs.getDate("NgayKetThucSuKien");
					String noiDung=rs.getString("NoiDung");
					String hinh=rs.getString("Hinh");
					lstSuKien.add(new SuKienModels(maSuKien, tenSuKien, ngayBatDauSuKien, ngayKetThucSuKien, noiDung, hinh));
				}
				return lstSuKien;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static Boolean CapNhatSuKien(SuKienModels sukien){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_CapNhatSuKien(?,?,?,?,?,?)}";
				pstm = conn.prepareStatement(sqlExecute);

				pstm.setInt(1, sukien.getMaSuKien());
				pstm.setString(2, sukien.getTenSuKien());
				pstm.setDate(3, sukien.getNgayBatDauSuKien());
				pstm.setDate(4, sukien.getNgayKetThucSuKien());
				pstm.setString(5, sukien.getNoiDung());
				pstm.setString(6, sukien.getHinh());
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static Boolean XoaSuKien(int maSuKien){
		if(ConnectDB()){
			try {
				String sqlExecute = "{call Sp_XoaSuKien(?)}";
				pstm = conn.prepareStatement(sqlExecute);

				pstm.setInt(1, maSuKien);
				
				int effectedRow = pstm.executeUpdate();
				if (effectedRow > 0)
					return true;
				return false;
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return false;
			} finally {
				try {
					pstm.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					return false;
				}
			}
		}
		return false;
	}
	
	public static int DangKyTaiKhoan(String tenNguoiDung, String tenDangNhap, String matKhau, String email){
		if(ConnectDB()){
			CallableStatement cstmt=null;
			try {
				
				String sqlExecute = "{call Sp_DangKyTaiKhoan(?,?,?,?,?)}";
				cstmt=conn.prepareCall(sqlExecute);
				cstmt.setString(1, tenNguoiDung);
				cstmt.setString(2, tenDangNhap);
				cstmt.setString(3, matKhau);
				cstmt.setString(4, email);
				cstmt.registerOutParameter(5, java.sql.Types.INTEGER);
				cstmt.execute();
				int returnValue=cstmt.getInt(5);
				return returnValue;
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
				return 0;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return 0;
			} finally {
				try {
					cstmt.close();
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
		return 0;
	}
	// HOME :
	public static ArrayList<SuKienModels> LaySuKienTheoThangVaNamHienTai(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LaySuKienTheoThangVaNamHienTai()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				
				ResultSet rs=pstm.executeQuery(); 
				lstSuKien = new ArrayList<SuKienModels>();
				while (rs.next()) {
					int maSuKien=rs.getInt("MaSuKien");
					String tenSuKien=rs.getString("TenSuKien");
					Date ngayBatDauSuKien=rs.getDate("NgayBatDauSuKien");
					Date ngayKetThucSuKien=rs.getDate("NgayKetThucSuKien");
					String noiDung=rs.getString("NoiDung");
					String hinh=rs.getString("Hinh");
					lstSuKien.add(new SuKienModels(maSuKien, tenSuKien, ngayBatDauSuKien, ngayKetThucSuKien, noiDung, hinh));
				}
				return lstSuKien;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static ArrayList<ChuDeModels> LayChuDeTheoThangVaNamHienTai(){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LayChuDeTheoThangVaNamHienTai()}";
				pstm=conn.prepareStatement(sqlExecute);
				
				
				ResultSet rs=pstm.executeQuery(); 
				lstChuDe = new ArrayList<ChuDeModels>();
				while (rs.next()) {
					int maChuDe=rs.getInt("MaChuDe");
					String Hinh=rs.getString("Hinh");
					System.out.println(Hinh);
					String tenChuDe=rs.getString("TenChuDe");
					lstChuDe.add(new ChuDeModels(maChuDe,tenChuDe,Hinh));
				}
				return lstChuDe;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
	
	public static SuKienModels LaySuKienTheoMaSuKien(int maSuKien){
		if(ConnectDB()){
			try{
				String sqlExecute= "{call Sp_LaySuKienTheoMaSuKien(?)}";
				pstm=conn.prepareStatement(sqlExecute);
				
				pstm.setInt(1, maSuKien);
				
				ResultSet rs=pstm.executeQuery(); 
				while (rs.next()) {
					String tenSuKien=rs.getString("TenSuKien");
					Date ngayBatDau=rs.getDate("NgayBatDauSuKien");
					Date ngayKetThuc=rs.getDate("NgayKetThucSuKien");
					String noiDung=rs.getString("NoiDung");
					String hinh=rs.getString("Hinh");
					
					return new SuKienModels(maSuKien, tenSuKien, ngayBatDau, ngayKetThuc, noiDung, hinh);
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}
			finally {
				try {
					pstm.close();
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
