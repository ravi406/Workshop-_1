package workshop1;

import java.util.Scanner;

public class VowelCountDemo {

    public void vowelCount(String str) {

        char ch[] = {'a','e','i','o','u'};
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
                for(int j = 0; j < ch.length; j++) {
                    if (str.charAt(i) == ch[j])
                        count++;
                }

            }
        System.out.println("The vowel count in a given string is :"+count);

        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VowelCountDemo v1 = new VowelCountDemo();
        System.out.println("Enter the string :");
        String str = scanner.next().toLowerCase().trim();


        v1.vowelCount(str);


    }
}
