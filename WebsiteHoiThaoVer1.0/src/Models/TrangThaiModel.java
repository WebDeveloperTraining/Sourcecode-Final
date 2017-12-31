package Models;

public class TrangThaiModel {
	private int maTrangThai;
	private String tenTrangThai;
	public TrangThaiModel(int maTrangThai, String tenTrangThai) {

		this.maTrangThai = maTrangThai;
		this.tenTrangThai = tenTrangThai;
	}
	public int getMaTrangThai() {
		return maTrangThai;
	}
	public void setMaTrangThai(int maTrangThai) {
		this.maTrangThai = maTrangThai;
	}
	public String getTenTrangThai() {
		return tenTrangThai;
	}
	public void setTenTrangThai(String tenTrangThai) {
		this.tenTrangThai = tenTrangThai;
	}
	
}
