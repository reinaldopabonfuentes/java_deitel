

package chapterTwo;

//Fig. 2.7: Addition.java
//Addition program that inputs two numbers then displays their sum

import java.util.Scanner; // program uses class Scanner

public class Addition {
    // main method begins execution of Java application
    public static void main(String[] args){
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum); // display sum
    }
}
