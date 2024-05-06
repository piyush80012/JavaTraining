package OOps;

public class Overloading {
    public void m1(){
        System.out.println("m1 no arg method");
    }
    public void m1(int a){
        System.out.println("m1 int arg method");
    }
    public void m1(int a, int b){
        System.out.println("m2 two arg method");
    }







    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.m1();
        o.m1(1);
        o.m1(2, 3);
    }
}
