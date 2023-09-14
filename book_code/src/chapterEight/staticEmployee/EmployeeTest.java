package chapterEight.staticEmployee;
// Fig. 8.13: EmployeeTest.java
// static member demonstration
// Fig. 8.14: StaticImportTest.java
// Static import of Math class methods
import static java.lang.Math.*;

public class EmployeeTest {
    public static void main(String[] args){
        // show that count is 0 before creating Employees
        System.out.printf("Employees before instantiation: %d%n",
                Employee.getCount());

        // create two Employees; count should be 2
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        // show that count is 2 after creating two Employees
        System.out.printf("%nEmployees after instantiation: %n");
        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n",
                Employee.getCount());

        // get names of Employees
        System.out.printf("%nEmployee 1: %s %s%nEmpolyee : %s %s%n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());

        System.out.println();

        // Call Method to demonstrate static Imports
        System.out.println("Method to demonstrate static Imports");
        staticImport();

    }

    // demonstrate the static import of Math class methods

    public static void staticImport(){
        System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        System.out.printf("ceil(-9.8) = %1f%n", ceil(-9.8));
        System.out.printf("E = %f%n", E);
        System.out.printf("PI = %f%n", PI);
    }
}// end class EmployeeTest
