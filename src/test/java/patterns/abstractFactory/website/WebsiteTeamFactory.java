package patterns.abstractFactory.website;

import patterns.abstractFactory.Developer;
import patterns.abstractFactory.ProjectManager;
import patterns.abstractFactory.ProjectTeamFactory;
import patterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new manualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
