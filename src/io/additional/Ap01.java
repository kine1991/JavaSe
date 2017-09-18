package io.additional;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by kine4599 on 11.07.17.
 */
public class Ap01 {
    public static void main(String[] args) throws Exception {
        try(
        InputStream is = new FileInputStream("");
        OutputStream os = new FileOutputStream("")){

                byte[] buffer = new byte[4096];
                int r = is.read(buffer); // сколько прочитано байт
                while (r != -1) {
                    os.write(buffer, 0, r);
                    r = is.read(buffer);
                }
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }


















