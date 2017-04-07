package oop.task_06_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Роман on 07.04.2017.
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {
        byte[] bytes = {49, 0x0A, 0x32, 0x0A, 0x33, 0x0A, 0x34, 0x0A, 53};

        OutputStream os = new FileOutputStream("out/io1.bin");
        os.write(bytes);
        os.close();
    }
}