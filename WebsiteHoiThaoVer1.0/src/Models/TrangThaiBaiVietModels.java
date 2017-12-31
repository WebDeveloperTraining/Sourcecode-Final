package Models;

public class TrangThaiBaiVietModels {
	private int MaTrangThai;
	private String TenTrangThai;
	public int getMaTrangThai() {
		return MaTrangThai;
	}
	public void setMaTrangThai(int maTrangThai) {
		MaTrangThai = maTrangThai;
	}
	public String getTenTrangThai() {
		return TenTrangThai;
	}
	public void setTenTrangTrai(String tenTrangTrai) {
		TenTrangThai = tenTrangTrai;
	}
	
	public TrangThaiBaiVietModels(){}
	public TrangThaiBaiVietModels(int MaTrangThai, String TenTrangThai){
		this.MaTrangThai=MaTrangThai;
		this.TenTrangThai=TenTrangThai;
	}
	
}
