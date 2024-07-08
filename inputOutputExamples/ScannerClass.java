package inputOutputExamples;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        //there is the nextLI have experience working with teams to create user-friendly applications using agile methodologiesine method and next the next method will take only the first word
        // nextLine will take the whole line
        String fullName = scanner.nextLine();

        System.out.println("Enter your name only : ");
        String name = scanner.next();


        System.out.println("your full name is : " +
                fullName +
                " \nyour name is : " +
                name);





    }
}
