import java.util.Scanner;

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
         int[][] array = new int[twoDimArray.length][twoDimArray[0].length];


        for(int i = 0; i < twoDimArray.length; i++) {
            for(int j = twoDimArray[i].length - 1, k = 0; j >= 0; j--, k++) {
                array[i][j] = twoDimArray[i][k];
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                twoDimArray[i][j] = array[i][j];
            }
        }
        

    }
}
