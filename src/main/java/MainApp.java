import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap so luong nhan vien: ");
        int tongNhanVien = sc.nextInt();

        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            System.out.println("Nhan vien" + (i + 1) + ": ");
            String ten = sc.nextLine();
            System.out.print("La nhan vien (1-Fulltime, 2-Parttime): ");
            int kieuNhanVien = sc.nextInt();
            if(kieuNhanVien == 1) {
                System.out.print("Chuc vu nhan vien(1-Sep, 2-NhanVien): ");
                int chucVu = sc.nextInt();
                System.out.print("Ngay lam them: ");
                int ngayLamThem = sc.nextInt();
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            } else {
                System.out.print("Gio lam: ");
                int gioLamViec = sc.nextInt();
                mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
            }
        }
        System.out.println("Ket qua tinh luong");

        //tinh luong va xuat thong tin
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        }
    }
}