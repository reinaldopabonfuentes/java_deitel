package chapterSeven;

/* This class contains the followings figures:
    - Fig. 7.2: InitArray.java -> Initializing the elements of an array to default values of zero
    - Fig. 7.3: InitArray.java with an initializer
 */


public class InitArray {
    public static void main(String args[]){
         // initializer list specifies the initial value for each element
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};


        System.out.println("ARRAY WITH ZERO VALUES");
        printArrayInitializer(array);
        System.out.println();



        System.out.println("ARRAY INITIALIZER");
        printArrayZeroValues();
        System.out.println();


        System.out.println("ARRAY SUM");
        sumArray(array);
        System.out.println();



        System.out.println("BART CHART");
        printBartChart();
        System.out.println();

    }

    public static void printArrayZeroValues(){
        // declare variable array and initialize it with an array object
        int[] array = new int[10]; // create the array object

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }




    }

    public static void printArrayInitializer(int[] array){
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    public static void sumArray(int[] array){
        int total = 0;

        // add each element's value to total
        for (int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);

    }

    public static void printBartChart(){
        // Fig. 7.6. BartChart.java
        // Bart chart printing program

        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        
        System.out.println("Grade distribution:");
        
        // for each array element, output a bar of the chart
        for (int counter = 0; counter < array.length; counter++){
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (counter == 10){
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ",
                        counter * 10, counter * 10 + 9);
            }

            // print bar asterisks
            for (int stars = 0; stars < array[counter]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

    }



}
