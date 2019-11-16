package moje;




import java.util.Arrays;
import java.util.Scanner;
public class PetleForMojeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
       String[] huj = new String[5];
       while (a < 5){
           System.out.println("podaj produkt");
           String zakupy = scanner.nextLine();
           huj[a] = ( a + " - " + zakupy);
           a++;

        }
        System.out.println(Arrays.toString(huj));
    }
}



