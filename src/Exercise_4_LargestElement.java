import java.util.Scanner;

public class Exercise_4_LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Please enter the size of array:");
        size = sc.nextInt();
        int [] arr = new int[size];
        int maxNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter value for the elements: ");
            arr[i] = sc.nextInt();
        }

        for (int i: arr) {
            if (i >maxNumber){
                maxNumber = i;
            }
        }
        System.out.println("The largest element in your array is " + maxNumber);

    }
}
