package Models;

import java.sql.Date;

public class SuKienModels {
	// PROPERTIES :
	private int MaSuKien;
	private String TenSuKien;
	private Date NgayBatDauSuKien;
	private Date NgayKetThucSuKien;
	private String NoiDung;
	private String Hinh;
	private Boolean TrangThai;
	public int getMaSuKien() {
		return MaSuKien;
	}
	public void setMaSuKien(int maSuKien) {
		MaSuKien = maSuKien;
	}
	public String getTenSuKien() {
		return TenSuKien;
	}
	public void setTenSuKien(String tenSuKien) {
		TenSuKien = tenSuKien;
	}
	public Date getNgayBatDauSuKien() {
		return NgayBatDauSuKien;
	}
	public void setNgayBatDauSuKien(Date ngayBatDauSuKien) {
		NgayBatDauSuKien = ngayBatDauSuKien;
	}
	public Date getNgayKetThucSuKien() {
		return NgayKetThucSuKien;
	}
	public void setNgayKetThucSuKien(Date ngayKetThucSuKien) {
		NgayKetThucSuKien = ngayKetThucSuKien;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public String getHinh() {
		return Hinh;
	}
	public void setHinh(String hinh) {
		Hinh = hinh;
	}
	public Boolean getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(Boolean trangThai) {
		TrangThai = trangThai;
	}
	// CONSTRUCTOR OVERLOADDING :
	public SuKienModels(){}
	public SuKienModels(int MaSuKien, String TenSuKien, Date NgayBatDauSuKien, Date NgayKetThucSuKien, String NoiDung, String Hinh){
		this.MaSuKien=MaSuKien;
		this.TenSuKien=TenSuKien;
		this.NgayBatDauSuKien=NgayBatDauSuKien;
		this.NgayKetThucSuKien=NgayKetThucSuKien;
		this.NoiDung=NoiDung;
		this.Hinh=Hinh;
	}
}
