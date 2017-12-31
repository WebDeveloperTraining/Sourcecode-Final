package Models;

public class ChuyenGiaModel {
	private int MaChuyenGia;
	private String tenChuyenGia;
	private String hinh;
	private String kinhNghiem;
	private String hocVan;
	public ChuyenGiaModel(int maChuyenGia, String tenChuyenGia, String hinh, String kinhNghiem, String hocVan) {
		
		MaChuyenGia = maChuyenGia;
		this.tenChuyenGia = tenChuyenGia;
		this.hinh = hinh;
		this.kinhNghiem = kinhNghiem;
		this.hocVan = hocVan;
	}
	public int getMaChuyenGia() {
		return MaChuyenGia;
	}
	public void setMaChuyenGia(int maChuyenGia) {
		MaChuyenGia = maChuyenGia;
	}
	public String getTenChuyenGia() {
		return tenChuyenGia;
	}
	public void setTenChuyenGia(String tenChuyenGia) {
		this.tenChuyenGia = tenChuyenGia;
	}
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	public String getKinhNghiem() {
		return kinhNghiem;
	}
	public void setKinhNghiem(String kinhNghiem) {
		this.kinhNghiem = kinhNghiem;
	}
	public String getHocVan() {
		return hocVan;
	}
	public void setHocVan(String hocVan) {
		this.hocVan = hocVan;
	}
	
	
	
}
