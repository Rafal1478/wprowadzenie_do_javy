package zadaniapies;

public class Pies extends Pupil{
    private  String breed;
    private  int age = 7;
    private  char sex;
    private String sound ="woof!";

    private MounthGuard mounthGuard;

    public Pies(String breed, char sex, int age) {
        super(breed, sex, age,"woof");
    }
    public Pies(String breed, char sex, int age, String sound) {
        super(breed, sex, age, sound);
    }

    public void mountMauthguard(MounthGuard mounthGuard){
        this.mounthGuard = mounthGuard;
    }
    public void unmountMounthguard(){
        this.mounthGuard = null;
    }

    public MounthGuard getMounthGuard(){
        return mounthGuard;
    }

    @Override
    public String toString(){
        return  "Dog\n" +
                super.toString();
    }


}
