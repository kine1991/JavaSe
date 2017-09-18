package patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void biuldPrice() {
        website.setPrice(10000);
    }
}
