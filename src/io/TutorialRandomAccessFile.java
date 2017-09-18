package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by kine4599 on 04.07.17.
 */
public class TutorialRandomAccessFile {
    String s;
    StringBuilder stringBuilder = new StringBuilder();


    private void readFile(){
        File file = new File("/home/kine4599/Рабочий стол/Java/Pop");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")){

//            randomAccessFile.write("I love O!".getBytes("UTF8"));

            int data = randomAccessFile.read();
            while (data != -1){
                stringBuilder.append((char)data);
                data = randomAccessFile.read();
            }

            System.out.println(new String(stringBuilder));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        TutorialRandomAccessFile t = new TutorialRandomAccessFile();
        t.readFile();

    }
}
