package patterns.decorator;

/**
 * Created by kine4599 on 08.07.17.
 */
public class SeniorJavaeveloper extends DeveloperDecarator {
    public SeniorJavaeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReviev(){
        return "Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReviev();
    }
}
