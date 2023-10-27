package problem2;

public class CustomerA extends Customer{

    public CustomerA(int quantity, double unitPrice) {
        super(quantity, unitPrice, 0);
    }
    @Override
    public double calculateTotalPayment() {
        return totalPayment = quantity * unitPrice + quantity * unitPrice * vatRate;
    }
}
