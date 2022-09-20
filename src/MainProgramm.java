public class MainProgramm {
    public static void main(String[] args) {
        Employee e1 = new Employee("Muller", "Tom", "31.12 .2000", 'M', 21, 130, 0, 5000, "A34", "no founded");
        Employee e2 = new Employee("Schmidt", "Mark", "30.12.2000", 'd', 20, 70, 2, 1500, "C5", "tall");
        System.out.println(e1);
        System.out.println(e2);
    }
}
