package oop.task_06_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Роман on 07.04.2017.
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "out/io1.bin";
        final int BUFFER_SIZE = 100;

        InputStream is = new FileInputStream(FILE_NAME);
        byte[] bytes = new byte[BUFFER_SIZE];
        int k = is.read(bytes);
        String string = new String(bytes, 0, k);
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if (b % 2 != 0) {
                if (b != 00) {
                    sb.append(String.format("0x" +"%02X ",  b));
                }
           }
       }
        System.out.println("Text: " + "\n" + sb.toString());
    }


}
