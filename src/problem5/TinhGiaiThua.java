package problem5;
import java.util.Scanner;
public class TinhGiaiThua {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập một số nguyên dương: ");
            int n = scanner.nextInt();

            while (n < 0) {
                System.out.println("Nhập một số nguyên dương:");
                n = scanner.nextInt();
            }
            long giaiThua = 1;
            if (n == 0 || n == 1) {
            } else {

                for (int i = 2; i <= n; i++) {
                    giaiThua *= i;
                }
            }
            System.out.println(n + "! = " + giaiThua);

            scanner.close();
        }


}
