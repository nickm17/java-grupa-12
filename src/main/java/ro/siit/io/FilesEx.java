package ro.siit.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesEx {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(System.getProperty("user.dir") +"/src/main/resources/test2.txt");
        Path path2 = Paths.get(System.getProperty("user.dir") +"/src/main/resources/test3.txt");
        System.out.println(Files.exists(path));
//    Files.createDirectory(Paths.get(System.getProperty("user.dir") +"/src/main/resources"));
    Files.walk(Paths.get(System.getProperty("user.dir") +"/src/main/resources")).forEach(System.out::println);
        try {
            final List<String> lines = Files.readAllLines(path);
            for(String line: lines) {
                System.out.println(line);
            }
//            Files.readAllLines(path).forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
//        Files.copy(path,path2);// copiaza fisierul dar pastreaza originalul
//        Files.move(path, path2); // muta originalul
//        System.out.println(Files.size(path));
//        System.out.println();

    }
}
