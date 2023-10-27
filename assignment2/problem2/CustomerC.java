package problem2;

public class CustomerC extends Customer{
    public CustomerC( int quantity, double unitPrice) {
        super( quantity, unitPrice,0);
    }
    @Override
    public double calculateTotalPayment() {
        return (quantity * unitPrice * 0.5) + quantity * unitPrice * vatRate;
    }
}
