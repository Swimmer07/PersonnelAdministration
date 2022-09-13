public class MainProgramm {
    public static void main(String[] args) {
        Employee p1 = new Employee(0,1500,"A38");
        System.out.println("Dienstjahre: " + p1.getYearsOfService() + " Gehalt: " + p1.getSalary() + " Abteilung: " + p1.getDepartment());
        Employee p2 = new Employee(3, 1800,"A1");
        System.out.println("Dienstjahre: " + p2.getYearsOfService() + " Gehalt: " + p2.getSalary() + " Abteilung: " + p2.getDepartment());
        Employee p3 = new Employee(40, 5000, "F36");
        System.out.println("Dienstjahre: " + p3.getYearsOfService() + " Gehalt: " + p3.getSalary() + " Abteilung: " + p3.getDepartment());
    }
}
