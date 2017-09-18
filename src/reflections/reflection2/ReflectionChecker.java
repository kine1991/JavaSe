package reflections.reflection2;

/**
 * Created by nikolaj on 17.07.17.
 */
public class ReflectionChecker {
    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }
}
