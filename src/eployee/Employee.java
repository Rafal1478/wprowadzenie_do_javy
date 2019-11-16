package eployee;

public class Employee {
    String name;
    String email;
    int experience;

    public Employee(String name, String email, int experience){
        this.name = name;
        this.email = email;
        this.experience = experience;
        }

        protected String getName(){
        return name;
        }
        protected String getEmail(){
        return email;
        }
        protected int getExperience(){
        return  experience;
        }
}

