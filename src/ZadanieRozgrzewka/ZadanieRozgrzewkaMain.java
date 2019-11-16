package ZadanieRozgrzewka;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ZadanieRozgrzewkaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz liczbe całkowitą");
        int liczba = scanner.nextInt();
        System.out.println(liczba);
        if (liczba == 0) {
            System.out.println("Nie bede liczyc");
        }if(liczba <= 11) {
            System.out.println(liczba * liczba * liczba * liczba);
        }

            }
        }



