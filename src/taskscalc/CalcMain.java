package taskscalc;

import switchcase.SwitchCaseMain;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz pierwsza cyfre");
        int number1 = scanner.nextInt();
        System.out.println("wprowadz druga cyfre");
        int number2 = scanner.nextInt();
        System.out.println("Wynik " + number1 + "+" + number2 + "=" + (number1 + number2));
    }
}

