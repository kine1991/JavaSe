package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by kine4599 on 04.07.17.
 */
public class TutorialFileWruter {
    String s;
    StringBuilder stringBuilder = new StringBuilder();

    private void write(){
        try(Writer writer = new FileWriter("/home/kine4599/Рабочий стол/Java/Pop")){
            writer.write("Lost");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TutorialFileWruter t = new TutorialFileWruter();
        t.write();
    }


}
