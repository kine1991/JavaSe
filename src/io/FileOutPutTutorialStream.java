package io;

import java.io.*;

/**
 * Created by kine4599 on 04.07.17.
 */
public class FileOutPutTutorialStream {

    String s = "~abc~";

    private void writenInFile(){
        File file = new File("/home/kine4599/Рабочий стол/Java/Pop");
        try(OutputStream out = new FileOutputStream(file)) {
            byte[] data = s.getBytes();
            out.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileOutPutTutorialStream c = new FileOutPutTutorialStream();
        c.writenInFile();
    }
}
