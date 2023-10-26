package problem6;
import java.util.Scanner;
public class TinhTong {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số nguyên dương n: ");
            int n = scanner.nextInt();

            while (n <= 0) {
                System.out.println("Nhập số nguyên dương n:");
                n = scanner.nextInt();
            }
            int tong = 0;
            for (int i = 1; i <= n; i++) {
                tong += i;
            }
            System.out.println("Tổng từ 1 đến " + n + " là: " + tong);

            scanner.close();
        }


}
