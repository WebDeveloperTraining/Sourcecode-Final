package Models;

public class GiaiThuongModel {
	private int MaGiaiThuong;
	private String TenGiaiThuong;
	private String NoiDung;
	public GiaiThuongModel(int maGiaiThuong, String tenGiaiThuong, String noiDung) {
		MaGiaiThuong = maGiaiThuong;
		TenGiaiThuong = tenGiaiThuong;
		NoiDung = noiDung;
	}
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
	
	
}
