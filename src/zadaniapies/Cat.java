package zadaniapies;

public class Cat  extends Pupil {


    public Cat(String breed, char sex, int age) {
        super(breed, sex, age,"miauuu");

    }

    public Cat(String breed, char sex, int age, String sound) {
        super(breed, sex, age, sound);

    }

    @Override
    public String toString() {

        return "Cat\n" +
                super.toString();

    }
}
