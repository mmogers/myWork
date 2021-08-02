//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter an operator: ");
        String str = scan.next();
        char sign = str.charAt(0);
        scan.close();
        switch(sign) {
            case '%':
                System.out.println("The remainder is " + num1 % num2);
                break;
            case '*':
                System.out.println("The multiplication is " + num1 * num2);
                break;
            case '+':
                System.out.println("The sum is " + (num1 + num2));
                break;
            case '-':
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case '/':
                float result = (float)num1 / (float)num2;
                System.out.println(result);
                break;
            case 'b':
                if (num1 > num2) {
                    System.out.println("num1 is bigger than num2");
                } else if (num1 != num2) {
                    System.out.println("num2 is bigger than num1");
                }
                break;
            case 'p':
                System.out.println("Entered numbers are " + num1 + " " + num2);
                break;
            case 's':
                if (num1 < num2) {
                    System.out.println("num1 is smaller than num2");
                } else if (num1 != num2) {
                    System.out.println("num2 is smaller than num1");
                }
                break;
            default:
                System.out.println("Sign is not allowed!");
        }

    }
}
