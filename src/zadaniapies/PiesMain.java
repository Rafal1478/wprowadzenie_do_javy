package zadaniapies;


public class PiesMain {
    public static void main(String[] args) {
        int i = 8;
        Pies rex = new Pies("husky",'m', 5);
        Pies luky = new Pies("boxer", 'f', 2, "miauuu!");
        Pies[] psy = new Pies[]{rex, luky};
        for (Pies pies:psy){
            System.out.println(pies.toString());
            pies.sound();
            System.out.println();
        }

    }
}
