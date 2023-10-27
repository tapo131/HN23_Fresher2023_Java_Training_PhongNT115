package problem1;

// Lớp con cho nhân viên văn phòng
public class OfficeEmployee extends Employee{
    private int daysWorked;

    public OfficeEmployee(String name, String dob, int daysWorked) {
        super(name, dob);
        this.daysWorked = daysWorked;
    }

    @Override
    public void calculateSalary() {
        salary = 100000 * daysWorked; // Lương = số ngày làm việc * 100.000
    }
}
