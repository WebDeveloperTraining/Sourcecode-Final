package Models;

public class BaiVietModels {
	// PROPERTIES :
	private int MaBaiViet;
	private String TenBaiViet;
	private String TomTat;
	private String DiaChiFile;
	private int MaChuDe;
	private int MaTrangThai;
	private String TenTacGia;
	private float DiemSo;
	public int getMaBaiViet() {
		return MaBaiViet;
	}
	public void setMaBaiViet(int maBaiViet) {
		MaBaiViet = maBaiViet;
	}
	public String getTenBaiViet() {
		return TenBaiViet;
	}
	public void setTenBaiViet(String tenBaiViet) {
		TenBaiViet = tenBaiViet;
	}
	public String getTomTat() {
		return TomTat;
	}
	public void setTomTat(String tomTat) {
		TomTat = tomTat;
	}
	public String getDiaChiFile() {
		return DiaChiFile;
	}
	public void setDiaChiFile(String diaChiFile) {
		DiaChiFile = diaChiFile;
	}
	public int getMaChuDe() {
		return MaChuDe;
	}
	public void setMaChuDe(int maChuDe) {
		MaChuDe = maChuDe;
	}
	public int getMaTrangThai() {
		return MaTrangThai;
	}
	public void setMaTrangThai(int maTrangThai) {
		MaTrangThai = maTrangThai;
	}
	public String getTenTacGia() {
		return TenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		TenTacGia = tenTacGia;
	}
	public float getDiemSo() {
		return DiemSo;
	}
	public void setDiemSo(float diemSo) {
		DiemSo = diemSo;
	}
	// CONSTRUCTORS OVERLOADDING :
	public BaiVietModels(){}
	public BaiVietModels(int MaBaiViet, String TenBaiViet, String TomTat){
		this.MaBaiViet=MaBaiViet;
		this.TenBaiViet=TenBaiViet;
		this.TomTat=TomTat;
	}
	public BaiVietModels(int MaBaiViet, String TenBaiViet, String TomTat, String DiaChiFile, int MaChuDe, int MaTrangThai, String TenTacGia,float DiemSo){
		this.MaBaiViet=MaBaiViet;
		this.TenBaiViet=TenBaiViet;
		this.TomTat=TomTat;
		this.DiaChiFile=DiaChiFile;
		this.MaChuDe=MaChuDe;
		this.MaTrangThai=MaTrangThai;
		this.TenTacGia=TenTacGia;
		this.DiemSo=DiemSo;
	}
}
