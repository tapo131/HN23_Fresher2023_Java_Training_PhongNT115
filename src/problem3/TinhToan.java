package problem3;
import java.util.Scanner;
public class TinhToan {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập số b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập phép toán (+, -, *, /): ");
            String operator = scanner.next();

            double result = 0.0;
            //Thực hiện các phép toán tùy theo trường hợp
            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Lỗi: Không thể chia cho 0.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Phép toán không hợp lệ.");
                    return;
            }

            System.out.println("Kết quả: " + result);

            scanner.close();
        }
}
