package Models;

public class ThongBaoModels {
	// PROPERTIES :
	private int MaThongbao;
	private String ChuDe;
	private String NoiDung;
	private int MaBaiViet;
	public int getMaThongbao() {
		return MaThongbao;
	}
	public void setMaThongbao(int maThongbao) {
		MaThongbao = maThongbao;
	}
	public String getChuDe() {
		return ChuDe;
	}
	public void setChuDe(String chuDe) {
		ChuDe = chuDe;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public int getMaBaiViet() {
		return MaBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		MaBaiViet = maBaiViet;
	}
	// CONSTRUCTOR OVERLOADDING :
	public ThongBaoModels(){}
	public ThongBaoModels(int MaThongBao, String ChuDe, String NoiDung){
		this.MaThongbao=MaThongBao;
		this.ChuDe=ChuDe;
		this.NoiDung=NoiDung;
	}
	public ThongBaoModels(int MaThongBao, String ChuDe, String NoiDung, int MaBaiViet){
		this.MaThongbao=MaThongBao;
		this.ChuDe=ChuDe;
		this.NoiDung=NoiDung;
		this.MaBaiViet=MaBaiViet;
	}
	
}
