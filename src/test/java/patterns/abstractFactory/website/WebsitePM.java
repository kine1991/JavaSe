package patterns.abstractFactory.website;

import patterns.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("WebsitePM");
    }
}
