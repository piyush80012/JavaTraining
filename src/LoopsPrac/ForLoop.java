package LoopsPrac;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i=i+2) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= 10; i=i*2) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }
// nested for loop
        System.out.println();
        for(int i = 1; i <=10 ; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }

        }
    }

}
