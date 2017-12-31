package Models;

public class ThongTinDangNhapModel {
	private String tenDangNhap;
	private String matKhau;
	private String email;
	public ThongTinDangNhapModel(String tenDangNhap, String matKhau, String email) {
		
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
