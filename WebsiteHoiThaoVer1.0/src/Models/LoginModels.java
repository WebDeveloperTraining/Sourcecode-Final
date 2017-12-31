package Models;

public class LoginModels {
	// PROPERTIES :
	private int MaTaiKhoan;
	private String TenDangNhap;
	private String MatKhau;
	private String TenNguoiDung;
	private int MaNguoiDung;
	private int MaQuyen;
	private String TenQuyen;
	private String Hinh;
	
	public int getMaTaiKhoan() {
		return MaTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		MaTaiKhoan = maTaiKhoan;
	}

	public String getTenDangNhap() {
		return TenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public String getTenNguoiDung() {
		return TenNguoiDung;
	}

	public void setTenNguoiDung(String tenNguoiDung) {
		TenNguoiDung = tenNguoiDung;
	}

	public int getMaQuyen() {
		return MaQuyen;
	}

	public void setMaQuyen(int maQuyen) {
		MaQuyen = maQuyen;
	}

	public String getTenQuyen() {
		return TenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		TenQuyen = tenQuyen;
	}

	public int getMaNguoiDung() {
		return MaNguoiDung;
	}

	public void setMaNguoiDung(int maNguoiDung) {
		MaNguoiDung = maNguoiDung;
	}

	public String getHinh() {
		return Hinh;
	}

	public void setHinh(String hinh) {
		Hinh = hinh;
	}

	// CONSTRUCTOR OVERLOADING :
	public LoginModels(){}
	
	public LoginModels(String TenDangNhap, String MatKhau){
		this.TenDangNhap=TenDangNhap;
		this.MatKhau=MatKhau;
	}
	
	public LoginModels(int MaTaiKhoan, String TenNguoiDung,int MaQuyen,int MaNguoiDung,String Hinh){
		this.MaTaiKhoan=MaTaiKhoan;
		this.TenNguoiDung=TenNguoiDung;
		this.MaQuyen=MaQuyen;
		this.MaNguoiDung=MaNguoiDung;
		this.Hinh=Hinh;
	}
	
	public LoginModels(int MaTaiKhoan,String TenDangNhap,String MatKhau){
		this.MaTaiKhoan=MaTaiKhoan;
		this.TenDangNhap=TenDangNhap;
		this.MatKhau=MatKhau;
	}
	
	public LoginModels(String TenDangNhap, String MatKhau, int MaQuyen){
		this.TenDangNhap=TenDangNhap;
		this.MatKhau=MatKhau;
		this.MaQuyen=MaQuyen;
	}
	
	public LoginModels(String TenDangNhap, String TenNguoiDung, String TenQuyen){
		this.TenDangNhap=TenDangNhap;
		this.TenNguoiDung=TenNguoiDung;
		this.TenQuyen=TenQuyen;
	}
	public LoginModels(int MaTaiKhoan, String TenDangNhap, String MatKhau, int MaNguoiDung, int MaQuyen){
		this.MaTaiKhoan=MaTaiKhoan;
		this.TenDangNhap=TenDangNhap;
		this.MatKhau=MatKhau;
		this.MaNguoiDung=MaNguoiDung;
		this.MaQuyen=MaQuyen;
	}
	
	public LoginModels(int MaTaiKhoan, String TenDangNhap, String MatKhau, int MaNguoiDung, int MaQuyen, String TenNguoiDung){
		this.MaTaiKhoan=MaTaiKhoan;
		this.TenDangNhap=TenDangNhap;
		this.MatKhau=MatKhau;
		this.MaNguoiDung=MaNguoiDung;
		this.MaQuyen=MaQuyen;
		this.TenNguoiDung=TenNguoiDung;
	}
	public LoginModels(int MaTaiKhoan, String TenDangNhap, String MatKhau, int MaNguoiDung, int MaQuyen, String TenNguoiDung, String TenQuyen){
		this.MaTaiKhoan=MaTaiKhoan;
		this.TenDangNhap=TenDangNhap;
		this.MatKhau=MatKhau;
		this.MaNguoiDung=MaNguoiDung;
		this.MaQuyen=MaQuyen;
		this.TenNguoiDung=TenNguoiDung;
		this.TenQuyen=TenQuyen;
	}
}
