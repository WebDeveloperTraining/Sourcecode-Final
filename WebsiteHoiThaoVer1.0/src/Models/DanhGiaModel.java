package Models;

public class DanhGiaModel {
	private int maDanhGia;
	private String noiDungNhanXet;
	private float diemSo;
	private String trangThaiDanhGia;
	public DanhGiaModel(int maDanhGia, String noiDungNhanXet, float diemSo, String trangThaiDanhGia) {

		this.maDanhGia = maDanhGia;
		this.noiDungNhanXet = noiDungNhanXet;
		this.diemSo = diemSo;
		this.trangThaiDanhGia = trangThaiDanhGia;
	}
	public int getMaDanhGia() {
		return maDanhGia;
	}
	public void setMaDanhGia(int maDanhGia) {
		this.maDanhGia = maDanhGia;
	}
	public String getNoiDungNhanXet() {
		return noiDungNhanXet;
	}
	public void setNoiDungNhanXet(String noiDungNhanXet) {
		this.noiDungNhanXet = noiDungNhanXet;
	}
	public float getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(float diemSo) {
		this.diemSo = diemSo;
	}
	public String getTrangThaiDanhGia() {
		return trangThaiDanhGia;
	}
	public void setTrangThaiDanhGia(String trangThaiDanhGia) {
		this.trangThaiDanhGia = trangThaiDanhGia;
	}
	
	
}
