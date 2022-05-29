import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise_1_SumArraysElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indexSum = 0;
        int [] arr = IntStream.range(0,100).toArray();
        for (int index:
             arr) {
            indexSum+= index;
        }
        System.out.println(indexSum);



    }
}
