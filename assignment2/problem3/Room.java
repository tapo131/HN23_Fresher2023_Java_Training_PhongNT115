package problem3;

public class Room {
    protected int nights;
    protected double serviceFee;

    public Room(int nights, double serviceFee) {
        this.nights = nights;
        this.serviceFee = serviceFee;
    }

    public double calculateRevenue() {
        return 0;
    }

    public double getPreviousMonthRevenue() {
        return 0;
    }
}
