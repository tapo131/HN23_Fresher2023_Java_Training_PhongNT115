package problem2;

public class Customer {
        public int quantity;
        public double unitPrice;
        public int yearsLoyal;
        protected final double vatRate = 0.1;

        protected double totalPayment = 0;
        public Customer(int quantity, double unitPrice, int yearsLoyal) {
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.yearsLoyal = yearsLoyal;
        }
        public double calculateTotalPayment() {
            return 0;
        }

}
