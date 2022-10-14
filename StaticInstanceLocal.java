package workshop1;

public class StaticInstanceLocal {

    int a=10;  //global variable
    static int  b=20; //static variable or class variable

    void add(){
        int x =10 ;
        int y=20;
        System.out.println("A+B="+(a+b));
    }

    public static void main(String[] args) {
        StaticInstanceLocal s = new StaticInstanceLocal();
        System.out.println("instance variable :"+s.a);
        System.out.println("static variable :"+b);
        s.add();
    }
}
