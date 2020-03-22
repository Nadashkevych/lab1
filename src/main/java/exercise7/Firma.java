package exercise7;

public class Firma {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalski", 30);
        Employee employee2 = new Employee("Katarzyna", "Sikora", 28);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
