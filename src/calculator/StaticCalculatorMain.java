package calculator;

import java.util.Scanner;

public class StaticCalculatorMain {
    public static void main(String[] args) {
        System.out.println("czegp?");
        System.out.println("add");
        System.out.println("sub");
        System.out.println("divide");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        int a,b;
        switch (choice){
            case "divide" :
                System.out.println("insert first number");
                a = scanner.nextInt();
                System.out.println("Insert second number");
                b = scanner.nextInt();
                try {
                    System.out.println(a + " / " + b + " = " + StaticCalculator.divide(a,b));
                } catch (ZeroDividedExeption e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "add":
                System.out.println("insert first number");
                a = scanner.nextInt();
                System.out.println("Insert second number");
                b = scanner.nextInt();
                System.out.println(a + " + " + b + " = " + StaticCalculator.add(a,b));
                break;
            default:
                System.out.println("Wrong instructiion");
        }
    }
}
