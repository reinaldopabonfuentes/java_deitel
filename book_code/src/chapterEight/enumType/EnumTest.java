package chapterEight.enumType;
// Fig. 8.11: EnumTest.java
// Testing enum type Book.

import java.util.EnumSet;
public class EnumTest {
    public static void main(String[] args){
        System.out.println("All books");

        // print all boos in enum Book
        /*
            For every enum, the compiler generates the static method values
            (called in line 17) that returns an array of the enum’s
            constants in the order they were declared
         */
        for (Book book : Book.values()){
            /*
                When an enum constant is converted to a String
                (e.g., book in line 22), the constant’s identifier is used
                as the String representation (e.g., JHTP for the first
                enum constant).
             */
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
        System.out.printf("%nDisplay a range of enum constants:%n");

        // print first four books
        /*
            Here we use the static method range of class EnumSet (declared in package
            java.util) to display a range of the enum Book’s constants. Method range
            takes two parameters—the first and the last enum constants in the
            range—and returns an EnumSet that contains all the constants between
            these two constants, inclusive.
         */
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)){
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
} // end class EnumTest
