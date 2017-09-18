package io;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by kine4599 on 06.07.17.
 */
public class SequenceEnumeration /*implements Enumeration<FileInputStream>*/ {
//    private Enumeration<String> files;
//
//    public SequenceEnumeration(Enumeration<String> files) {
//        this.files = files.elements();
//    }
//
//
//
//    @Override
//    public boolean hasMoreElements() {
//        return files.hasMoreElements();
//    }
//
//    @Override
//    public FileInputStream nextElement() {
//        try{
//            return new FileInputStream(files.nextElement());
//        } catch (FileNotFoundException e) {
//            return null;
//        }
//
//    }
//
//    class SequenceInputDemo{
//        private Vector<String> fiels;
//
//        private StringBuilder sb = new StringBuilder();
//
//        public void read(){
//            try(InputStream in = new SequenceInputStream(new SequenceEnumeration(fiels))){
//                int data;
//                while((data = in.read()) != -1){
//                    sb.append((char) data);
//                }
//                String result = new String(sb);
//                System.out.println(result);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Vector<String> fiels = new Vector<>();
//        fiels.add("/home/kine4599/Рабочий стол/Java/Pop");
//        fiels.add("/home/kine4599/Рабочий стол/Java/spring/Pop1000");
//
//        SequenceInputDemo inputDemo = new SequenceInputDemo(fiels);
//        inputDemo.read();
//    }


}










