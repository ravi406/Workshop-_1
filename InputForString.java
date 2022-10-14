package workshop1;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class InputForString {


    public String reverseString(String name) {
         String reverseStr = "";
        for (int i = name.length()-1; i >=0; i--) {
        //    System.out.print(name.charAt(i));
            reverseStr += name.charAt(i);
        }
        System.out.println(reverseStr);
        return reverseStr;

    }

    public void isPalindrome(String str,String name ) {

        if (str.equals(name)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("string is not palindrome");
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name=sc.nextLine();

        System.out.println("Name :"+name);

        InputForString str1 = new InputForString();

        String string1= str1.reverseString(name);
        str1.isPalindrome(string1,name);


    }
}
