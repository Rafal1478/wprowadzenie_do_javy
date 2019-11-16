package klasap;

public class Newspaper extends Publication {
    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getDetails() {

        return "title=\"" + title + "\"" + "source=\"" + source + "\"";
        // write your code here
    }

}