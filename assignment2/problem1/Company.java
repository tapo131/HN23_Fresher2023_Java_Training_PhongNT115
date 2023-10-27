package problem1;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho nhân viên sản xuất:");
        System.out.print("Họ tên: ");
        String name1 = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        String dob1 = scanner.nextLine();
        System.out.print("Số sản phẩm: ");
        int productCount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập thông tin cho nhân viên văn phòng:");
        System.out.print("Họ tên: ");
        String name2 = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        String dob2 = scanner.nextLine();
        System.out.print("Số ngày làm việc: ");
        int daysWorked = scanner.nextInt();
        scanner.nextLine();

        // Tạo và quản lý nhân viên sản xuất
        ProductionEmployee productionEmployee = new ProductionEmployee(name1, dob1, productCount);
        productionEmployee.calculateSalary();
        productionEmployee.displayInfo();

        // Tạo và quản lý nhân viên văn phòng
        OfficeEmployee officeEmployee = new OfficeEmployee(name2, dob2, daysWorked);
        officeEmployee.calculateSalary();
        officeEmployee.displayInfo();

        scanner.close();
    }
}
