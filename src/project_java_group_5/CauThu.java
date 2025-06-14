package project_java_group_5;

public class CauThu extends NhanVien {
	// properties:
	private int soLuotTranThamGia;
	private int banThang;
	private Integer luongThoaThuan;
	private int maDoi;
	// constructors:
	public CauThu() {
	}

	public CauThu(String ten, String quocTich, String ngaySinh, Integer thamNien,
			String vaitro, int soLuotTranThamGia, int banThang, Integer luongThoaThuan, int maDoi) {
		super(ten, quocTich, ngaySinh, thamNien, vaitro);
		
		this.soLuotTranThamGia = soLuotTranThamGia;
		this.banThang = banThang;
		this.luongThoaThuan = luongThoaThuan;
		this.maDoi =maDoi;
	}

	public int getSoLuotTranThamGia() {
		return soLuotTranThamGia;
	}

	public void setSoLuotTranThamGia(int soLuotTranThamGia) {
		this.soLuotTranThamGia = soLuotTranThamGia;
	}

	public int getBanThang() {
		return banThang;
	}

	public void setBanThang(int banThang) {
		this.banThang = banThang;
	}

	public double getLuongThoaThuan() {
		return luongThoaThuan;
	}

	public void setLuongThoaThuan(Integer luongThoaThuan) {
		this.luongThoaThuan = luongThoaThuan;
	}
	
	public int getmaDoi() {
		return maDoi;
	}

	public void setmaDoi(int maDoi) {
		this.maDoi = maDoi;
	}

	// methods:
	// tinh luong:
	public Integer tinhLuong(){
		return this.luongThoaThuan * super.hesoLuong(super.getThamNien());
	}
        //tinh thuong
        public Integer tinhThuong(){
            return getBanThang() *  getSoLuotTranThamGia(); 
        }
}
