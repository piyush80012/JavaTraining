package OOps;

public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
        f.marry();
        f.property();
        Son s = new Son();
        s.marry();
        s.property();
        Father f2 = new Son();
        f2.property();
        f2.marry();
        f2.property();

    }

    @Override
    public void marry() {
        System.out.println("9yantara, 4me, 3sha");
    }

}
