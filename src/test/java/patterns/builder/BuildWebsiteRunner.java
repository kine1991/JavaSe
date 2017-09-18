package patterns.builder;

public class BuildWebsiteRunner {

    public static void main(String[] args) {
        Director director = new Director();

        director.setWebsiteBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
