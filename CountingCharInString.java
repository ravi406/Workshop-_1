package workshop1;

import java.util.Scanner;

public class CountingCharInString {

    private static void checkStringOccurance(String str, char ch) {
        int count = 0;

        for( int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("charecter :"+ch+" occurred "+count+" times");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str =scanner.next();

        System.out.println("Enter a charecter to check :");
        char ch = scanner.next().charAt(0);

        checkStringOccurance(str,ch);

    }
}
