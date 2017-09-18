package io.additional;

import java.io.*;

/**
 * Created by kine4599 on 11.07.17.
 */
public class Ap02 {

    public static void demoReadWrite() throws Exception{
        Reader r = new FileReader("");
        Writer w = new FileWriter("");

        char[] buffer = new char[4094];
        int c = r.read(buffer);
        while (c!=-1){
            w.write(buffer,0, c );
            c = r.read(buffer);
        }
        r.close();
        w.close();
    }

    public static void encodeDemo() throws Exception{
        FileInputStream fis = new FileInputStream("/home/kine4599/Рабочий стол/Java/Pop");
        Reader fr = new InputStreamReader(fis, "utf-8");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();


    }

    public static void main(String[] args) throws Exception {
        encodeDemo();
    }

}
