package ro.siit.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class PathExamples {

    public static void main(String[] args) {
        // System.getProperty("user.dir") - folosit pentru a ne plasa in directorul de lucru(directorul proiectului)
        Path path = Paths.get(System.getProperty("user.dir") +"/src/main/resources/test.txt");
        try {
            Files.lines(path).filter(s -> s.length() > 15).forEach(System.out::println);
            Files.readAllLines(path).forEach(System.out::println);

            Stream stream = Files.lines(path).filter(s -> s.length() > 15);
            List<String> list = Files.readAllLines(path);
            stream.forEach(System.out::println);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }


}
