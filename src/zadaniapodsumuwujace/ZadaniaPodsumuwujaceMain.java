package zadaniapodsumuwujace;



import java.util.Scanner;

public class ZadaniaPodsumuwujaceMain {
    public static void main(String[] args) {
        System.out.println("Podaj długość boku kwadratu");
        Scanner scanner = new Scanner(System.in);
        char brusch = '*';
        int sideLenght = scanner.nextInt();
        drawSquare(sideLenght, brusch );

    }
    private static void  drawSquare(int sideLenght, char brusch){
        for (int i = 0; i < sideLenght; i++) {
        for (int j = 0; j < sideLenght; j++) {

            System.out.print(brusch + "\t");
        }System.out.println();

    }


    }
}
