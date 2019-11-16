package moje;

import java.util.Scanner;

public class MojeZadaniaMain {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę całkowitą");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println(liczba);
        if (liczba == 0){
            System.out.println("Nie będę liczyć");
        }
        else if (liczba <= 11){
          int b =  liczba * liczba * liczba * liczba;
            System.out.println(b);
        }else if (liczba > 11 && liczba < 100) {
            int c = 3 + 2 * (liczba - 8) / 2 * liczba;
            System.out.println(c);
        }
            else if(liczba >= 100){
                System.out.println("Błędny zakres, akceptowalne wartości: 0-99");
        }
    }
}
