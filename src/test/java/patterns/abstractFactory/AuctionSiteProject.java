package patterns.abstractFactory;

import patterns.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {


    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();

        developer.writeCode();
    }

}
