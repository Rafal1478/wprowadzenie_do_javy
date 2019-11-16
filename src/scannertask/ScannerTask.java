package scannertask;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj Imie");
        String firstName = scanner.nextLine();
        System.out.println("Witaj " + firstName);
        //zad 2
        System.out.println("Podaj pierwsza cyfre");
        int number1 = scanner.nextInt();
        System.out.println("Podaj drugą cyfre");
        int number2 = scanner.nextInt();
        System.out.println("Wynik: " + (number1 + number2));


    }
}
