package patterns.abstractFactory;

import patterns.abstractFactory.Developer;
import patterns.abstractFactory.ProjectManager;
import patterns.abstractFactory.ProjectTeamFactory;
import patterns.abstractFactory.Tester;
import patterns.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();




        developer.writeCode();


    }
}
