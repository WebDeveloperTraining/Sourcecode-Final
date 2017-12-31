package Models;

import java.sql.Date;

public class DetailsSubjectModel {
	private int maChuDe;
	private String tenChuDe;
	private int maLinhVuc;
	private String tenLinhVuc;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String giaiNhat;
	private String giaiNhi;
	private String giaiBa;
	private Date ngayThongBaoKetQua;
	public DetailsSubjectModel(int maChuDe, String tenChuDe, int maLinhVuc, String tenLinhVuc, Date ngayBatDau,
			Date ngayKetThuc, Date ngayThongBaoKetQua) {
	
		this.maChuDe = maChuDe;
		this.tenChuDe = tenChuDe;
		this.maLinhVuc = maLinhVuc;
		this.tenLinhVuc = tenLinhVuc;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.ngayThongBaoKetQua = ngayThongBaoKetQua;
	}
	public int getMaChuDe() {
		return maChuDe;
	}
	public void setMaChuDe(int maChuDe) {
		this.maChuDe = maChuDe;
	}
	public String getTenChuDe() {
		return tenChuDe;
	}
	public void setTenChuDe(String tenChuDe) {
		this.tenChuDe = tenChuDe;
	}
	public int getMaLinhVuc() {
		return maLinhVuc;
	}
	public void setMaLinhVuc(int maLinhVuc) {
		this.maLinhVuc = maLinhVuc;
	}
	public String getTenLinhVuc() {
		return tenLinhVuc;
	}
	public void setTenLinhVuc(String tenLinhVuc) {
		this.tenLinhVuc = tenLinhVuc;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public String getGiaiNhat() {
		return giaiNhat;
	}
	public void setGiaiNhat(String giaiNhat) {
		this.giaiNhat = giaiNhat;
	}
	public String getGiaiNhi() {
		return giaiNhi;
	}
	public void setGiaiNhi(String giaiNhi) {
		this.giaiNhi = giaiNhi;
	}
	public String getGiaiBa() {
		return giaiBa;
	}
	public void setGiaiBa(String giaiBa) {
		this.giaiBa = giaiBa;
	}
	public Date getNgayThongBaoKetQua() {
		return ngayThongBaoKetQua;
	}
	public void setNgayThongBaoKetQua(Date ngayThongBaoKetQua) {
		this.ngayThongBaoKetQua = ngayThongBaoKetQua;
	}
	
	
	
}
