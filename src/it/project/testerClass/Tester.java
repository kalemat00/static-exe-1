package it.project.testerClass;

import it.project.classes.Badge;
import it.project.classes.Employee;

public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Matteo", "Calenda", "via pinco pallino 67");
        Employee employee2 = new Employee("Ciro", "Esposito", "via buon natale 25");

        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}
