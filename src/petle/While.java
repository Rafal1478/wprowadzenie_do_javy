package petle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3);
        System.out.println("wpisz nazwe produktu");
        String product = scanner.nextLine();
        System.out.printf("Dodałem do koszzyka %s, to nasza %d produkt\n", product, i+1);
        i++;





    }
}
