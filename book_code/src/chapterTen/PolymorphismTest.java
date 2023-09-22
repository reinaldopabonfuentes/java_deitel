package chapterTen;

import chapterNine.CommissionEmployee;
import chapterNine.BasePlusCommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        // assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones",
                "222-22-2222", 10000,
                0.06);

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob",
                        "Lewis", "333-33-3333",
                        500, 0.04, 300);

        // invoke toString on superclass object using superclass variable

        System.out.printf("%n%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "to superclass object", commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object",
                basePlusCommissionEmployee.toString());

        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 =
                basePlusCommissionEmployee;
        System.out.printf("%s %s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's",
                "toString with superclass reference",
                "to subclass object", commissionEmployee2.toString());


    } // end of main method

}// end of class PolymorphismTest
