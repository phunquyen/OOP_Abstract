public abstract class NhanVien {
    //ten NV, luong
    //loai NV, tinh luong, xuat thong tin
    protected String ten;
    protected long luong;

    public NhanVien() {

    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    protected abstract String loaiNhanVien();

    public abstract void tinhLuong();

    public void xuatThongTin() {
        System.out.println("Ten nhan vien:" + ten);
        System.out.println("Loai nhan vien:" + loaiNhanVien());
        System.out.println("Luong:" + luong);
    }

}
