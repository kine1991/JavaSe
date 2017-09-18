package patterns.builder;

public class Director {

    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.biuldPrice();

        Website website = websiteBuilder.getWebsite();
        return website;
    }
}
