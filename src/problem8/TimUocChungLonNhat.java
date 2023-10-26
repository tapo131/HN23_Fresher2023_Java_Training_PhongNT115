package problem8;
import java.util.Scanner;
public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int ucln = timUocChungLonNhat(a, b);
        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là " + ucln);

        scanner.close();
    }

    public static int timUocChungLonNhat(int a, int b) {
        //Sử dụng thuật toán Euclid để tìm ƯCLN
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
