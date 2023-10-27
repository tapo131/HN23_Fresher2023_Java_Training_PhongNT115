package problem3;

class BusinessRoom extends Room {
    public BusinessRoom(int nights) {
        super(nights, 0);
    }

    @Override
    public double calculateRevenue() {
        return nights * 300000;
    }
}
