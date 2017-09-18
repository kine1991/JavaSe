package io.additional;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by kine4599 on 11.07.17.
 */
public class Ap03 {
    public static void main(String[] args) {
        File file = new File("/home/kine4599/Рабочий стол/Java");
//        file.mkdirs();
        String[] l = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("P");
            }
        });
        for (String g: l){
            System.out.println(g);
        }
    }
}
