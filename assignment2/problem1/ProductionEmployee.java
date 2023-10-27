package problem1;

// Lớp con cho nhân viên sản xuất
public class ProductionEmployee extends Employee{
    private int productCount;
    public ProductionEmployee(String name, String dob, int productCount) {
        super(name, dob);
        this.productCount = productCount;
    }

    @Override
    public void calculateSalary() {
        salary = 5000 * productCount; // Lương = số sản phẩm * 5.000
    }
}
