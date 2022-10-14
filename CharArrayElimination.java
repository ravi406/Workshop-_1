package workshop1;

public class CharArrayElimination {

    public static void main(String[] args) {

        char[] charArray={'0','a','b','c','0','d','0','e'};

        removeZeroFromArray(charArray);
    }

    private static void removeZeroFromArray(char[] charArray) {
        final int SIZE =charArray.length;
        char[] newCharArray = new char[SIZE-3];
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
           // System.out.print(charArray[i]);
            if(charArray[i] != '0'){
                newCharArray[count++] += charArray[i];
                //System.out.print(charArray[i]+" ");
            }
        }
        for ( int i= 0; i < newCharArray.length; i++) {
            System.out.print(newCharArray[i]+" ");
        }

    }

}
