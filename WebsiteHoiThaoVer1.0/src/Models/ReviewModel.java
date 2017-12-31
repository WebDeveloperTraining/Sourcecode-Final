package Models;

public class ReviewModel {
	private int maBaiViet;
	private String tenBaiViet;
	private int maChuDe;
	private String tenTrangThai;
	private String tenTacGia;
	private String tomTat;
	private String diaChuFile;
	
	public ReviewModel(int maBaiViet, String tenBaiViet, int maChuDe, String tenTrangThai, String tenTacGia,
			String tomTat, String diaChuFile) {
		
		this.maBaiViet = maBaiViet;
		this.tenBaiViet = tenBaiViet;
		this.maChuDe = maChuDe;
		this.tenTrangThai = tenTrangThai;
		this.tenTacGia = tenTacGia;
		this.tomTat = tomTat;
		this.diaChuFile = diaChuFile;
	}
	
	public int getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}
	public String getTenBaiViet() {
		return tenBaiViet;
	}
	public void setTenBaiViet(String tenBaiViet) {
		this.tenBaiViet = tenBaiViet;
	}
	public int getMaChuDe() {
		return maChuDe;
	}
	public void setMaChuDe(int maChuDe) {
		this.maChuDe = maChuDe;
	}
	public String getTenTrangThai() {
		return tenTrangThai;
	}
	public void setTenTrangThai(String tenTrangThai) {
		this.tenTrangThai = tenTrangThai;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public String getTomTat() {
		return tomTat;
	}
	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}
	public String getDiaChuFile() {
		return diaChuFile;
	}
	public void setDiaChuFile(String diaChuFile) {
		this.diaChuFile = diaChuFile;
	}
	
	
	
}
