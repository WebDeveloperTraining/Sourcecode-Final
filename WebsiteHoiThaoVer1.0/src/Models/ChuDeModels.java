package Models;

import java.sql.Date;

public class ChuDeModels {
	// PROPERTIES : 
	private int MaChuDe;
	private String TenChuDe;
	private int MaLinhVuc;
	private String TenLinhVuc;
	private Boolean TrangThai;
	private Date NgayBatDau;
	private Date NgayKetThuc;
	private String Hinh;
	private String GiaiNhat;
	private String GiaiNhi;
	private String GiaiBa;
	private Date NgayThongBaoKetQua;
	
	public int getMaChuDe() {
		return MaChuDe;
	}
	public void setMaChuDe(int maChuDe) {
		MaChuDe = maChuDe;
	}
	public String getTenChuDe() {
		return TenChuDe;
	}
	public void setTenChuDe(String tenChuDe) {
		TenChuDe = tenChuDe;
	}
	public Boolean getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(Boolean trangThai) {
		TrangThai = trangThai;
	}
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
	public Date getNgayBatDau() {
		return NgayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		NgayBatDau = ngayBatDau;
	}
	public Date getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
	}
	public String getHinh() {
		return Hinh;
	}
	public void setHinh(String hinh) {
		Hinh = hinh;
	}
	public String getGiaiNhat() {
		return GiaiNhat;
	}
	public void setGiaiNhat(String giaiNhat) {
		GiaiNhat = giaiNhat;
	}
	public String getGiaiNhi() {
		return GiaiNhi;
	}
	public void setGiaiNhi(String giaiNhi) {
		GiaiNhi = giaiNhi;
	}
	public String getGiaiBa() {
		return GiaiBa;
	}
	public void setGiaiBa(String giaiBa) {
		GiaiBa = giaiBa;
	}
	public Date getNgayThongBaoKetQua() {
		return NgayThongBaoKetQua;
	}
	public void setNgayThongBaoKetQua(Date ngayThongBaoKetQua) {
		NgayThongBaoKetQua = ngayThongBaoKetQua;
	}
	// CONSTRUCTOR OVERLOADDING : 
	public ChuDeModels(){}
	public ChuDeModels(int MaChuDe, String TenChuDe){
		this.setMaChuDe(MaChuDe);
		this.setTenChuDe(TenChuDe);
	}
	public ChuDeModels(int MaChuDe, String TenChuDe, int MaLinhVuc){
		this.setMaChuDe(MaChuDe);
		this.setTenChuDe(TenChuDe);
		this.setMaLinhVuc(MaLinhVuc);
	}
	
	public ChuDeModels(int MaChuDe, String TenChuDe, String Hinh){
		this.setMaChuDe(MaChuDe);
		this.setTenChuDe(TenChuDe);
		this.setHinh(Hinh);
		
	}
	
	public ChuDeModels(int MaChuDe, String TenChuDe, Boolean TrangThai){
		this.setMaChuDe(MaChuDe);
		this.setTenChuDe(TenChuDe);
		this.setTrangThai(TrangThai);
	}
	
	public ChuDeModels(int MaChuDe, String TenChuDe,int MaLinhVuc, String TenLinhVuc, Date NgayBatDau, Date NgayKetThuc, String Hinh, Date NgayThongBaoKetQua){
		this.MaChuDe=MaChuDe;
		this.TenChuDe=TenChuDe;
		this.MaLinhVuc=MaLinhVuc;
		this.TenLinhVuc=TenLinhVuc;
		this.NgayBatDau=NgayBatDau;
		this.NgayKetThuc=NgayKetThuc;
		this.Hinh=Hinh;
		this.NgayThongBaoKetQua=NgayThongBaoKetQua;
	}
	
	public ChuDeModels(int MaChuDe, String TenChuDe, int MaLinhVuc, String TenLinhVuc){
		this.setMaChuDe(MaChuDe);
		this.setTenChuDe(TenChuDe);
		this.setMaLinhVuc(MaLinhVuc);
		this.setTenLinhVuc(TenLinhVuc);
	}

}
