package petle;

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("wpisz nazwe produktu");
            String product = scanner.nextLine();
            System.out.printf("Dodałem do koszzyka %s, to nasza %d produkt\n", product, (i+1));
        }
    }
}

