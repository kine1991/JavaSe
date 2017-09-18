package patterns.prototype;

public class VersionControleRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"qqqq","SC sc = new Sc();");
        System.out.println(master);



        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
//        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);
    }
}
