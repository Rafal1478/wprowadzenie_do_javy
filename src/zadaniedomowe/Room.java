package zadaniedomowe;

import java.util.Scanner;

public class Room {

    Scanner scanner = new Scanner(System.in);
    private double high;
    private double wide;
    private double length;

    public Room(double high, double wide, double length) {
        this.high = high;
        this.wide = wide;
        this.length = length;
    }

    public Room(double wide, double length) {
        this.wide = wide;
        this.length = length;
        this.high = 2.4;

    }

    public double getArea() {
        return wide * length;
    }
    public double getVolume(){
        return  wide*length*high;
    }
    public void displayArea(){
        System.out.println(getArea());
    }
    public void displayVolume(){
        System.out.println(getVolume());
    }
    public void setHigh(double high){
        if(high > 0)
        this.high = high;
        else {
                System.out.println("błąd!");
                System.out.println("podałeś liczbę ujemną");
            }
    }

    public double getHigh() {
        return this.high;
    }

    public double getWide() {
        return wide;
    }

    public double getLength() {
        return length;
    }
}





