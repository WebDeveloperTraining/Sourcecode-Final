package Models;

public class ReviewBaiViet {
	private int maBaiViet;
	private int maChuDe;
	private int maChuyenGia;
	private int diemSo;
	private String nhanXet;
	private int maTrangThai;
	public ReviewBaiViet(int maBaiViet, int maChuDe, int maChuyenGia, int diemSo, String nhanXet, int maTrangThai) {

		this.maBaiViet = maBaiViet;
		this.maChuDe = maChuDe;
		this.maChuyenGia = maChuyenGia;
		this.diemSo = diemSo;
		this.nhanXet = nhanXet;
		this.maTrangThai = maTrangThai;
	}
	public int getMaBaiViet() {
		return maBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		this.maBaiViet = maBaiViet;
	}
	public int getMaChuDe() {
		return maChuDe;
	}
	public void setMaChuDe(int maChuDe) {
		this.maChuDe = maChuDe;
	}
	public int getMaChuyenGia() {
		return maChuyenGia;
	}
	public void setMaChuyenGia(int maChuyenGia) {
		this.maChuyenGia = maChuyenGia;
	}
	public int getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(int diemSo) {
		this.diemSo = diemSo;
	}
	public String getNhanXet() {
		return nhanXet;
	}
	public void setNhanXet(String nhanXet) {
		this.nhanXet = nhanXet;
	}
	public int getMaTrangThai() {
		return maTrangThai;
	}
	public void setMaTrangThai(int maTrangThai) {
		this.maTrangThai = maTrangThai;
	}
	
	
	
	
}
