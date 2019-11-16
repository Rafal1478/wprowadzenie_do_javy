package zadaniepowtorka;


import java.util.Scanner;

public class ZadaniePowtorkaMain {
    private  static String[] sklep = {"kombinerki", "nożyczki", "śróbokręt"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        String imie = scanner.nextLine();
        System.out.println("Witaj! " + imie + "\nw naszej ofercie mamy:");
        displaySklep(sklep);
        System.out.println("co chcialbys kupić?");
        sellProduct(scanner.nextLine());
    }
    private static void sellProduct(String choice) {

        switch (choice) {
            case "kombinerki":
                sklep = new String[]{"nożyczki", "śróbokręt"};
                System.out.println("kupiłeś " + choice);
                break;
            case "nożyczki":
                sklep = new String[]{"kombinerki", "śróbokręt"};
                System.out.println("kupiłeś " + choice);
                break;
            case "śróbokręt":
                sklep = new String[]{"kombinerki", "nożyczki"};
                System.out.println("kupiłeś " + choice);
                break;
            default:
                System.out.println("takiego produktu nie mamy w ofercie");
                break;
        }

        }
        public static void displaySklep (String[]sklep){
            System.out.println("W naszej ofercie mamy:");
            for (String produkty : sklep) {
                System.out.println(produkty);
            }
    }
}