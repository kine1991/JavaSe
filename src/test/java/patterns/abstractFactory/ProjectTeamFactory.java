package patterns.abstractFactory;

/**
 * Created by nikolaj on 21.07.17.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
