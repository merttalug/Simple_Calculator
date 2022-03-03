package Statements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        double n1, n2, sum, sub, mult, dvs;
        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        n1 = input.nextDouble();
        System.out.println("Input the second number:");
        n2 = input.nextDouble();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Your Choice: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                sum = n1 + n2;
                System.out.println("Sum=" + sum);
                break;
            case 2:
                sub = n1 - n2;
                System.out.println("Subtraction=" + sub);
                break;
            case 3:
                mult = n1 * n2;
                System.out.println("Multiple=" + mult);
                break;
            case 4:
                dvs = n1 / n2;
                if (n2 != 0) {
                    System.out.println("Division=" + dvs);
                } else
                    System.out.println("MATH ERROR : Any number cannot divide by Zero !!!");

                break;
            default:
                System.out.println("ERROR ! You entered an invalid number. Please Try Again...");
                break;

        }


    }

}
