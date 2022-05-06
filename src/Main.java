/*
Static
Exercise: static

define a tester class where you:
create 2 new Employee objects
create their new 2 Badge
show to the user the 2 employees' badge details
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Marco", "Rossi","Via dei lecci,5");
        Employee employee2 = new Employee("Maria","Verdi","Via dei tigli,3");
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);
        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
