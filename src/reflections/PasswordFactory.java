package reflections;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by nikolaj on 15.07.17.
 */
public class PasswordFactory {

//    public static String getPassword(){
//        try{
//            String clazz = getGenerator();
//            Class<?> genClass = Class.forName(clazz);
//
//            Method[] methods = genClass.getMethods();
//            for (Method method : methods){
//                Genetator ann = method.getAnnotation(Genetator.class);
//                if (ann != null){
//                    Object generator = createObject(genClass);
//                    String pswd = (String)method.invoke(generator);
//                    return pswd;
//                }
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return "";
//    }
//
//
//
//    private static String getGenerator() throws Exception {
//        Properties p = new Properties();
//        p.load(new FileReader("generator1.properties"));
//        return p.getProperty("generator.class");
//    }
//
//
//    private static Object createObject(Class clazz) throws Exception{
//        Object obj = clazz.newInstance();
//
//        return fillProperties(obj);
//    }
//
//    private static Object fillProperties(Object obj) throws Exception{
//        Properties p = new Properties();
//        p.load(new FileReader("generator1.properties"));
//
//        for (String str : p.stringPropertyNames()){
//            if(!"generator.class".equals(str)) {
//                String value = p.getProperty(str);
//                System.out.println("Prop"+str+ value);
//            }
//        }
//        return obj;
//    }




}
