package eployee;

public class Developer extends Employee {
    String mainLanguage;
    String[] skills;


    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
    protected String getMainLanguage(){
        return mainLanguage;
    }
    protected String[] getSkills(){
        return skills;
    }
}

