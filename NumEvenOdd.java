package workshop1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumEvenOdd {


    private static void evenOdd(int num) {
        if(num % 2 == 0) {
            System.out.println(num+" is Even Number");
        }else {
            System.out.println(num+" is Odd Number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumEvenOdd n1 = new NumEvenOdd();
        System.out.print("Enter a Number :");
        int num =sc.nextInt();

        evenOdd(num);
    }
}
