package problem1;
import  java.util.Scanner;
public class DiemTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();// Nhập điểm trung bình

        if (diemTrungBinh >= 5.0) { // So sánh với điểm chuẩn
            System.out.println("Đậu");
        } else {
            System.out.println("Rớt");
        }

        scanner.close();
    }
}
