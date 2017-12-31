package Models;

public class LinhVucModels {

	// PROPERTIES :
	private int MaLinhVuc;
	private String TenLinhVuc;
	private Boolean TrangThai;
	public int getMaLinhVuc() {
		return MaLinhVuc;
	}
	public void setMaLinhVuc(int maLinhVuc) {
		MaLinhVuc = maLinhVuc;
	}
	public String getTenLinhVuc() {
		return TenLinhVuc;
	}
	public void setTenLinhVuc(String tenLinhVuc) {
		TenLinhVuc = tenLinhVuc;
	}
	public Boolean getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(Boolean trangThai) {
		TrangThai = trangThai;
	}
	
	// CONSTRUCTORS OVERLOADDING :
	public LinhVucModels(){	}
	
	public LinhVucModels(int MaLinhVuc, String TenLinhVuc){
		this.MaLinhVuc=MaLinhVuc;
		this.TenLinhVuc=TenLinhVuc;
	}
	
	public LinhVucModels(int MaLinhVuc, String TenLinhVuc, Boolean TrangThai){
		this.MaLinhVuc=MaLinhVuc;
		this.TenLinhVuc=TenLinhVuc;
		this.TrangThai=TrangThai;
	}

}
