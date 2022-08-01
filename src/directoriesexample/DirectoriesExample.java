package directoriesexample;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {
    public static void main(String[] args) {

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };

        String[] contents = new File(".").list();
        for (String file : contents) {
            System.out.println(file);
        }
    }
}
