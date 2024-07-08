package inputOutputExamples;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path ;
import java.nio.file.Paths;

public class filesExample {

    public static void main(String[] args) throws Exception {

//        gettingDirectories();
 //   fileCopier();
        listDirectory();


    }

    public static void creatingFile() throws IOException{
        Path path = Paths.get("/home/hmzx7/IdeaProjects/JavaPlayGround/inputOutputExamples/moy.txt");
        if (Files.notExists(path)) {

            Files.createFile(path);
            System.out.println("the file has been created !!!");
        }
        System.out.println("working fine !!!");
    }

    public static void gettingDirectories() throws Exception{
       // Files.list(Paths.get(".")).filter(x ->x.endsWith("s")).forEach(System.out::println);
        // and this is another example for the map and filter methods and you should learn how to use them more efficiently
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)  // Ensure we're listing only directories
                .map(Path::getFileName)      // Get the filename (last part of the path)
                .map(Path::toString)         // Convert it to a string
                .filter(name -> name.endsWith("s")) // Filter by names ending with "s"
                .forEach(System.out::println);

    }

    public static void fileCopier() throws Exception {

        Path pathToCopyFrom = Paths.get("/home/hmzx7/IdeaProjects/JavaPlayGround/inputOutputExamples/molly.txt");
        Path pathToPasteTo = Paths.get("/home/hmzx7/");
        if(Files.notExists(pathToPasteTo)){

        Files.copy(pathToCopyFrom,pathToPasteTo);
            System.out.println("this is working !!!");
        }



    }

    public static void listDirectory() throws IOException{
        System.out.println("I'm calling you from the moooooonn sweetie XOXO");

        Files.list(Paths.get("/home/hmzx7/Desktop/file")).forEach(System.out::println);

    }
}
