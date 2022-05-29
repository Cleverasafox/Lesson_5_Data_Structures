import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_7_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it's a Palindrome");
        System.out.println("palindrome is a sequence of characters which reads the same backward or\n" +
                "forward, such as madam or tacocat");
        String palindrome = sc.nextLine();
        String palindrome2 = "";

        int length = palindrome.length();

        for (int i = length -1; i>= 0; i--){
            palindrome2 = palindrome2 + palindrome.charAt(i);
        }
        if (palindrome.equalsIgnoreCase(palindrome2)){
            System.out.println("The word is a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}
