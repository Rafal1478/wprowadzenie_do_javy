package eployee;

public class DataAnalyst extends Employee {
    boolean phd;
    String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods){
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }
    protected boolean isPhd(){
        return phd;
    }
    protected String[] getMethods(){
        return methods;
    }

}
