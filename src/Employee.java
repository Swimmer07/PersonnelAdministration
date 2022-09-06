public class Employee {
    private String name;
    private String vorname;
    private String geburtsdatum;
    private char geschlecht;
    private int alter;
    private double gewicht;
    private String abteilung;
    private double gehalt;
    private int dienstjahre;
    private String besonderheiten;

    public Employee(int dienstjahre, double gehalt, String abteilung) {
        this.dienstjahre = dienstjahre;
        this.gehalt = gehalt;
        this.abteilung = abteilung;
    }
}
