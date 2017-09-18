package io;

import java.io.*;

/**
 * Created by kine4599 on 04.07.17.
 */
public class TutorialInputStreamReaderOutputStreamWriter {
    String s;
    StringBuilder stringBuilder = new StringBuilder();


    //InputStreamReader
    private void read(){

        String path = "/home/kine4599/Рабочий стол/Java/Pop";

        try(Reader reader = new InputStreamReader(new FileInputStream(path), "UTF8")){

            int data = reader.read();
            while (data != -1){
                stringBuilder.append((char)data);
                data = reader.read();

            }

            System.out.println(stringBuilder);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void write(){
        String path = "/home/kine4599/Рабочий стол/Java/Pop";

        try(Writer writer = new OutputStreamWriter(new FileOutputStream(path), "UTF8")) {
            writer.write("hello Kolya");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TutorialInputStreamReaderOutputStreamWriter t = new TutorialInputStreamReaderOutputStreamWriter();
        t.write();
    }


}
