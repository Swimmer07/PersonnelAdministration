public class Employee {
    private String name;
    private String forename;
    private String birthday;
    private char gender;
    private int age;
    private double weight;
    private String department;
    private double salary;
    private int yearsOfService;
    private String specialitys;

    public Employee(String name, String forename, String birthday, char gender, int age, double weight,int yearsOfService, double salary, String department, String specialitys) {
        this.name = name;
        this.forename = forename;
        this.birthday = birthday;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.yearsOfService = 1;
        this.salary = 1500;
        this.department = "A38";
        this.specialitys = specialitys;
    }

    public String getName() {
        return name;
    }

    public String getForename() {
        return forename;
    }

    public String getBirthday() {
        return birthday;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
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

    public void setDepartment(String department){
        this.department = department;
    }

    public String getSpecialitys() {
        return specialitys;
    }
}
