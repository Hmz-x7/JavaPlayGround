package inputOutputExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferExample {

    public static void main(String[] args) throws IOException {
        // you have to create a path for the file reader to read it from bufferReader

          BufferedReader reader = new BufferedReader(new FileReader("/home/hmzx7/IdeaProjects/JavaPlayGround/inputOutputExamples/felo.txt"));
        String line = reader.readLine();
        // you are never old this is what is called experience ; )
        FileReader file = new FileReader("/home/hmzx7/IdeaProjects/JavaPlayGround/inputOutputExamples/felo.txt");

        Scanner scan = new Scanner(file);
        System.out.println(scan.next());
        System.out.println(scan);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        StringBuilder string = new StringBuilder();
        System.out.println(line);
        reader.lines().forEach(string::append);
        System.out.println(string);

        reader.close();
    }
}
