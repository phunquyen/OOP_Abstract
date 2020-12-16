public class NhanVienFullTime extends NhanVien{
    //loai chuc vu, ngay lam them
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if(loaiChucVu == Configs.NHAN_VIEN) {
            return "Nhan Vien" + (ngayLamThem > 0 ? "có làm thêm ngày" : "");
        } else {
            return "Sep" + (ngayLamThem > 0 ? "có làm thêm ngày" : "");
        }
    }

//    @Override
    public void tinhLuong() {
        if(loaiChucVu == Configs.NHAN_VIEN) {
            luong = Configs.LUONG_NHANVIEN_FULLTIME + ngayLamThem + Configs.LUONG_LAMTHEM_NGAY;
        } else if(loaiChucVu == Configs.SEP) {
            luong = Configs.LUONG_SEP_FULLTIME + ngayLamThem + Configs.LUONG_LAMTHEM_NGAY;
        }
    }
}
