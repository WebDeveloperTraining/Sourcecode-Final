package Models;

import java.util.Date;

public class ThongTinCaNhanModel {
	private String tenNguoiDung;
	private Boolean gioiTinh;
	private String email;
	private String diaChi;
	private String CMND;
	private Date ngaySinh;
	private String ngheNghiep;
	private String hocVan;
	private String dienThoai;
	private String hinhAnh;
	private String kinhNghiem;
	public ThongTinCaNhanModel(String tenNguoiDung, Boolean gioiTinh, String email, String diaChi, String cMND,
			Date ngaySinh, String ngheNghiep, String hocVan, String dienThoai, String hinhAnh, String kinhNghiem) {

		this.tenNguoiDung = tenNguoiDung;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.diaChi = diaChi;
		CMND = cMND;
		this.ngaySinh = ngaySinh;
		this.ngheNghiep = ngheNghiep;
		this.hocVan = hocVan;
		this.dienThoai = dienThoai;
		this.hinhAnh = hinhAnh;
		this.kinhNghiem=kinhNghiem;
	}
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	public Boolean getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getNgheNghiep() {
		return ngheNghiep;
	}
	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
	public String getHocVan() {
		return hocVan;
	}
	public void setHocVan(String hocVan) {
		this.hocVan = hocVan;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getKinhNghiem() {
		return kinhNghiem;
	}
	public void setKinhNghiem(String kinhNghiem) {
		this.kinhNghiem = kinhNghiem;
	}
	
}
