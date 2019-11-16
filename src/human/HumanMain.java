package human;

public class HumanMain {
    public static void main(String[] args) {
        Human adam = new Human ("adam", 12, EyeColor.Brown, HairColor.Pink);
        System.out.println(adam.toString());
    }
}
