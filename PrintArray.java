package workshop1;

public class PrintArray {

    public static void main(String[] args) {
        int[] myIntArray = {0,1,1,0,0,0,1,0,1,1,1,1,0,0};

        sortZeroAndOnes(myIntArray);


    }

    private static void sortZeroAndOnes(int[] myIntArray) {
        int SIZE = myIntArray.length;
        int [] sortZeroOnes = new int[SIZE];
        int count = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            if(myIntArray[i] == 0) {
                sortZeroOnes[i] += myIntArray[i];
                System.out.print(sortZeroOnes[i]+" ");
            }

        }

    }
}
