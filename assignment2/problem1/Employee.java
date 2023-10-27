package problem1;

// Lớp cha Employee chứa thông tin chung cho tất cả nhân viên
public class Employee {
    private String name;
    private String dob;
    protected double salary;
    public Employee(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void calculateSalary() {
    }

    public void displayInfo() {
        System.out.println("Họ tên: " + name);
        System.out.println("Ngày sinh: " + dob);
        System.out.println("Lương: " + salary);
    }
}
