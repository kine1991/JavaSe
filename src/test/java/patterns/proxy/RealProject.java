package patterns.proxy;

/**
 * Created by nikolaj on 15.07.17.
 */
public class RealProject implements Project {

    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from " + url);
    }

    @Override
    public void run() {
        System.out.println("Running project +"+url);
    }
}
