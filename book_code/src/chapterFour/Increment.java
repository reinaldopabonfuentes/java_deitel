package chapterFour;

// Fig. 4.10: Increment.java
// Prefis increment and postfix incremente operators.

public class Increment {
    public static void main(String[] args){
        //demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); // prints 5
        System.out.printf(" postincrementing c: %d%n", c++); // prints 5
        System.out.printf(" c after postincrement: %d%n", c); // prints 6
    }
}
