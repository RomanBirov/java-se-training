package oop.task_06_01_IO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


/**
 * Created by Роман on 07.04.2017.
 */
public class WriteFileTextRus {
    public static final String FILE_NAME1 = "out/io111.txt";

    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter(FILE_NAME1)) {
            System.out.print("Text: ");
            writer.write(new Scanner(System.in).nextLine());
        }
    }
}
