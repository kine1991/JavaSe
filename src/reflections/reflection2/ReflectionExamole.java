package reflections.reflection2;

import reflections.reflection2.rabbit.Rabbit;

/**
 * Created by nikolaj on 17.07.17.
 */
public class ReflectionExamole {
    public static void main(String[] args) {
        ReflectionChecker checker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();

        checker.showClassName(rabbit);
    }
}
