package oop.example_canvas_image;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/**
 * Created by Роман on 24.03.2017.
 */


class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("1.txt");
        Reader reader = new InputStreamReader(inputStream);
        char[] buf = new char[8196];
        try {
            int k = reader.read(buf);
            String data = new String(buf, 0, k);
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
