package problem7;
import java.util.Scanner;
public class TinhTongSoChan {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số nguyên dương n: ");
            int n = scanner.nextInt();

            while (n <= 0) {
                System.out.println("Nhập số nguyên dương n:");
                n = scanner.nextInt();
            }
            int tong = 0;
            for (int i = 2; i <= n; i += 2) {
                tong += i;
            }

            System.out.println("Tổng các số chẵn nhỏ hơn hoặc bằng " + n + " là: " + tong);

            scanner.close();
        }


}
