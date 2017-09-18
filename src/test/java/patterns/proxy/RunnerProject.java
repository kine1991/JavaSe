package patterns.proxy;

/**
 * Created by nikolaj on 15.07.17.
 */
public class RunnerProject {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com/proselytear/realProject");

        project.run();
    }
}
