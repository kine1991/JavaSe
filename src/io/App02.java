package io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by kine4599 on 10.07.17.
 */
public class App02 {

    public static void main(String[] args) throws IOException {
        InputStream src = new URL("http://dom2.ru").openStream();
//        OutputStream dst = new FileOutputStream("/home/kine4599/Рабочий стол/Pop");
        copy(src, System.out);
    }


    public static void copy1(InputStream src, OutputStream dst) throws IOException {
        while (true){
            int data = src.read();
            if (data != -1){
                dst.write(data);
            }else {return;}
        }
    }








    public static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true){
            int data = src.read();
            if (data != -1){
                dst.write(data);
            }else {return;}
        }
    }
















}
