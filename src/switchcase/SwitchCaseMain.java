package switchcase;

import java.util.Scanner;

public class SwitchCaseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadż liczbę");
        int number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("*");
                break;
            case 1:
                System.out.println("@");
                break;
            case 2:
                System.out.println("#");
                break;
            case 3:
                System.out.println("$");
                break;
            case 4:
                System.out.println("%");
                break;
            case 5:
                System.out.println("^");







        }
    }
}
