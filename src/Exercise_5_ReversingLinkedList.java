import java.util.*;

public class Exercise_5_ReversingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lList = new LinkedList<Integer>();
        System.out.println("Please add the size of your Linked list");
        int listSize = sc.nextInt();
        // temp parameter for swapping
        int temp;
        for (int i = 1; i <=listSize; i++) {
            System.out.printf("Please enter number of element %d %n" ,  i);
            lList.add(sc.nextInt());
        }
        System.out.println("This is the current state of the linked list");
        System.out.println(lList);

        for (int i = 0; i < lList.size() /2 ; i++) {
            temp = lList.get(i);
            lList.set(i, lList.get(lList.size()-i -1));
            lList.set(lList.size()-i-1,temp);

        }
        System.out.println("This is the reversed order of your list");

        System.out.println(lList);



    }
}
