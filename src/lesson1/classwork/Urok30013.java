package lesson1.classwork;

import java.util.Scanner;

public class Urok30013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double numFirst=scanner.nextDouble();
        System.out.println("Enter second number:");
        double numSecond=scanner.nextDouble();
        if (numSecond != 0) {
            System.out.println("Enter operation " +
                    "'+' -Sum; " +
                    "'-' -Difference; " +
                    "'/' -Division; " +
                    "'*' -Multiplication;");
            //We can use String either. Just write default section (else) for any other cases. char ok too.
            char c = scanner.next().charAt(0);// ввод одного символа
            if (c == '+') {
                double result = numFirst + numSecond;
                System.out.println("Result::" + result);
            } else if (c == '-') {
                double result = numFirst - numSecond;
                System.out.print("Result:" + result);
            } else if (c == '/') {
                double result = numFirst / numSecond;
                System.out.print("Result:" + result);
            } else if (c == '*') {
                double result = numFirst * numSecond;
                System.out.print("Result:" + result);
            }
            else{
                System.out.println("Entered wrong operation!");
            }
        }
        else {
            System.out.println("Division by 0 is forbidden");
        }
    }


}

