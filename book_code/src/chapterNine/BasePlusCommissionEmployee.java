package chapterNine;
// Fig. 9.8: BasePlussComissionEmployee.java
// private superclass members cannot be accessed in a subclass

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
        String socialSecurityNumber, double grossSales,
        double comissionRate, double baseSalary){
        // explicit call to superclass ComissionEmployee constructor
        super(firstName, lastName, socialSecurityNumber, grossSales,
                comissionRate);

        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0){
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;

    } // end of constructor

    // set base salary
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // calculate earnings
    @Override
    public double earnings(){
        return baseSalary + (getCommissionRate() * getGrossSales());
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f"
                "base-salaried commission employee",
                getFirstName(),getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate(),
                "base salary", baseSalary);
    }


} // end class BasePlusCommisionEmployee
