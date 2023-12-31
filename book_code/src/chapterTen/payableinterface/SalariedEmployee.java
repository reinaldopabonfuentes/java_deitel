package chapterTen.payableinterface;
// Fig. 10.14: SalariedEmployee.java
// SalariedEmployee class that implements interface Payable
// method getPaymentAmount

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // constructor
    public SalariedEmployee(String firstname, String lastName,
                            String socialSecurityNumber,
                            double weeklySalary ){
        super(firstname, lastName,socialSecurityNumber);

        if (weeklySalary < 0.0){
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0){
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    // calculate earnings; implement interface Payable method that
    // was abstract in superclass Employee
    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

    // return String representation of SalariedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }


}// end class SalariedEmployee
