package chapterFive;
// Fig 5.12: AutoPolicyTest.java
// Demosntrating Strings in switch

public class AutoPolicyTest {
    public static void main(String[] args){
        // create two AutoPolicy objects
        AutoPolicy policy1 =
                new AutoPolicy(111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 =
                new AutoPolicy(222222, "Ford Fusion", "ME");

        //display whether each policy is in a no-fault state
        policyNoFaultState(policy1);
        policyNoFaultState(policy2);



    }
    // method that displays whether an AutoPolicy
    // is in a state with no-fault auto insurance
    public static void policyNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state %n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }



}
