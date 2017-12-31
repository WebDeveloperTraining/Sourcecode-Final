package Models;

public class TaiKhoanModel {
	private String tenDangNhap;
	private String matKhau;
	private int maNguoiDung;
	private int maQuyen;
	private String tenNguoiDung;
	
	public TaiKhoanModel(String tenDangNhap, String matKhau, int maNguoiDung, int maQuyen, String tenNguoiDung) {
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.maNguoiDung = maNguoiDung;
		this.maQuyen = maQuyen;
		this.tenNguoiDung = tenNguoiDung;
	}
	
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public int getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(int maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	public int getMaQuyen() {
		return maQuyen;
	}
	public void setMaQuyen(int maQuyen) {
		this.maQuyen = maQuyen;
	}
	
	
}
