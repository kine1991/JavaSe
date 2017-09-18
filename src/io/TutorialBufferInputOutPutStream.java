package io;

import java.io.*;

/**
 * Created by kine4599 on 05.07.17.
 */
public class TutorialBufferInputOutPutStream {
//    String s;
//    StringBuilder stringBuilder = new StringBuilder();
//
//
//    private void read(){
//        String path ="/home/kine4599/Рабочий стол/Java/Pop";
//        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path))) {
//
//            byte[] data = new byte[1024];
//
//            int amountData = bufferedInputStream.read(data, 0, 1024);//кол-во данных прочитанных/2ой аргумент 0 с какой ячейки мы будем записывать/ 1024- сколько мы будем записывать
//
//            while (amountData != -1 && amountData == 1024) {
//                stringBuilder.append(new String(data, "UTF8"));
//                amountData = bufferedInputStream.read(data, 0, 1024);
//            }
//
//            if (amountData != -1){
//                byte[] residue = new byte[amountData];
//                System.arraycopy(data, 0, residue, 0, residue.length);
//                stringBuilder.append(new String(residue));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private void copyDataFileToFile(){
//        String pathToSource = "/home/kine4599/Рабочий стол/Java/Pop";
//
//        String pathToTarget = "/home/kine4599/Рабочий стол/Java/Pop1000";
//
//        int bufferSize = 1024*8;
//        int indexStartReading = 0;
//
//        try(BufferedInputStream inputStream = new BufferedInputStream(
//                new FileInputStream(pathToSource));
//
//            BufferedOutputStream outputStream = new BufferedOutputStream(
//                    new FileOutputStream(pathToTarget))) {
//
//            int data = inputStream.read();
//
//            while (data != -1) {
//                outputStream.write(data);
//                outputStream.flush();
//                data = inputStream.read();
//
//
//            }
//
//
//        }
//
//
//
//            byte[] dataBuffer = new byte[bufferSize];
//
//            int dataLength = inputStream.read(dataBuffer,indexStartReading,bufferSize);
//
//            while (dataLength != -1){
//                outputStream.write(dataBuffer,0,dataBuffer.length);
//                outputStream.flush();
//                dataLength = inputStream.read(dataBuffer,indexStartReading,bufferSize);
//            }
//
//
//
//
//    } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        TutorialBufferInputOutPutStream t = new TutorialBufferInputOutPutStream();
//        t.copyDataFileToFile();
//    }
}

