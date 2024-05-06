import java.util.Scanner;

public class ConditionStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalMarks = sc.nextInt();

        if(totalMarks <= 100 && totalMarks >= 90) {
            System.out.println("Grade A "+ totalMarks);
        }
        else if(totalMarks <= 90 && totalMarks >= 80) {
                System.out.println("Grade B "+ totalMarks);

        }
        else if (totalMarks <=80 && totalMarks >= 70){
            System.out.println("Grade C "+ totalMarks);
        }
        else if (totalMarks <=70 && totalMarks >= 60) {
            System.out.println("Grade D " + totalMarks);
        }
        else if (totalMarks <=60 && totalMarks >= 50) {
            System.out.println("Grade E "+ totalMarks);
        }
        else if (totalMarks <=50 && totalMarks >= 40){
            System.out.println("Grade F "+ totalMarks);
        }
        else if (totalMarks <=40 && totalMarks >= 30) {
            System.out.println("Grade G "+ totalMarks);


        }
        else if (totalMarks <=30 && totalMarks >= 20) {
            System.out.println("Grade H "+ totalMarks);
        }
        else if (totalMarks <=20 && totalMarks >= 1) {
            System.out.println("Grade I "+ totalMarks);
        }
        else if (totalMarks <=10 && totalMarks >= 0) {
            System.out.println("Fail "+ totalMarks);
        }


    }
}
