package io.additional;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by kine4599 on 12.07.17.
 */
public class ChannelExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("");
        FileOutputStream fos = new FileOutputStream("");

        FileChannel inChannel = fis.getChannel();
        FileChannel outChannel = fos.getChannel();

        ByteBuffer inBb = ByteBuffer.allocate(4096);
        ByteBuffer outBb = ByteBuffer.allocate(4096);

        int r = inChannel.read(inBb); //r - количество байтов которые мы считали
        while (r != -1) {
            inBb.flip();
            while (inBb.hasRemaining()) { //пока в буффере что то есть
                byte get = inBb.get(); //забираем байты
                outBb.put(get);
            }
            outBb.flip();
            outChannel.write(outBb);
            inBb.clear();//после того как забрали, чистим
            outBb.clear();
            r = inChannel.read(inBb);


        }
        fis.close();
        fos.close();
    }
}
