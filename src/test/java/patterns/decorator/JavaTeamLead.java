package patterns.decorator;

/**
 * Created by kine4599 on 08.07.17.
 */
public class JavaTeamLead extends DeveloperDecarator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "send week report to customer.";
    }


    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
