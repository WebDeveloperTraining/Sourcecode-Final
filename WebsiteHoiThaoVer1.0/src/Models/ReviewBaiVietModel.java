package Models;

public class ReviewBaiVietModel {
	private int maBaiViet;
	private String tenBaiViet;
	private String tomTat;
	private String diaChiFile;
	private int maChuDe;
	private String trangThai;
	private String tenChuDe;
	public ReviewBaiVietModel(int maBaiViet, String tenBaiViet, String tomTat, String diaChiFile, int maChuDe,
			String trangThai, String tenChuDe) {
		this.maBaiViet = maBaiViet;
		this.tenBaiViet = tenBaiViet;
		this.tomTat = tomTat;
		this.diaChiFile = diaChiFile;
		this.maChuDe = maChuDe;
		this.trangThai = trangThai;
		this.tenChuDe = tenChuDe;
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
	public String getTomTat() {
		return tomTat;
	}
	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}
	public String getDiaChiFile() {
		return diaChiFile;
	}
	public void setDiaChiFile(String diaChiFile) {
		this.diaChiFile = diaChiFile;
	}
	public int getMaChuDe() {
		return maChuDe;
	}
	public void setMaChuDe(int maChuDe) {
		this.maChuDe = maChuDe;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getTenChuDe() {
		return tenChuDe;
	}
	public void setTenChuDe(String tenChuDe) {
		this.tenChuDe = tenChuDe;
	}
	
	
}
