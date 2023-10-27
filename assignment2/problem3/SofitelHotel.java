package problem3;
import java.util.Scanner;
public class SofitelHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phòng Deluxe:");
        int numDeluxeRooms = scanner.nextInt();
        DeluxeRoom[] deluxeRooms = new DeluxeRoom[numDeluxeRooms];
        for (int i = 0; i < numDeluxeRooms; i++) {
            System.out.println("Nhập thông tin cho phòng Deluxe #" + (i + 1));
            System.out.print("Số đêm: ");
            int nights = scanner.nextInt();
            System.out.print("Phí dịch vụ: ");
            double serviceFee = scanner.nextDouble();
            deluxeRooms[i] = new DeluxeRoom(nights, serviceFee);
        }

        System.out.println("Nhập số lượng phòng Premium:");
        int numPremiumRooms = scanner.nextInt();
        PremiumRoom[] premiumRooms = new PremiumRoom[numPremiumRooms];
        for (int i = 0; i < numPremiumRooms; i++) {
            System.out.println("Nhập thông tin cho phòng Premium #" + (i + 1));
            System.out.print("Số đêm: ");
            int nights = scanner.nextInt();
            System.out.print("Phí dịch vụ: ");
            double serviceFee = scanner.nextDouble();
            premiumRooms[i] = new PremiumRoom(nights, serviceFee);
        }

        System.out.println("Nhập số lượng phòng Business:");
        int numBusinessRooms = scanner.nextInt();
        BusinessRoom[] businessRooms = new BusinessRoom[numBusinessRooms];
        for (int i = 0; i < numBusinessRooms; i++) {
            System.out.println("Nhập thông tin cho phòng Business #" + (i + 1));
            System.out.print("Số đêm: ");
            int nights = scanner.nextInt();
            businessRooms[i] = new BusinessRoom(nights);
        }

        double totalRevenue = 0;

        for (DeluxeRoom room : deluxeRooms) {
            double revenue = room.calculateRevenue();
            totalRevenue += revenue;
            if (revenue >= room.getPreviousMonthRevenue() * 1.25) {
                System.out.println("Phòng Deluxe có doanh thu vượt trội.");
            }
        }

        for (PremiumRoom room : premiumRooms) {
            double revenue = room.calculateRevenue();
            totalRevenue += revenue;
            if (revenue >= room.getPreviousMonthRevenue() * 1.25) {
                System.out.println("Phòng Premium có doanh thu vượt trội.");
            }
        }

        for (BusinessRoom room : businessRooms) {
            double revenue = room.calculateRevenue();
            totalRevenue += revenue;
            if (revenue >= room.getPreviousMonthRevenue() * 1.25) {
                System.out.println("Phòng Business có doanh thu vượt trội.");
            }
        }

        System.out.println("Tổng doanh thu: " + totalRevenue);

        scanner.close();
    }
}