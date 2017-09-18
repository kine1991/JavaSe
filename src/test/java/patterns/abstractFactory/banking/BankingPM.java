package patterns.abstractFactory.banking;

import patterns.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager  {
    @Override
    public void managerProject() {
        System.out.println("Banking PM");
    }
}
