package Models;

import java.sql.Date;

public class SubjectModel {
	private int maChuDe;
	private String tenChuDe;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private String hinh;
	private Date ngayThongBaoKQ;
	public SubjectModel(int maChuDe, String tenChuDe, Date ngayBatDau, Date ngayKetThuc, String hinh, Date ngayThongBaoKQ) {
		
		this.maChuDe = maChuDe;
		this.tenChuDe = tenChuDe;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.hinh = hinh;
		this.ngayThongBaoKQ = ngayThongBaoKQ;
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
	public Date getNgaybatDau() {
		return ngayBatDau;
	}
	public void setNgaybatDau(Date ngaybatDau) {
		this.ngayBatDau = ngaybatDau;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayThongBaoKQ() {
		return ngayThongBaoKQ;
	}
	public void setNgayThongBaoKQ(Date ngayThongBaoKQ) {
		this.ngayThongBaoKQ = ngayThongBaoKQ;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	
	
}

