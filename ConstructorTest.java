package workshop1;

public class ConstructorTest {
    int x;
    int y;
    public ConstructorTest(){
        this.x=10;
        this.y=20;
    }

    public ConstructorTest(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(x+" "+y);
    }

    @Override
    public String toString() {
        return "ConstructorTest{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {

        ConstructorTest c1 = new ConstructorTest();
        ConstructorTest c2 = new ConstructorTest(50,60);

        System.out.println(c1);
        System.out.println(c2);
    }
}
