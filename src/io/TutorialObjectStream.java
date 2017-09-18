package io;

import java.io.*;

/**
 * Created by kine4599 on 06.07.17.
 */
public class TutorialObjectStream {

    private String obj = "abc";

    public void write() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/home/kine4599/Рабочий стол/Java/Pop"))) {
            out.writeUTF("Hello Froozooopp");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void read() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/kine4599/Рабочий стол/Java/Pop"))) {
            System.out.println(in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TutorialObjectStream o = new TutorialObjectStream();
        o.write();
        o.read();
    }
}



