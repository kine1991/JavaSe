package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by kine4599 on 03.07.17.
 */
public class CopyFileTutorial {
    private boolean copy(){
        File src =      new File("/home/kine4599/Рабочий стол/Java/Pop");
        File target =   new File("/home/kine4599/Рабочий стол/Java/Pop1");
        try {
            Files.copy(src.toPath(), target.toPath());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
            return false;
    }

    private boolean move(){
        File src =      new File("/home/kine4599/Рабочий стол/Java/Pop1");
        File target =   new File("/home/kine4599/Рабочий стол/Java/spring/Pop1000");
        try {
            Files.move(src.toPath(), target.toPath());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
//        CopyFileTutorial copy = new CopyFileTutorial();
//        copy.move();

//        File file = new File("/home/kine4599/Рабочий стол/Java/Pop1");
//        File dir = new File("/home/kine4599/Рабочий стол/Java");
//
//        String[] paths = dir.list();
//        boolean exist = dir.exists();
//        File[] files = dir.listFiles();
//        System.out.println(files);








    }


}
