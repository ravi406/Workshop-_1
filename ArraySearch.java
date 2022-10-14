package workshop1;

import java.util.Scanner;

public class ArraySearch {
    public static void checkElementIsPresent(int[] myIntArray ,int n) {

        int count = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            if (myIntArray[i] == n) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println( n+" :is present in an array");
        }else {
            System.out.println(n+" :is not present in an array");
        }

    }

    public static void main(String[] args) {

        int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A number to check");
        int n = sc.nextInt();

        checkElementIsPresent(myIntArray,n);
    }

}
