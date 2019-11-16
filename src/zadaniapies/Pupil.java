package zadaniapies;

public class Pupil {
    private String breed;
    private  int age = 7;
    private char sex;
    private String sound;

    public Pupil(String breed, char sex, int age, String barkingSound) {
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.sound = barkingSound;
    }
    @Override
    public String toString(){
        return "Breed: " + breed + "\n" +
                "sex: " + sex +"\n" +
                "age: " + age;
    }
    public void sound(){
        System.out.println(sound);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("podałes ujemny wiek");
            return;
        }
        this.age = age;
    }
}
