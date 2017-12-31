package Models;

public class QuyenModels {

	// PROPERTIES :
	private int MaQuyen;
	private String TenQuyen;
	
	public int getMaQuyen() {
		return MaQuyen;
	}

	public void setMaQuyen(int maQuyen) {
		MaQuyen = maQuyen;
	}

	public String getTenQuyen() {
		return TenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		TenQuyen = tenQuyen;
	}

	// CONSTRUCTORS OVERLOADING :
	public QuyenModels() {}
	
	public QuyenModels(int MaQuyen, String TenQuyen){
		this.MaQuyen=MaQuyen;
		this.TenQuyen=TenQuyen;
	}

}
