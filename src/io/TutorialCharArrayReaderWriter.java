package io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by kine4599 on 04.07.17.
 */
public class TutorialCharArrayReaderWriter {
    String s;
    StringBuilder stringBuilder = new StringBuilder();


    private void read(){
        try(Reader reader = new CharArrayReader(new char[] {'a', 'b', 'c'})) {

            int data = reader.read();
            while (data !=-1){
                stringBuilder.append((char) data);
                data = reader.read();
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void write(){
        try(CharArrayWriter writer = new CharArrayWriter(1024)){
            writer.write("Java");
            System.out.println(writer.toString());
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TutorialCharArrayReaderWriter c = new TutorialCharArrayReaderWriter();
        c.write();
    }


}
