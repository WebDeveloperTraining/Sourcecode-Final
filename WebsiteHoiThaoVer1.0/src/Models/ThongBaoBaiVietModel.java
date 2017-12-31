package Models;

public class ThongBaoBaiVietModel {
	
	private String chuDeThongBao;
	private String noiDung;
	public ThongBaoBaiVietModel(String chuDeThongBao, String noiDung) {
		this.chuDeThongBao = chuDeThongBao;
		this.noiDung = noiDung;
	}
	public String getChuDeThongBao() {
		return chuDeThongBao;
	}
	public void setChuDeThongBao(String chuDeThongBao) {
		this.chuDeThongBao = chuDeThongBao;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
}
