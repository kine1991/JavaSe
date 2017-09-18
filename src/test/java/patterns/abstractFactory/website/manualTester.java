package patterns.abstractFactory.website;

import patterns.abstractFactory.Tester;

public class manualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester");
    }
}
