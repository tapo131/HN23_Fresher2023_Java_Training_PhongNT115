package problem2;
import java.util.Scanner;
public class TimSoLonNhat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập số b: ");
            double b = scanner.nextDouble();
            //So sánh 2 số
            if (a > b) {
                System.out.println("Số lớn nhất là " + a);
            } else if (b > a) {
                System.out.println("Số lớn nhất là " + b);
            } else {
                System.out.println("a và b bằng nhau, cả hai số đều là số lớn nhất.");
            }

            scanner.close();
        }
}
