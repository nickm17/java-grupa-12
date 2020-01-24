package ro.siit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFile {
    // Reader / Writer

    public static void main(String[] args) throws IOException {
        long before = System.currentTimeMillis();
        copyTextFile();
        System.out.println(System.currentTimeMillis() - before);
    }

    static void copyTextFile() throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/main/resources/test.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/src/main/resources/testCopy.txt"));

            String s;
            while ((s = bufferedReader.readLine()) != null){
                bufferedWriter.write(s);
                bufferedWriter.newLine();

            }

        } catch (IOException ex) {
            // handle ioexception
        } finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }

}
