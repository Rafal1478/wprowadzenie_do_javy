package printtask;

import java.util.Arrays;

public class PrintTaskMain {
    public static void main(String[] args) {
        //zadanie 1
      String firstName = "rafał";
        System.out.println("Witaj," + firstName);
        //zadanie 2
        System.out.print("łancuch znakow\n" + "drugi łancuch\n");
        //zadnie 3
        double value = 12.465324d;
        System.out.printf("moja wartość: %.2f\n", value);
        //zadanie 4
        int incrValue = 50;
        System.out.println("10" + (incrValue++));
    }
}
