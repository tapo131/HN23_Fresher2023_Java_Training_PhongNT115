package problem4;
import java.util.Scanner;
public class TimQuyCuaThang {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập tháng (1-12): ");
            int thang = scanner.nextInt();
            //Kiểm tra tháng có hợp lệ không
            if (thang < 1 || thang > 12) {
                System.out.println("Tháng không hợp lệ. Tháng phải nằm trong khoảng từ 1 đến 12.");
            } else {
                int quy = (thang - 1) / 3 + 1; // Tính quý từ tháng
                System.out.println("Tháng " + thang + " thuộc quý " + quy + " trong năm.");
            }

            scanner.close();
        }
}
