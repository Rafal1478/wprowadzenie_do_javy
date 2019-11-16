package ifels;

import org.w3c.dom.ls.LSOutput;
import scannertask.ScannerTask;

import java.util.Scanner;

public class IfelsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("wprowdz liczbe");
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println("mniejsza od 10");
        } else if (number == 10) {
            System.out.println("Równa 10");
        } else {
            System.out.println("Większy od 10");
        }
    }

}
