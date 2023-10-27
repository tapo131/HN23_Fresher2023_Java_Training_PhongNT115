package problem2;
public class CustomerB extends Customer{
    public CustomerB( int quantity, double unitPrice, int yearsLoyal) {
        super(quantity, unitPrice, yearsLoyal);
    }
    @Override
    public double calculateTotalPayment() {
        double discountPercentage = Math.max(yearsLoyal * 0.05, 0.5);
        return totalPayment = (quantity * unitPrice) * (1 - discountPercentage) + quantity * unitPrice * vatRate;
    }
}
