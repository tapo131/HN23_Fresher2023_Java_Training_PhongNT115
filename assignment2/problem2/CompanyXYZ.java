package problem2;
import java.util.Scanner;
public class CompanyXYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho khách hàng loại A:");
        System.out.print("Số lượng hàng: ");
        int quantityA = scanner.nextInt();
        System.out.print("Đơn giá hàng: ");
        double unitPriceA = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập đơn giá hàng

        System.out.println("Nhập thông tin cho khách hàng loại B:");
        System.out.print("Số lượng hàng: ");
        int quantityB = scanner.nextInt();
        System.out.print("Đơn giá hàng: ");
        double unitPriceB = scanner.nextDouble();
        System.out.print("Số năm thân thiết: ");
        int yearsLoyalB = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập số năm thân thiết

        System.out.println("Nhập thông tin cho khách hàng loại C:");
        System.out.print("Số lượng hàng: ");
        int quantityC = scanner.nextInt();
        System.out.print("Đơn giá hàng: ");
        double unitPriceC = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống sau khi nhập đơn giá hàng

        CustomerA customerA = new CustomerA(quantityA, unitPriceA);
        CustomerB customerB = new CustomerB(quantityB, unitPriceB, yearsLoyalB);
        CustomerC customerC = new CustomerC(quantityC, unitPriceC);

        double totalRevenue = customerA.calculateTotalPayment() + customerB.calculateTotalPayment() + customerC.calculateTotalPayment();

        System.out.println("Khách hàng loại A phải trả: " + customerA.calculateTotalPayment());
        System.out.println("Khách hàng loại B phải trả: " + customerB.calculateTotalPayment());
        System.out.println("Khách hàng loại C phải trả: " + customerC.calculateTotalPayment());
        System.out.println("Tổng số tiền công ty thu được: " + totalRevenue);

        scanner.close();
    }
}
