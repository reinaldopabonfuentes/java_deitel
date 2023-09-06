package chapterSeven.multidimensionalArrays;
// Fig. 7.17: InitArray.java -> Initializing two-dimensional arrays

public class InitArray {

    // create and output two-dimensional arrays
    public static void main(String[] args){
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1); // displays array1 by row

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2); // displays array2 by row


        // Gets the total of the array and prints it
        System.out.printf("%nThe total of the array1:  %d%n", totalArray(array1));

        // Gets the total of the array and prints it
        System.out.printf("%nThe total of the array2:  %d%n", totalArray(array2));
    }

    // output rows and columns of a two-dimensional array
    public static void outputArray(int[][] array){
        // loop through array's rows
        for (int row = 0; row < array.length; row++){
            // loop through columns of current row

            for (int column = 0; column < array[row].length; column++){
                System.out.printf("%d  ", array[row][column]);
            }

            System.out.println();
        }

    }

    public static int totalArray(int[][] array){
        int total = 0;

        // loop through the array and add the value to total

        // loop through array's rows
        for (int row = 0; row < array.length; row++){
            // loop through columns of current row
            for (int column = 0; column < array[row].length; column++){
                total += array[row][column];
            }
        }

        return total;
    }
}
