import java.util.Scanner;

public class Exercise_2and3_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[4][3];


        // This exercise combines task 2 and 3 into 1 because i just wanted to directly initialise the elements in the array with Scanner input instead of directly initialising them
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++){
                System.out.println("Please add a value for the elements in the array: ");
                arr2D[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]);
            }
            System.out.println();

        }
    }
}
