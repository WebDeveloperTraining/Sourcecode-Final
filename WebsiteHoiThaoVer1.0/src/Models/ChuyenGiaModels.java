package Models;

public class ChuyenGiaModels {

	// PROPERTIES :
	private int MaChuyenGia;
	private String TenChuyenGia;
	private int MaLinhVuc;
	public int getMaChuyenGia() {
		return MaChuyenGia;
	}
	public void setMaChuyenGia(int maChuyenGia) {
		MaChuyenGia = maChuyenGia;
	}
	public String getTenChuyenGia() {
		return TenChuyenGia;
	}
	public void setTenChuyenGia(String tenChuyenGia) {
		TenChuyenGia = tenChuyenGia;
	}
	public int getMaLinhVuc() {
		return MaLinhVuc;
	}
	public void setMaLinhVuc(int maLinhVuc) {
		MaLinhVuc = maLinhVuc;
	}
	
	// CONSTRUCTORS OVERLOADDING :
	public ChuyenGiaModels(){}
	public ChuyenGiaModels(int MaChuyenGia, String TenChuyenGia){
		this.MaChuyenGia=MaChuyenGia;
		this.TenChuyenGia=TenChuyenGia;
	}
	
	public ChuyenGiaModels(int MaChuyenGia, String TenChuyenGia, int MaLinhVuc){
		this.MaChuyenGia=MaChuyenGia;
		this.TenChuyenGia=TenChuyenGia;
		this.MaLinhVuc=MaLinhVuc;
	}
}
