public class Employee {
    private String name;
    private String forename;
    private String birthday;
    private char gender;
    private int age;
    private double weigh;
    private String department;
    private double salary;
    private int yearsOfService;
    private String specialitys;

    public Employee(int yearsOfService, double salary, String department) {
        this.yearsOfService = yearsOfService;
        this.salary = salary;
        this.department = department;
    }

    public int getYearsOfService(){
        return yearsOfService;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
