public class NhanVienPartTime extends NhanVien{
    //gio lam viec
    //loai nhan vien, tinh luong
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }

    @Override
    public void tinhLuong() {
        luong = Configs.LUONG_PARTTIME_GIO * gioLamViec;
    }
}
