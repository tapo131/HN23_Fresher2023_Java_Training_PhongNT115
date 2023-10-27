package problem3;

public class DeluxeRoom extends Room{
    public DeluxeRoom(int nights, double serviceFee) {
        super(nights, serviceFee);
    }

    @Override
    public double calculateRevenue() {
        return (nights * 750000 + serviceFee) * 1.05;
    }
}
