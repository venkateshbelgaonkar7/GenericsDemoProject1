package fileexample;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\2056569\\IdeaProjects\\GenericsDemoProject\\src\\fileexample\\file.txt");
        try {
            boolean created = myFile.createNewFile();
            System.out.println(created);
        } catch (IOException e) {

        }

    }
}
