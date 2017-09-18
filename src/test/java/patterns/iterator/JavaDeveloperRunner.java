package patterns.iterator;

/**
 * Created by kine4599 on 10.07.17.
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skils = {"Java", "Spring", "Hibernate", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Kolya", skils);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skils: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
