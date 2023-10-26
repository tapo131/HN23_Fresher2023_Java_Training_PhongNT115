package problem9;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int num = scanner.nextInt();

        if (laSoNguyenTo(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }

        scanner.close();
    }
    //Dùng sàng Eratosthenes để kiểm tra số nguyên tố
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }

        // Tạo một mảng để đánh dấu các số từ 2 đến n
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sàng Eratosthenes để loại bỏ các bội số
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        return isPrime[n];
    }
}
