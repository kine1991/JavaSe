package io;

/**
 * Created by kine4599 on 07.07.17.
 */
public class App01 {
    public static void main(String[] args) throws Exception {
//        System.out.println("Эюя".getBytes("UTF-8").length);

        byte[] bytes = {70, 71, 72};
        String str = new String(bytes, "UTF-8");
        System.out.println(str);
//        char[]

    }
}
