package workshop1;

public class EvenOddArray {
    public static void main(String[] args)
    {
        int [] myIntArray = new int[100];

        for (int i =0; i < myIntArray.length; i++)
        {
               myIntArray[i]= i +1;
        }

        System.out.println(" These are Odd Numbers in 1 to 100");
        checkingOddEven(myIntArray);
    }

    private static void checkingOddEven(int[] myIntArray) {

        for(int i =0; i < myIntArray.length; i++) {
            if (myIntArray[i] % 2 != 0) {
                System.out.print(+myIntArray[i] +" ");
            }
        }

    }
}
