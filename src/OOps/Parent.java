package OOps;
// object oriented programming
public class Parent {
    public int a;
    public int b;
    protected int c;
    public static void main(String[] args) {
        Parent p = new Parent(); // object declaration and assignment
        p.a = 10;
        p.b = 20;
        System.out.println(p.a);
        System.out.println(p.b);

        Parent p1 = new Parent();
        p1.a = 40;
        p1.b = 50;
        System.out.println(p1.a);
        System.out.println(p1.b);

        Parent p2 = new Parent();
        p2.a = 100;
        p2.b = 200;
        System.out.println(p2.a);
        System.out.println(p2.b);

        System.out.println(p.a);
    }
    public void Print(){
        System.out.println("Hello I am Parent print Method");
    }

    public void Print2(){
        System.out.println("Hello I am Parent print2 Method");
    }
}
