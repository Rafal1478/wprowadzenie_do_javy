package zadaniasobota;

import java.util.Scanner;

public class ZadaniaSobotaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToRead = 5, minimalValue = 10;
       int a = 0;
       int suma = 0;
        while (a++ < numbersToRead){
            System.out.println("podaj liczbę całkowitą");
            int number = scanner.nextInt();
            //if(number > minmalValue)
            // sum+= number;
            suma += number > minimalValue ? number : 0;

        }
        System.out.println(suma);
    }
}
