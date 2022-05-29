import java.util.Scanner;

public class Exercise_6_SumOfDiagonal2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[4][4];
        int sumDiagonal1 = 0,sumDiagonal2 = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println("Please add a value for the elements in the array: ");
                arr2D[i][j] = sc.nextInt();
            }
        }
        //PRINT MATRIX
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] +"\t");
            }
            System.out.println(" ");

        }

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                //this is diagonal 1 which is the left diagonal
                // We only care about the indexes with matching row and cow
                if (row == col) {
                    sumDiagonal1 += arr2D[row][col];
                }
            }
        }
        System.out.println("The sum of your left Diagonal is: " + sumDiagonal1);

        // Trying to find 2nd diagonal sum When row is 0 increment by 1 and j is 3 we do j -- to locate the indexes
        // What we are searching for is [0] [3],[1][2],[2][1] [3][0]
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                //Drawing the matrix on paper made me realise that the row+col indexes are always 3 which  matches arr2D.lenght -1
                    if((row+col) == (arr2D.length - 1)){
                        sumDiagonal2 += arr2D[row][col];
                }
            }
        }
        System.out.println("The sum of your left Diagonal is: " + sumDiagonal2);
    }
}