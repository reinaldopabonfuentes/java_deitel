package chapterThree;
// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation




public class Account {
    private String name; // instances variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance){
        this.name = name; // assign name to instance variable name

        // validaite that the balance is greater than 0.0; if it's not,
        // instance variable balances keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) onlye a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAMount is valid
            balance = balance + depositAmount; // Add it to the balance
        }
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name){
        this.name = name;
    }

    // method that returns the name
    public String getName(){
        return name;
    }



}







