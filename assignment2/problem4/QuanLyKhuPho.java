package problem4;
import java.util.Scanner;
public class QuanLyKhuPho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hộ dân cư: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        KhuPho[] khuPhoArr = new KhuPho[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho hộ gia đình " + (i + 1));
            System.out.print("Số nhà: ");
            int soNha = scanner.nextInt();
            scanner.nextLine();

            KhuPho khuPho = new KhuPho(soNha);

            int m;
            System.out.print("Nhập số thành viên trong gia đình: ");
            m = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < m; j++) {
                System.out.println("Nhập thông tin cho người thứ " + (j + 1));
                System.out.print("Họ tên: ");
                String hoTen = scanner.nextLine();
                System.out.print("Tuổi: ");
                int tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nghề nghiệp: ");
                String ngheNghiep = scanner.nextLine();
                System.out.print("Số CMND: ");
                String soCMND = scanner.nextLine();

                Nguoi nguoi = new Nguoi(hoTen, tuoi, ngheNghiep, soCMND);
                khuPho.themHoGiaDinh(nguoi);
            }

            khuPhoArr[i] = khuPho;
        }

        // Hiển thị thông tin của các hộ trong khu phố
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin hộ gia đình " + (i + 1) + ":\n" + khuPhoArr[i]);
        }

        scanner.close();
    }
}
