package patterns.decorator;

/**
 * Created by kine4599 on 08.07.17.
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
