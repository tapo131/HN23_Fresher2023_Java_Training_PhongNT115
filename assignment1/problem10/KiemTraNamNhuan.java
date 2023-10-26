package problem10;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nam;

        do {
            System.out.print("Nhập một năm (năm >= 0): ");
            nam = scanner.nextInt();
            if (nam < 0) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
            }
        } while (nam < 0);

        if (isNamNhuan(nam)) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải là năm nhuận.");
        }

        scanner.close();
    }

    public static boolean isNamNhuan(int nam) {
        if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
            return true;
        }
        return false;
    }
}
