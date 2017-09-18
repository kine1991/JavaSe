package io;

import java.io.*;

/**
 * Created by kine4599 on 04.07.17.
 */
public class FileInPutTutorialStream {
    String s;
    int k;
    StringBuilder stringBuilder = new StringBuilder();

    private  void readFile(){
        File file = new File("/home/kine4599/Рабочий стол/Java/Pop");
        try(InputStream inputStream =new FileInputStream(file)) {
            int data = inputStream.read();
            while (data != -1){
                stringBuilder.append((char) data);
                data = inputStream.read();
            }
            s = new String(stringBuilder);
            k = new Integer(inputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileInPutTutorialStream o = new FileInPutTutorialStream();
        //o.readFile();
        System.out.println(o.k);
    }
}
