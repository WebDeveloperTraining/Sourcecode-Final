package Models;

public class GiaiThuongModels {
	// PROPERTIES :
	private int MaGiaiThuong;
	private String TenGiaiThuong;
	private String NoiDung;
	public int getMaGiaiThuong() {
		return MaGiaiThuong;
	}
	public void setMaGiaiThuong(int maGiaiThuong) {
		MaGiaiThuong = maGiaiThuong;
	}
	public String getTenGiaiThuong() {
		return TenGiaiThuong;
	}
	public void setTenGiaiThuong(String tenGiaiThuong) {
		TenGiaiThuong = tenGiaiThuong;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	
	// CONSTRUCTOR OVERLOADDING :
	public GiaiThuongModels(){}
	public GiaiThuongModels(int MaGiaiThuong, String TenGiaiThuong, String NoiDung){
		this.MaGiaiThuong=MaGiaiThuong;
		this.TenGiaiThuong=TenGiaiThuong;
		this.NoiDung=NoiDung;
	}
}
