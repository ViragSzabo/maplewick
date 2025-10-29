package implementation.week10.Examination.TryCatch;

import java.util.Scanner;

class CodeChef {
    public void perform() {
        int a, b, c = 0;

        System.out.println("I am inside a try block");
        System.out.println("I am at top of finally");

        Scanner sc = new Scanner(System.in);

        try {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b == 0 | a == 0) {
                throw new ArithmeticExampleException();
            }
            c = a / b;
        } catch (ArithmeticExampleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("c=" + c);
        System.out.println("I am at the bottom of finally");
    }
}

public class TryCatch {
    public static void main(String args[]) {
        CodeChef chef = new CodeChef();
        chef.perform();
    }
}