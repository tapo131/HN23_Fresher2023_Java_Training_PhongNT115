package problem5;
import java.util.Scanner;
import java.util.ArrayList;
public class TruongTHPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho học sinh #" + (i + 1));
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Quê quán: ");
            String queQuan = scanner.nextLine();

            HocSinh hocSinh = new HocSinh(hoTen, tuoi, queQuan);
            danhSachHocSinh.add(hocSinh);
        }

        // Hiển thị các học sinh 20 tuổi
        System.out.println("Danh sách học sinh 20 tuổi:");
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.getTuoi() == 20) {
                System.out.println(hocSinh.toString());
            }
        }

        // Đếm số lượng học sinh có tuổi là 23 và quê ở Hà Nội
        int soLuongHocSinh23TuoiHaNoi = 0;
        for (HocSinh hocSinh : danhSachHocSinh) {
            if (hocSinh.getTuoi() == 23 && hocSinh.getQueQuan().equals("Hà Nội")) {
                soLuongHocSinh23TuoiHaNoi++;
            }
        }
        System.out.println("Số lượng học sinh 23 tuổi và quê ở Hà Nội: " + soLuongHocSinh23TuoiHaNoi);

        scanner.close();
    }
}