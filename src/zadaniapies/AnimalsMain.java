package zadaniapies;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat garfield = new Cat("pers", 'f', 4);
        Pies ozzy = new Pies("boxer", 'm', 7, "woof");
        Pies ozzy1 = new Pies("chiwawa", 'm', 7, "woof");
        ozzy.mountMauthguard(new MounthGuard(4, "steel", 100));

        Pies[] pupils = new Pies[] {ozzy1, ozzy};
        for(Pies pupil : pupils){
            System.out.println(pupil.toString());
            pupil.sound();
            if(pupil.getMounthGuard() != null)
            System.out.println(" kaganiec material " + pupil.getMounthGuard().getMaterial());
            else
            System.out.println("do does not have mouthguard");
            System.out.println();
        }
    }
}
