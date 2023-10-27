package problem3;

class PremiumRoom extends Room {
    public PremiumRoom(int nights, double serviceFee) {
        super(nights, serviceFee);
    }

    @Override
    public double calculateRevenue() {
        return (nights * 500000 + serviceFee) * 1.05;
    }
}