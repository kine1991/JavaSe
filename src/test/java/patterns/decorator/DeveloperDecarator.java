package patterns.decorator;

/**
 * Created by kine4599 on 08.07.17.
 */
public class DeveloperDecarator implements Developer {

    Developer developer;

    public DeveloperDecarator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
