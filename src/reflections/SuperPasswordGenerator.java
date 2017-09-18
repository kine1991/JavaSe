package reflections;

/**
 * Created by nikolaj on 15.07.17.
 */
public class SuperPasswordGenerator {

    public String algorithm;
    public String name;
    @Genetator
    public String createPassword(){
        return "Super password";
    }
}
