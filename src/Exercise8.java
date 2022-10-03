import java.util.Scanner;
public class Exercise8 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10]; //Declaration and Instantiation

        //Initialization
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                matrix[row][col] = 0;
            }

        }
        matrix[0][4] = 1;
        matrix[2][6] = 1;
        matrix[3][1] = 1;
        matrix[8][6] = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}